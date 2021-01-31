**Regression Test Selection Tool**

This project includes the programs that generate the test case models for the following case studies:

1. The OO2DB transformation program case study.
2. The QN2QPN transformation program case study.
3. The BibTeX2DocBook transformation program case study.
4. The CPL2SPL transformation program case study.

In addition, the project includes a generic program that be can edited to apply our framework on other model transformation programs. The name of the program is ReadEUnitFile_General.java 

Each program does the following:

1. Read the .eunit file related to the case study. This is the EUnit file specifying the expected and actual target models for each test case. The .eunit files are included in the eunit folder.
2. Read the transformation program. ETL programs are included in the ETLPrograms folder and ATL programs are included in the ATLPrograms folder.
3. Build the test case model as outlined in the paper.
4. The generated test case model is created and saved in the output folder. Also, at the end of the main method, the name of a changed rule can be specified (see the variable _theChangedRule_). By setting this to the name of one of the rules in the transformation program, the program creates the EUnit file (see test.eunit in the output folder) which can subsequently be used to run only the selected test cases on EUnit. Note that the test case model is used in the final step to select the test cases and generate the .eunit file.

Brief explanations of the programs are included in the programs&#39; comments. The tool works as follows. We will be using the OO2DB model transformation presented in the paper and the test case's source and target models shown in Figures 5 and 6 of the paper as an example. First, the tool reads the EUnit file to get the mappings between the test cases and their source/target models. Thus, the tool recognizes that the model in Figure 6 is the target model for the source model in Figure 5 in this particular test case. Then, the tool reads the transformation program to obtain the mappings between the rules and the source meta-classes. Hence, for example, the tool recognizes that the rule <em>Class2Table</em> is related to the source meta-class <em>Class</em>. Finally, the tool builds the test case model by reading the source models and using the information gained in the previous two steps. For example, for the source model in Figure 5, since it contains <em>Class</em> instances, the tool establishes the link between the rule <em>Class2Table</em> and the test case that relates the source model in Figure 5 and the target model in Figure 6. Once the test case model is built, it can be queried to find the test cases that are selected by our framework. The tool also generates the EUnit file that can be used to re-run the selected test cases automatically.

Note that the following output is displayed on the console when the program is run:

1. Mappings between the EUnit test case IDs and the corresponding expected and actual target models.
2. Mappings between the rules and the corresponding source meta-classes.
3. Mappings between the rules, the EUnit test case IDs, and the corresponding expected and actual target models.
4. Mappings for the selected test cases showing the EUnit test case IDs and the corresponding expected and actual target models.

This output is useful for debugging purposes. The mappings are used to generate the output files and the test case models.

The following external JARs need to be added to the project&#39;s build path:

- org.eclipse.emf.common\_2.14.0.v20180527-1134.jar ([https://jar-download.com/?search\_box=org.eclipse.emf.common](https://jar-download.com/?search_box=org.eclipse.emf.common))
- commons-lang3-3.0.jar ([http://www.java2s.com/Code/Jar/c/Downloadcommonslang3301jar.htm](http://www.java2s.com/Code/Jar/c/Downloadcommonslang3301jar.htm))
- epsilon-1.5.1-kitchensink.jar ([http://mirror1.ku.ac.th/eclipse/epsilon/jars/](http://mirror1.ku.ac.th/eclipse/epsilon/jars/))

**Note:** The test environment containing the test cases, their models, and the EUnit files used in the paper can be downloaded from: 
https://github.com/ialazzon/TestEnvironment

