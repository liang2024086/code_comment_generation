package methodEmbedding.Counting_Sheep.S.LYD234;

import java.io.*;
import java.util.*;

public class CountingSheep {

    private static int digitsVector = 0;
    private static boolean allTrue = false;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        try {
            PrintWriter out = new PrintWriter(new FileWriter("countsheep.txt"));


            int numTrials = in.nextInt();

            for (int i = 1; i <= numTrials; i++) {

                int N = in.nextInt();
                int multiplier = 0;
                int num = -1;
                allTrue = false;
                digitsVector = 0;

                while (!allTrue && N != 0) {

                    multiplier++;

                    // sets digits to true
                    num = N*multiplier;
                    while (num != 0) {

                        // sets bit of digit = 1, represents seen
                        digitsVector = digitsVector | (1 << (num%10));
                        num = num/10;
                    }

                    // checks if all digits seen
                    if (digitsVector == 1023)
                        allTrue = true;

                }

                if (N == 0)
                    out.println("Case #" + i + ": INSOMNIA");
                else
                    out.println("Case #" + i + ": " + N*multiplier);
            }


            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
}
