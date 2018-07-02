package methodEmbedding.Counting_Sheep.S.LYD1555;


import prosonf.utils.FileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by proson on 4/9/16.
 */
public class BleatrixSheepCount {

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        String inputFileName = args[0];
        Scanner scanner = new Scanner(new FileInputStream(new File("/opt/dev/java/wspace_intellij/codejam/Round_1C_2010/src/main/resources/prosonf.codejam.april2016/A-small-attempt0.in")));
        int testCases = scanner.nextInt();
        scanner.nextLine();

        IntStream.range(1, testCases + 1).forEach(testCase -> {
            Set<String> digitsSoFar = new HashSet<>();
            long n = scanner.nextLong();
            scanner.nextLine();
            long iteration = 1;

            while (digitsSoFar.size() < 10) {
                long currentN = iteration * n;
                Arrays.stream(Long.toString(currentN).split("")).forEach(digitsSoFar::add);

                if (currentN == 0L) {
                    System.out.println(String.format("Case #%d: INSOMNIA", testCase));
                    break;
                } else if (digitsSoFar.size() == 10) {
                    System.out.println(String.format("Case #%d: %d", testCase, currentN));
                    break;
                } else {
                }
                iteration++;
            }
        });
    }

}
