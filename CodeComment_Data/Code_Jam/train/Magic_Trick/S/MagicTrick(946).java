package methodEmbedding.Magic_Trick.S.LYD2070;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class MagicTrick {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Lukas\\A-small-attempt0.in"));
		PrintWriter wr = new PrintWriter("small.out", "UTF-8");
		int[] poss = new int[4];
		int t = sc.nextInt();
		for(int i = 1; i < t + 1; i++){
			int m = 0, a = 0;
			int r = sc.nextInt();
			for(int j = 1; j < 5; j++)
				if (j != r)
					for(int k = 0; k < 4; k++)
						sc.nextInt();
				else
					for(int k = 0; k < 4; k++)
						poss[k] = sc.nextInt();
			r = sc.nextInt();
			for(int j = 1; j < 5; j++)
				if (j != r)
					for(int k = 0; k < 4; k++)
						sc.nextInt();
				else
					for(int k = 0; k < 4; k++){
						int p = sc.nextInt();
						
						if (p == poss[0] || p == poss[1] || p == poss[2] || p == poss[3]){
							m++;
							a = p;
						}
					}
			if (m == 1)
				wr.println("Case #" + i + ": " + a);
			else if (m == 0)
				wr.println("Case #" + i + ": Volunteer cheated!");
			else
				wr.println("Case #" + i + ": Bad magician!");
		}
		sc.close();
		wr.close();
	}
}
