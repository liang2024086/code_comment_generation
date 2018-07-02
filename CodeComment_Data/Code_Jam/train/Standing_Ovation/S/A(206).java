package methodEmbedding.Standing_Ovation.S.LYD222;

import java.util.Scanner;
import java.util.StringTokenizer;


public class A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int testCase=Integer.parseInt(scanner.nextLine());
		int Smax=0;
		String string=null;
		StringTokenizer st=null;
		for(int i=0;i<testCase;i++)
		{   st=new StringTokenizer(scanner.nextLine());
			Smax=Integer.parseInt(st.nextToken());
			string=st.nextToken();
			int extra=0;
			int count=0;//Integer.parseInt(string.charAt(0)+"")-1;
			//System.out.println(count);
		    for(int j=0;j<=Smax;j++)
		    {   int x=Integer.parseInt(string.charAt(j)+"");
		        if(x==0)
		        {
		        	if(count==0)
		        	{
		        		extra++;
		        	}
		        	else
		        	{
		        		count--;
		        	}
		        }
		        else
		        	count=count+x-1;
		    	
		    }
		    System.out.println("Case #"+(i+1)+": "+extra);
		}

	}


}
