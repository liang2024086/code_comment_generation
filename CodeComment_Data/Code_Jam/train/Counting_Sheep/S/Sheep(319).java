package methodEmbedding.Counting_Sheep.S.LYD1585;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Sheep{
    public Sheep() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int cases = scanner.nextInt();
        int[] numbers = new int[cases];
        ArrayList countedNumbers = new ArrayList();

        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < numbers.length; ++i) {
            if(numbers[i] == 0) {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            } else {
                countedNumbers.clear();
                int lastNumber = 0;

                for(int j = 1; countedNumbers.size() < 10; ++j) {
                    int n = j * numbers[i];

                    for(lastNumber = n; n != 0; n /= 10) {
                        int m = n % 10;
                        if(!countedNumbers.contains(m)) {
                            countedNumbers.add(m);
                        }
                    }
                }

                System.out.println("Case #" + (i + 1) + ": " + lastNumber);
            }
        }
    }
}
