package methodEmbedding.Revenge_of_the_Pancakes.S.LYD37;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String... args) throws IOException {
        String name1 = "B-small-attempt0.in";
        String name2 = "B-small-attempt0.out";

        try (BufferedReader in = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream(name1)));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(name2))))) {

            for (int i = 0, total = Integer.parseInt(in.readLine()); i < total; i++) {
                char[] arr = in.readLine().toCharArray();
                char prv = '\0';
                int res = 0;

                for (char ch : arr) {
                    if (prv != '\0' && prv != ch) {
                        res++;
                    }

                    prv = ch;
                }

                if (prv == '-')
                    res++;

                if (i != 0)
                    out.newLine();

                out.append(String.format("Case #%d: %d", i + 1, res));
                System.out.println(String.format("Case #%d: %d", i + 1, res));
            }
        }
    }
}
