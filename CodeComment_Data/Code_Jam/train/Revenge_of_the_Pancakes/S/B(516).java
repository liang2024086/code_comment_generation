package methodEmbedding.Revenge_of_the_Pancakes.S.LYD263;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {

    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(r);

        String firstLine = in.readLine();
        int testCases = Integer.parseInt(firstLine);

        for (int i = 0; i < testCases; i++) {

            int result = 0;
            char[] pancakes = in.readLine().toCharArray();
            for (int j = 0; j < pancakes.length - 1; j++) {
                if (pancakes[j] != pancakes[j + 1]) {
                    result++;
                }
            }
            if (pancakes[pancakes.length - 1] == '-') {
                result++;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Case #");
            sb.append(i + 1);
            sb.append(": ");
            sb.append(result);

            System.out.println(sb);
        }
    }
}
