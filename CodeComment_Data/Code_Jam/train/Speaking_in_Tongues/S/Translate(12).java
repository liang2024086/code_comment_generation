package methodEmbedding.Speaking_in_Tongues.S.LYD1684;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Translate {

	public static void main(String[] args) {
		int i = 0;
		List<String> strings = new ArrayList<String>();
		List<String> strings2 = new ArrayList<String>();
		char[] alphabet = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x',
				'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z',
				't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		char[] alphabet2 = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x',
				'd', 'u', 'i', 'g', 'l', 'b', 'q', 'r', 'z',
				't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'k'};
		
		
		Scanner scan = new Scanner(System.in);
		try {scan = new Scanner(new FileReader("A-small-attempt1.in"));
		} catch(Exception e) {
			System.out.println("poop");
		}
		int num = Integer.parseInt(scan.nextLine());
		while (scan.hasNextLine() && i < num) {
			i++;
			String a = "";
			String b = "";
			String line = scan.nextLine();
			char[] lineAsChar = line.toCharArray();
			for (char c : lineAsChar) {
				if (c >= 97 && c <= 122) {
					a += alphabet[c - 97];
					b += alphabet2[c-97];
				} else {
					a += c;
					b += c;
				}
			}
			strings.add("Case #" + i + ": " + a);
			strings2.add("Case #" + i + ": " + b);
		}
		
		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println("");
		for (String s : strings2) {
			System.out.println(s);
		}
	}
}
