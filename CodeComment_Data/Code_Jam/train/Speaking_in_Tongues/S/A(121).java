package methodEmbedding.Speaking_in_Tongues.S.LYD890;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;


public class A {
    
    private static Map<String, String> translateMap = new HashMap<String, String>();
    static {
        translateMap.put("e", "0");
        translateMap.put("j", "u");
        translateMap.put("p", "r");
        translateMap.put("m", "l");
        translateMap.put("y", "a");
        translateMap.put("s", "n");
        translateMap.put("l", "g");
        translateMap.put("c", "e");
        translateMap.put("k", "i");
        translateMap.put("d", "s");
        translateMap.put("x", "m");
        translateMap.put("e", "o");
        translateMap.put("v", "p");
        translateMap.put("n", "b");
        translateMap.put("r", "t");
        translateMap.put("s", "n");
        translateMap.put("i", "d");
        translateMap.put(" ", " ");
        translateMap.put("b", "h");
        translateMap.put("t", "w");
        translateMap.put("a", "y");
        translateMap.put("h", "x");
        translateMap.put("w", "f");
        translateMap.put("f", "c");
        translateMap.put("o", "k");
        translateMap.put("u", "j");
        translateMap.put("g", "v");
        translateMap.put("q", "z");
        translateMap.put("z", "q");
    }
    
    public static void main(String[] args) {
        try {
            
            BufferedReader in = new BufferedReader(new FileReader("src/codejam/world2012/qualification/a/small.in"));
            BufferedWriter out = new BufferedWriter(new FileWriter("src/codejam/world2012/qualification/a/small.out"));

            int T = 0;
            T = Integer.parseInt(in.readLine());
            
            for (int t = 0; t < T; t++) {
                String googlerese = in.readLine();
                
                StringBuilder answer = new StringBuilder();
                
                for (int i=0; i < googlerese.length(); i++) {
                    
                    String replacement = translateMap.get(Character.toString(googlerese.charAt(i)));
                    if (replacement == null) replacement = "8";
                    answer.append(replacement);
                }
                
                out.write("Case #"+String.valueOf(t+1) +": "+answer.toString());
                if (t < T-1) out.write(System.getProperty("line.separator"));
                
            }
            out.close();
            
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
}
