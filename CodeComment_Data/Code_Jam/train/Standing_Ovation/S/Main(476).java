package methodEmbedding.Standing_Ovation.S.LYD1747;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int smax = in.nextInt();
			char cad[] = in.next().toCharArray();
			int cp = cad[0] - 48;
			int cf = 0;
//			System.out.println(cp);

			for (int i = 1; i < cad.length; i++) {
				if (cp >= i) {
					cp += cad[i] - 48;
				} else if(cad[i]!='0'){
//					System.out.printf("cad i:%d = %c cp:%d\n", i,cad[i], cp);
					cf = cf + i - cp;
					cp += cf + cad[i] - 48;
				}
			}
			System.out.printf("Case #%d: %d\n", tc + 1, cf);
		}
	}
}
