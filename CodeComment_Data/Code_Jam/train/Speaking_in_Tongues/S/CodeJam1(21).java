package methodEmbedding.Speaking_in_Tongues.S.LYD1537;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

/**
 *
 * @author Mahmoud
 */
public class CodeJam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader inputRef = new BufferedReader(new FileReader("input1.txt"));
            BufferedReader outputRef = new BufferedReader(new FileReader("output1.txt"));
            String inStrLine, outStrLine;



            HashMap<Character, Character> transGToS = new HashMap<Character, Character>();
            HashMap<Character, Character> transSToG = new HashMap<Character, Character>();

            transSToG.put('a', 'y');
            transGToS.put('y', 'a');
            transSToG.put('o', 'e');
            transGToS.put('e', 'o');
            transSToG.put('z', 'q');
            transGToS.put('q', 'z');
            transSToG.put('q', 'z');
            transGToS.put('z', 'q');

            inStrLine = inputRef.readLine();
            if (inStrLine == null) {
                System.out.println("wrong format");
                return;
            }
            int num = Integer.parseInt(inStrLine);
            for (int i = 0; i < num; i++) {
                inStrLine = inputRef.readLine();
                if (inStrLine == null) {
                    System.out.println("wrong format");
                    return;
                }

                outStrLine = outputRef.readLine();
                if (outStrLine == null) {
                    System.out.println("wrong format");
                    return;
                }


                for (int j = 0; j < inStrLine.length(); j++) {
                    transGToS.put(inStrLine.charAt(j), outStrLine.charAt(j + 9));
                    transSToG.put(outStrLine.charAt(j + 9), inStrLine.charAt(j));
                }
            }

            for (Character c = 'a'; c <= 'z'; c++) {
                System.out.print(c);
                System.out.print("\t" + transSToG.get(c));
                System.out.println("\t" + transGToS.get(c) + "\n");
            }

            inputRef = new BufferedReader(new FileReader("A-small-attempt0.in"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));

            inStrLine = inputRef.readLine();
            if (inStrLine == null) {
                System.out.println("wrong format");
                return;
            }
            num = Integer.parseInt(inStrLine);
            for (int i = 0; i < num; i++) {
                writer.write("Case #" + (i+1) + ": ");
                inStrLine = inputRef.readLine();
                if (inStrLine == null) {
                    System.out.println("wrong format");
                    return;
                }


                for (int j = 0; j < inStrLine.length(); j++) {
                    writer.write(transGToS.get(inStrLine.charAt(j)));
//                    transGToS.put(inStrLine.charAt(j), outStrLine.charAt(j + 9));
//                    transSToG.put(outStrLine.charAt(j + 9), inStrLine.charAt(j));
                }
                
                if(i!=num-1)
                    writer.write('\n');
            }
            
            writer.flush();

        } catch (Exception e) {
            System.err.println("cant open file");
        }
    }
}
