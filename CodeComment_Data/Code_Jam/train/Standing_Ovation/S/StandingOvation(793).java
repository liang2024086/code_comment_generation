package methodEmbedding.Standing_Ovation.S.LYD942;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StandingOvation {

	   public static String[] tokens,Input;
	   public static int counter;
	   public static FileWriter OutputFile;
	   public static File Inputfile;
	   public static int TestCases;
  
    public static  void main(String args[])
    {
	     int t,personNeeded, personClapping,friendsThisTime,totalFriends;
	     String currentDir,nextline;;
	       {
	       try {
	    	   currentDir = new java.io.File( "." ).getCanonicalPath();
	    	   Inputfile = new File( currentDir+ "\\A-small-attempt0.in");	    	   
               OutputFile = new FileWriter(currentDir +"\\OutputFile1.txt");
               InputStream i = new FileInputStream(Inputfile);
               BufferedReader bufferedReader = new BufferedReader(
                               new InputStreamReader(i));
               counter = 0;

               while ((nextline = bufferedReader.readLine()) != null){
                   if(counter!=0){          
                   tokens = nextline.split(" ");                      
                   Input[counter-1] = tokens[1];	
                  }else if(counter==0){
                	  TestCases = Integer.parseInt(nextline);
              		  Input = new String[TestCases];
                  }
                  counter++;
               }
               
             t = Input.length;
             
             for(int j = 0; j < t; j++)
             {
            	 personNeeded= 0;
            	 personClapping=0;
            	 totalFriends=0;
            	 friendsThisTime=0;
            	 
            	 String str =Input[j]; 
            	 
            	 for(int k=0;k<str.length();k++)
            	 {
            		 personNeeded = k;
            		 friendsThisTime = 0;
            		 if(personClapping< personNeeded )
            		 {
            			 friendsThisTime= personNeeded -personClapping;
            			 totalFriends = totalFriends+ friendsThisTime;
            		 }
            	
            		 personClapping =personClapping + friendsThisTime+( Integer.parseInt(str.substring(k,k+1)));        		 
            	 }
            	 OutputFile.write("Case #"+(j+1)+ ": " +totalFriends);
            	 OutputFile.write("\n");
             }                 
             OutputFile.close();
	       }
	       catch (IOException e1) {
               e1.printStackTrace();
       }
	}
   }
}
