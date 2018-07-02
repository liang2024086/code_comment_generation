package methodEmbedding.Speaking_in_Tongues.S.LYD1422;

import java.util.*;
import java.io.*;

class problemA {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(args[0]));
		Map<Character, Character> myMap = new TreeMap<Character, Character>();

		int lines;
		String tempLine;
		char[] tempCharAry;

		lines = sc.nextInt();
		sc.nextLine();

		myMap.put('a', 'y');
		myMap.put('b', 'h');
		myMap.put('c', 'e');
		myMap.put('d', 's');
		myMap.put('e', 'o');
		myMap.put('f', 'c');
		myMap.put('g', 'v');
		myMap.put('h', 'x');
		myMap.put('i', 'd');
		myMap.put('j', 'u');
		myMap.put('k', 'i');
		myMap.put('l', 'g');
		myMap.put('m', 'l');
		myMap.put('n', 'b');
		myMap.put('o', 'k');
		myMap.put('p', 'r');
		myMap.put('q', 'z');
		myMap.put('r', 't');
		myMap.put('s', 'n');
		myMap.put('t', 'w');
		myMap.put('u', 'j');
		myMap.put('v', 'p');
		myMap.put('w', 'f');
		myMap.put('x', 'm');
		myMap.put('y', 'a');
		myMap.put('z', 'q');

		for (int i = 0; i < lines; i++) {
			tempLine = sc.nextLine();

			tempCharAry = tempLine.toCharArray();

			for (int idx = 0; idx < tempLine.length(); idx++) {
				if (tempCharAry[idx] != ' ') {
					tempCharAry[idx] = myMap.get(tempCharAry[idx]);
				}
			}

			tempLine = String.copyValueOf(tempCharAry);
			System.out.println("Case #" + (i+1) + ": " + tempLine);
		}
	}
}
