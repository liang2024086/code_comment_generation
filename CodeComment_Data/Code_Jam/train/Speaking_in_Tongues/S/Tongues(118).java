package methodEmbedding.Speaking_in_Tongues.S.LYD1385;

import java.io.*;
import java.util.*;

public class Tongues {

    public static HashMap<String, String> letters;

    static {
        letters = new HashMap<String, String>();
        letters.put("a", "y");
        letters.put("b", "h");
        letters.put("c", "e");
        letters.put("d", "s");
        letters.put("e", "o");
        letters.put("f", "c");
        letters.put("g", "v");
        letters.put("h", "x");
        letters.put("i", "d");
        letters.put("j", "u");
        letters.put("k", "i");
        letters.put("l", "g");
        letters.put("m", "l");
        letters.put("n", "b");
        letters.put("o", "k");
        letters.put("p", "r");
        letters.put("q", "z");
        letters.put("r", "t");
        letters.put("s", "n");
        letters.put("t", "w");
        letters.put("u", "j");
        letters.put("v", "p");
        letters.put("w", "f");
        letters.put("x", "m");
        letters.put("y", "a");
        letters.put("z", "q");
    }

    public static void main (String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(args[0]));
        FileWriter output = new FileWriter("tonguesOutput.txt");
        int num = Integer.parseInt(input.readLine());
        for (int i = 1; i <= num; i++) {
            output.write("Case #" + i + ": ");
            String in = input.readLine();
            for (int j = 0; j < in.length(); j++) {
                String c = letters.get(in.substring(j, j+1));
                if (c == null) {
                    c = in.substring(j, j+1);
                }
                output.write(c);
            }
            output.write("\r\n");
        }
        output.flush();
    }

}
