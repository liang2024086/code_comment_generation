package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1165;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("B-out.txt", "UTF-8");
		while(sc.hasNext()) {
			int T = sc.nextInt();
			sc.nextLine();
			for(int i = 1; i <= T; i++) {
				String s = sc.nextLine();
				int a = s.charAt(s.length()-1) == '+' ? 0 : 1;
				for(int j = 0; j < s.length()-1; j++) {
					a += s.charAt(j)==s.charAt(j+1) ? 0 : 1;
				}
				System.out.println("Case #" + i + ": " + a);
				pw.println("Case #" + i + ": " + a);
			}
			pw.close();
		}
	}

}
