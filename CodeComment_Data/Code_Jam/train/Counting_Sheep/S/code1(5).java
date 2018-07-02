package methodEmbedding.Counting_Sheep.S.LYD124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class code1 {
	public static void main(String a[])throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Darshit Pathak\\Downloads\\A-small-attempt1.in")));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\output.txt")));
		String ab="";
			
			int testCase=Integer.parseInt(br.readLine());
			
			for(int i=1;i<=testCase;i++)
			{
				int N=Integer.parseInt(br.readLine());
				
				int arr[]=new int[10];
				
				if(N==0)
				{
					bw.write("case #"+i+": INSOMNIA\n");
				
				}
				else
				{
					
					int count=0;
					int num=0;
					int incr=1;
					int ans=0;
					while(count<=9)
					{
						
						
						 num=incr*N;
		
						 ans=num;
						 
						while(num!=0)
						{
						int temp=num%10;
						int j;
						for(j=0;j<count;j++)
						{
							if(arr[j]==temp)
								break;
						}
						
						if(j==count)
							arr[count++]=temp;
							
						
						num=num/10;
						
						}
						
						incr++;
					}
					
					bw.write("case #"+i+": "+ans+"\n");
					
				}
			}
			
			bw.close();
		}
	
	
	}


