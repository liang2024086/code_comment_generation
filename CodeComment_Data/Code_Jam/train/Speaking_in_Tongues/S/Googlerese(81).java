package methodEmbedding.Speaking_in_Tongues.S.LYD1374;

import java.util.Hashtable;
import java.util.Scanner;
public class Googlerese {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Hashtable<Character, Character> dict = new Hashtable<Character, Character>(27);
    
    dict.put('a', 'y');
    dict.put('b', 'h');
    dict.put('c', 'e');
    dict.put('d', 's');
    dict.put('e', 'o');
    dict.put('f', 'c');
    dict.put('g', 'v');
    dict.put('h', 'x');
    dict.put('i', 'd');
    dict.put('j', 'u');
    dict.put('k', 'i');
    dict.put('l', 'g');
    dict.put('m', 'l');
    dict.put('n', 'b');
    dict.put('o', 'k');
    dict.put('p', 'r');
    dict.put('q', 'z');
    dict.put('r', 't');
    dict.put('s', 'n');
    dict.put('t', 'w');
    dict.put('u', 'j');
    dict.put('v', 'p');
    dict.put('w', 'f');
    dict.put('x', 'm');
    dict.put('y', 'a');
    dict.put('z', 'q');
    dict.put(' ', ' ');
    
    int T = sc.nextInt();
    sc.nextLine();
    
    for (int i = 0; i < T; i++) {
      String Googlerese = sc.nextLine();
      int length = Googlerese.length();
      StringBuilder English = new StringBuilder(length);
      
      for (int j = 0; j < length; j++)
        English.append(dict.get(Googlerese.charAt(j)));
      
      System.out.println("Case #" + (i + 1) + ": " + English);
    }
  }
}
