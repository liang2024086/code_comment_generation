package methodEmbedding.Speaking_in_Tongues.S.LYD685;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author yondaime
 */
public class Main {

    static char a = 'y';
    static char b = 'h';
    static char c = 'e';
    static char d = 's';
    static char e = 'o';
    static char f = 'c';
    static char g = 'v';
    static char h = 'x';
    static char i = 'd';
    static char j = 'u';
    static char k = 'i';
    static char l = 'g';
    static char m = 'l';
    static char n = 'b';
    static char o = 'k';
    static char p = 'r';
    static char q = 'z';//
    static char r = 't';
    static char s = 'n';
    static char t = 'w';
    static char u = 'j';
    static char v = 'p';
    static char w = 'f';
    static char x = 'm';
    static char y = 'a';
    static char z = 'q';//
    static HashMap<Character, Character> hashMap = new LinkedHashMap<>();

    static {
        hashMap.put('a', a);
        hashMap.put('b', b);
        hashMap.put('c', c);
        hashMap.put('d', d);
        hashMap.put('e', e);
        hashMap.put('f', f);
        hashMap.put('g', g);
        hashMap.put('h', h);
        hashMap.put('i', i);
        hashMap.put('j', j);
        hashMap.put('k', k);
        hashMap.put('l', l);
        hashMap.put('m', m);
        hashMap.put('n', n);

        hashMap.put('o', o);
        hashMap.put('p', p);
        hashMap.put('q', q);
        hashMap.put('r', r);
        hashMap.put('s', s);
        hashMap.put('t', t);
        hashMap.put('u', u);
        hashMap.put('v', v);
        hashMap.put('w', w);
        hashMap.put('x', x);
        hashMap.put('y', y);
        hashMap.put('z', z);
        hashMap.put(' ', ' ');
    }
    static String chaine = "ejp mysljylc kd kxveddknmc re jsicpdrysi";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("A-small-attempt3.in"));
        PrintWriter out = new PrintWriter(new File("A-small-attempt3.out"));
        sc.nextLine();
        int kl = 0;
        while (sc.hasNext()) {
            out.print("Case #"+(++kl)+": ");
            String t = sc.nextLine();
            for (int i = 0; i < t.length(); i++) {
                out.print(hashMap.get(t.charAt(i)));
            }
            out.println("");
        }
        out.close();
        sc.close();


    }
}
