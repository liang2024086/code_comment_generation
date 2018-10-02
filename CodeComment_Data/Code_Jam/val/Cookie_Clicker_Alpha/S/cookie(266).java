package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1635;

import java.io.*;
import java.util.*;
class cookie
{public static void main(String arg[])throws IOException
	{Scanner sc=new Scanner(new InputStreamReader(System.in));
	int T=sc.nextInt(),c=1;
	double C,F,X,min,s,a;
	while((T--)>0)
	{a=2.0;C=sc.nextDouble();F=sc.nextDouble();X=sc.nextDouble();s=0.0;min=s+(X/a);
		while((s+(X/(a+F))+(C/a))<min)
			{min=(s+(X/(a+F))+(C/a));
			s+=(C/a);
			a+=F;
			}
		System.out.println("Case #"+(c++)+": "+min);			
			
			}
	}
}
