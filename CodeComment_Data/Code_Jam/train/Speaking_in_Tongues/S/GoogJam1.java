package methodEmbedding.Speaking_in_Tongues.S.LYD1469;

import java.io.*;
public class GoogJam1
{
	public static void main(String args[])
	{try{
		String a="abcdefghijklmnopqrstuvwxyz";
		String b="yhesocvxduiglbkrztnwjpfmaq";
		BufferedReader br=new BufferedReader(new FileReader(args[0]));
		int T=Integer.parseInt(br.readLine());
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt",true));			
					
		for(int i=0;i<T;i++)
		{
		String st=br.readLine();
		int l=st.length();
		char res[]=new char[l];
		
		for(int j=0;j<l;j++)
		{
		if(st.charAt(j)==' ')
		{res[j]=' ';
		continue;
		}
		res[j]=b.charAt((int)st.charAt(j)-97);
				
		}
		String rep=new String(res);
		bw.write("Case #"+(i+1)+": "+rep+"\n");	
				
		}
		br.close();
		bw.close();
		}
		catch(Exception e)
		{}
	}

}
