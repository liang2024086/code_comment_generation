package methodEmbedding.Standing_Ovation.S.LYD576;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Problem1 {

	   public static String[] tokens,Input;
	   public static int counter;
	   public static FileWriter f1;
	   public static File file;
	   public static int TestCases;
  
    public static  void main(String args[])
    

	       {
	       try {
               
               file = new File("D:\\A-small-attempt1.in");	    	   
	           f1 = new FileWriter("D:\\OutputFile.txt");
               InputStream i = new FileInputStream(file);
               BufferedReader bufferedReader = new BufferedReader(
                               new InputStreamReader(i));
               counter = 0;

               String line;
               while ((line = bufferedReader.readLine()) != null){
                   if(counter!=0){          
                   tokens = line.split(" ");                      
                   Input[counter-1] = tokens[1];	
                  }else if(counter==0){
                	  TestCases = Integer.parseInt(line);
              		  Input = new String[TestCases];
                  }
                  counter++;
               }
               
      	     int t;
             int personNeeded, personClapping,friendsThisTime;
    		 int totalFriends;
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
            		 //System.out.println( str.substring(k, k+1));
            		 personClapping =personClapping + friendsThisTime+( Integer.parseInt(str.substring(k,k+1)));        		 
            	 }
            	 f1.write("Case #"+(j+1)+ ": " +totalFriends);
            	 f1.write("\n");
             }                 
	          f1.close();
	       }
	       catch (IOException e1) {
               e1.printStackTrace();
       }
	}
}

   
