package methodEmbedding.Speaking_in_Tongues.S.LYD1118;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Aymen
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String alpha = "abcdefghijklmnopqrstuvwxyz ";
        String beta =  "ynficwlbkuomxsevzpdrjgthaq ";
        String outputFile = System.getenv("USERPROFILE") + "\\Documents\\A-small.out";
        String inputFile = System.getenv("USERPROFILE") + "\\Documents\\A-small.in";
        //String outputFile = System.getenv("USERPROFILE") + "\\Documents\\output.txt";
        //String inputFile = System.getenv("USERPROFILE") + "\\Documents\\input.txt";                
        
        BufferedWriter os = new BufferedWriter(new FileWriter(outputFile));
        DataInputStream is = new DataInputStream(new FileInputStream(inputFile));
        
        int T = Integer.valueOf(is.readLine());
        System.out.println("T " + T);
        for (int i = 0; i < T; i++) {
            String sentence = is.readLine();
            int L = sentence.length();
            String cryptedChar;
            int cryptedInd;
            String realChar;            
            String realSentence = "";
            for (int j = 0; j < L; j++) {
                cryptedChar = String.valueOf(sentence.charAt(0));
                System.out.println(cryptedChar);
                cryptedInd = beta.indexOf(cryptedChar);
                System.out.println(cryptedInd);
                realChar = String.valueOf(alpha.charAt(cryptedInd));
                realSentence += realChar;                
                sentence = sentence.substring(1);
            }
                                                            
            int m = i + 1;
            System.out.println(realSentence);
            os.write("Case #" + m + ": " + realSentence);
            os.newLine();
            System.out.println("");
        }
        is.close();
        os.close();    
    }
}
