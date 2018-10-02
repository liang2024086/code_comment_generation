package methodEmbedding.Speaking_in_Tongues.S.LYD699;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author Hasala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader("A-small-attempt0.in"));

        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("A.out")));

        HashMap translater = new HashMap(30);

        translater.put('a', 'y');
        translater.put('b', 'h');
        translater.put('c', 'e');
        translater.put('d', 's');
        translater.put('e', 'o');
        translater.put('f', 'c');
        translater.put('g', 'v');
        translater.put('h', 'x');
        translater.put('i', 'd');
        translater.put('j', 'u');
        translater.put('k', 'i');
        translater.put('l', 'g');
        translater.put('m', 'l');
        translater.put('n', 'b');
        translater.put('o', 'k');
        translater.put('p', 'r');
        translater.put('q', 'z');
        translater.put('r', 't');
        translater.put('s', 'n');
        translater.put('t', 'w');
        translater.put('u', 'j');
        translater.put('v', 'p');
        translater.put('w', 'f');
        translater.put('x', 'm');
        translater.put('y', 'a');
        translater.put('z', 'q');
        translater.put(' ', ' ');

        int num = Integer.parseInt(read.readLine());
        
        for(int i=0; i<num ; i++){

            String input = read.readLine();
            int inlength = input.length();
            StringBuilder out = new StringBuilder(100);

            for(int j=0; j<inlength; j++){
            out.append(translater.get(input.charAt(j)));
            
            }
            writer.println("Case #" + (i+1) + ": "+ out);
        }

        writer.flush();
        writer.close();

        System.exit(0);
    }

}
