package methodEmbedding.Cookie_Clicker_Alpha.S.LYD801;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class pb {
public static void main(String []args) throws Exception{
		
		Scanner s=new Scanner(new File("/Users/Rahul/Desktop/B-small-attempt0.in"));
		System.setOut(new PrintStream(new FileOutputStream(new File("/Users/Rahul/Desktop/out.txt"))));
		int k,test;
		test=s.nextInt();
		for(k=1;k<=test;k++)
		{
		s.nextLine();
		double c=s.nextDouble();
		double f=s.nextDouble();
		double x=s.nextDouble();
		double time=0,r=2;
		while((x/r)>((c/r)+(x/(r+f))))
		{
			time=time+(c/r);//System.out.println((c/r)+" ");
			r=r+f;
		}
		//System.out.println((x/r)+" ");
		time=time+(x/r);
		System.out.println("Case #"+k+": "+time);
		}
}
}
