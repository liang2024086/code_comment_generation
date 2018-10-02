package methodEmbedding.Speaking_in_Tongues.S.LYD318;


	import java.io.BufferedReader;
import java.io.BufferedWriter;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.ArrayList;
import java.util.Scanner;


public class solveA {

		public static void main(String args[]) 
		{
			int x ,y,j,k,ans=0;
			int tcount =0;
			try{
				  // Create file 
				  FileWriter fstream = new FileWriter("A-small.out");
				  BufferedWriter out = new BufferedWriter(fstream);
				 
			
	      
			
			 Scanner myfile;
			try {
			
				String encrypt = "yhesocvxduiglbkrztnwjpfmaq";
				FileReader fst = new FileReader("A-small-attempt0.in");
				BufferedReader in = new BufferedReader(fst);
				
				 int testcases = Integer.parseInt(in.readLine());
				 
					 //int testcases = myfile.nextInt();
	         while (testcases != 0 )  
	         {          // Read file content using a while loop
	        	
	        	 String str = in.readLine();
	        	 StringBuffer sbuf = new StringBuffer();
	        	 for(int i=0;i<str.length();i++)
	        	 {
	        		 int m = str.charAt(i)-97;
	        		 if(m >=0 && m<= 25)
	        			 {
	        			 sbuf.append(encrypt.charAt(m));
	        			 }
	        		 else
	        			 sbuf.append(str.charAt(i));
	        	 }
	        	 
			out.write("Case #"+ ++tcount+": "+sbuf+"\n");
			
			//System.out.println("");
			testcases--;
	         }

			  } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Reading file using Scanner

			out.close();
			}catch (Exception e){//Catch exception if any
				  System.err.println("Error: " + e.getMessage());
				  }
			
			
		}

		

}
