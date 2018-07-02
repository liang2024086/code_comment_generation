package methodEmbedding.Speaking_in_Tongues.S.LYD1570;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DebrajMallick
 */
public class me {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "y");
        map.put("b", "h");
        map.put("c", "e");
        map.put("d", "s");
        map.put("e", "o");
        map.put("f", "c");
        map.put("g", "v");
        map.put("h", "x");
        map.put("i", "d");
        map.put("j", "u");
        map.put("k", "i");
        map.put("l", "g");
        map.put("m", "l");
        map.put("n", "b");
        map.put("o", "k");
        map.put("p", "r");
        map.put("q", "z");
        map.put("r", "t");
        map.put("s", "n");
        map.put("t", "w");
        map.put("u", "j");
        map.put("v", "p");
        map.put("w", "f");
        map.put("x", "m");
        map.put("y", "a");
        map.put("z", "q");
        map.put(" ", " ");
        try {
            String inputFileName = "F:\\MyProjects\\CodeJam\\src\\codejam\\A-small-attempt2.in";
            String outputFileName = "F:\\MyProjects\\CodeJam\\src\\codejam\\me.out";
            FileReader inputFileReader = new FileReader(inputFileName);
            FileWriter outputFileReader = new FileWriter(outputFileName);
            BufferedReader inputStream = new BufferedReader(inputFileReader);
            PrintWriter outputStream = new PrintWriter(outputFileReader);
            int init = 0;
            String inLine = null;
            while ((inLine = inputStream.readLine()) != null) {
                if (init == 0) {
                    init++;
                } else {
                    String str = "";
                    for (int i = 0; i < inLine.length(); i++) {
                        //System.out.println(String.valueOf(inLine.charAt(i)));
                        str = str + map.get(String.valueOf(inLine.charAt(i)));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Case #").append(init).append(": ").append(str);
                    System.out.println(sb);
                    outputStream.println(sb);
                    init++;
                }
            }
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {

            System.out.println("IOException:");
            e.printStackTrace();

        }
    }
}
