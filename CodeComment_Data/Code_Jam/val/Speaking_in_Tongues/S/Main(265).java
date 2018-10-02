package methodEmbedding.Speaking_in_Tongues.S.LYD764;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nasir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static HashMap<Character, Character> map = new HashMap<Character, Character>();
    public static String[] strArray;

    public static void main(String[] args) {

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
        map.put('q', 'z');
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

        boolean first = true;
        int size = 0;
        int loop = 0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        while (loop <= size) {
            String str = scanner.nextLine();

            if (first) {
                first = false;
                size = Integer.parseInt(str);
                strArray = new String[size];
            } else {
                strArray[index++] = str.toLowerCase();
            }
            loop++;
        }

        int caseNumber = 1;

        for (int i = 0; i < strArray.length; i++) {

            String temp = strArray[i];
            System.out.print("Case #" + caseNumber + ": ");
            caseNumber++;
            for (int j = 0; j < temp.length(); j++) {
                System.out.print(map.get(temp.charAt(j)));
            }
            if (i < strArray.length - 1) {
                System.out.println();
            }
        }

    }
}
