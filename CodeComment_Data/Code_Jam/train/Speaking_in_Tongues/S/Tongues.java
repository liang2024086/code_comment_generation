package methodEmbedding.Speaking_in_Tongues.S.LYD138;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Tongues {

    private static final Map<String,String> map = new HashMap<String,String>() {{
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
        put(" ", " ");
    }};

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
            PrintWriter out = new PrintWriter(new FileWriter("A-small-attempt0.out"));

            Integer lines = Integer.valueOf(in.readLine().trim());
            for (int i = 0; i < lines; i++) {
                out.print(String.format("Case #%d: ", i+1));
                String line = in.readLine().trim();
                for (int j = 0; j < line.length(); j++) {
                    out.print(map.get(String.valueOf(line.charAt(j))));
                }
                out.print("\n");
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
