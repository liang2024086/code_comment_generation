package methodEmbedding.Standing_Ovation.S.LYD740;

import java.util.*;
import java.io.*;

public class a {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String[] parts = reader.readLine().split(" ");

            String s = parts[1];
            int standing = 1;
            int answer = 0;

            for (int j = 0; j < s.length(); j++) {
                int x = Integer.parseInt(s.charAt(j)+"");
                //answer += (int)Math.ceil(((j+1) - standing) / 9.0);
                while (standing < j+1) {
                    standing++;
                    answer++;
                }
                standing += x;
            }

            System.out.printf("Case #%d: %d\n", i+1, answer);
        }
    }
}
