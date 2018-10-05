package methodEmbedding.Speaking_in_Tongues.S.LYD833;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		int testcases = sc.nextInt();
		sc.nextLine();

		char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
						  'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

		char[] googler = {'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u', 'o', 'm', 'x', 's', 'e', 'v',
						  'z', 'p', 'd', 'r', 'j', 'g', 't', 'h', 'a', 'q'};

		ArrayList<Character> English = new ArrayList<Character>();
		ArrayList<Character> Googler = new ArrayList<Character>();
		for(char letter : english) {
			English.add(letter);
		}
		for(char letter : googler) {
			Googler.add(letter);
		}


		for(int testcase = 1; testcase <= testcases; testcase++) {
			char[] line = sc.nextLine().toCharArray();
			String output = "";

			for(char letter : line) {
				if(English.contains(letter)) {
					output = output + english[Googler.indexOf(letter)];
				} else {
					output = output + letter;
				}
			}

			System.out.printf("Case #%d: %s\n", testcase, output);

		}
	}
}
