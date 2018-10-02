package methodEmbedding.Cookie_Clicker_Alpha.S.LYD350;


import java.text.DecimalFormat;
import java.util.Scanner;

public class magic {

	public static void main(String args[])throws Exception
	{
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		for(int i=0;i<a;i++)
		{
			double c=scn.nextDouble();
			double f=scn.nextDouble();
			double x=scn.nextDouble();
			double D=2;
			double Time=0;
			while(true){
			if(x/D<c/D+(x)/(f+D))
			{
			Time=Time+x/D;	
			break;
			}
			else
			{
				Time=Time+c/D;
				
			D=D+f;
			
			}
			}
			String twoDecimals = new DecimalFormat("#.#######").format(Time);
			System.out.println("Case #"+(i+1)+": "+twoDecimals);
		}

	}
	
}
