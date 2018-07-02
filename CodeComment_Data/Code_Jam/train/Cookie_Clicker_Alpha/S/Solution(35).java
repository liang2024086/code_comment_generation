package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1311;

import java.util.*;
public class Solution{
	public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(int k=1;k<=n;k++)
        {
			double c=obj.nextDouble();
			double f=obj.nextDouble();
			double x=obj.nextDouble();
			double no=2,t=0;
			double t1=x/no;
			double t2=(c/no)+(x/(no+f));
			while(t1>t2)
			{
				t=t+Double.parseDouble(String.format("%.7f",(c/no)));
				no=no+f;
				t1=x/no;
			    t2=(c/no)+(x/(no+f));
			}
			t=t+Double.parseDouble(String.format("%.7f",(x/no)));
			System.out.print("Case #"+k+": ");
			System.out.printf("%.7f",t);
			System.out.println();
		}
	}
}
