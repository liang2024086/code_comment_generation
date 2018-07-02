package methodEmbedding.Speaking_in_Tongues.S.LYD483;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GTrans {
    public static void main(String[] argv) throws IOException {
        String sample_Googlerese = "ejp mysljylc kd kxveddknmc re jsicpdrysi\n" +
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\n" +
                "de kr kd eoya kw aej tysr re ujdr lkgc jv";

        String sample_english = "our language is impossible to understand\n" +
                "there are twenty six factorial possibilities\n" +
                "so it is okay if you want to just give up";

        Map<Character, Character> map= new HashMap<Character, Character>();
        map.put('z', 'q');
        map.put('q', 'z');

        for(int idx = 0; idx < sample_Googlerese.length(); idx++){
            map.put(sample_Googlerese.charAt(idx), sample_english.charAt(idx));
        }

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = inputReader.readLine();

        int count_of_cases = Integer.parseInt(firstLine);
        for (int idx_of_case = 1; idx_of_case <= count_of_cases; idx_of_case++) {
            String line_of_googlerese = inputReader.readLine();

            StringBuilder sb = new StringBuilder(line_of_googlerese.length());
            for(int idx_of_letter = 0; idx_of_letter < line_of_googlerese.length(); idx_of_letter++){
                sb.append(map.get(line_of_googlerese.charAt(idx_of_letter)));
            }

            System.out.println(String.format("Case #%d: %s", idx_of_case, sb.toString()));
        }
    }
}
