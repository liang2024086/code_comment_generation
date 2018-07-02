package methodEmbedding.Speaking_in_Tongues.S.LYD101;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Rumal
 */
public class Codejam2012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));;
        int T = Integer.parseInt(br.readLine());
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashMap<Character, Character> rmap = new HashMap<Character, Character>();
        map.put(' ', ' ');
        map.put('a', 'y');
        map.put('b', 'n');
        map.put('c', 'f');
        map.put('d', 'i');
        map.put('e', 'c');
        map.put('f', 'w');
        map.put('g', 'l');
        map.put('h', 'b');
        map.put('i', 'k');
        map.put('j', 'u');
        map.put('k', 'o');
        map.put('l', 'm');
        map.put('m', 'x');
        map.put('n', 's');
        map.put('o', 'e');
        map.put('p', 'v');
        map.put('q', 'z');
        map.put('r', 'p');
        map.put('s', 'd');
        map.put('t', 'r');
        map.put('u', 'j');
        map.put('v', 'g');
        map.put('w', 't');
        map.put('x', 'h');
        map.put('y', 'a');
        map.put('z', 'q');
        for (char c : map.keySet()) {
            rmap.put(map.get(c), c);
        }
        for (int t = 1; t <= T; t++) {
            String lan = br.readLine();
            String ans = "";
            for (int i = 0; i < lan.length(); i++) {
                ans += rmap.get(lan.charAt(i));
//                char d = lan.charAt(i);
//                char c = ans.charAt(i);
//                if (map.containsKey(c)) {
//                    char e = map.get(c);
//                    if (e!=d)
//                        System.out.println("error");
//                } else {
//                    map.put(c, d);
//                }
            }
            System.out.println("Case #"+t+": "+ans);
        }
        //System.out.println(map);
    }
}
