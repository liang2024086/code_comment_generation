package methodEmbedding.Speaking_in_Tongues.S.LYD1665;

import java.io.*;
import java.util.*; 

public class Googlerese {

/*
abcdefghijklmnopqrstuvwxyz <--input
yhesocvxduiglbkrztnwjpfmaq  <--output
*/
 public static void main(String[] args) {
      try {
        HashMap hm = new HashMap();
        hm.put("a", "y");
        hm.put("b", "h");        
        hm.put("c", "e");
        hm.put("d", "s");
        hm.put("e", "o");
        hm.put("f", "c");
        hm.put("g", "v");
        hm.put("h", "x");
        hm.put("i", "d");
        hm.put("j", "u");
        hm.put("k", "i");
        hm.put("l", "g");
        hm.put("m", "l");
        hm.put("n", "b");
        hm.put("o", "k");
        hm.put("p", "r");
        hm.put("q", "z");
        hm.put("r", "t");
        hm.put("s", "n");
        hm.put("t", "w");
        hm.put("u", "j");
        hm.put("v", "p");
        hm.put("w", "f");
        hm.put("x", "m");
        hm.put("y", "a");
        hm.put("z", "q");
        hm.put(" ", " ");

         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         String s = in.readLine().trim();
         int t = Integer.parseInt(s);

         for (int i = 0; i < t; i++) {
            String input = in.readLine().trim();
            StringBuffer outString = new StringBuffer(); 
            String tmp = "";
             
            for (int j = 0; j < input.length(); j++) {
               tmp = (String) hm.get("" + input.charAt(j));
               outString.append(tmp.charAt(0));
            }
            System.out.println("Case #" + (i+1) + ": " + outString); 
         }   
         
      }
      catch (IOException e) {
         e.printStackTrace();
      }   	
 }
}
