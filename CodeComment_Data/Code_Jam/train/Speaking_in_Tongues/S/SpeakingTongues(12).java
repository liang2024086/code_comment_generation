package methodEmbedding.Speaking_in_Tongues.S.LYD1545;

import java.util.*;
import java.io.*;
import java.lang.*;

class SpeakingTongues { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put('a', 'y');
    map.put('b', 'h');
    map.put('c', 'e');
    map.put('d', 's');
    map.put('e', 'o');
    map.put('f', 'c');
    map.put('g', 'v');
    map.put('h', 'x');
    map.put('i', 'd');
    map.put('j', 'u');
    map.put('k', 'i');
    map.put('l', 'g');
    map.put('m', 'l');
    map.put('n', 'b');
    map.put('o', 'k');
    map.put('p', 'r');
    map.put('q', 'z'); // q
    map.put('r', 't');
    map.put('s', 'n');
    map.put('t', 'w');
    map.put('u', 'j');
    map.put('v', 'p');
    map.put('w', 'f');
    map.put('x', 'm');
    map.put('y', 'a');
    map.put('z', 'q');
    map.put(' ', ' ');

    for (int i=0; i<T; i++) {
    	String s = sc.nextLine();
    	String r = new String("");
    	for (int j=0; j<s.trim().length(); j++) r += map.get(s.charAt(j));
    	System.out.println("Case #" + (i+1) + ": " + r);
    }
  }
}

