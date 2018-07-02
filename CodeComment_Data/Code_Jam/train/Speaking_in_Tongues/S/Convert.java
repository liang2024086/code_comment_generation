package methodEmbedding.Speaking_in_Tongues.S.LYD1303;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Convert {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("A-small-attempt0.in");
		Scanner in = new Scanner(file);
		
		int cases = in.nextInt();
		in.useDelimiter("\n");
		for (int i = 0; i < cases; i++) {
			String temp = in.next();
			String output = "";
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == 'a') {
					output += "y";
				} else if (temp.charAt(j) == 'b') {
					output += "h";
				} else if (temp.charAt(j) == 'c') {
					output += "e";
				} else if (temp.charAt(j) == 'd') {
					output += "s";
				} else if (temp.charAt(j) == 'e') {
					output += "o";
				} else if (temp.charAt(j) == 'f') {
					output += "c";
				} else if (temp.charAt(j) == 'g') {
					output += "v";
				} else if (temp.charAt(j) == 'h') {
					output += "x";
				} else if (temp.charAt(j) == 'i') {
					output += "d";
				} else if (temp.charAt(j) == 'j') {
					output += "u";
				} else if (temp.charAt(j) == 'k') {
					output += "i";
				} else if (temp.charAt(j) == 'l') {
					output += "g";
				} else if (temp.charAt(j) == 'm') {
					output += "l";
				} else if (temp.charAt(j) == 'n') {
					output += "b";
				} else if (temp.charAt(j) == 'o') {
					output += "k";
				} else if (temp.charAt(j) == 'p') {
					output += "r";
				} else if (temp.charAt(j) == 'q') {
					output += "z";
				} else if (temp.charAt(j) == 'r') {
					output += "t";
				} else if (temp.charAt(j) == 's') {
					output += "n";
				} else if (temp.charAt(j) == 't') {
					output += "w";
				} else if (temp.charAt(j) == 'u') {
					output += "j";
				} else if (temp.charAt(j) == 'v') {
					output += "p";
				} else if (temp.charAt(j) == 'w') {
					output += "f";
				} else if (temp.charAt(j) == 'x') {
					output += "m";
				} else if (temp.charAt(j) == 'y') {
					output += "a";
				} else if (temp.charAt(j) == 'z') {
					output += "q";
				} else {
					output += " ";
				}
			}
			System.out.println("Case #"+ i + ": " + output);
		}
	}
}
