package methodEmbedding.Speaking_in_Tongues.S.LYD1443;

import java.io.*;
import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.*;
import java.io.File;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.html.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class Soup
{
   public static void main(String args[])
	{
	  int jumlahH[]=new int[20];
	  int jumlahA[]=new int[20];
	  int jumlahC[]=new int[20];
	  int jumlahK[]=new int[20];
      int jumlahE[]=new int[20];
	  int jumlahR[]=new int[20];
	  int jumlahU[]=new int[20];
	  int jumlahP[]=new int[20];
	 
	  int jum[]=new int[20];
	  String hasil[]=new String[31];
	  
	  
	  int i=0;
      int j=0;
      int k=0;
      int l=0;
	  int il=0;
	  
      try{
		// Open the file that is the first 
		// command line parameter
		FileInputStream fstream = new FileInputStream("a.txt");
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		//Read File Line By Line
		j=0;
		while ((strLine = br.readLine()) != null) 	{
			// Print the content on the console
		    if(j==0)
            {
             i=Integer.parseInt(strLine);	
             if(i>30)
              {
	           i=30;
              }
             else if(i<1)
              {
	           i=1;
              } 			
			 System.out.println (i);
		    }
			else
			{
			 int panjangtext=strLine.length();
			 int posisi=0;
			 //String isi=strLine.trim();
			 char arr[]=strLine.toCharArray(); 
			 String tmp=""; 
			  for(l=0; l<panjangtext; l++)
			  {
			     if(arr[l]=='a')
				 {
				  tmp=tmp+"y";
				 }
				 else if(arr[l]=='b')
				 {
				   tmp=tmp+"h";
				 }
				  else if(arr[l]=='c')
				 {
				    tmp=tmp+"e";
				 }
				  else if(arr[l]=='d')
				 {
				   tmp=tmp+"s";
				 }
				  else if(arr[l]=='e')
				 {
				   tmp=tmp+"o";
				 }
				  else if(arr[l]=='f')
				 {
				   tmp=tmp+"c";
				 }
				 else if(arr[l]=='g')
				 {
				   tmp=tmp+"v";
				 } 
				 else if(arr[l]=='h')
				 {
				   tmp=tmp+"x";
				 }
				 else if(arr[l]=='i')
				 {
				   tmp=tmp+"d";
				 }
				  else if(arr[l]=='j')
				 {
				   tmp=tmp+"u";
				 }
				  else if(arr[l]=='k')
				 {
				   tmp=tmp+"i";
				 }
				  else if(arr[l]=='l')
				 {
				   tmp=tmp+"g";
				 }
				  else if(arr[l]=='m')
				 {
				   tmp=tmp+"l";
				 }
				  else if(arr[l]=='n')
				 {
				   tmp=tmp+"b";
				 }
				  else if(arr[l]=='o')
				 {
				   tmp=tmp+"k";
				 }
				  else if(arr[l]=='p')
				 {
				   tmp=tmp+"r";
				 }
				  else if(arr[l]=='q')
				 {
				   tmp=tmp+"z";
				 }
				  else if(arr[l]=='r')
				 {
				   tmp=tmp+"t";
				 }
				  else if(arr[l]=='s')
				 {
				   tmp=tmp+"n";
				 }
				  else if(arr[l]=='t')
				 {
				   tmp=tmp+"w";
				 }
				  else if(arr[l]=='u')
				 {
				   tmp=tmp+"j";
				 }
				  else if(arr[l]=='v')
				 {
				   tmp=tmp+"p";
				 }
				  else if(arr[l]=='w')
				 {
				   tmp=tmp+"f";
				 }
				  else if(arr[l]=='x')
				 {
				   tmp=tmp+"m";
				 }
				  else if(arr[l]=='y')
				 {
				   tmp=tmp+"a";
				 }
				  else if(arr[l]=='z')
				 {
				    tmp=tmp+"q"; 
				 }
				 else
				 {
				  tmp=tmp+" ";
				 }
				 
				
				 
			  }
			  System.out.println(strLine);
			  
			  System.out.println(tmp);
			  hasil[j]=tmp;
            }
		//Close the input stream
		    j++;
		   }
	       in.close();
		}
		catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		
		
		
      
	  try
	  {
	   File makefile= new File("resultsoup.txt");
       FileWriter fwrite= new FileWriter(makefile);
       PrintWriter pw=new PrintWriter(fwrite);	 
	   for(il=1; il<=i; il++)
         {
		  pw.println("Case #"+(il)+": "+hasil[il]+"\n");
		  System.out.println("case #"+(il)+": "+hasil[il]+"\n");
		 }
	   fwrite.flush();
	   fwrite.close();
	  }
	  catch(IOException e)
	  {
	   e.printStackTrace();
	  }
	  
	}
	

	

  

	
	
	
}

