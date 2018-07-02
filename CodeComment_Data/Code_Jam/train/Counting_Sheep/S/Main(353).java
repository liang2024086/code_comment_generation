package methodEmbedding.Counting_Sheep.S.LYD574;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        int T = Integer.parseInt(in.readLine());

        File outFile = File.createTempFile("pancakes.", ".out");

        PrintStream out = new PrintStream(outFile);
        for (int t = 0; t < T; t++) {
            long num = Long.parseLong(in.readLine());

            if (num == 0) {
                out.println("Case #" + (t+1) + ": INSOMNIA");
            } else {
                List<Boolean> seen = new ArrayList<Boolean>();
                for (int i = 0; i < 10; i++) {
                    seen.add(false);
                }

                long rem = num;
                while (rem > 0) {
                    int digit = (int) rem % 10;
                    seen.set(digit, true);
                    rem = rem / 10;
                }

                long currentNum = num;

                while (seen.contains(false)) {
                    currentNum += num;
                    long irem = currentNum;
                    while (irem > 0) {
                        int digit = (int)irem % 10;
                        seen.set(digit, true);
                        irem = irem / 10;
                    }
                }

                out.println("Case #" + (t+1) + ": " + currentNum);
            }


        }
        out.close();
        System.out.println(outFile.getAbsolutePath());
    }
}
