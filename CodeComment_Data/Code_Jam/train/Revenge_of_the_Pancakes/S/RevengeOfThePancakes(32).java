package methodEmbedding.Revenge_of_the_Pancakes.S.LYD322;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class RevengeOfThePancakes {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("/Users/AMANRAJ/Documents/workspace/Google Code Jam/src/RevengeOfThePancakes/B-small-attempt1.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("/Users/AMANRAJ/Documents/workspace/Google Code Jam/src/RevengeOfThePancakes/output.txt")));
		StringTokenizer s=new StringTokenizer(br.readLine());
		int t=Integer.parseInt(s.nextToken());
		for(int i=0;i<t;i++)
		{
			int count1=0, count2=0;
			String str=br.readLine();
			char arr[]=new char[str.length()];
			arr=str.toCharArray();
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]=='+'){
					count1++;
				}
				else{
					count2++;
				}
			}
			if(count1==arr.length){
				out.println("Case #"+(i+1)+": 0");
			}
			else if(count2==arr.length){
				out.println("Case #"+(i+1)+": 1");
			}
			else{
				boolean flag=false;
				int pos=0, count=0;
				char ch=arr[0];
				for(int j=1;j<arr.length;j++)
				{
					if(arr[j]!=arr[0]){
						pos=j;
						ch=arr[j];
						count++;
						j=1;
						flag=true;
					}
					if(flag==true){
						for(int k=0;k<pos;k++)
						{
							arr[k]=ch;
						}
						int count3=0;
						for(int k=0;k<arr.length;k++)
						{
							if(arr[k]=='-'){
								count3++;
							}
						}
						if(count3==arr.length){
							count++;
						}
						flag=false;
					}
				}
				out.println("Case #"+(i+1)+": "+count);
			}
		}
		out.close();
		br.close();
	}
}
