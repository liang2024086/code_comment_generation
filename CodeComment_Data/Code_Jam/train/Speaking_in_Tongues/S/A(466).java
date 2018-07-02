package methodEmbedding.Speaking_in_Tongues.S.LYD338;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class A {
    
    public static void main(String[] args) throws IOException {
        String str1 = "yeqejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jvz";
        String str2 = "aozour language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give upq";
        
        char []map = new char[300];
        
        for (int i = 0; i < str1.length(); i ++) {
            map[str1.charAt(i)] = str2.charAt(i);
        }
//        for (char i = 'a'; i <= 'z'; i ++) {
//            System.out.println(i + " -> " +map[i]);
//        }
        map[' '] = ' ';
        Scanner scanner = null;
//        scanner = new Scanner(System.in);
        scanner = new Scanner(new File("A.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        FileWriter writer = new FileWriter("A.out");
        
        for (int test = 1; test <= n; test ++) {
            String line = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            sb.append(String.format("Case #%d: ", test));
            for (int i = 0; i < line.length(); i ++) {
                sb.append(map[line.charAt(i)]);
            }
            writer.write(sb.toString());
            writer.write("\n");
//            System.out.println(sb.toString());
        }
        writer.close();
//        for (char i = 'a'; i <= 'z'; i ++) {
//            int j;
//            for (j = 'a'; j <= 'z'; j ++) {
//                if (map[j] == i) break;
//            }
//            if (j > 'z') System.out.println(i);
//        }
    }

}
