package methodEmbedding.Speaking_in_Tongues.S.LYD891;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashMap;

/**
 *
 * @author Ostap
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<String,String> map = new HashMap();
       map.put("y", "a");
       map.put("n", "b");
       map.put("f", "c");
       map.put("i", "d");
       map.put("c", "e");
       map.put("w", "f");
       map.put("l", "g");
       map.put("b", "h");
       map.put("k", "i");
       map.put("u", "j");
       map.put("o", "k");
       map.put("m", "l");
       map.put("x", "m");
       map.put("s", "n");
       map.put("e", "o");
       map.put("v", "p");
       map.put("z", "q");
       map.put("p", "r");
       map.put("d", "s");
       map.put("r", "t");
       map.put("j", "u");
       map.put("g", "v");
       map.put("t", "w");
       map.put("h", "x");
       map.put("a", "y");
       map.put("q", "z");
       map.put(" ", " ");
       
       BufferedReader bf = new BufferedReader(new FileReader("A-small-attempt0.in"));
       int n = Integer.parseInt(bf.readLine());
       PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
       
       for (int i = 0;i < n;i++){
           String s = bf.readLine();
           
           String result = "";
           
           for (int j = 0; j < s.length(); j++) {
               result+=map.get(s.substring(j, j+1));
           }
           System.out.println(result);
           
           pw.print("Case #"+(i+1)+": "+result);
           pw.println();
       }
       
       pw.flush();;
       pw.close();
       
       
    }
}
