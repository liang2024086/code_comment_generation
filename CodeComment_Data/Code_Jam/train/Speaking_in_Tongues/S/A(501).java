package methodEmbedding.Speaking_in_Tongues.S.LYD765;


import java.util.Scanner;

public class A {
	static char[] lt = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i',
		'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm',
		'a', 'q' };

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int lp = scanner.nextInt();
			scanner.nextLine();
			int c = 0;
			for (int loop = 0; loop < lp; loop++) {
					StringBuilder s = new StringBuilder(scanner.nextLine());
					for (int i = 0; i < s.length(); i++) {
						if (Character.isLetter(s.charAt(i))) {
							s.setCharAt(i, lt[s.charAt(i) - 'a']);
						}
					}
					c++;
					System.out.println("Case #" + c + ": " + s.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
