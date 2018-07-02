package methodEmbedding.Standing_Ovation.S.LYD1145;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by marcus on 4/10/15.
 */
public class StandOvation {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(new File("input_p1.txt"));

            int numTests = Integer.parseInt(scan.nextLine());
//            System.out.println("Num Tests: " + numTests);
            for(int i = 0; i < numTests; i++) {
                int num = scan.nextInt();
//                System.out.println("Nums: " + num);
                String[] nums = scan.nextLine().split("");
                int sum = 0;
                int count = 0;
                for(int c = 1; c < nums.length; c++) {
                    int current = Integer.parseInt(nums[c]);
                    sum += current;
//                    System.out.println("Sum: " + sum + " -- C: " + c);
                    if(sum - c < 0) {
                        count++;
                        sum++;
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + count);
            }

        } catch (IOException ex) {

        }


    }
}
