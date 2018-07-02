package methodEmbedding.Speaking_in_Tongues.S.LYD352;

import java.util.Scanner;

public class A {
	private static final char[] OUTPUT_ARRAY = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for (int zz = 1; zz <= T; zz++) {
			String line = in.nextLine();
			int length = line.length();
			StringBuffer buff = new StringBuffer(length);
			for (int i = 0; i < length; i++) {
				char output;
				char input = line.charAt(i);
				if (input == ' ') {
					output = ' ';
				} else {
					output = OUTPUT_ARRAY[input - 97];
				}
				buff.append(output);
			}
			System.out.format("Case #%d: %s\n", zz, buff.toString());
		}
	}
}
