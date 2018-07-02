package methodEmbedding.Speaking_in_Tongues.S.LYD1522;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws IOException {
        String[] input = new String[]{
          "ejp mysljylc kd kxveddknmc re jsicpdrysi",
          "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
          "de kr kd eoya kw aej tysr re ujdr lkgc jv"
        };

        String[] output = new String[]{
                "our language is impossible to understand",
                "there are twenty six factorial possibilities",
                "so it is okay if you want to just give up"
        };

        Map<Character,Character> lettersMap = new HashMap<Character, Character>();
        lettersMap.put('z','q');
        lettersMap.put('q','z');
        lettersMap.put(' ',' ');

        for(int i=0;i<3;i++) {
            for(int j=0;j<input[i].length();j++) {
                lettersMap.put(input[i].charAt(j), output[i].charAt(j));
            }
        }

        /*for(char c = 'a'; c<='z';c++) {
            System.out.println(c + "=>" + lettersMap.get(c));
            if(!lettersMap.values().contains(c)) {
                System.out.println("******* = " + c);
            }
        }*/


        Scanner scanner = new Scanner(new File(args[0]));

        FileWriter writer = new FileWriter("a-out.txt");
        
        int T = scanner.nextInt();
        scanner.nextLine();
        String line;
        String resLine;
        for(int i=0;i<T;i++) {
            line = scanner.nextLine();
            resLine = "";
            for(int j=0;j<line.length();j++) {
                resLine += lettersMap.get(line.charAt(j));
            }
            writer.append("Case #"+(i+1)+": " + resLine+(i+1<T?"\n":""));
        }
        writer.flush();
    }
}
