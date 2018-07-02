package methodEmbedding.Standing_Ovation.S.LYD189;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out),true);
		int t=Integer.parseInt(b.readLine());
		StringTokenizer st;
		int j=1;
		while(t-->0)
		{
			st=new StringTokenizer(b.readLine());
			int shy=Integer.parseInt(st.nextToken());
			String s=st.nextToken();
			long c=0,req=0;
			for(int i=0;i<s.length();i++)
			{
				if(c<i && s.charAt(i)!='0'){
					req+=i-c;
					c+=req;
				}
				String r="";
				r+=s.charAt(i);
				c+=Integer.parseInt(r);
			}
			out.println("Case #"+j+": "+req);
			j++;
		}
	}
}
