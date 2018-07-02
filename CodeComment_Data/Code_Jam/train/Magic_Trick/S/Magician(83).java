package methodEmbedding.Magic_Trick.S.LYD1890;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Magician {
	public static void main(String args[])
	{
	File file=new File("A-small-attempt3.in");
	try
	{
  PrintWriter pr=new PrintWriter("A-small-attempt3.out");
	Scanner obj=new Scanner(file);
	int testcases=obj.nextInt();
	for(int i=1;i<=testcases;i++)
	{
		
		int firstAns=obj.nextInt();
		for(int j=0;j<(firstAns-1)*4;j++)
			obj.nextInt();
		int arr1[]=new int[4];
		for(int k=0;k<4;k++)
		arr1[k]=obj.nextInt();
		for(int l=0;l<(4-firstAns)*4;l++)
			obj.nextInt();
		int secondAns=obj.nextInt();
		for(int j=0;j<(secondAns-1)*4;j++)
			obj.nextInt();
		int arr2[]=new int[4];
		for(int k=0;k<4;k++)
		arr2[k]=obj.nextInt();
		for(int l=0;l<(4-secondAns)*4;l++)
			obj.nextInt();
		int count=0;
		int n=0;
		for(int z=0;z<4;z++)
		{
		for(int m=0;m<4;m++)
		{
			if(arr1[z]==arr2[m])
			{
				count++;
			    n=m;
			}
		}
		}
		if(count==1)
			pr.println("Case #"+i+": "+arr2[n]);
		if(count==0)
			pr.println("Case #"+i+": "+"Volunteer cheated!");
		if(count>1)
			pr.println("Case #"+i+": "+"Bad magician!");

		
			
		
	}
	obj.close();
	pr.close();
	}
	catch (FileNotFoundException e) {
        e.printStackTrace();
    }
	}

}
