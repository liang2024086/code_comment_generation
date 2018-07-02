package methodEmbedding.Counting_Sheep.S.LYD1472;


import java.util.*;
import java.io.*;


public class Q1 {

	private static Scanner in;

	public static void main(String[] args) throws FileNotFoundException{


		
		in = new Scanner(new File("A-small-attempt0 (1).in"));

		int T=in.nextInt();
		
		
		
		int N = 0;	
		if(T>=1 && T<=100)
		{
			for(int q=0;q<T;q++)
			{
				N=in.nextInt();	
				if(N>=0 && N<=200)
				{
					int mod;
					boolean s=false;
					int next=1;
					int X=N;
					int ans=0;
					boolean[] chk= {false,false,false,false,false,false,false,false,false,false};
					if(N==0)
						s=true;
					while(s==false)
					{
						
						X=N*next;
						ans=X;
						while(X>=1)
						{
							mod=X%10;
							if(chk[mod]!=true)
								chk[mod]=true;
							X=X/10;
						}
						
						
						if(chk[0]==true && chk[1]==true && chk[2]==true && chk[3]==true && chk[4]==true && chk[5]==true && chk[6]==true && chk[7]==true && chk[8]==true && chk[9]==true)
							s=true;
						
						next++;
						
					}
					if(N==0)
						System.out.println("Case #"+(q+1)+": INSOMNIA");
					else
						System.out.println("Case #"+(q+1)+": "+ans);
				}
				

				
			
				
				
				
			}
		}
		
		while(in.hasNextInt())
		{}
		
//		for(int i=0;i<chk.length;i++)
//			System.out.println((i)+" - "+chk[i]);
	}

	
}
