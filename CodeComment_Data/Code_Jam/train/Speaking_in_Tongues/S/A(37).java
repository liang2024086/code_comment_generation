package methodEmbedding.Speaking_in_Tongues.S.LYD115;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S_Malindi
 */
public class A {

    static Map<Character, Character> map = new HashMap<Character, Character>();

    public A() {
    }

    public static void main(String[] args) {
        StringBuffer buffer = null;

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
        map.put('q', 'z');
        map.put('o', 'k');
        map.put('p', 'r');
        map.put('r', 't');
        map.put('s', 'n');
        map.put('t', 'w');
        map.put('u', 'j');
        map.put('v', 'p');
        map.put('w', 'f');
        map.put('x', 'm');
        map.put('y', 'a');
        map.put('z', 'q');

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        String[] ins = new String[T];


        for (int z = 1; z <= T; z++) {
            buffer = new StringBuffer();
            String lineS = in.nextLine();
            ins[(z - 1)] = lineS;

            for (int i = 0; i < lineS.length(); i++) {

                char c = lineS.charAt(i);

                if (c == ' ') {;

                    buffer.append(c);

                } else {
                    char c1 = 0;
                    try {
                        c1 = map.get(c);
                    } catch (Exception e) {
                        System.out.println("ca is " + c);
                    }

                    buffer.append(c1);

                }

            }

            System.out.format("Case #%d: %s\n", z, buffer.toString());


        }

    }
}
