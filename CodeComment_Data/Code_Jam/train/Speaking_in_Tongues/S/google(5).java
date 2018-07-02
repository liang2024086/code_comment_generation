package methodEmbedding.Speaking_in_Tongues.S.LYD158;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;


public class google {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			FileInputStream f=new FileInputStream("C:/Users/HP G6/Desktop/A-small-attempt3.in");
			DataInputStream in = new DataInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			 String strLine;
			 int i=0;
			 while ((strLine = br.readLine()) != null)   {
				 i=i+1;
				 if(i==1)
				 {
				 }else{
					 char a[]=strLine.toCharArray();
					 for(int j=0; j<strLine.length();j++)
					 {
						 if(strLine.charAt(j)=='a')
						 {
							 a[j]='y';
						 }
						 if(strLine.charAt(j)=='b')
						 {
							 a[j]='h';
						 }
						 if(strLine.charAt(j)=='c')
						 {
							 a[j]='e';
						 }
						 if(strLine.charAt(j)=='d')
						 {
							 a[j]='s';
						 }
						 if(strLine.charAt(j)=='e')
						 {
							 a[j]='o';
						 }
						 if(strLine.charAt(j)=='f')
						 {
							 a[j]='c';
						 }
						 if(strLine.charAt(j)=='g')
						 {
							 a[j]='v';
						 }
						 if(strLine.charAt(j)=='h')
						 {
							 a[j]='x';
						 }
						 if(strLine.charAt(j)=='i')
						 {
							 a[j]='d';
						 }
						 if(strLine.charAt(j)=='j')
						 {
							 a[j]='u';
						 }
						 if(strLine.charAt(j)=='k')
						 {
							 a[j]='i';
						 }
						 if(strLine.charAt(j)=='l')
						 {
							 a[j]='g';
						 }
						 if(strLine.charAt(j)=='m')
						 {
							 a[j]='l';
						 }
						 if(strLine.charAt(j)=='n')
						 {
							 a[j]='b';
						 }
						 if(strLine.charAt(j)=='o')
						 {
							 a[j]='k';
						 }
						 if(strLine.charAt(j)=='p')
						 {
							 a[j]='r';
						 }
						 if(strLine.charAt(j)=='q')
						 {
							 a[j]='z';
						 }
						 if(strLine.charAt(j)=='r')
						 {
							 a[j]='t';
						 }
						 if(strLine.charAt(j)=='s')
						 {
							 a[j]='n';
						 }
						 if(strLine.charAt(j)=='t')
						 {
							 a[j]='w';
						 }
						 if(strLine.charAt(j)=='u')
						 {
							 a[j]='j';
						 }
						 if(strLine.charAt(j)=='v')
						 {
							 a[j]='p';
						 }
						 if(strLine.charAt(j)=='w')
						 {
							 a[j]='f';
						 }
						 if(strLine.charAt(j)=='x')
						 {
							 a[j]='m';
						 }
						 if(strLine.charAt(j)=='y')
						 {
							 a[j]='a';
						 }
						 if(strLine.charAt(j)=='z')
						 {
							 a[j]='q';
						 }
						
					 }
					
					String result=new String(a);
					
					  try {
	                        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
	                        		"C:/Users/HP G6/Desktop/A-small-attempt3.out"), true));
	                        bw.write("Case #"+(i-1)+": "+result);
	                        bw.newLine();
	                        bw.close();
	                } catch (Exception e) {
	                }

					
					
				 }
				 
				
				 
				  }
			 in.close();
	    }catch (Exception e){//Catch exception if any
	  System.err.println("Error: " + e.getMessage());
	  }
			
		}
		


	
}
