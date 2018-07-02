package methodEmbedding.Speaking_in_Tongues.S.LYD324;

import java.io.*;
import java.util.*;

class GoogleSpeak
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		String langs="yhesocvxduiglbkrztnwjpfmaq";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String ans[]=new String[n];
		for(int i=0;i<n;i++)
		{
			StringBuffer sb=new StringBuffer();
			String s=br.readLine();
			sb.append("Case #"+(i+1)+": ");
			for(int j=0;j<s.length();j++)
			{
				int t=s.charAt(j)-'a';
				if(t==-65)
					sb.append(" ");
				else
					sb.append(langs.charAt(t));
			}
			//sb.append('\0');
			ans[i]=sb.toString();
		}
		for(int i=0;i<n;i++)
			System.out.println(ans[i]);
	}
}
