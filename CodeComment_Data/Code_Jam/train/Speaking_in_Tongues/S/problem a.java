package methodEmbedding.Speaking_in_Tongues.S.LYD1582;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dr. Reda M. Hussien
 */
public class ProblemA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String[] Cases;
        
        String[] outs ;
         StringBuilder output = new StringBuilder();
        Map<Character, Character> Mapper = new HashMap<Character, Character>();
        Mapper.put('a', 'y');
        Mapper.put('b', 'h');
        Mapper.put('c', 'e');
        Mapper.put('d', 's');
        Mapper.put('e', 'o');
        Mapper.put('f', 'c');
        Mapper.put('g', 'v');
        Mapper.put('h', 'x');
        Mapper.put('i', 'd');
        Mapper.put('j', 'u');
        Mapper.put('k', 'i');
        Mapper.put('l', 'g');
        Mapper.put('m', 'l');
        Mapper.put('n', 'b');
        Mapper.put('o', 'k');
        Mapper.put('p', 'r');
        Mapper.put('q', 'z');
        Mapper.put('r', 't');
        Mapper.put('s', 'n');
        Mapper.put('t', 'w');
        Mapper.put('u', 'j');
        Mapper.put('v', 'p');
        Mapper.put('w', 'f');
        Mapper.put('x', 'm');
        Mapper.put('y', 'a');
        Mapper.put('z', 'q');
        Mapper.put(' ', ' ');
        System.out.println("Enter the number of test cases: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        
        int n;
         while(true)
        {
         n = Integer.parseInt(ip);
        if((n>=1) && (n<=30))break;
        else
            System.out.println("Enter the number of test cases: between 1 and 30 ");
        }
           Cases = new String[n];
           outs = new String[n];
        for (int i = 0; i < n; i++) {
            while(true)
            {
            Cases[i] = br.readLine();
            if (Cases[i].length()<=100)break;
            else
               System.out.println("G contains at most 100 characters "); 
            }
            
           
            for (Character key : Cases[i].toCharArray()) {
                output.append((Character) Mapper.get(key));
            }

            outs[i] = output.toString();
             output.setLength(0);
        }
        
        for (int k=1;k<outs.length+1;k++)
        System.out.println("Case #"+ k+": " + outs[k-1]);
        
    }
}
