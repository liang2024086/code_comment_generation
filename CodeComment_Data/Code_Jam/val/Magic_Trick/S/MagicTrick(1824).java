package methodEmbedding.Magic_Trick.S.LYD1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MagicTrick {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InputStream resourceAsStream = MagicTrick.class.getClassLoader().getResourceAsStream("in.txt");
        Scanner scanner = new Scanner(resourceAsStream);
        Writer out = new FileWriter("c:\\temp\\2013.txt");

        int tcc = scanner.nextInt();
        for (int ci = 0; ci < tcc; ci++) {
            int answer1 = scanner.nextInt();
            Set<Integer> first= new TreeSet<>();
            for (int i = 0; i < 4; i++) {
                if (i+1!=answer1) {
                    for (int j = 0; j < 4; j++) {
                        scanner.nextInt();
                    }
                    continue;
                }
                for (int j = 0; j < 4; j++) {
                    first.add(scanner.nextInt());
                }
            }
            int answer2 = scanner.nextInt();
            Set<Integer> second= new TreeSet<>();
            for (int i = 0; i < 4; i++) {
                if (i+1!=answer2) {
                    for (int j = 0; j < 4; j++) {
                        scanner.nextInt();
                    }
                    continue;
                }
                for (int j = 0; j < 4; j++) {
                    second.add(scanner.nextInt());
                }
            }

            first.retainAll(second);
            String call = null;
            if (first.size() == 1) {
                call = first.iterator().next().toString();
            } else if (first.size() == 0) {
                call = "Volunteer cheated!";
            } else {
                call ="Bad magician!";
            }


            String res = String.format("Case #%d: %s\n",ci+1,call);
            out.write(res);

        }
        out.close();
        return;
    }
}
