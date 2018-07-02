package methodEmbedding.Speaking_in_Tongues.S.LYD1197;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Googlerese {
	
	public static void main(String[] args) throws IOException {
		String input = "A-small-attempt0.in";
		String output = "A-small-output0.txt";
		Scanner scanner = new Scanner(new File(input));
		PrintWriter os = new PrintWriter(new FileWriter(output));
		int n = scanner.nextInt();
		String temp = scanner.nextLine();
		ArrayList<Character> tempArr = new ArrayList<Character>();
		char c;
		for (int i = 1; i <= n; ++i) {
			os.append("Case #" + i + ": ");
			temp = scanner.nextLine();
			temp = temp.trim();
			for (char ch : temp.toCharArray()) {
				tempArr.add(ch);
			}
			for (int j = 0; j < tempArr.size(); ++j) {
				c = tempArr.get(j);
				if (c == ' ') {
					continue;
				} else if (c == 'a') { // a : y
					c = 'y';
				} else if (c == 'b') { // b : h
					c = 'h';
				} else if (c == 'c') { // c : e
					c = 'e';
				} else if (c == 'd') { // d : s
					c = 's';
				} else if (c == 'e') { // e : o
					c = 'o';
				} else if (c == 'f') { // f : c
					c = 'c';
				} else if (c == 'g') { // g : v
					c = 'v';
				} else if (c == 'h') { // h : x
					c = 'x';
				} else if (c == 'i') { // i : d
					c = 'd';
				} else if (c == 'j') { // j : u
					c = 'u';
				} else if (c == 'k') { // k : i
					c = 'i';
				} else if (c == 'l') { // l : g
					c = 'g';
				} else if (c == 'm') { // m : l
					c = 'l';
				} else if (c == 'n') { // n : b
					c = 'b';
				} else if (c == 'o') { // o : k
					c = 'k';
				} else if (c == 'p') { // p : r
					c = 'r';
				} else if (c == 'q') { // q : z
					c = 'z';
				} else if (c == 'r') { // r : t
					c = 't';
				} else if (c == 's') { // s : n
					c = 'n';
				} else if (c == 't') { // t : w
					c = 'w';
				} else if (c == 'u') { // u : j
					c = 'j';
				} else if (c == 'v') { // v : p
					c = 'p';
				} else if (c == 'w') { // w : f
					c = 'f';
				} else if (c == 'x') { // x : m
					c = 'm';
				} else if (c == 'y') { // y : a
					c = 'a';
				} else if (c == 'z') { // z : q
					c = 'q';
				}
				tempArr.set(j, c);
			}
			temp = "";
			for (char ch : tempArr) {
				temp += ch;
			}
			tempArr.clear();
			os.append(temp + "\n");
			temp = "";
		}
		if (scanner != null) {
			scanner.close();
		}
		if (os != null) {
			os.close();
		}
	}

}
