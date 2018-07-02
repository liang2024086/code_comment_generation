package methodEmbedding.Speaking_in_Tongues.S.LYD993;



import java.util.Scanner;

public class A {

	public static final char[] rev = {
		'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 
		'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 
		'j', 'p', 'f', 'm', 'a', 'q'
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= T; i++) {
			String line = sc.nextLine();
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < line.length(); j++) {
				char c = line.charAt(j);
				if(c < 'a' || c > 'z')
					sb.append(c);
				else
					sb.append(rev[c-'a']);
			}
			System.out.println("Case #" + i + ": " + sb.toString());
		}
	}

}
