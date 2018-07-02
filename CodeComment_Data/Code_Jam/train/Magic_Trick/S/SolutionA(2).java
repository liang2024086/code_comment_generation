package methodEmbedding.Magic_Trick.S.LYD1142;

import java.util.*;
import java.io.*;

public class SolutionA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ntests = sc.nextInt();

        for (int t = 1; t <= ntests; ++t) {
            int n = sc.nextInt() - 1;
            Set<Integer> nums = new HashSet<Integer>(4);
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; ++j) {
                    int k = sc.nextInt();
                    if (i == n)
                        nums.add(k);
                }
            }

            n = sc.nextInt() - 1;
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; ++j) {
                    int k = sc.nextInt();
                    if (i != n)
                        nums.remove(k);
                }
            }

            System.out.format("Case #%d: ", t);
            if (nums.isEmpty())
                System.out.println("Volunteer cheated!");
            else if (nums.size() == 1)
                System.out.println(nums.iterator().next());
            else
                System.out.println("Bad magician!");
        }
    }
}
