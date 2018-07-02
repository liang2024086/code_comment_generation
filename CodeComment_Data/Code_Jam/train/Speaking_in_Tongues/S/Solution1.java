package methodEmbedding.Speaking_in_Tongues.S.LYD1516;

import java.io.*;
public class Solution1
{
	public static void main(String []args) throws IOException
	{
		char arr_eng[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
	    char arr_google[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',' '};
	    BufferedReader br=new BufferedReader(new FileReader("input.txt"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
	    int lines=Integer.parseInt(br.readLine());
	    for(int i=0;i<lines;i++)
	    {
	    	String s=br.readLine();String temp="";
	    	for(int j=0;j<s.length();j++)
	    	   for(int k=0;k<27;k++)
	    		    if(arr_eng[k]==s.charAt(j))
	    		       temp=temp+arr_google[k];
	        pw.println("Case #"+(i+1)+": "+temp);
	    	
	    }
	    pw.close();
	    
	}
}
