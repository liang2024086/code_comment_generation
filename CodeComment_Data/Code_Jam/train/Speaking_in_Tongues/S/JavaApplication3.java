package methodEmbedding.Speaking_in_Tongues.S.LYD952;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Belal
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character, Character> hm = new HashMap();
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
        hm.put(' ', ' ');
        
        ArrayList<String> chars = new ArrayList<>();
        chars.add("a");
        chars.add("b");
        chars.add("c");
        chars.add("d");
        chars.add("e");
        chars.add("f");
        chars.add("g");
        chars.add("h");
        chars.add("i");
        chars.add("j");
        chars.add("k");
        chars.add("l");
        chars.add("m");
        chars.add("n");
        chars.add("o");
        chars.add("p");
        chars.add("q");
        chars.add("r");
        chars.add("s");
        chars.add("t");
        chars.add("u");
        chars.add("v");
        chars.add("w");
        chars.add("x");
        chars.add("y");
        chars.add("z");
        
        
        File input = new File("A-small-attempt0.in");
        Scanner inputStream = new Scanner(input);
        
        File output = new File("A-small-attempt0.out");
        PrintWriter outputStream = new PrintWriter(output);
        
        int cases= Integer.parseInt(inputStream.nextLine());
        for(int i=1; i<=cases; i++){
            String line = inputStream.nextLine();
            char[] charrrs = line.toCharArray();
            String line2 = "";
            for(int k = 0; k<charrrs.length; k++){
                charrrs[k] = hm.get(charrrs[k]);
                line2 = line2.concat(charrrs[k]+"");
            }
            
            outputStream.println("Case #" + i + ": " + line2);
        }
        outputStream.close();
        inputStream.close();
    }
}
