package methodEmbedding.Counting_Sheep.S.LYD1674;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = sc.nextInt();

        for (int i = 1; i <= cases; i++) {

            int N = sc.nextInt();

            int indent = 1;

            boolean[] seen = new boolean[10];
            int result = 0;

            int lastseen = -1;

            while (true) {

                boolean complete = true;

                for (int j = 0; j < seen.length; j++) {
                    if(!seen[j]) {
                        complete = false;
                        break;
                    }
                }



                if(complete)
                    break;

                result = N * indent;

                if(lastseen == result) {
                    result = -1;
                    break;
                }
                lastseen = result;
                char[] chars = String.valueOf(result).toCharArray();

                for (char c : chars) {
                    seen[Integer.parseInt(String.valueOf(c))] = true;
                }

                indent++;
            }

            String s_result = String.valueOf(result);

            if(result == -1) {
                s_result = "INSOMNIA";
            }

            System.out.println("Case #" + i + ": " + (s_result));
        }
    }
}
