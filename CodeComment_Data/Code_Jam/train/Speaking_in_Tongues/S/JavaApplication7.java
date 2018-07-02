package methodEmbedding.Speaking_in_Tongues.S.LYD438;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Cleyton
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {


        BufferedReader bf = new BufferedReader(new FileReader("C:\\googlecode\\A-small-attempt2.in"));
        String lineResult = "";
        HashMap<String, String> hash = new HashMap<String, String>();

        //construir a hash
        hash.put("y", "a");
        hash.put("n", "b");
        hash.put("f", "c");
        hash.put("i", "d");
        hash.put("c", "e");
        hash.put("w", "f");
        hash.put("l", "g");
        hash.put("b", "h");
        hash.put("k", "i");
        hash.put("u", "j");
        hash.put("o", "k");
        hash.put("m", "l");
        hash.put("x", "m");
        hash.put("s", "n");
        hash.put("e", "o");
        hash.put("v", "p");
        hash.put("z", "q");
        hash.put("p", "r");
        hash.put("d", "s");
        hash.put("r", "t");
        hash.put("j", "u");
        hash.put("g", "v");
        hash.put("t", "w");
        hash.put("h", "x");
        hash.put("a", "y");
        hash.put("q", "z");


        FileWriter fw = new FileWriter("C:\\googlecode\\output.out");

        BufferedWriter bw = new BufferedWriter(fw);

        //primeira linha
        int n = Integer.parseInt(bf.readLine());

        //proximas linhas
        for (int i = 1; i <= n; i++) {
            String str = bf.readLine();
            Scanner s = new Scanner(str);
            lineResult = "Case #" + i + ": ";

            while (s.hasNext()) {

                String token = s.next();
                for (int j = 0; j < token.length(); j++) {

                    lineResult += hash.get(Character.toString(token.charAt(j)));

                }
                if (s.hasNext()) {
                    lineResult += " ";

                }

            }


            if (i != n) {
                fw.write(lineResult + "\n");
            } else {
                fw.write(lineResult);
            }

            // System.out.println(lineResult + "\n");
        }

        fw.flush();
        fw.close();



        //       Scanner s = new Scanner(new FileReader("C:\\codejam\\a-small.in"));

        //primeira linha
        //    int n = Integer.parseInt(s.nextLine());

//        // segunda linha
//        s.nextLine();
//        
//        //terceira linha
//        s.next(); 





    }
}
