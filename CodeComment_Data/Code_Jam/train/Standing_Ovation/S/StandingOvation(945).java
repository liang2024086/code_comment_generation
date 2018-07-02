package methodEmbedding.Standing_Ovation.S.LYD1237;

import java.io.*;
import java.util.*;
public class StandingOvation {
	final static String inputFile="A-small-attempt0.in";
	final static String outputFile="[output]StandingOvation.txt";
	static Scanner reader;
	static PrintStream writer;
	static int res,n,sum; static int [] a; 
	static String s;
	public static void main(String[] args) throws Exception{
		reader=new Scanner(new FileInputStream(inputFile));
		writer=new PrintStream(new FileOutputStream(outputFile));
		int nTest=reader.nextInt(); int i;
		for (int test=1;test<=nTest;test++){
			n=reader.nextInt();  s=reader.next();
			a=new int[n+2]; Arrays.fill(a, 0);
			for (i=0;i<=n;i++)
				a[i]=((int)s.charAt(i))-((int)'0');
			sum=a[0]; res=0;
			for (i=1;i<=n;i++){
				if ((sum+res)<i) res+=(i-(sum+res));
				sum+=a[i];
			}
			writer.println("Case #"+test+": "+res);
		}
	}

}
