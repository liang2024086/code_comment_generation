package methodEmbedding.Cookie_Clicker_Alpha.S.LYD108;


import java.io.*;
import java.util.*;
import java.text.*;

public class hello {

	public static void main(String[] Q)
	{
		Scanner sc = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMaximumFractionDigits(7);
		
		boolean flag = true;
		int n=0;
		double c, f,x, tmp1, tmp2, prod, t1, t2;
		
		n = sc.nextInt();
		
		for (int ii = 0; ii< n; ii++)
		{
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			prod =2;
			tmp1=0;
			tmp2=0;
			t1 = 0;
			t2 = 0;
			flag = true;
			while (flag)
			{
				tmp1 = x / prod + t1;
				
				t2 = t1+ c/prod;
				
				tmp2 = x / (prod+f)+t2;
				if (tmp2>tmp1) flag = false; 
				else 
				{
					t1 = t2;
					prod+=f;
				}
			}
			System.out.println("Case #"+String.valueOf(ii+1)+": "+String.valueOf(formatter.format(tmp1)));
		}
		
		sc.close();
		return;
	}
	
}
