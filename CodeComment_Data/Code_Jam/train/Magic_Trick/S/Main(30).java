package methodEmbedding.Magic_Trick.S.LYD1594;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner theIn = new Scanner(System.in);
        int numberOfCases = theIn.nextInt();

        for (int i=1; i<=numberOfCases; i++) {
            Set<Integer> numbers1 = new HashSet<Integer>();
            Set<Integer> numbers2 = new HashSet<Integer>();

            int currentRow = theIn.nextInt();
            for (int j=1; j<=4; j++) {
                for (int k=1; k<=4; k++) {
                    int currentNumber = theIn.nextInt();
                    if (j == currentRow) numbers1.add(currentNumber);
                }
            }

            currentRow = theIn.nextInt();
            for (int j=1; j<=4; j++) {
                for (int k=1; k<=4; k++) {
                    int currentNumber = theIn.nextInt();
                    if (j == currentRow) numbers2.add(currentNumber);
                }
            }

            numbers1.retainAll(numbers2);

            System.out.print("Case #" + i + ": ");

            if (numbers1.size() == 0) {
                System.out.println("Volunteer cheated!");
            } else if (numbers1.size() > 1) {
                System.out.println("Bad magician!");
            } else {
                System.out.println(numbers1.toArray()[0]);
            }

        }
    }
}
