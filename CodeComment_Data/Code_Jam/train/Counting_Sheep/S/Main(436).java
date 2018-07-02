package methodEmbedding.Counting_Sheep.S.LYD513;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfCases = s.nextInt();

        for(int i = 0; i < numberOfCases; i++){
            int current = s.nextInt();
            int original = current;
            if(current == 0){
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
                continue;
            }

            int count = 0;
            boolean[] tracker = new boolean[10];

            int multiplier = 0;

            Arrays.fill(tracker, false);

            while(count < 10) {
                multiplier++;
                current = original * multiplier;
                char[] currentString = Integer.toString(current).toCharArray();
                for (char c : currentString) {
                    if (tracker[(int) c - 48] == false) {
                        tracker[(int) c - 48] = true;
                        count++;
                    }
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + current);
        }
    }
}
