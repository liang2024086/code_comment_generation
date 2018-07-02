package methodEmbedding.Magic_Trick.S.LYD2079;

import java.io.File;
import java.util.Scanner;

/*
1
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 5 4
3 11 6 15
9 10 7 12
13 14 8 16
 */
public class GCJ1 
{

static String case2 = "Bad magician!";
static String case3 = "Volunteer cheated!";
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = null;
		try{
	        sc = new Scanner(new File("/home/robin/Downloads/in1.in"));
		}
		catch(Throwable th)
		{
			
		}
      	int T = sc.nextInt();
      	
      	for(int i=1;i<=T;i++)
      	{
      		int rowNum = sc.nextInt();
      		
      	    int[] el1, el2;
      	    el1= new int[4];
      	    el2 = new int[4];
      	    
      		for(int j=1;j<=4;++j)
      		{
      			if(j==rowNum)
      			{
      				el1[0] = sc.nextInt();
      				el1[1] = sc.nextInt();
      				el1[2] = sc.nextInt();
      				el1[3] = sc.nextInt();
      			}
      			else
      			{
      				sc.nextInt();
	      			sc.nextInt();
	      			sc.nextInt();
	      			sc.nextInt();
      			}
      		}
      		
      		rowNum = sc.nextInt();
      		
      		for(int j=1;j<=4;++j)
      		{
      			if(j==rowNum)
      			{
      				el2[0] = sc.nextInt();
      				el2[1] = sc.nextInt();
      				el2[2] = sc.nextInt();
      				el2[3] = sc.nextInt();
      			}
      			else
      			{
      				sc.nextInt();
	      			sc.nextInt();
	      			sc.nextInt();
	      			sc.nextInt();
      			}
      		}
      		
      		int countCommons=0, common=0;
      		
      		for(int j=0;j<4;j++)
      		{
      			for(int k=0;k<4;k++)
      			{
      				if(el1[j]==el2[k])
      				{
      					countCommons++;
      					common = el1[j];
      				}
      			}
      		}
      		
      		
      		if(countCommons==0)
      		{
      			System.out.println("Case #"+i+": "+case3);
      		}
      		else if(countCommons==1)
      		{
      			System.out.println("Case #"+i+": "+common);
      		}
      		else
      		{
      			System.out.println("Case #"+i+": "+case2);
      		}
      	}
	}

}
