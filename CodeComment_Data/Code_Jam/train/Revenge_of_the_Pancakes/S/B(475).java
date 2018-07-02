package methodEmbedding.Revenge_of_the_Pancakes.S.LYD474;


import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintStream;

public class B {
    public static void main(String[] args) throws Exception {
        // set up scanner and iterate over test cases
        Scanner scanner = new Scanner(new FileInputStream(
            "/storage/emulated/0/Download/B-small-attempt0.in"));
        PrintStream output = new PrintStream(
            "/storage/emulated/0/Download/B-small-attempt0.out");
        int T = scanner.nextInt();
        for (int t = 1; t <= T; ++t) {
            // get parameters
            String pancakes = scanner.next();
            // solve problem
            output.print("Case #" + t + ": ");
            int flipped = 0;
            // align
            for (int top = 1; top < pancakes.length(); ++top)
                if (pancakes.charAt(top - 1) != pancakes.charAt(top))
                    ++flipped;
            // last one
            if (pancakes.charAt(pancakes.length() - 1) == '-')
                ++flipped;
            output.println(flipped);
        }
        output.close();
        System.out.println("finished");
    }
}

