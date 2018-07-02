package methodEmbedding.Magic_Trick.S.LYD1156;

import java.util.Scanner;
import java.io.*;


 class Magic
{
	public static void main(String args[])throws IOException
	{
      FileInputStream fis = new FileInputStream("input.txt");
      DataInputStream in = new DataInputStream(fis);
      
	  BufferedReader bis = new BufferedReader(new InputStreamReader(in));
	  PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
	  
	  int t=Integer.parseInt(bis.readLine());
	  
	     for(int i=0;i<t;i++)
	      {
		   int p=Integer.parseInt(bis.readLine());
		   
		   String w = bis.readLine();
		   String x = bis.readLine();
		   String y = bis.readLine();
		   String z = bis.readLine();
		   
		   String arr1[]={w,x,y,z};
		   String s1=arr1[p-1];
		   String pie[]=s1.split("\\s+");
		  
		  int q=Integer.parseInt(bis.readLine());
		   
		   String a = bis.readLine();
		   String b = bis.readLine();
		   String c = bis.readLine();
		   String d = bis.readLine();
		   
		   String arr2[]={a,b,c,d};
		     
		   String s2=arr2[q-1];
		   
		   String apple[]=s2.split("\\s+");
		   
		   String ans="";
		   int count=0;
		   
		   for(int j=0;j<4;j++)
		   {
		     for(int k=0;k<4;k++)
			 {
			 if(pie[j].equals(apple[k]))
			 {
			 count++;
			 ans=pie[j];
			 }
			 
			 
			 
			 }
		   
		   
		   }
		   if(count==1)
		   {
		   writer.println("Case #"+(i+1)+": "+ans);
		   
		   
		   }
		   
		   else if(count==0)
		   {
		    writer.println("Case #"+(i+1)+": Volunteer cheated!");
		   
		   }
		   
		   else if(count>1)
		   {
		   writer.println("Case #"+(i+1)+": Bad magician!");
		   }
		   
		 
		  

		 
		   
		  }
		  writer.close();
		  
	 }
}	 
