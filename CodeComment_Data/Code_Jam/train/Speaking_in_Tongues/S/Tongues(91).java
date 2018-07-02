package methodEmbedding.Speaking_in_Tongues.S.LYD677;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author maheshgupta
 */
public class Tongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            HashMap hm = new HashMap();
            hm.put('a', 'y');
            hm.put('b', 'h');
            hm.put('c', 'e');
            hm.put('d', 's');
            hm.put('e', 'o');
            hm.put('f', 'c');
            hm.put('g', 'v');
            hm.put('h', 'x');
            hm.put('i', 'd');
            hm.put('j', 'u');
            hm.put('k', 'i');
            hm.put('l', 'g');
            hm.put('m', 'l');
            hm.put('n', 'b');
            hm.put('o', 'k');
            hm.put('p', 'r');
            hm.put('q', 'z');
            hm.put('r', 't');
            hm.put('s', 'n');
            hm.put('t', 'w');
            hm.put('u', 'j');
            hm.put('v', 'p');
            hm.put('w', 'f');
            hm.put('x', 'm');
            hm.put('y', 'a');
            hm.put('z', 'q');
           File file = new File("/Users/maheshgupta/Downloads/A-small-attempt0.in"); 
//            File file = new File("/Users/maheshgupta/Desktop/input.txt");
            BufferedReader in = new BufferedReader(new FileReader(file));
            FileWriter fw = new FileWriter("/Users/maheshgupta/Desktop/output.txt");
            String line;
            int cases = Integer.parseInt(in.readLine());

            for (int i = 0; i < cases; i++) {

                line = in.readLine();
                String word = "";
                int number = line.length();
                for (int j = 0; j < number; j++) {
                    char c = line.charAt(j);
                    if (c == 32) {
                        word += c;
                    } else {
                        word += hm.get(c);
                    }


                }
                if(i<cases-1){
                    fw.write("Case #" + (i + 1) + ": " + word + "\n");
                }else{
                    fw.write("Case #" + (i + 1) + ": " + word);
                }
                
            }
            fw.close();
            in.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
