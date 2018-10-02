package methodEmbedding.Speaking_in_Tongues.S.LYD451;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.util.HashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author bossmizzle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Character, String> hm = new HashMap<Character, String>();
        hm.put('e', "o");
        hm.put('j', "u");
        hm.put('p', "r");
        hm.put('m', "l");
        hm.put('y', "a");
        hm.put('s', "n");
        hm.put('l', "g");
        hm.put('c', "e");
        hm.put('d', "s");
        hm.put('x', "m");
        hm.put('v', "p");
        hm.put('n', "b");
        hm.put('r', "t");
        hm.put('i', "d");
        hm.put('b', "h");
        hm.put('t', "w");
        hm.put('a', "y");
        hm.put('h', "x");
        hm.put('k', "i");
        hm.put('w', "f");
        hm.put('f', "c");
        hm.put('o', "k");
        hm.put('u', "j");
        hm.put('g', "v");
        hm.put('z', "q");
        hm.put('q', "z");
        hm.put(' ', " ");
        // TODO code application logic here
       // String translation = " ";


        try {
            FileInputStream fstream = new FileInputStream("C:/A-small-attempt2.in");
            DataInputStream in = new DataInputStream(fstream);
            Scanner sc = new Scanner(in);
            int N = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < N; i++) {
                String googlerese = sc.nextLine().trim();
                String output = "";
                    for(char c: googlerese.toCharArray()){
                        String translation = hm.get(c);
                        output += translation;
                    }

                    System.out.println("Case #" + (i+1) + ": " + output);
                //}
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
