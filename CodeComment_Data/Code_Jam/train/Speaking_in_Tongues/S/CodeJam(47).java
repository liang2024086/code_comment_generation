package methodEmbedding.Speaking_in_Tongues.S.LYD12;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author cristian
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> d = new HashMap<String, String>();
        d.put("y", "a");
        d.put("n", "b");
        d.put("f", "c");
        d.put("i", "d");
        d.put("c", "e");
        d.put("w", "f");
        d.put("l", "g");
        d.put("b", "h");
        d.put("k", "i");
        d.put("u", "j");
        d.put("o", "k");
        d.put("m", "l");
        d.put("x", "m");
        d.put("s", "n");
        d.put("e", "o");
        d.put("v", "p");
        d.put("z", "q");
        d.put("p", "r");
        d.put("d", "s");
        d.put("r", "t");
        d.put("j", "u");
        d.put("g", "v");
        d.put("t", "w");
        d.put("h", "x");
        d.put("a", "y");
        d.put("q", "z");

        StringBuffer sb;
        Boolean firstLine = true;

        try {
            // Open the file that is the first 
            // command line parameter
            FileInputStream fstream = new FileInputStream("/tmp/codejam.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            int line = 1;
            while ((strLine = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                sb = new StringBuffer();
                // Print the content on the console
                //System.out.println(strLine);
                for (int i = 0; i < strLine.length();
                        i++) {
                    String letter = Character.toString(strLine.charAt(i));
                    if (letter.equals(" ")) {
                        sb.append(" ");
                    } else {
                        sb.append(d.get(letter));
                    }
                }

                System.out.println("Case #"+ line + ": " + sb.toString());
                line++;
                
                //Case #1: our language is impossible to understand
                //Case #2: there are twenty six factorial possibilities
                //Case #3: so it is okay if you want to just give up


            }
            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
}

