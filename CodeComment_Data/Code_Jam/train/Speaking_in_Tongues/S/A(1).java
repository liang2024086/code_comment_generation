package methodEmbedding.Speaking_in_Tongues.S.LYD10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A {
	public static void main(String[] args) throws FileNotFoundException {
		String v = "yhesocvxduiglbkrztnwjpfmaq";
		Scanner sc = new Scanner(new File("inputA.txt"));
		int tt = sc.nextInt(), cc = 0;
		sc.nextLine();
		for(int t = 0; t < tt; ++t) {
			String line = sc.nextLine();
			String ans = "";
			for(int i = 0; i < line.length();++i) {
				if(line.charAt(i)==' ')
					ans +=" ";
				else
					ans += v.charAt(line.charAt(i)-'a');
			}

			System.out.format("Case #%d: %s\n", ++cc, ans);
		}
	}
}
