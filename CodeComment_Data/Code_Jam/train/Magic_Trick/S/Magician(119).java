package methodEmbedding.Magic_Trick.S.LYD1389;


import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
public class Magician {  
     static BufferedWriter writer;  
     static BufferedReader reader;  
     public static void main(String[] args) throws IOException {  
          File inFile = new File("C:\\Users\\Administrator\\Downloads\\A-small-attempt1.IN"); // input file  
          File outFile = new File("C:\\Users\\Administrator\\Downloads\\output3.out"); // outfile  
          FileWriter fwriter = new FileWriter(outFile);  
          writer = new BufferedWriter(fwriter);  
          FileReader freader = new FileReader(inFile);  
          reader = new BufferedReader(freader);  
          int numCases = Integer.parseInt(reader.readLine());  
          System.out.println("numcases = " + numCases);  
          // looping on number of cases  
          double current = 0;  
          int count = 0;  
          
          for(int i=0;i<numCases;i++)
          {
        	  count=0;
        	  int match=0;
        	  String array[][]=new String[2][4];
        	  for(int j=0;j<2;j++)
        	  {
        		  int temp=Integer.parseInt(reader.readLine());
        		  for(int k=1;k<5;k++)
        		  {
        			 String line= reader.readLine();
        			  if(k==temp)
        			  {
        				  array[j]=line.split(" ");
        				 
        			  }
        		  }
        		  
        	  }
        	  for(int j=0;j<4;j++)
        	  {
        		  int first=Integer.parseInt(array[0][j]);
        		  for(int k=0;k<4;k++)
        		  {
        			  int second=Integer.parseInt(array[1][k]);
        			  if(first==second)
        			  {
        				  count++;
        				  match=first;
        			  }
        		  }
        	  }
        	  
        	  if(count==1)
        	  {
        		  writer.write("Case #"+(i+1)+": "+match);
        		  writer.newLine();
        	  }
        	  else if(count==0)
        	  {
        		  writer.write("Case #"+(i+1)+": Volunteer cheated!");
        		  writer.newLine();
        	  }
        	  else
        	  {
        		  writer.write("Case #"+(i+1)+": Bad magician!");
        		  writer.newLine();
        	  }
        		  
          }
           
          writer.close();  
     }  
     
      
}  
