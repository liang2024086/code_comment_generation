package methodEmbedding.Counting_Sheep.S.LYD537;


import java.util.Scanner;

public class ProbAS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String seenNumbers = "";
        boolean insomnia = false;
            int m = 0;
            for (int j = 1; seenNumbers.length() < 10; j++) {
                m = n * j;
                String ms = String.valueOf(m);
                for (int k = 0; k < ms.length(); k++) {
                    if (!seenNumbers.contains(ms.substring(k, k + 1))) {
                        seenNumbers += ms.substring(k, k + 1);
                    }
                }
                if (j > 1000000) {
                    insomnia = true;
                    break;
                }
            }
            if (insomnia) {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            } else {
                System.out.println("Case #" + (i + 1) + ": " + m);
            }
        }
    }

}
