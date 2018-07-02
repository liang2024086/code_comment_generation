package methodEmbedding.Counting_Sheep.S.LYD1402;

import java.io.*;
import java.util.*;
class Test
{
		public static void main(String []arg)throws Exception
		{
			int n,input;
			BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
			n=Integer.parseInt(read.readLine());
			
			
			String tempa;
			
			
			int index=1;
			while(n-->0)
			{
				String temp="";
				int ans;
				int len,flag=0,k=1,s=0,l=0,flag1=0;
				char []contain=new char[100];
			input=Integer.parseInt(read.readLine());

					
				while(true)
				{
					if(input==0)
					{
						System.out.println("Case #"+index+": INSOMNIA");
						break;
					}
					
					ans=input*k;
					temp=temp+""+ans;			
					len=temp.length();
					
					
						for(int i=0;i<len;i++)
						{
							flag=0;
						
							for(int j=0;j<=l;j++)
							{
								
								if((contain[j]+"").equals(temp.charAt(i)+""))
								{
									flag=1;
									break;
								}
								
							}
							if(flag==0)
							{
								contain[l++]=temp.charAt(i);	
							}
						}

						for(int h=0;h<l&&l==10;h++)
						{

							for(int p=0;p<=9;p++)
							{
								if((contain[h]+"").equals(p+""))
								{
									flag1++;
								}
							}
						}

						if(flag1==10)
						{
							System.out.println("Case #"+index+": "+k*input);
							
							break;
						}
					k++;
					
				}
					
				index++;

	
					
				
				
			}
		}
}
