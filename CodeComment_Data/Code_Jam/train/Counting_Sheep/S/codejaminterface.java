package methodEmbedding.Counting_Sheep.S.LYD7;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;


public class codejaminterface {
public static void main(String[] args)throws IOException{
	
     try {
        
         File newTextFile = new File("/Users/classxiaoli/Downloads/output.txt");
         FileWriter fw = new FileWriter(newTextFile);
         BufferedReader reader = new BufferedReader(new FileReader("/Users/classxiaoli/Downloads/A-small-attempt1.in"));
         int c=0;
         int i=0;
         int t=0;
         for(int j=0;j<=9;j++) t|=(1<<j);
         String line;
         reader.readLine();
         while ((line= reader.readLine()) != null) {
        	 i++; 
        	 c=Integer.parseInt(line);
           if(c==0) fw.write("Case #"+i+": INSOMNIA"+"\n"); 
           else{
        	 int n=0;
        	 int num=0;
        	 while(num!=t){
        		 n++;
        		 int d=c*n;
        		 while(d!=0){
        			 int k=d%10;
        			 d/=10;
        			 num|=(1<<k); 
        		 }
        	 }
        	 
        	 fw.write("Case #"+i+": "+c*n+"\n");
           }
         }
         fw.close();
      }finally {
         
      }
}
}
