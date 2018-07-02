package methodEmbedding.Speaking_in_Tongues.S.LYD1581;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author TatePoon
 */
public class A {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("A_sample.txt"));
        int n = scan.nextInt();
        scan.nextLine();
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = scan.nextLine();
        }
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < n; i++) {
            scan.next();
            scan.next();
            scan.skip(" ");
            String oLine = scan.nextLine();
            for (int j = 0; j < oLine.length(); j++) {
                map.put(lines[i].charAt(j), oLine.charAt(j));
            }
        }
        map.put('z', 'q');
        boolean[] f = new boolean[26];
        for (char c : map.keySet()) {
            if (c != ' ') {
                f[c - 'a'] = true;
            }
        }
        char last = 'z';
        for (int i = 0; i < 26; i++) {
            if (!f[i]) {
                last = (char) ('a' + i);
            }
        }
        boolean[] f2 = new boolean[26];
        for (char c : map.values()) {
            if (c != ' ') {
                f2[c - 'a'] = true;
            }
        }        
        for (int i = 0; i < 26; i++) {
            if (!f2[i]) {
                map.put(last, (char) ('a' + i));
            }
        }
        // finish init map

        scan = new Scanner(new File("A-small-attempt1.in"));
        System.setOut(new PrintStream(new FileOutputStream("A-small-attempt1.out")));
        n = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= n; i++) {
            String line = scan.nextLine();
            System.out.format("Case #%s: ", i);
            for (char c : line.toCharArray()) {
                if (c == ' ') {
                    System.out.print(' ');
                } else {
                    System.out.print(map.get(c));
                }
            }
            System.out.println();
        }
    }
}
