package methodEmbedding.Cookie_Clicker_Alpha.S.LYD167;

	import java.util.Scanner;
	import java.io.*;
public class cookiess {

		public static void main(String[] args)  throws IOException   {
			Scanner sc = new Scanner(System.in);
			int tc=sc.nextInt();
		int k=0;
		for(k=0;k<tc;k++)
		{	double C=sc.nextDouble();
		double F=sc.nextDouble();
		double X=sc.nextDouble();
		double ps=2;
		double time=0;
			int compt=0;
		while( (X/ps) > ( (C/ps)+( X/(F+ps)) ) )
		{	ps+=F;
		compt ++;
		}
		int i=0;
		ps=2;
		for(i=0;i<compt;i++)
		{time+=C/ps;
		ps+=F;
		}
		time+=(X/ps);
		System.out.println("Case #"+(k+1)+": "+time);
		}

		
		}




}
