package methodEmbedding.Speaking_in_Tongues.S.LYD988;

import java.io.PrintWriter;
import java.util.Scanner;


public class Codejam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inFile = null;
	    PrintWriter outFile = null;
	    inFile = FileUtils.ScannerOpen("zin");
	    outFile = FileUtils.PrintWriterOpen("zout");
	    int numberOfTestCase=0;
	    //get the number of test cases
	    if(inFile.hasNext()){
	    	String s=inFile.nextLine();
	    	try{
	    		numberOfTestCase=Integer.parseInt(s);
	    	}catch(Exception e){
	    		
	    	}
	    }
	    
	    //for each test case get the input
	    for(int i=0;i<numberOfTestCase;i++){
	    	Solver s=new Solver(i+1);
	    	s.processInput(inFile, outFile);
	    }
	    inFile.close();
	    outFile.close();
	    System.out.println("Done");
	}

}
