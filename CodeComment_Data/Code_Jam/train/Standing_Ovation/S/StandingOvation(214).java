package methodEmbedding.Standing_Ovation.S.LYD1325;

import java.io.*;
public class StandingOvation
{
	public static void main(String args[])
	{
	try{
	
	BufferedReader br=new BufferedReader(new FileReader(args[0]));
		int T=Integer.parseInt(br.readLine());
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt",true));
	for(int i1=0;i1<T;i1++)
	{
		String st=br.readLine();
		String sam[]=st.split(" ");
		int n=Integer.parseInt(sam[0]);
		st=sam[1];
		int ans=0;
		int sum= ((int)st.charAt(0))-48;
		
		for(int i=1;i<=n;i++)
		{
			if(sum<i)
			{
				ans++;
				sum+=(((int)st.charAt(i))-47);
			}
			else
			{
				sum+=(((int)st.charAt(i))-48);
			}
		
		}

		bw.write("Case #"+(i1+1)+": "+ans+"\n");
		//System.out.println(count);
	}
	bw.close();
	br.close();
	}
	catch(Exception e)
	{e.printStackTrace();}
	
	}
}
