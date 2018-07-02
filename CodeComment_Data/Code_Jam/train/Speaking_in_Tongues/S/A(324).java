package methodEmbedding.Speaking_in_Tongues.S.LYD146;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
	File file = new File("file.in");
	Scanner in = new Scanner(file);

	String S;
	int X = 0;
	HashMap<Character, Character> ht = new HashMap<Character, Character>();
	ht.put('a', 'y');
	ht.put('b', 'h');
	ht.put('c', 'e');
	ht.put('d', 's');
	ht.put('e', 'o');
	ht.put('f', 'c');
	ht.put('g', 'v');
	ht.put('h', 'x');
	ht.put('i', 'd');
	ht.put('j', 'u');
	ht.put('k', 'i');
	ht.put('l', 'g');
	ht.put('m', 'l');
	ht.put('n', 'b');
	ht.put('o', 'k');
	ht.put('p', 'r');
	ht.put('q', 'z');
	ht.put('r', 't');
	ht.put('s', 'n');
	ht.put('t', 'w');
	ht.put('u', 'j');
	ht.put('v', 'p');
	ht.put('w', 'f');
	ht.put('x', 'm');
	ht.put('y', 'a');
	ht.put('z', 'q');
	ht.put(' ', ' ');

	int T = in.nextInt();
	String ret = "";
	String temp = "";
	in.nextLine();
	for (X = 1; X <= T; X++) {
	
		temp=in.nextLine();
		for (int i = 0; i < temp.length(); i++) {
		    ret = ret + Character.toString(ht.get(temp.charAt(i)));
		}
		System.out.println("Case #" + X + ": " + ret);
		ret = "";
	    
	}
    }
}
