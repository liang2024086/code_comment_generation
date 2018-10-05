package methodEmbedding.Revenge_of_the_Pancakes.S.LYD774;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();

        for (int x = 0; x < times; x++) {
            String input = new StringBuilder(sc.next()).reverse().toString();
            int count = 0;
            boolean flip = false;

            for (int i = 0; i < input.length(); i++) {
                if (!flip) {
                    if (input.charAt(i) != '+') {
                        count++;
                        flip = true;
                    }
                } else {
                    if (input.charAt(i) == '+') {
                        count++;
                        flip = false;
                    }
                }
            }
            System.out.format("Case #%s: %s", x+1,count);
            System.out.println("");

        }
        //end
    }
}
