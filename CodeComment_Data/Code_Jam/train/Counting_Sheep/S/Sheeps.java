package methodEmbedding.Counting_Sheep.S.LYD1354;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sheeps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int number = sc.nextInt();
            Set<Character> nums = new HashSet<>();
            int inc = number;
            boolean found = false;
            while (number > 0 && inc <= Integer.MAX_VALUE) {
                String str = String.valueOf(inc);
                for (int j = 0; j < str.length(); j++) {
                    nums.add(str.charAt(j));
                }
                if (nums.size() == 10) {
                    found = true;
                    break;
                }
                inc += number;
            }
            System.out.println("Case #" + (i+1) + ": " + (found ? inc : "INSOMNIA"));
        }
        sc.close();
    }

}
