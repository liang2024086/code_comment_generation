package methodEmbedding.Cookie_Clicker_Alpha.S.LYD427;

import java.util.Scanner;
import java.io.*;


 class Cookie
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
		double t1;
		double t2;
		double t3=0.0;
		double t4;
		
		double l=2.0;
		String s=bis.readLine();
		String pie[]=s.split("\\s+");
		
		double c=Double.parseDouble(pie[0]);
		double f=Double.parseDouble(pie[1]);
		double x=Double.parseDouble(pie[2]);
		
		do
		{
		 t1=c/l+t3;
		 t2=x/l+t3;
		 t3=t1;
		 l=l+f;
		 t4=x/l+t3;
        
		}while(t4<t2);
       		
		writer.println("Case #"+(i+1)+": "+t2);
		
		}
		writer.close();

	  }
}	  
