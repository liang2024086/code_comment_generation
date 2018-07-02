package methodEmbedding.Speaking_in_Tongues.S.LYD131;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author BUDDHIMA
 */
public class codejamA {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter(new File("outputA-small.txt")));

        int tests = Integer.parseInt(br.readLine());

        String[] subs = {"y", "h", "e", "s", "o", "c", "v", "x", "d", "u", "i", "g", "l", "b", "k", "r", "z", "t", "n", "w", "j", "p", "f", "m", "a", "q"};


        for (int testIndex = 1; testIndex <= tests; testIndex++) {
            String decrypted = new String();

            String crypted = br.readLine();


            for (int index = 0; index < crypted.length(); index++) {

                int ascii = (int) crypted.charAt(index);
                
                // For lower case
                if (ascii > 96 && ascii < 123) {
                    decrypted += subs[ascii - 97];
                } 
                //For upper case
                else if (ascii > 64 && ascii < 91) {
                    decrypted += subs[ascii - 65].toUpperCase();
                } else {
                    decrypted += crypted.charAt(index);
                }


            }


            if (testIndex == tests) {
                out.write("Case #" + testIndex + ": " + decrypted);
            } else {
                out.write("Case #" + testIndex + ": " + decrypted + "\n");
            }

        }



        out.close();
    }
}
