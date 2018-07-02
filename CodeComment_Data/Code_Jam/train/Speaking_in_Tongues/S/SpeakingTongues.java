package methodEmbedding.Speaking_in_Tongues.S.LYD1184;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Luis Carlos
 */
public class SpeakingTongues {

    private static String caseString = "Case #%d: %s";
    private static Map<String, String> mapping = new TreeMap<String, String>() {

        {
            put("y", "a");
            put("n", "b");
            put("f", "c");
            put("i", "d");
            put("c", "e");
            put("w", "f");
            put("l", "g");
            put("b", "h");
            put("k", "i");
            put("u", "j");
            put("o", "k");
            put("m", "l");
            put("x", "m");
            put("s", "n");
            put("e", "o");
            put("v", "p");
            put("p", "r");
            put("d", "s");
            put("r", "t");
            put("j", "u");
            put("g", "v");
            put("t", "w");
            put("h", "x");
            put("a", "y");
            put("z", "q");//Faltante
            put("q", "z");//Faltante
        }
    };

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader("small.in"));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= testCase; i++) {
            String t1 = bf.readLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < t1.length(); j++) {
                if (" ".equals(String.valueOf(t1.charAt(j)))) {
                    sb.append(" ");
                    continue;
                }
                sb.append(mapping.get(String.valueOf(t1.charAt(j))));
            }
            System.out.println(String.format(caseString, i, sb.toString()));
        }
    }
}
