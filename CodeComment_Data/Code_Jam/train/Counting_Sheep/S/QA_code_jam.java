package methodEmbedding.Counting_Sheep.S.LYD1426;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QA_code_jam {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			String str=br.readLine();
			int num=Integer.parseInt(str);
			if(num==0) pr.println("Case #"+(i+1)+": INSOMNIA");
			else{
				int m=2;
				int num1=num;
				int arr[]=new int[10];
				while(true)
				{
					//pr.println("Num "+num);
					//pr.println("Str "+str);
					for(int j=0;j<str.length();j++)
					{
						int t=Character.getNumericValue(str.charAt(j));
						arr[t]++;
					}
					int te=0;
					for(int j=0;j<10;j++)
					{
						//pr.println(j+" "+arr[j]);
						if(arr[j]==0) break;
						else te++;
					}
					if(te==10) 
						{
							pr.println("Case #"+(i+1)+": "+num1);
							break;
						}
					num1=num*m;
					str=Integer.toString(num1);
					m++;
				}
			}
		}
		pr.close();
	}
}
