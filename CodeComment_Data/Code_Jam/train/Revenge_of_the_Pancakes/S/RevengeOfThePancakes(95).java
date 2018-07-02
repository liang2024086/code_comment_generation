package methodEmbedding.Revenge_of_the_Pancakes.S.LYD775;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 The Infinite House of Pancakes has just introduced a new kind of pancake! It has a happy face made of chocolate chips on one side (the "happy side"), and nothing on the other side (the "blank side").

 You are the head waiter on duty, and the kitchen has just given you a stack of pancakes to serve to a customer. Like any good pancake server, you have X-ray pancake vision, and you can see whether each pancake in the stack has the happy side up or the blank side up. You think the customer will be happiest if every pancake is happy side up when you serve them.

 You know the following maneuver: carefully lift up some number of pancakes (possibly all of them) from the top of the stack, flip that entire group over, and then put the group back down on top of any pancakes that you did not lift up. When flipping a group of pancakes, you flip the entire group in one motion; you do not individually flip each pancake. Formally: if we number the pancakes 1, 2, ..., N from top to bottom, you choose the top i pancakes to flip. Then, after the flip, the stack is i, i-1, ..., 2, 1, i+1, i+2, ..., N. Pancakes 1, 2, ..., i now have the opposite side up, whereas pancakes i+1, i+2, ..., N have the same side up that they had up before.

 For example, let's denote the happy side as + and the blank side as -. Suppose that the stack, starting from the top, is --+-. One valid way to execute the maneuver would be to pick up the top three, flip the entire group, and put them back down on the remaining fourth pancake (which would stay where it is and remain unchanged). The new state of the stack would then be -++-. The other valid ways would be to pick up and flip the top one, the top two, or all four. It would not be valid to choose and flip the middle two or the bottom one, for example; you can only take some number off the top.

 You will not serve the customer until every pancake is happy side up, but you don't want the pancakes to get cold, so you have to act fast! What is the smallest number of times you will need to execute the maneuver to get all the pancakes happy side up, if you make optimal choices?

 Input

 The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with a string S, each character of which is either + (which represents a pancake that is initially happy side up) or - (which represents a pancake that is initially blank side up). The string, when read left to right, represents the stack when viewed from top to bottom.

 Output

 For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the minimum number of times you will need to execute the maneuver to get all the pancakes happy side up.

 Limits

 1 ??? T ??? 100.
 Every character in S is either + or -.

 Small dataset

 1 ??? length of S ??? 10.
 Large dataset

 1 ??? length of S ??? 100.
 Sample


 Input

 Output

 5
 -
 -+
 +-
 +++
 --+-

 Case #1: 1
 Case #2: 1
 Case #3: 2
 Case #4: 0
 Case #5: 3

 In Case #1, you only need to execute the maneuver once, flipping the first (and only) pancake.

 In Case #2, you only need to execute the maneuver once, flipping only the first pancake.

 In Case #3, you must execute the maneuver twice. One optimal solution is to flip only the first pancake, changing the stack to --, and then flip both pancakes, changing the stack to ++. Notice that you cannot just flip the bottom pancake individually to get a one-move solution; every time you execute the maneuver, you must select a stack starting from the top.

 In Case #4, all of the pancakes are already happy side up, so there is no need to do anything.

 In Case #5, one valid solution is to first flip the entire stack of pancakes to get +-++, then flip the top pancake to get --++, then finally flip the top two pancakes to get ++++.
 */

public class RevengeOfThePancakes { // B

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileInputStream("data/online/codejam2016/qualification/B-small-attempt0.in"));
        File out = new File("data/online/codejam2016/qualification/B-small-attempt0.out");
        Files.deleteIfExists(out.toPath());
        out.createNewFile();

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String S = sc.next();
            int numFlips = 0;

            while (true) {
                // get furthest "-" to right. this will be position where to flip
                int posToFlip = -1;
                for (int i = S.length()-1; i >= 0; i--) {
                    if (S.charAt(i) == '-') {
                        posToFlip = i;
                        break;
                    }
                }

                // update numFlips if need to, or break out if no flips needed
                if (posToFlip >= 0) {
                    numFlips++;
                }
                else {
                    break;
                }

                // flip pancakes
                StringBuilder flipped = new StringBuilder();
                for (int i = 0; i <= posToFlip; i++) {
                    flipped.append(S.charAt(i) == '-' ? '+' : '-');
                }
                S = flipped.toString() + S.substring(posToFlip+1);
            }

            // write result to file
            String line = "Case #" + test_case + ": " + numFlips + "\n";
            Files.write(Paths.get(out.getPath()), line.getBytes(), StandardOpenOption.APPEND);
            System.out.print(line);
        }
    }
}
