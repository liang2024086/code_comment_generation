package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1190;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\Sebastian\\workspace\\GoogleCodeJam2016\\input.in");
        Scanner in = new Scanner(inputFile);
        int T = in.nextInt();

        for(int testCases = 1; testCases <= T;testCases++){
            String pancakes = in.next();
            RevengePancake revengePancake = new RevengePancake();
            revengePancake.CountFlips(pancakes);
            System.out.format("Case #%d: %d\n", testCases, revengePancake.TotalNumFlips);
            revengePancake.TotalNumFlips = 0;
        }
    }
}
