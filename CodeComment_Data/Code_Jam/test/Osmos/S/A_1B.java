package method_all.Osmos.S.LYD43;

import java.io.*;
import java.util.*;
import java.lang.*;
 
public class A_1B {
    static long [] moteSizes;
    static long [] neededToReach;
    static int [] psum;
    static long [] minMoves;
    
    public static void main(String[] args) {
		try 
		{
			Scanner s = new Scanner(new File("A-small-attempt1.in"));
			FileOutputStream out = new FileOutputStream(new File("lawn2.txt"));
			PrintStream p = new PrintStream(out);
			long num = s.nextInt();
			
			for(int n=1;n<=num;n++)
			{
				long initial=s.nextInt();
				int moteNum=s.nextInt();
				moteSizes=new long [moteNum];
				neededToReach=new long [moteNum];
				psum=new int [moteNum+1];
				minMoves=new long [moteNum];
				
				for(int i=0;i<moteSizes.length;i++)
				{
					moteSizes[i]=s.nextInt();
				}
				if(initial==1)
				{
					p.println("Case #"+n+": "+moteNum);
					continue;
				}
				Arrays.sort(moteSizes);
				
				long cur=initial;
				for(int i=0;i<moteSizes.length;i++)
				{
					long tmp=0;
					while(cur<=moteSizes[i])
					{
						cur+=cur-1;
						tmp++;
					}
					neededToReach[i]=tmp;
					cur+=moteSizes[i];
				}
				int sum=0;
				psum[0]=0;
				for(int i=0;i<moteSizes.length;i++)
				{
					sum+=neededToReach[i];
					psum[i+1]=sum;
				}
				
					int min=500;
					for(int j=0;j<=moteSizes.length;j++)
					{
						int tmp=moteSizes.length-j+psum[j]-psum[0];
						if(tmp<min)
							min=tmp;
					}
					minMoves[0]=min;
					
					p.println("Case #"+n+": "+minMoves[0]);
			}
			
			p.close();
		}
		catch(IOException e)
		{
			System.out.println("There was a problem:" + e);
		
		}
    }
}
