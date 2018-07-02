package methodEmbedding.Counting_Sheep.S.LYD801;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("sample.txt"));
        scan.nextLine();

        PrintWriter writer = new PrintWriter("result.txt", "UTF-8");

        int count = 0;

        while (scan.hasNextLine()) {
            int number = Integer.parseInt(scan.nextLine());
            count++;

            if (number == 0) {
                writer.println("Case #" + count + ": " + "INSOMNIA");
                continue;
            }

            int sample = number;

            Integer[] sam = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            ArrayList<Integer> good = new ArrayList<Integer>();
            good.addAll(Arrays.asList(sam));
            ArrayList<Integer> check = new ArrayList<Integer>();

            do {
                int num = number;
                while (num >= 10) {
                    int remaider = num % 10;
                    num = num / 10;
                    check.add(remaider);
                }
                check.add(num);
                number = sample + number;
            } while (!check.containsAll(good));

            writer.println("Case #" + count + ": " + (number - sample));
        }

        writer.close();
    }
}
