package methodEmbedding.Cookie_Clicker_Alpha.S.LYD127;

import java.io.*;
import java.util.StringTokenizer;
class codejam3
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	
		int T=Integer.parseInt(obj.readLine());
		double []C=new double [T];
		double []F=new double [T];
		double []X=new double [T];
		double []Res=new double [T];
		 
		int i; double t1,t2,t3,c=2,sum;
		
		StringTokenizer st;
		for(i=0;i<T;i++)
		{
			st=new StringTokenizer(obj.readLine());
			
			C[i]=Double.parseDouble(st.nextToken());
			F[i]=Double.parseDouble(st.nextToken());
			X[i]=Double.parseDouble(st.nextToken());
		}

		for(i=0;i<T;i++)
		{
			c=2;
			sum=0;
			t1=C[i]/(double)c;
			t2=X[i]/(double)c;

			t3=t1+(X[i]/((double)(c+F[i])));

			while(t3<t2)
			{
				sum+=t1;
				c=c+F[i];

				t1=C[i]/(double)(c);
				t2=X[i]/(double)(c);
				t3=t1+(X[i]/((double)(c+F[i])));
			//	System.out.println("Sum1="+sum);
			}
			sum+=t2;
			//System.out.println("Sum2="+sum);

			Res[i]=sum;
			
		}

		for(i=0;i<T;i++)
		{
			System.out.print("Case #"+(i+1)+": ");
			System.out.format("%.7f\n",Res[i]);
		}
	}

}
