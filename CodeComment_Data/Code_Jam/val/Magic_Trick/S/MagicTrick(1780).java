package methodEmbedding.Magic_Trick.S.LYD741;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class MagicTrick {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for (int i=1; i<=T; i++) {
            int row = Integer.parseInt(reader.readLine());
            for (int j = row; j>1; j--) reader.readLine();
            StringTokenizer tok = new StringTokenizer(reader.readLine());
            Set<Integer> options = new HashSet<Integer>(4);
            for (int j=0; j<4; j++) options.add(Integer.parseInt(tok.nextToken()));
            for (int j = row; j<4; j++) reader.readLine();

            row = Integer.parseInt(reader.readLine());
            for (int j = row; j>1; j--) reader.readLine();
            tok = new StringTokenizer(reader.readLine());
            Set<Integer> options2 = new HashSet<Integer>(4);
            for (int j=0; j<4; j++) options2.add(Integer.parseInt(tok.nextToken()));
            for (int j = row; j<4; j++) reader.readLine();
            options.retainAll(options2);
            if (options.size() == 1)
                System.out.printf("Case #%d: %d\n", i, options.iterator().next());
            else if (options.isEmpty())
                System.out.printf("Case #%d: Volunteer cheated!\n", i);
            else
                System.out.printf("Case #%d: Bad magician!\n", i);
        }
    }
}
