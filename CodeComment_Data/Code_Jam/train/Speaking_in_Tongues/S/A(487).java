package methodEmbedding.Speaking_in_Tongues.S.LYD768;

import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		char dir[] = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
		Scanner sc = new Scanner(System.in);
		System.setOut(new PrintStream(new File("A.out")));
		int T = Integer.parseInt(sc.nextLine());
		for(int ca = 1; ca <= T; ca++) {
			String s = sc.nextLine();
			String line = "";
			for(int i=0; i<s.length(); i++)
				if(s.charAt(i) == ' ') line += " ";
				else line += dir[s.charAt(i) - 'a'];
			System.out.printf("Case #%d: %s\n", ca, line);
		}
	}
}
