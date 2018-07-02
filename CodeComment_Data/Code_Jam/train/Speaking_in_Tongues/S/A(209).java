package methodEmbedding.Speaking_in_Tongues.S.LYD365;

import java.util.Scanner;
public class A {
    public static void main(String[] args) {
		// build case
		String googlese = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jvqz";
		googlese = googlese + googlese.toUpperCase();
		String english = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give upzq";
		english = english + english.toUpperCase();
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		scanner.nextLine();
		for(int j = 1; j<N+1; j++) {
			String line = scanner.nextLine();
			StringBuffer buffer = new StringBuffer();
			for(int i = 0; i < line.length(); i++) {
				int index = googlese.indexOf(line.charAt(i));
				buffer.append(english.charAt(index));
			}
			System.out.println("Case #" + j + ": " + buffer.toString());
		}
    }
}
