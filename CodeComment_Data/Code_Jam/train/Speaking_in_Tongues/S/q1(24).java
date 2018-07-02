package methodEmbedding.Speaking_in_Tongues.S.LYD312;

import java.io.*;
public class q1
{
	public static void main(String []args) throws IOException
	{
		String final1="",x1;
		
		char arrG[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
	     char arrT[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',' '};
		
	   PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
	   BufferedReader br=new BufferedReader(new FileReader("input.txt"));
	   
	   int limit=Integer.parseInt(br.readLine());
	   for(int li=1;li<=limit;li++)
	   {
	   	   x1=br.readLine();
	   	   for(int i=0;i<x1.length();i++)
		{
			char ch=x1.charAt(i);
			for(int j=0;j<27;j++)
			   {  if(arrG[j]==ch)
			   	final1=final1+arrT[j]; }
	     }
	     pw.println("Case #"+li+": "+final1);
	     final1="";
	   }
	    pw.close(); 	
			  
	}
}
	
