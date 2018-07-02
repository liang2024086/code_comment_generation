package methodEmbedding.Counting_Sheep.S.LYD184;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        final String FILE = "A-small-attempt0";
        PrintWriter outPrinter = new PrintWriter(new File("C:\\Users\\ivo.correia\\Downloads\\" + FILE  + ".out"));

        Scanner scanIn = new Scanner(new File("C:\\Users\\ivo.correia\\Downloads\\" + FILE + ".in"));
        final int N = Integer.parseInt(scanIn.nextLine());


        for (int entries = 0; entries < N; entries++) {
            int digitsSeen = 0;
            boolean[] digits = new boolean[10];
            int cycles = 1;

            String number = scanIn.nextLine();
            int intNumber = Integer.parseInt(number);

            String currentNumber = "";
            while (digitsSeen < 10 && cycles < 100000) {
                try {
                    currentNumber = Integer.toString(intNumber * cycles);
                } catch (Exception e) {
                    System.out.println("Error for " + number);
                    break;
                }

                for (int i = 0; i < currentNumber.length(); i++) {
                    if (digits[currentNumber.charAt(i) - '0'] == false) {
                        digitsSeen++;
                        digits[currentNumber.charAt(i) - '0'] = true;
                    }
                }

                cycles++;
                if (number.equals(currentNumber) && cycles > 2) {
                    break;
                }
            }

            if (digitsSeen != 10) {
                outPrinter.write("Case #" + (entries + 1) + ": INSOMNIA\n");
            } else {
                outPrinter.write("Case #" + (entries + 1) + ": " + currentNumber + "\n");
            }

        }

        outPrinter.close();
        scanIn.close();
    }

}
