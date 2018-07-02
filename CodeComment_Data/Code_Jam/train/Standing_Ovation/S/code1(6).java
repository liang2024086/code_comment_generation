package methodEmbedding.Standing_Ovation.S.LYD1819;

import java.io.*;
public class code1 {
	
	public static void main(String args[])throws IOException
	{
		 File file = new File("E:\\A-small-attempt2.in");
		    File outFile = new File("E:\\A-small-attempt2.out");
		    BufferedReader br = new BufferedReader(new FileReader(file));
		   BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		//System.out.println("Enter the number of test cases:-");
		int n=Integer.parseInt(br.readLine());
		//	System.out.println("Enter the Strings for test cases:-");
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=br.readLine();
		}
		
		
		for(int i=0;i<n;i++)
		{
			int l=(int)s[i].charAt(0)-48;
			int a[]=new int[l+1];
			int sum=0;
			int count=0;
			for(int j=0;j<l+1;j++)
			{
				a[j]=(int)s[i].charAt(2+j)-48;
				
				while(sum< j)
				{
					sum++;
					count++;
				}
				sum=sum+a[j];
			}
			bw.write("Case #"+(i+1)+": "+count);
			bw.newLine();
			
		}
		bw.close();
	}

}
