package methodEmbedding.Counting_Sheep.S.LYD1258;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSheep {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStream);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int seenDigits[] = new int[10];
            int N = Integer.parseInt(br.readLine());

            if (N == 0) {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
                continue;
            }

            int count = 0;
            int num = 0;
            for (int j = 1; count != 10 ; j++) {
                num = j * N;
                int temp = num;

                while (temp != 0) {
                    int digit = temp % 10;

                    if (seenDigits[digit] != 1) {
                        count++;
                        seenDigits[digit] = 1;
                    }

                    temp = temp / 10;
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + num);
        }

    }
}
