package methodEmbedding.Standing_Ovation.S.LYD88;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("src/A-small-attempt3.in");
        FileWriter fw = new FileWriter("src/A-small-attempt3.out");

        Scanner in = new Scanner(file);

        int cases = in.nextInt();

        for (int j = 0; j<cases; j++) {
            int max = in.nextInt();
            String next = in.next();
            int stand = 0;
            int need = 0;

            for (int i = 0; i <=max; i++) {
                if (next.charAt(i) != '0') {
                    if (i <= stand) {
                        stand += (int) (next.charAt(i) - '0');
                    } else {
                        need += i - stand;
                        stand = stand + need + (int) (next.charAt(i) - '0');

                    }
                }
            }

            fw.write("Case #" + (j + 1) + ": " + need + "\n");
        }

        fw.close();

    }
}
