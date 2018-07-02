package methodEmbedding.Cookie_Clicker_Alpha.S.LYD209;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Cookie {

	public static void main (String[] args) throws Exception {

//		Scanner scanner=	new Scanner (new BufferedReader(
//				new FileReader ("/Users/dongcaishen/0411/B-small-attempt0.in")));
		Scanner scanner=	new Scanner (System.in);		
		int nTests=	scanner.nextInt ();
		for (int iTest=	1; iTest <= nTests; ++iTest) {
			System.out.print ("Case #" + iTest + ": ");
			double C=	scanner.nextDouble ();
			double F=	scanner.nextDouble ();
			double y=	scanner.nextDouble ();
			int k=	(int)(y / C - 2 / F + 1e-8);
			k=	(k < 0) ? 0 : k;
//			System.out.println ("k=" + k);
			double x=	y / (2 + k * F);
			double den=	2;
			for (int i=	0; i < k; ++i) {
				x+=	C / den;	
				den+=	F;		
			}
			System.out.format("%.7f\n", x);
		}
		scanner.close ();
	}

}
