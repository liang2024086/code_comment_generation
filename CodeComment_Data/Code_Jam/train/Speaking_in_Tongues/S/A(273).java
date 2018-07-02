package methodEmbedding.Speaking_in_Tongues.S.LYD64;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String English = "abcdefghijklmnopqrstuvwxyz ";
		String Googlerese = "ynficwlbkuomxsevzpdrjgthaq ";
		int T = in.nextInt();
		String G = in.nextLine();
		for (int x = 1; x <= T; x++) {
			G = in.nextLine();
			System.out.print("Case #" + x + ": ");
			for (int i = 0; i < G.length(); i++) {
				System.out.print(English.charAt(Googlerese.toLowerCase().indexOf(G.charAt(i))));
			}
			System.out.println();
		}
	}
}
