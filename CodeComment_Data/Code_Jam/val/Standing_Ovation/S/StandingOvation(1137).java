package methodEmbedding.Standing_Ovation.S.LYD1317;

import java.io.*;
class StandingOvation {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr=new PrintWriter(System.out);
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			String str[]=br.readLine().split(" ");
			int temp=0,man=0,temp2=0;
			for(int j=0;j<str[1].length();j++)
			{
				if(temp<j) 
					{
					temp2=j-temp;
					man+=j-temp;
					}
				temp+=Character.getNumericValue(str[1].charAt(j))+temp2;
				temp2=0;
			}
			pr.println("Case #"+(i+1)+": "+man);
		}
		pr.close();
	}
}
