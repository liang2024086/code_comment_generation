package methodEmbedding.Speaking_in_Tongues.S.LYD558;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karim
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character, Character> myMap=new HashMap<Character, Character>();
        myMap.put('y', 'a');
        myMap.put('n', 'b');
        myMap.put('f', 'c');
        myMap.put('i', 'd');
        myMap.put('c', 'e');
        myMap.put('w', 'f');
        myMap.put('l', 'g');
        myMap.put('b', 'h');
        myMap.put('k', 'i');
        myMap.put('u', 'j');
        myMap.put('o', 'k');
        myMap.put('m', 'l');
        myMap.put('x', 'm');
        myMap.put('s', 'n');
        myMap.put('e', 'o');
        myMap.put('v', 'p');
        myMap.put('z', 'q');
        myMap.put('p', 'r');
        myMap.put('d', 's');
        myMap.put('r', 't');
        myMap.put('j', 'u');
        myMap.put('g', 'v');
        myMap.put('t', 'w');
        myMap.put('h', 'x');
        myMap.put('a', 'y');
        myMap.put('q', 'z');
        myMap.put(' ', ' ');
//        BufferedReader reader = new BufferedReader(new FileReader("B_.in"));
        PrintWriter writer = new PrintWriter("A.out");
        Scanner r=new Scanner(System.in);
        String s=r.nextLine();
        int t=Integer.parseInt(s);
        for (int i=0;i<t;i++){
            s=r.nextLine();
            String original="";
            for (int j=0;j<s.length();j++){
                original+=myMap.get(s.charAt(j));
            }
            writer.write("Case #"+(i+1)+": "+original+"\n");
            writer.flush();
        }
    }
}
