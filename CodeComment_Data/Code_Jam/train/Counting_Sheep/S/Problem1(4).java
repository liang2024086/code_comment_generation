package methodEmbedding.Counting_Sheep.S.LYD1044;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(input.nextInt());
        for (int i = 0; i < nums.get(0); i++) {
            nums.add(input.nextInt());
        }

        for (int i = 1; i <= nums.get(0); i++) {
            int val = nums.get(i);
            String result;
            if (val != 0) {
                Set<Character> found = new HashSet<>();
                int curVal = 0, runs = 0;
                while(found.size() < 10) {
                    runs++;
                    curVal = runs * val;
                    char[] digits = String.valueOf(curVal).toCharArray();
                    for (char c : digits) {
                        found.add(c);
                    }
                }
                result = String.valueOf(curVal);
            } else {
                result = "INSOMNIA";
            }
            System.out.println("Case #" + i + ": " + result);
        }
    }

}
