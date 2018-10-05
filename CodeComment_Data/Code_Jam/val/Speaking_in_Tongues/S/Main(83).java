package methodEmbedding.Speaking_in_Tongues.S.LYD1223;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.jar.JarEntry;

/**
 * Created with IntelliJ IDEA.
 * User: vitaly
 * Date: 4/14/12
 * Time: 9:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>();

        String alphabet = "abcdfejhijklmnopqrstuvwxyz";

        String[] input = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
                "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
        String[] output = {"our language is impossible to understand",
                "there are twenty six factorial possibilities",
                "so it is okay if you want to just give up"};

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < input[i].length(); j++) {
                String inp = input[i].substring(j, j+1);
                String out = output[i].substring(j, j+1);
                if(map.containsKey(inp)) {
                    if(!map.get(inp).equals(out)) {
                        throw new RuntimeException("Mapping break rules");
                    }
                }
                map.put(inp, out);
            }
        }

        map.put("q", "z");
        map.put("z", "q");

        Scanner scanner = new Scanner(new File("A-small-attempt1.in"));
        PrintWriter pw = new PrintWriter(new File("google.out"));

        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < line.length(); j++) {
                String inp = line.substring(j, j + 1);
                String out = map.get(inp);
                sb.append(out);
            }
            pw.print(String.format("Case #%d: %s%n", i + 1, sb.toString()));
        }


        scanner.close();
        pw.close();



    }

}
