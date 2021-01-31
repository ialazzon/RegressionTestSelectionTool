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

import TestCaseMM.*;
import TestCaseMM.impl.*;

/* Here, we describe how to edit this program so that it works on any model transformation case. 
 * QN2QPN is included here as a sample, but it needs to be replaced with the new model transformation details. The 
 * instructions on how to do this are provided in the comments.
 */

/* 1- Import the EMF-related packages related to the source meta-model. These can be automatically generated using EMF. 
 * Replace the following two lines with the new imported packages. */
import MultiClassQN.*;
import MultiClassQN.QNM;  


public class ReadEUnitFile_General {
	private static Scanner input;
	private static HashMap<String, String> r_class = new HashMap<>();
	private static HashMap<String, Tuple> tc_i_o = new HashMap<>();
	private static TestCaseMMFactory tcsRF;
	
	/* 2- Define the following paths. Here, QN2QPN is used as a sample. Replace as necessary. The values are set in the gradle build file. */
	private static String eunit_file_path = Configuration.eunit_file_path;
	private static String atl_file_path = Configuration.atl_file_path;
	private static String output_model_file_path = Configuration.output_model_file_path;
	
	/* 3- Define the name of the changed rule for which the test cases need to be selected. */
	private static String theChangedRule = Configuration.theChangedRule; 
	
	/* 4- Define the names of the input and output metamodels. */
	private static String input_metamodel_name = Configuration.input_metamodel_name;
	private static String output_metamodel_name =Configuration.output_metamodel_name; 
	
	public static void main(String args[]) throws IOException {
		//Read the eunit file to get the mappings between test cases and target models
		/* We make the following assumptions on the formatting of the eunit file:
		 * - Every test case is written as follows (Replace the string arguments as necessary):
			 @test
			 operation compareModel() {
  			 	runTarget("atl1");
             	assertEqualModels("QPN1Expected", "QPN1");
             }
             Note that each line contains at most one statement or a declaration. The name of the test case
             is enclosed in parentheses following runTarget. Also, the names of the source test model and the target (expected) model
             are enclosed in parentheses following assertEqualModels.
		 */
		try {
			input = new Scanner(Paths.get(eunit_file_path));
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
		/* We make the following assumptions on the formatting of the ATL program file:
		 * Every rule should start as follows-as an example:
		   rule Server {
				from qn_s : MultiClassQN!Server
		   		
		   The keyword rule should be followed by the name of the rule. Also, the keyword from should be followed by ! in the 
		   same line. The content after ! is the meta-class of the elements on which the rule applies.	
			 
		 */
		try {
			input = new Scanner(Paths.get(atl_file_path));
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

					r_class.put(rule, c);
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
		//Build the test case model and save it as testCaseSet.model in the output folder
		/* We assume that the source model files are in the folder named 'models' on the same path as the class file.
		 * We also make an assumption on the names of the source model files. They should be named as follows: input_metamodel_name
		 * followed by a number identifier. For example, QN25.model
		 */
		for(Entry<String,Tuple> e:tc_i_o.entrySet()) {
			String sourceModel = StringUtils.replace(e.getValue().outputModel, output_metamodel_name, input_metamodel_name );
			System.out.println(getMappingsForModel(sourceModel+".model") );
		
		}

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestCaseMMPackage.eNS_URI, TestCaseMMPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = Paths.get(output_model_file_path).toAbsolutePath().toString(); 
		Resource resource = resourceSet.createResource(URI.createFileURI(loc));
		resource.getContents().clear();
		tcsRF= TestCaseMMFactoryImpl.init();
		TestCaseSet testCaseSet= tcsRF.createTestCaseSet();
		resource.getContents().add(testCaseSet);
		
		for(Entry<String,Tuple> e:tc_i_o.entrySet()) {
			String sourceModel = StringUtils.replace(e.getValue().outputModel, output_metamodel_name, input_metamodel_name );
			buildTestCaseModel(testCaseSet,sourceModel+".model");
		
		}
		
		resource.save(null);
		
		System.out.println("\n\n--\n\n");
		/*
		 * theChangedRule is the name of the rule that has been changed.
		 */
		//printEUnitFile method prints the contents of the eunit file to the console and saves it in a new file test.eunit in the output folder 
		printEUnitFile(theChangedRule);
	}
	
	public static void buildTestCaseModel(TestCaseSet tcSet, String model) throws IOException {
		ArrayList<String> listClasses = new ArrayList<>();
		
		// Load the model using EMF
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(MultiClassQNPackage.eNS_URI, MultiClassQNPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = ReadEUnitFile_General.class.getResource("models/"+ model).getFile();
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
					if(StringUtils.substringAfter(e.getValue().outputModel,input_metamodel_name).equals(
							StringUtils.substringBetween(model,input_metamodel_name ,".model"))) {
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
			if(entry.getValue().equals(c))
            	lr.add(entry.getKey());
		}
		return lr;
	}
	
	public static String getMappingsForModel(String model) throws IOException {
		String returnString ="";
		ArrayList<String> listClasses = new ArrayList<>();
		
		// Load the model using EMF
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(MultiClassQNPackage.eNS_URI, MultiClassQNPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = ReadEUnitFile_General.class.getResource("models/"+ model).getFile();
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
					if(StringUtils.substringAfter(e.getValue().outputModel,output_metamodel_name).equals(
							StringUtils.substringBetween(model,input_metamodel_name,".model")))
						returnString += String.format("%s %s %s %s%n",r, e.getKey(), e.getValue().inputModel, e.getValue().outputModel );
				
				}
		
		return returnString;
	}
	
	public static void printEUnitFile(String theChangedRule) throws IOException {
		// Load the model using EMF
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TestCaseMMPackage.eNS_URI, TestCaseMMPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		String loc = Paths.get(output_model_file_path).toAbsolutePath().toString();
		Resource resource = resourceSet.createResource(URI.createFileURI(loc));
		resource.load(new HashMap<Object, Object>());

		Object o = resource.getContents();

		TreeIterator<EObject> ir = resource.getAllContents();
		TestCaseSet s;
		s = (TestCaseSet)(ir.next());
		EList<Rule> listRules = s.getRules();
		for(Rule r: listRules) {
			if(r.getName().equals(theChangedRule)){
				System.out.printf("%s %s %s%n",r.getTestCases().get(0).getName(),r.getTestCases().get(0).getSourceModel().getName() ,r.getTestCases().get(0).getTargetModel().getName() );
			}
		}
		
		Formatter output = new Formatter(Paths.get("output/test.eunit").toString());
		for(Rule r: listRules) {
			if(r.getName().equals(theChangedRule)){
				output.format("%s\n", "@test");
				output.format("%s\n", "operation compareModel() {");
				output.format("%s%s%s\n", "runTarget(\"",r.getTestCases().get(0).getName(),"\");");
				output.format("%s%s%s%s%s\n", "assertEqualModels(\"",r.getTestCases().get(0).getSourceModel().getName(),"\",\"",r.getTestCases().get(0).getTargetModel().getName(),"\");");
				output.format("%s\n\n", "}");
			}
		}
		output.close();
		
		
	}
}


