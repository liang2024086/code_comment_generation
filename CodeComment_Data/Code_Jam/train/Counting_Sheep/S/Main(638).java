package methodEmbedding.Counting_Sheep.S.LYD1503;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        boolean[] nums = new boolean[10];
        boolean allPresent = true;
        for (int i = 1; i <= t; ++i) {
            Arrays.fill(nums, false);
            int n = in.nextInt();

            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }

            int j = 1;
            int m = n;

            while (true) {
                allPresent = true;

                for (boolean b: nums) if (!b) allPresent = false;
                if (allPresent) {
                    break;
                }

                m = n * j;
                j++;
                String number = String.valueOf(m);
                for (char c : number.toCharArray()) {
                    nums[Character.getNumericValue(c)] = true;
                }
            }

            System.out.println("Case #" + i + ": " + m);
        }
    }
}
