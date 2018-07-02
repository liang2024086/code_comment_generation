package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1137;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClicker {
public static void main(String args[])
{
	File file=new File("B-small-attempt0.in");
	try
	{
  PrintWriter pr=new PrintWriter("B-small-attempt0.out");
	Scanner obj=new Scanner(file);
	int testcases=obj.nextInt();
	
	for(int i=1;i<=testcases;i++)
	{
		double rate=2.0;
	 double C=obj.nextDouble();
	 double F=obj.nextDouble();
	 double X=obj.nextDouble();
	 double totalTime=0.0;
	 while((X/rate)>((X/(rate+F))+(C/rate)))
	 {
	// pr.println("Case #"+i+": "+totalTime+(X/rate));
	 
		totalTime=totalTime+(C/rate);
		rate=rate+F;
		
	 }
	 String s=String.format("%.7f", (totalTime+(X/rate)));
	 pr.println("Case #"+i+": "+s);
	
	 
}
	obj.close();
	pr.close();
	}
	catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}
	

