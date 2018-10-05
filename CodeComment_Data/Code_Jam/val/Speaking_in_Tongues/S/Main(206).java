package methodEmbedding.Speaking_in_Tongues.S.LYD350;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char[] code = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };
		
		int t = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i <= t; i++) {
			char[] c = scanner.nextLine().toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c[j] != ' ') {
					c[j] = code[c[j]-'a'];
				}
			}
			System.out.println("Case #"+i+": " + new String(c));
		}
	}
}
