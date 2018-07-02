package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1044;

import java.io.*;
import java.util.*;
class TestClass
{
	public static void main(String []arg)throws Exception
	{
		
			int n;
			BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
			n=Integer.parseInt(read.readLine());	
			int index=1;			
			while(n-->0)
			{
					
			int l=0;
			int flag=0;

				int flag1=0;
				String input=read.readLine();

				char []contain=new char[100];
				while(true)
				{
						int count=1;
					int len=input.length();
					if((input.charAt(0)+"").equals("-") && len==1)
					{
						System.out.println("Case #"+index+": "+ "1");
						break;
					}
					for(int i=0;i<len;i++)
					{
						contain[l++]=input.charAt(i);	
					}
					for(int k=0;k<l;k++)
						{
							flag1=0;
							if(!((contain[k]+"").equals("+")))
							{
								flag1=1;
								
								break;
							}
							
						}
						if(flag1==0)
						{	
							System.out.println("Case #"+index+": "+ "0");
							break;
						}
			
					while(true)
					{
						flag=0;
						for(int j=l-1;j>=0;j--)
						{
							if((contain[j]+"").equals("-") && flag==0)
							{
							//	System.out.println(contain[j]+"ppp");
								contain[j]='+';
								j--;
								flag=1;
							}	
							if(flag==1 && j>=0)
							{
								
								if((contain[j]+"").equals("+"))
								{
									contain[j]='-';
								}
								else
								{
									contain[j]='+';
								}
								
							}
							
						}			
						
						for(int k=0;k<l;k++)
						{
							flag1=0;
							if(!((contain[k]+"").equals("+")))
							{
								flag1=1;
								
								break;
							}
							
						}
						if(flag1==0)
						{	
							
							break;
						}
						count++;
						
							
					}
					if(flag1==0)
					{
						System.out.println("Case #"+index+": "+ count);
						break;
					}
					
				}
				index++;
				
			}
	}
}
