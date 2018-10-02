package methodEmbedding.Speaking_in_Tongues.S.LYD1679;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author karam.yaaqna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line;
        StringTokenizer st ;
        HashMap encryption = new HashMap<String,String>();
        encryption.put("y","a");
        encryption.put("n","b");
        encryption.put("f","c");
        encryption.put("i","d");
        encryption.put("c","e");
        encryption.put("w","f");
        encryption.put("l","g");
        encryption.put("b","h");
        encryption.put("k","i");
        encryption.put("u","j");
        encryption.put("o","k");
        encryption.put("m","l");
        encryption.put("x","m");
        encryption.put("s","n");
        encryption.put("e","o");
        encryption.put("v","p");
        encryption.put("z","q");
        encryption.put("p","r");
        encryption.put("d","s");
        encryption.put("r","t");
        encryption.put("j","u");
        encryption.put("g","v");
        encryption.put("t","w");
        encryption.put("h","x");
        encryption.put("a","y");
        encryption.put("q","z");
        encryption.put(" "," ");

        try{
            BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
            PrintWriter writer = new PrintWriter(new FileOutputStream("output.txt"));
            int testCase = Integer.parseInt(reader.readLine());
            String originalLine = "";
            for(int index = 1;index<=testCase;index++){
                line = reader.readLine();
                for(int i=0;i<line.length();i++)
                {
                   
                    originalLine += encryption.get(line.charAt(i)+"");
                }
               writer.println("Case #"+index+": "+originalLine+"\n");
               //System.out.println(originalLine );
               originalLine = "";
               
            }
         writer.close();
        }catch(Exception e){

       
        }

    }

}
