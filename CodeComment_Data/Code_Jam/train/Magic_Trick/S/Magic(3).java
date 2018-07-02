package methodEmbedding.Magic_Trick.S.LYD110;

import java.util.*;
import java.io.*;
class Magic
{
  
	public static void main(String args[])throws IOException
	{
		File f=new File("cfi.in");
		Scanner sc=new Scanner(f);
		FileWriter fout=new FileWriter("out7.out");
		int test,k,i,j,r1,r2;
		int count=0,pos=-1;
		int arr2[][]=new int[4][4];
		int arr1[][]=new int[4][4];
		//int tt=sc.nextInt();
		//System.out.println(tt);
		//	try{
			
	
		
		
		 /*fout.write("Case #"+": "+tt+"\n");	
		fout.close();
			}
		catch(Exception e)
		{System.out.println("Wrong input...Exception encountered");
			System.exit(1);
			}*/
			test=sc.nextInt();
			//System.out.println("Enter number of test cases: ");
		
			if(test<1||test>100)
		{
			System.out.println("Not a valid input...stopping execution...");
		System.exit(1);
			}
			for(k=1;k<=test;k++){
			count=0;
			//System.out.println("1.Which row the card is in? ");
			r1=sc.nextInt();
			if(r1<1||r1>4)
			{	System.out.println(k+"Error");System.exit(1);}
			r1--;
			
			
			
			for(i=0;i<4;i++)
				for(j=0;j<4;j++)
				{arr1[i][j]=sc.nextInt();
				if(arr1[i][j]<1||arr1[i][j]>16)
					System.exit(1);
					
				}
				
			//System.out.println("2.Which row the card is in? ");
			r2=sc.nextInt();
				if(r2<1||r2>4)
		{	System.out.println(k+"Error");System.exit(1);}
			r2--;
		
			
			for(i=0;i<4;i++)
				for(j=0;j<4;j++)
					arr2[i][j]=sc.nextInt();
			
			for(i=0;i<4;i++)
			{
				for(j=0;j<4;j++)
				{	if(arr1[r1][i]==arr2[r2][j])
					{count++;pos=i;} 
					
				}
			
		}
		if(count==0)
			fout.write("Case #"+(k)+": Volunteer Cheated!\n");
			else if(count==1)
				fout.write("Case #"+(k)+": "+arr1[r1][pos]+"\n");
			else 
				fout.write("Case #"+(k)+": Bad Magician!"+"\n");
	}
	fout.close();
	}}
