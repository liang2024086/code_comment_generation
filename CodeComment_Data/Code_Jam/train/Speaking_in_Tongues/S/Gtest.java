package methodEmbedding.Speaking_in_Tongues.S.LYD201;


import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Gtest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String oldMSG = " ynficwlbkuomxsevzpdrjgthaq";
		String newMSG = " abcdefghijklmnopqrstuvwxyz";
		
		try{
	          File rFile = new File("E:/A-small-attempt2.in");
	          File wFile = new File("E:/A-small-attempt2.out"); 
	          BufferedReader br = new BufferedReader(new FileReader(rFile));
	          BufferedWriter bw = new BufferedWriter(new FileWriter(wFile,true));
	          
	          int caseNum = 1;
	          String str = br.readLine();
	          while(str!=null) {
	        	  String output = new String();
	          
	        	  for(int i=0;i<str.length();i++) {
	        		  str.charAt(i);
	        		  int tag = 0;
	        		  while(str.charAt(i) != oldMSG.charAt(tag)) {
	        			  tag++;
	        		  }
	        		  output = output + newMSG.charAt(tag);
	        	  }
	              bw.append("Case #" + caseNum + ": " + output);
	              bw.newLine();
	              bw.flush();
	              str = br.readLine();
	              caseNum++;
	          }
	          bw.close();
	          br.close();
	          System.out.println("DONE!");
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }
		
	}
	
	

}
