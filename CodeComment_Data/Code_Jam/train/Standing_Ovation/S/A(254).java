package methodEmbedding.Standing_Ovation.S.LYD388;


import java.io.*;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader(new File("/Users/marat/IdeaProjects/GCJ2015/src/ru/marat/input.txt"));
//        Reader reader = new InputStreamReader(System.in);
        Writer writer = new FileWriter(new File("output.txt"));
//        Writer writer = new OutputStreamWriter(System.out);

        Scanner input = new Scanner(reader);
        int tests = input.nextInt();
        for (int test = 0; test < tests; test++) {
            int len = input.nextInt();
            String str = input.next();
            int res = 0;
            int clapping = 0;
            for (int i = 0; i < len + 1; i++) {
                if (str.charAt(i) == '0') {
                    continue;
                }
                if (clapping < i) {
                    res += i - clapping;
                    clapping += i - clapping;
                }
                clapping += str.charAt(i) - '0';
            }

            writer.write(String.format("Case #%d: %d\r\n", test + 1, res));
        }

        writer.flush();
    }
}
