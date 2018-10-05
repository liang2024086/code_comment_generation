package methodEmbedding.Counting_Sheep.S.LYD1399;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by shreeprakash on 4/9/16.
 */
public class CountingSheep {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numOfTestCases = in.nextInt();
        for (int i = 0; i < numOfTestCases; i++) {
            Map<Integer, Integer> numbersTraced = new HashMap<>();
            numbersTraced.put(0, 0);
            numbersTraced.put(1, 0);
            numbersTraced.put(2, 0);
            numbersTraced.put(3, 0);
            numbersTraced.put(4, 0);
            numbersTraced.put(5, 0);
            numbersTraced.put(6, 0);
            numbersTraced.put(7, 0);
            numbersTraced.put(8, 0);
            numbersTraced.put(9, 0);
            int value = in.nextInt();
            int actualValue = value;
            boolean allNumersTraced = false;
            int count = 0;
            int multiplier = 2;
            int previousValue = value;
            while (value != 0 && !allNumersTraced && (count < 10)) {
                String valueTemp = String.valueOf(value);
                for (int j = 0; j < valueTemp.length(); j++) {
                    int charValueInInt = (int) valueTemp.charAt(j);
                    charValueInInt = charValueInInt - 48;
                    if (numbersTraced.get(charValueInInt) == 0) {
                        numbersTraced.put(charValueInInt, 1);
                        count ++;
                    }
                }
                previousValue = value;
                value = actualValue * multiplier;
                multiplier ++;
            }
            if (count == 10) {
                System.out.println("Case #" + (i + 1) + ": " + previousValue);
            } else {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            }
        }
    }
}
