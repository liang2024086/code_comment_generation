package methodEmbedding.Counting_Sheep.S.LYD1506;

import java.util.*;
import java.io.*;

/**
 * Created by alaaalchalabi on 4/9/2016.
 */
public class counting1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        boolean allPresent = true;
        boolean[] nums = new boolean[10];
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            Arrays.fill(nums, false);
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
