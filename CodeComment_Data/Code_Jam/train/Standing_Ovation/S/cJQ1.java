package methodEmbedding.Standing_Ovation.S.LYD706;

import java.io.*;
import java.math.*;
class cJQ1
{
	public static void main (String args[])	throws IOException
	{
		//BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw=new PrintWriter(System.out, true);
		File file =new File("sub.txt");
		File file1 =new File("read.txt");
		file.createNewFile();
		FileWriter writer =new FileWriter(file);
		int inc=1;
		try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
		String line;
		while ((line = br.readLine()) != null) {
       // process the line.
			if(inc==1)
			{inc+=1;}
			else
			{
			//int t=Integer.parseInt(in.readLine());
			String inp[]=line.split(" ");
			int n=Integer.parseInt(inp[0]);
			int count=0,sum=0,num=0;
			for(int i=0;i<=n;i++)
			{
				num=Character.getNumericValue((inp[1].charAt(i)));
				if(num==0)
				{
					if(sum<=i)
					{
							count+=1;
							sum+=1;
					}
				}
				else
				{
					sum=sum+num;	
				}
			}
			writer.write("Case #"+(inc-1)+": "+count+"\n");
			//pw.println("Case #"+(inc++)+": "+count);
			inc++;
			}
		}
		writer.flush();
		writer.close();
		}
	}
}
