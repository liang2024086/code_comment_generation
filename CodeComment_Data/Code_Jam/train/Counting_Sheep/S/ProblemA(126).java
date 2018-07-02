package methodEmbedding.Counting_Sheep.S.LYD1182;

import java.io.FileNotFoundException;
import java.util.*;


public class ProblemA {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		java.io.PrintStream out=new java.io.PrintStream("C:/users/Josh/documents/output.txt");
		int run=Integer.parseInt(in.nextLine());
		for(int p=0;p<run;p++)
		{
			String N=in.nextLine();
			int n=Integer.parseInt(N);
			String outp="";
			int []arr={0,0,0,0,0,0,0,0,0,0};
			for (int c=0;c<N.length();c++)
			{
				arr[(Integer.parseInt(N.substring(c, (c+1))))]=1;
			}
			//System.out.println(arr[0]);
			int check=1;
			for(int c=0;c<10;c++)
			{
				if(arr[c]==0)
					check=0;
			}
			int count=2;
			while(check==0)
			{
				if(n==(n*count))
				{
					outp="INSOMNIA";
					break;
				}
				else
				{
					int temp=n*count;
					System.out.println(temp);
					count++;
					N=Integer.toString(temp);
					for (int d=0;d<N.length();d++)
					{
						arr[(Integer.parseInt(N.substring(d, (d+1))))]=1;
					}
					check=1;
					for(int c=0;c<10;c++)
					{
						if(arr[c]==0)
							check=0;
					}
					if (check==1)
						outp=N;
				}
			}
			out.println("Case #"+(p+1)+": "+outp);
		}
	}
}
