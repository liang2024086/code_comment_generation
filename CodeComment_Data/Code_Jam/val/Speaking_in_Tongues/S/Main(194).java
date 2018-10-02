package methodEmbedding.Speaking_in_Tongues.S.LYD583;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author mas1991
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new FileWriter("A-small-attempt0.out"));
        HashMap<Character,Character> s= new HashMap<Character, Character>();
        s.put('e', 'o');s.put('j', 'u');s.put('p', 'r');
        s.put('m', 'l');s.put('y', 'a');s.put('l', 'g');
        s.put('c', 'e');s.put('k', 'i');s.put('d', 's');
        s.put('x', 'm');s.put('n', 'b');s.put('r', 't');
        s.put('s', 'n');s.put('i', 'd');s.put('t', 'w');
        s.put('a', 'y');s.put('h', 'x');s.put('w', 'f');
        s.put('f', 'c');s.put('v', 'p');s.put('o', 'k');
        s.put('u', 'j');s.put('z', 'q');s.put('g', 'v');
        s.put('b', 'h');s.put('q', 'z');
        int n = Integer.parseInt(in.readLine());
        StringBuilder a;
        for (int i = 1; i <=n; i++) {
            a= new StringBuilder(in.readLine());
            for (int j = 0; j < a.length(); j++) {
                if(s.containsKey(a.charAt(j)))
                {
                    a.setCharAt(j, s.get(a.charAt(j)));
                }

            }
            out.println("Case #"+i+": "+a);
        }
        out.close();
    }

}
