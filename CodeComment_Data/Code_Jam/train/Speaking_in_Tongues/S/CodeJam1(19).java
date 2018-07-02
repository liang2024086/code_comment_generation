package methodEmbedding.Speaking_in_Tongues.S.LYD291;


import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ivan du Toit <s29363412>
 */
public class CodeJam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Character, Character> charmap = new HashMap();
        //Known

        BufferedReader fIn = null;
        PrintWriter fOut = null;
        try {
            fIn = new BufferedReader(new FileReader("in.txt"));
            fOut = new PrintWriter(new FileWriter("out.txt"));
            
        } catch (IOException e) {
            System.out.println("Invalid file given for output.");     
            System.exit(200);
        }
        
        charmap.put('a', 'y');
        charmap.put('b', 'h');
        charmap.put('c', 'e');
        charmap.put('d', 's');
        charmap.put('e', 'o');
        charmap.put('f', 'c');
        charmap.put('g', 'v');
        charmap.put('h', 'x');
        charmap.put('i', 'd');
        charmap.put('j', 'u');
        charmap.put('k', 'i');
        charmap.put('l', 'g');
        charmap.put('m', 'l');
        charmap.put('n', 'b');
        charmap.put('o', 'k');
        charmap.put('p', 'r');
        charmap.put('q', 'z');
        charmap.put('r', 't');
        charmap.put('s', 'n');
        charmap.put('t', 'w');
        charmap.put('v', 'p');
        charmap.put('w', 'f');
        charmap.put('x', 'm');
        charmap.put('y', 'a');
        charmap.put('u', 'j');
        charmap.put('z', 'q');
        charmap.put(' ', ' ');
        
        Scanner in = new Scanner(fIn);
        int numberOfCases = Integer.parseInt(in.nextLine());
        
        for (int c=0; c<numberOfCases; c++) {
            String s = in.nextLine();
            fOut.print("Case #" + (c+1) + ": ");
            for (int pos=0; pos<s.length(); pos++) {
                fOut.print(charmap.get(s.charAt(pos)));
                //System.out.print(charmap.get(s.charAt(pos)));
            }
            fOut.println();
            //System.out.println("");
        }
        fOut.flush();
    }
}
