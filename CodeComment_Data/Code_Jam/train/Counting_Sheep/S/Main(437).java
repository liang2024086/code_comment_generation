package methodEmbedding.Counting_Sheep.S.LYD979;


import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int T = 1; T <= t;T++)
        {
            String result = "INSOMNIA";
            int N = scanner.nextInt();
            int[] chars = new int[256];
            for(int q = 1; q < 10000; q++) {
                boolean isAsleepNow = true;
                String numberString = Integer.toString(N * q);
                for (int s = 0; s < numberString.length(); s++)
                    chars[numberString.charAt(s)]++;
                for (int n = 48; n <= 57; n++) {
                    if (chars[n] == 0) {
                        isAsleepNow = false;
                        break;
                    }
                }
                if (isAsleepNow) {
                    result = numberString;
                    break;
                }
            }
            System.out.println(MessageFormat.format("Case #{0}: {1}", T, result));
        }
    }
}
