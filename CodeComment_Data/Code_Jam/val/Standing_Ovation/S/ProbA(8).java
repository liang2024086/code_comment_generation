package methodEmbedding.Standing_Ovation.S.LYD982;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbA {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testNum; i++) {
            String s[] = reader.readLine().split(" ");
            int friendsCount = 0;
            int sum = 0;
            char[] chars = s[1].toCharArray();
            for (int j = 0; j <chars.length; j++) {
                int k = chars[j] - 48;
                if (k > 0 && j > sum){
                    friendsCount += j - sum;
                    sum += j - sum;
                }
                sum += k;
            }
            System.out.printf("Case #%d: %d\n", i + 1, friendsCount);
        }

    }
}
