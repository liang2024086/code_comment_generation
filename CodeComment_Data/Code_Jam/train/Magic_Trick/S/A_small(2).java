package methodEmbedding.Magic_Trick.S.LYD1418;

import java.util.Arrays;
import java.util.Scanner;


public class A_small {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int cas = 0; cas<T; cas++) {
			int row = in.nextInt()-1;
			in.nextLine();
			for(int i = 0; i<row; i++) {
				in.nextLine();
			}
			boolean[] possible = new boolean[16];
			Arrays.fill(possible, false);
			for(int i = 0; i<4; i++) {
				possible[in.nextInt()-1] = true;
			}
			for(int i = 0; i<4-row; i++) {
				in.nextLine();
			}
			
			row = in.nextInt()-1;
			in.nextLine();
			for(int i = 0; i<row; i++) {
				in.nextLine();
			}
			boolean[] possible2 = new boolean[16];
			Arrays.fill(possible2, false);
			for(int i = 0; i<4; i++) {
				possible2[in.nextInt()-1] = true;
			}
			for(int i = 0; i<4-row; i++) {
				in.nextLine();
			}
			for(int i = 0; i<16; i++) {
				possible[i] = possible[i] && possible2[i];
			}
			
			String y = "Volunteer cheated!";
			for(int i = 0; i<16; i++) {
				if(possible[i] && y.length()<6) {
					y = "Bad magician!";
					break;
				}
				if(possible[i]) {
					y = ""+(i+1);
				}
			}
			
			System.out.println("Case #" + (cas+1) + ": "+ y);
		}
	}
}
