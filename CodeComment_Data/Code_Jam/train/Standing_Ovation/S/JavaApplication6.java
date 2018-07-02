package methodEmbedding.Standing_Ovation.S.LYD167;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author parul29
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String s2;
         try{
              File file = new File("output.in");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br=new BufferedReader(new FileReader("all.in"));
        s2=br.readLine();
        int test=Integer.parseInt(s2);
       for(int i=0;i<test;i++)
       {
           String s3=br.readLine();
           String s1[]=s3.split(" ");
           int maxShy=Integer.parseInt(s1[0]);
           int []a=new int [s1[1].length()];
           for(int j=0;j<s1[1].length();j++)
           {
               a[j]=Character.getNumericValue(s1[1].charAt(j));
           }
           int added=0,noofperstanding=0;
           for(int k=0;k<a.length;k++)
           {
               if(k>noofperstanding &&a[k]!=0)
               {
                   added=added+k-noofperstanding;
                   noofperstanding=noofperstanding+added;
               }
               noofperstanding=noofperstanding+a[k];
           }
           int n=i+1;
            System.out.println("Case #"+ n+": "+added);
           
                        String s6="Case #"+ n+": "+added+"\n";
			bw.write(s6);
                        
       }
       bw.close();
         }
         catch(Exception e)
         {
             
         }
    }
    
}
