package methodEmbedding.Speaking_in_Tongues.S.LYD804;

import java.util.Scanner;


public class GCJ2012QRPA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t=1; t<=T; t++)
		{
			String str = sc.nextLine();
			str = str.replaceAll("a", "Y");
			str = str.replaceAll("b", "H");
			str = str.replaceAll("c", "E");
			str = str.replaceAll("d", "S");
			str = str.replaceAll("e", "O");
			str = str.replaceAll("f", "C");
			str = str.replaceAll("g", "V");
			str = str.replaceAll("h", "X");
			str = str.replaceAll("i", "D");
			str = str.replaceAll("j", "U");
			str = str.replaceAll("k", "I");
			str = str.replaceAll("l", "G");
			str = str.replaceAll("m", "L");
			str = str.replaceAll("n", "B");
			str = str.replaceAll("o", "K");
			str = str.replaceAll("p", "R");
			str = str.replaceAll("q", "Z");
			str = str.replaceAll("r", "T");
			str = str.replaceAll("s", "N");
			str = str.replaceAll("t", "W");
			str = str.replaceAll("u", "J");
			str = str.replaceAll("v", "P");
			str = str.replaceAll("w", "F");
			str = str.replaceAll("x", "M");
			str = str.replaceAll("y", "A");
			str = str.replaceAll("z", "Q");
			System.out.println("Case #"+t+": "+str.toLowerCase());
		}
	}
}
