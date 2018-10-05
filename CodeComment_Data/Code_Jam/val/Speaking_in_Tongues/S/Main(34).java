package methodEmbedding.Speaking_in_Tongues.S.LYD711;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author azab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner in = new Scanner(new BufferedReader(new FileReader("in.txt")));
            BufferedWriter out  = new BufferedWriter(new FileWriter("out.txt"));
            Map<Character, Character> map = new HashMap<Character, Character>();
            map.put('a','y');
            map.put('b','h');
            map.put('c','e');
            map.put('d','s');
            map.put('e','o');
            map.put('f','c');
            map.put('g','v');
            map.put('h','x');
            map.put('i','d');
            map.put('j','u');
            map.put('k','i');
            map.put('l','g');
            map.put('m','l');
            map.put('n','b');
            map.put('o','k');
            map.put('p','r');
            map.put('q','z');
            map.put('r','t');
            map.put('s','n');
            map.put('t','w');
            map.put('u','j');
            map.put('v','p');
            map.put('w','f');
            map.put('x','m');
            map.put('y','a');
            map.put('z','q');
            map.put(' ',' ');
            
            int n = in.nextInt();
            in.nextLine();
            for(int i=1; i<=n; i++)
            {
                String src = in.nextLine();
                String dst = "";
                for(int j=0; j<src.length(); j++)
                {
                    dst += map.get(src.charAt(j));
                }
                String tmp = "Case #"+i+": "+dst;
                if(i != n)
                    tmp += "\n";
                out.write(tmp);
            }
            
            in.close();
            out.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
