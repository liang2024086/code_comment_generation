package methodEmbedding.Counting_Sheep.S.LYD1303;

import java.util.*;
import java.util.Random;
import java.io.*;
class SheepCounting
{

     public static void main(String []args)
     {
		try
		{
			File  fileName =new File("A-small-attempt1.in");
			Scanner sc = new Scanner(fileName);
			File fo=new File("Output.txt");
			fo.createNewFile();
			PrintStream out=new PrintStream(new FileOutputStream(fo));
			System.setOut(out);
      
			int test=sc.nextInt();
      
			int a[]=new int[test];
			for(int i=0;i<test;i++)
			{
				a[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<test;i++)
			{
				int j=1;
				int number1=0,number=0;
				count++;
           
				Set<Integer> al1= new LinkedHashSet<Integer>();
				if(a[i]==0)
				{
					out.println("Case #"+count+": "+"INSOMNIA");
				}
				else
				{
					while(al1.size()!=10)
					{
						number =a[i]*j;
						number1=number;
						while(number>0)
						{
							al1.add(number%10);
							number=number/10;
						}
						j++;
					}
					out.println("Case #"+count+": "+number1);
				}
				
			}
		out.close();
		}catch(Exception e)
		{	
			System.out.println(e);
		}
	 }
		
}

