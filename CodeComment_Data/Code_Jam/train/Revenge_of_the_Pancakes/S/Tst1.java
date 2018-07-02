package methodEmbedding.Revenge_of_the_Pancakes.S.LYD796;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tst1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("text2")));
        int testCount = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testCount; i++) {
            String A = br.readLine();
            int count =0;
            char last = '+';
            for(int end = A.length() - 1; end >= 0; end-- ) {
                if(A.charAt(end) != last) {
                    count++;
                }
                last = A.charAt(end);
            }
            System.out.println("Case #"+i+": " + count);
        }
    }
}
