package methodEmbedding.Cookie_Clicker_Alpha.S.LYD774;

import java.util.*;
public class cookiebuilder {
public static void main(String ar[]){
	Scanner input=new Scanner(System.in);
	int T=input.nextInt();
	double c,f,x;
	double time=0.0,count=2.0;
	for(int i=1;i<=T;i++)
	{
		time=0.0;
		count=2.0;
		c=input.nextDouble();
		f=input.nextDouble();
		x=input.nextDouble();
		System.out.println();
		while(true)
		{
		//	System.out.println("Time "+time);
			if(x/count<(c/count+x/(count+f)))
			{
				time=time+x/count;
				System.out.print("Case #"+i+": ");
				System.out.printf("%.7f", time);
				break;
			}
			else
			{
				time=time+c/count;
				//System.out.println("Increment is done here");
				count=count+f;
				
			}
			
		}
	}
}
}
