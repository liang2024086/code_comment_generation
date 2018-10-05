package methodEmbedding.Speaking_in_Tongues.S.LYD1327;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author bjdengdong
 *
 */
public class Main {

    static String[] googlerese = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
        "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
    
    static String[] normal = {"our language is impossible to understand",
        "there are twenty six factorial possibilities",
        "so it is okay if you want to just give up"};
    
    static Map<Character, Character> map = new HashMap<Character, Character>();
    
    
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < googlerese.length; i++) {
            String src = googlerese[i];
            String tar = normal[i];
            for (int j = 0; j < src.length(); j++) {
                if (src.charAt(j) != ' ')
                    map.put(src.charAt(j), tar.charAt(j));
            }
        }
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            System.out.println(ch + "->" + map.get(ch));
//        }
        map.put('q', 'z');
        map.put('z', 'q');
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= t; i++) {
            String line = br.readLine();
            StringBuilder sb = new StringBuilder("Case #"+i+": ");
            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);
                if (ch >= 'a' && ch <= 'z') {
                    sb.append(map.get(ch));
                } else {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }

}
