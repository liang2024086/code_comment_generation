package methodEmbedding.Counting_Sheep.S.LYD575;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        String numbers;
        String store = "";
        int multiplier = 1;
        int checker;
        int input = 0;
        while (count < x) {
            numbers = "0123456789";
            checker = 0;
            multiplier = 1;
            input = Integer.parseInt(br.readLine());
            if (input == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", count + 1);

            } else {
                while (numbers.length() != 0) {

                    store = "" + input * multiplier;
                    multiplier++;

                    for (int i = 0; i < store.length(); i++) {
                        numbers = numbers.replace("" + store.charAt(i), "");
                    }

                    if (numbers.length() == 0) {
                        System.out.printf("Case #%d: %s\n", count + 1, store);
                    }
                }
            }
            count++;

        }
    }

}
