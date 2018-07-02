package methodEmbedding.Speaking_in_Tongues.S.LYD1049;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		
		Hashtable dic = new Hashtable();
		dic.put('y', 'a');
		dic.put('n', 'b');
		dic.put('f', 'c');
		dic.put('i', 'd');
		dic.put('c', 'e');
		dic.put('w', 'f');
		dic.put('l', 'g');
		dic.put('b', 'h');
		dic.put('k', 'i');
		dic.put('u', 'j');
		dic.put('o', 'k');
		dic.put('m', 'l');
		dic.put('x', 'm');
		dic.put('s', 'n');
		dic.put('e', 'o');
		dic.put('v', 'p');
		dic.put('z', 'q');
		dic.put('p', 'r');
		dic.put('d', 's');
		dic.put('r', 't');
		dic.put('j', 'u');
		dic.put('g', 'v');
		dic.put('t', 'w');
		dic.put('h', 'x');
		dic.put('a', 'y');
		dic.put('q', 'z');
		dic.put(' ', ' ');
		
		for(int l = 1; l <= T;l++){
			String G = in.nextLine();
			String linCon = "";
			for (int c = 0; c < G.length(); c++) {
				linCon += dic.get(G.charAt(c)); 
			}
			System.out.format("\n");
			System.out.format("Case #%d: %s\n", l, linCon);
		}
	}
}
