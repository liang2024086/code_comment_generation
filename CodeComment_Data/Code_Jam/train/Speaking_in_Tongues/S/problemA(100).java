package methodEmbedding.Speaking_in_Tongues.S.LYD343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: kenneth.ng
 * Date: 4/13/12
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class problemA { 
    


    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<String, String>() {
            {
                put("a", "y");
                put("b", "h");
                put("c", "e");
                put("d", "s");
                put("e", "o");
                put("f", "c");
                put("g", "v");
                put("h", "x");
                put("i", "d");
                put("j", "u");
                put("k", "i");
                put("l", "g");
                put("m", "l");
                put("n", "b");
                put("o", "k");
                put("p", "r");
                put("q", "z");
                put("r", "t");
                put("s", "n");
                put("t", "w");
                put("u", "j");
                put("v", "p");
                put("w", "f");
                put("x", "m");
                put("y", "a");
                put("z", "q");
            }
        };
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            int cases = Integer.parseInt(br.readLine());
            for (int i = 0; i < cases; i++) {
                String line = br.readLine();
                char[] token = line.toCharArray();
                char[] output = new char[token.length];
                for (int j = 0; j < token.length; j++) {
                    if (mapping.containsKey(String.valueOf(token[j]))) {
                        output[j] = mapping.get(String.valueOf(token[j])).charAt(0);
                    } else {
                        output[j] = ' ';
                    }
                }
                System.out.println("Case #" + (i+1) + ": " + String.valueOf(output));
                
            }
        } catch (IOException e) {
            System.out.println("Error!");
            System.exit(1);
        }

    }
}
