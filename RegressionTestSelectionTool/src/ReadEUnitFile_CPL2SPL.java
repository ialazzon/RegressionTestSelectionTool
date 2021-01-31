import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
import java.nio.file.Paths;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import CPL.*;
import TestCaseMM.*;
import TestCaseMM.impl.*;



public class ReadEUnitFile_CPL2SPL {
	private static Scanner input;
	private static HashMap<String, String> r_class = new HashMap<>();
	private static HashMap<String, Tuple> tc_i_o = new HashMap<>();
	private static TestCaseMMFactory tcsRF;
	
	public static void main(String args[]) throws IOException {
		//Read the eunit file to get the mappings between test cases and target models
		try {
			input = new Scanner(Paths.get("eunit/mytest_CPL2SPL.eunit"));
		}catch(IOException e) {
			System.err.println("Error openning file.");
			System.exit(1);
		}
		
		String TC = " ";
		while(input.hasNext()) {
			String s = input.nextLine();
			String o = StringUtils.substringBetween(s,"runTarget(\"", "\"");
			if(o!=null) {
				TC = o;
				continue;
			}
			if(s.contains(",")) {
				String[] u = StringUtils.split(s, ',');
				String u1 = StringUtils.substringBetween(u[0], "assertEqualModels(\"", "\"");
				String u2 = StringUtils.substringBetween(u[1], "\"", "\"");
				Tuple t = new Tuple(u1,u2);
				tc_i_o.put(TC, t);
			}
		}
		
		for (String name: tc_i_o.keySet()){
            String key = name;
            Tuple tuple = tc_i_o.get(name); 
            System.out.println(key + " " + tuple.inputModel +" "+tuple.outputModel);  
		} 
		input.close();
		
		//Read the transformation program to get the mappings between the rules and the source meta-classes
		System.out.println("\n\n"); 
		try {
			input = new Scanner(Paths.get("ATLPrograms/CPL2SPL.atl"));
		}catch(IOException e) {
			System.err.println("Error openning file.");
			System.exit(1);
		}
		
		String rule=" ";
		while(input.hasNext()) {
			String s = input.nextLine();
			String r = StringUtils.substringAfterLast(s,"rule ");
			if(r!=null&&!r.isEmpty()) {
				rule=StringUtils.substringBefore(r, "{").trim();
				
			}
			
			if(s.contains("!") & s.contains("from")) {
				String c = StringUtils.substringAfterLast(s,"!");
				if(c!=null&&!c.isEmpty()) {

					r_class.put(rule, c.trim());
				}
			}
		}
		for (String name: r_class.keySet()){
            String key = name;
            String value = r_class.get(name); 
            System.out.println(key + " " + value);  
		} 
		
		input.close();
		
		System.out.println("\n\n--\n\n");
		for(Entry<String,Tuple> e:tc_i_o.entrySet()) {
			String sourceModel = StringUtils.replace(e.getValue().outputModel, "SPL", "AutomaticModel_CPL" );
			System.out.println(getMappingsForModel(sourceModel+".xmi") );
		
		}
		
		//Build the test case model and save it as testCaseSet.model in the output folder
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestCaseMMPackage.eNS_URI, TestCaseMMPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = Paths.get("output/testCaseSet.model").toAbsolutePath().toString(); 
		Resource resource = resourceSet.createResource(URI.createFileURI(loc));
		resource.getContents().clear();
		tcsRF= TestCaseMMFactoryImpl.init();
		TestCaseSet testCaseSet= tcsRF.createTestCaseSet();
		resource.getContents().add(testCaseSet);
		
		for(Entry<String,Tuple> e:tc_i_o.entrySet()) {
			String sourceModel = StringUtils.replace(e.getValue().outputModel, "SPL", "AutomaticModel_CPL" );
			buildTestCaseModel(testCaseSet,sourceModel+".xmi");
		
		}
		
		resource.save(null);
		
		System.out.println("\n\n--\n\n");
		/*
		 * theChangedRule is the name of the rule that has been changed.
		 */
		String theChangedRule ="Proxy2Select";
		//printEUnitFile method prints the contents of the eunit file to the console and saves it in a new file test.eunit in the output folder 
		printEUnitFile(theChangedRule);
	}
	
	public static void buildTestCaseModel(TestCaseSet tcSet, String model) throws IOException {
		ArrayList<String> listClasses = new ArrayList<>();
		
		// Load the model using EMF
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(CPLPackage.eNS_URI, CPLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = ReadEUnitFile_CPL2SPL.class.getResource("models/"+ model).getFile();
		Resource resource = resourceSet.createResource(URI.createFileURI(loc));
		resource.load(new HashMap<Object, Object>());

		Object o = resource.getContents();

		TreeIterator<EObject> ir = resource.getAllContents();
		while(ir.hasNext() ) {
			String next = StringUtils.substringBefore(ir.next().getClass().getSimpleName(),"Impl");
			if(!listClasses.contains(next))
				listClasses.add(next);
		}
		
		for(String c:listClasses)
			for(String r:lRules(c))
				for(Entry<String,Tuple> e:tc_i_o.entrySet()) {
					if(StringUtils.substringAfter(e.getValue().outputModel,"SPL").equals(
							StringUtils.substringBetween(model,"AutomaticModel_CPL",".xmi"))) {
						/* add rule */
						Rule rule= tcsRF.createRule();
						rule.setName(r);
						tcSet.getRules().add(rule);
						/* add test case */
						TestCase testCase = tcsRF.createTestCase();
						testCase.setName(e.getKey());
						rule.getTestCases().add(testCase);
						tcSet.getTestCases().add(testCase);
						/* add input test model */
						SourceModel iTestCaseModel = tcsRF.createSourceModel();
						iTestCaseModel.setName(e.getValue().inputModel);
						testCase.setSourceModel(iTestCaseModel);
						tcSet.getSourceModels().add(iTestCaseModel);
						/* add output test model */
						TargetModel oTestCaseModel = tcsRF.createTargetModel();
						oTestCaseModel.setName(e.getValue().outputModel);
						testCase.setTargetModel(oTestCaseModel);
						tcSet.getTargetModels().add(oTestCaseModel);
					}
				
				}
		
	}
	
	public static ArrayList<String> lRules(String c){
		ArrayList<String> lr = new ArrayList<>();
		
		for (Entry<String,String> entry : r_class.entrySet()) {  
			try {
				
				String cClassName = "CPL2.impl."+c+"Impl";
				String eClassName = "CPL2.impl."+entry.getValue()+"Impl";
				//add to lr if c is a subclass of e
				if(Class.forName(eClassName).isAssignableFrom(Class.forName(cClassName)) ) {
						lr.add(entry.getKey());
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		return lr;
	}
	
	public static String getMappingsForModel(String model) throws IOException {
		String returnString ="";
		ArrayList<String> listClasses = new ArrayList<>();
		
		// Load the model using EMF
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(CPLPackage.eNS_URI, CPLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = ReadEUnitFile_CPL2SPL.class.getResource("models/"+ model).getFile();
		Resource resource = resourceSet.createResource(URI.createFileURI(loc));
		resource.load(new HashMap<Object, Object>());

		Object o = resource.getContents();

		TreeIterator<EObject> ir = resource.getAllContents();
		while(ir.hasNext() ) {
			String next = StringUtils.substringBefore(ir.next().getClass().getSimpleName(),"Impl");
			if(!listClasses.contains(next))
				listClasses.add(next);
		}
		
		
		for(String c:listClasses)
			for(String r:lRules(c))
				for(Entry<String,Tuple> e:tc_i_o.entrySet()) {
					if(StringUtils.substringAfter(e.getValue().outputModel,"SPL").equals(
							StringUtils.substringBetween(model,"AutomaticModel_CPL",".xmi"))) {
							returnString += String.format("%s %s %s %s%n",r, e.getKey(), e.getValue().inputModel, e.getValue().outputModel );
					}
				
				}
		
		return returnString;
	}
	
	public static void printEUnitFile(String theChangedRule) throws IOException {
		// Load the model using EMF
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestCaseMMPackage.eNS_URI, TestCaseMMPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = Paths.get("output/testCaseSet.model").toAbsolutePath().toString();
		Resource resource = resourceSet.createResource(URI.createFileURI(loc));
		resource.load(new HashMap<Object, Object>());

		Object o = resource.getContents();

		TreeIterator<EObject> ir = resource.getAllContents();
		TestCaseSet s;
		s = (TestCaseSet)(ir.next());
		EList<Rule> listRules = s.getRules();
		ArrayList<String> listTCs = new ArrayList<>();
		for(Rule r: listRules) {
			if(r.getName().equals(theChangedRule)){
				if(!listTCs.contains(r.getTestCases().get(0).getName())) {
					System.out.printf("%s %s %s%n",r.getTestCases().get(0).getName(),r.getTestCases().get(0).getSourceModel().getName() ,r.getTestCases().get(0).getTargetModel().getName() );
					listTCs.add(r.getTestCases().get(0).getName());
				}
			}
		}
		
		Formatter output = new Formatter(Paths.get("output/test.eunit").toString());
		listTCs = new ArrayList<>();
		for(Rule r: listRules) {
			if(r.getName().equals(theChangedRule)){
				if(!listTCs.contains(r.getTestCases().get(0).getName())) {
					output.format("%s\n", "@test");
					output.format("%s\n", "operation compareModel() {");
					output.format("%s%s%s\n", "runTarget(\"",r.getTestCases().get(0).getName(),"\");");
					output.format("%s%s%s%s%s\n", "assertEqualModels(\"",r.getTestCases().get(0).getSourceModel().getName(),"\",\"",r.getTestCases().get(0).getTargetModel().getName(),"\");");
					output.format("%s\n\n", "}");
					listTCs.add(r.getTestCases().get(0).getName());
				}
			}
		}
		output.close();
		
		
	}
}


