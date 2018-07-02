package methodEmbedding.Cookie_Clicker_Alpha.S.LYD990;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        Formatter output = new Formatter(new File("ouput.txt"));
        int T = Integer.parseInt(input.nextLine());

        for (int i = 0; i < T; i++) {
            String[] line = input.nextLine().split(" ");
            double C = Double.parseDouble(line[0]);
            double F = Double.parseDouble(line[1]);
            double X = Double.parseDouble(line[2]);
            double cookiePerSec = 2.0f;
            double noOfCookies = 0.0;
            double sec = 0.0;
            boolean idealRate = false;
            for (; noOfCookies <= X;) {
                noOfCookies += cookiePerSec;
                if (X / cookiePerSec
                        < (C / cookiePerSec) + (X / (cookiePerSec + F))) {
                    idealRate = true;
                }
                if (noOfCookies >= C && !idealRate) {
                    sec += (C / cookiePerSec);
                    cookiePerSec += F;
                    noOfCookies = 0;

                }

            }

            sec += (X / cookiePerSec);
            output.format("Case #%d: %.7f\n", (i + 1), sec);
        }

        output.close();
    }

}
