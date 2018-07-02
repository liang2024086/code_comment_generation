package methodEmbedding.Magic_Trick.S.LYD1369;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;


public class A {
	public static void main( String[] args ) throws Exception{
		System.setIn(new FileInputStream("asmall.in"));
		System.setOut(new PrintStream(new File("asmall.out")));
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for ( int casenum = 1; casenum <= T; casenum++ ){
			int a1 = in.nextInt()-1;
			int[][] b1 = new int[4][4];
			int[][] b2 = new int[4][4];
			for ( int j = 0; j < 4; j++ ){
				for ( int k = 0; k < 4; k++ ){
					b1[j][k] = in.nextInt();
				}
			}
			int a2 = in.nextInt()-1;
			for ( int j = 0; j < 4; j++ ){
				for ( int k = 0; k < 4; k++ ){
					b2[j][k] = in.nextInt();
				}
			}
			
			HashSet<Integer> poss1 = new HashSet<Integer>();
			HashSet<Integer> poss2 = new HashSet<Integer>();
			for( int i = 0; i < 4; i++ ){
				poss1.add(b1[a1][i]);
				poss2.add(b2[a2][i]);
			}

			//System.out.println(poss1);
			//System.out.println(poss2);
			
			HashSet<Integer> poss = new HashSet<Integer>();
			for ( int x : poss1 ) {
				if ( poss2.contains(x) ){
					poss.add(x);
				}
			}
			
			System.out.print("Case #" + casenum + ": ");
			
			if ( poss.size() == 1 ){
				System.out.println(poss.iterator().next());
			}
			else if ( poss.size() == 0 ){
				System.out.println("Volunteer cheated!");
			}
			else {
				System.out.println("Bad magician!");
			}
		}
	}
}
