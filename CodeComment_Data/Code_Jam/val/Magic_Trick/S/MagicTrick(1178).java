package methodEmbedding.Magic_Trick.S.LYD1376;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner=	new Scanner (new BufferedReader (new FileReader ("/Users/dongcaishen/0411/A-small-attempt0.in")));
//		Scanner scanner=	new Scanner (System.in);
		int nTests=	scanner.nextInt ();
		int[] s1=	new int[16];
		int[] s2=	new int[16];
		int[] row1=	new int[4];
		int[] row2=	new int[4];
		for (int iTest=	1; iTest <= nTests; ++iTest) {
			System.out.print ("Case #" + iTest + ": ");
			int g1=	scanner.nextInt ();
			for (int i=	0; i < 16; ++i) s1[i]=	scanner.nextInt ();
			int g2=	scanner.nextInt ();
			for (int i=	0; i < 16; ++i) s2[i]=	scanner.nextInt ();
			
			int i, j, k, l=	0;
			for (j=	0, i=	(g1 - 1) * 4; i < g1 * 4; ++i) 	row1[j++]=	s1[i];
			for (j=	0, i=	(g2 - 1) * 4; i < g2 * 4; ++i)	row2[j++]=	s2[i];
			Arrays.sort (row1);
			Arrays.sort (row2);
			
			for (i=j=k=	0; i < 4 && j < 4; ++j) {
				for (; i < 4 && row1[i] < row2[j]; ++i);
				if (i < 4 && row1[i] == row2[j]) {
					l=	row1[i];
					++i;
					++k;
				} 
			}
			switch (k) {
			case 0: System.out.println ("Volunteer cheated!"); break;
			case 1: System.out.println (l); break;
			default: System.out.println ("Bad magician!"); break;
			}
		}
		scanner.close ();
	}

}
