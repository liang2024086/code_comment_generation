package method_new_test.Dijkstra.S.LYD75;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by study on 4/11/15.
 */
public class Dijkstra {
    public static void main(String[] args) throws Exception {
        Scanner scanner;
        PrintWriter writer;

        Map<String, Character> map = new HashMap<>();
        map.put("ii", ' ');
        map.put("jj", ' ');
        map.put("kk", ' ');
        map.put("ij", 'k');
        map.put("ik", 'j');
        map.put("ji", 'k');
        map.put("jk", 'i');
        map.put("ki", 'j');
        map.put("kj", 'i');

        Map<String, Integer> signMap = new HashMap<>();
        signMap.put("ii", -1);
        signMap.put("jj", -1);
        signMap.put("kk", -1);
        signMap.put("ij", 1);
        signMap.put("ik", -1);
        signMap.put("ji", -1);
        signMap.put("jk", 1);
        signMap.put("ki", 1);
        signMap.put("kj", -1);


        if (new File("Dijkstra_sample.txt").exists()) {
            //scanner = new Scanner(new File("Dijkstra_sample.txt"));
            scanner = new Scanner(new File("Dijkstra_small.txt"));
            //scanner = new Scanner(new File("Dijkstra_large.txt"));
            writer = new PrintWriter(new File("Dijkstra_out.txt"));
            //writer = new PrintWriter(System.out);
        } else {
            scanner = new Scanner(System.in);
            writer = new PrintWriter(System.out);
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int L = scanner.nextInt();
            int X = scanner.nextInt();
            String str = scanner.next();

            if (L * X < 3) {
                writer.println("Case #" + (i + 1) + ": NO");
                continue;
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < X; j++) {
                sb.append(str);
            }

            char chars[] = sb.toString().toCharArray();

            int sign = 1;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'i') {
                    break;
                }

                if (j + 1 == chars.length) {
                    break;
                }

                String combine = chars[j] + "" + chars[j + 1];
                char find_i = map.get(combine);
                chars[j] = ' ';
                chars[j + 1] = find_i;
                sign *= signMap.get(combine);
                if (find_i == 'i') {
                    break;
                } else if (find_i == ' ') {
                    j++;
                }
            }

            chars = new String(chars).trim().toCharArray();

            for (int j = chars.length - 1; j >= 0; j--) {
                if (chars[j] == 'k') {
                    break;
                }

                if (j - 1 == -1) {
                    break;
                }

                String combine = chars[j - 1] + "" + chars[j];

                char find_k = map.get(combine);
                chars[j] = ' ';
                chars[j - 1] = find_k;
                sign *= signMap.get(combine);
                if (find_k == 'k') {
                    break;
                } else if (find_k == ' ') {
                    j--;
                }
            }

            chars = new String(chars).trim().toCharArray();

            for (int j = 1; j < chars.length - 1; j++) {
                if (j + 1 == chars.length - 1) {
                    break;
                }

                String combine = chars[j] + "" + chars[j + 1];
                char find_j = map.get(combine);
                chars[j] = ' ';
                chars[j + 1] = find_j;
                sign *= signMap.get(combine);
                if (find_j == ' ') {
                    j++;
                }
            }

            String rst = new String(chars).replace(" ", "");
            if("ijk".equals(rst) && sign == 1) {
                writer.println("Case #" + (i + 1) + ": YES");
                //writer.println(rst);
            } else {
                writer.println("Case #" + (i + 1) + ": NO");
                //writer.println(rst);
            }
        }

        writer.flush();
    }
}
