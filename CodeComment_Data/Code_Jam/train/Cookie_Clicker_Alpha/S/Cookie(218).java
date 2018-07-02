package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1022;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int tc=sc.nextInt();
		
		for(int i=0;i<tc;i++)
		{
			double c=sc.nextFloat();
			double f=sc.nextFloat();
			double x=sc.nextFloat();
			
			double t=2.0f;
			
			
			double pt=x/t;
			double ptt=0.0;
			while(true)
			{
				double ct=c/t;
				
				t=t+f;
				
				double ctt=x/t+ct+ptt;
				
				if(pt<ctt)
					break;
				
				pt=ctt;
				ptt=ct+ptt;
				
				
			}
			DecimalFormat df = new DecimalFormat("0.0000000");
			System.out.println("Case #"+(i+1)+": "+df.format(pt) );
		}
	}

}
