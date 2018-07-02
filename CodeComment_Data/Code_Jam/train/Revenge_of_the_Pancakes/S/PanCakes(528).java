package methodEmbedding.Revenge_of_the_Pancakes.S.LYD624;


import java.io.InputStream;
import java.util.Scanner;

public class PanCakes {
//	public static final String IN_FILE = "cake00.in";
	public static final String IN_FILE = "B-small-attempt0.in";

	public static void main(String[] args) {
		InputStream in = PanCakes.class.getResourceAsStream(IN_FILE);
		Scanner sc = new Scanner(in);
		
		int T = sc.nextInt();
		sc.nextLine(); // consumes empty line
		for (int tc = 1; tc <= T; tc++) {
			String token = sc.nextLine();
			CakeStack cakes = new CakeStack(token);
			while ( !cakes.isHappiestStack()) {
				cakes = cakes.flipSameSide();
			}
			System.out.println(String.format("Case #%d: %d",tc,  cakes.countFlip()));
		}
		sc.close();
	}
}
