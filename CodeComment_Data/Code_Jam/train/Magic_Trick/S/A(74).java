package methodEmbedding.Magic_Trick.S.LYD22;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class A {
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		boolean[] check=new boolean[17];
		for (int r=0;r<t;r++){
			Arrays.fill(check,false);
			int k=sc.nextInt();
			for (int i=0;i<4;i++)
				for(int j=0;j<4;j++)
				{ int n=sc.nextInt();
				  if (i==k-1) check[n]=true;
				}
			k=sc.nextInt();
			int count=0;
			int num=0;
			for (int i=0;i<4;i++)
				for(int j=0;j<4;j++)
				{ int n=sc.nextInt();
				  if (i==k-1 && check[n]){
					  count++;
					  num=n;
				  }
				}
			if (count==0) 
			System.out.println("Case #"+(r+1)+": "+"Volunteer cheated!");
			else if (count==1) 
				System.out.println("Case #"+(r+1)+": "+num);
			else 			System.out.println("Case #"+(r+1)+": "+"Bad magician!");


		}

	}
}
