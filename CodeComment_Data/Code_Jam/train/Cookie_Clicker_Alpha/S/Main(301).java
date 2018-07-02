package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1586;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: thoma_000
 * Date: 12-4-14
 * Time: 19:37
 */

/*
In this problem, you start with 0 cookies.
You gain cookies at a rate of 2 cookies per second, by clicking on a giant cookie.
Any time you have at least C cookies, you can buy a cookie farm.
Every time you buy a cookie farm, it costs you C cookies and gives you an extra F cookies per second.

Once you have X cookies that you haven't spent on farms, you win!
Figure out how long it will take you to win if you use the best possible strategy.

Input
The first line of the input gives the number of test cases, T. T lines follow.
Each line contains three space-separated real-valued numbers:
C, F and X, whose meanings are described earlier in the problem statement.
C, F and X will each consist of at least 1 digit followed by 1 decimal point followed by from 1 to 5 digits.
There will be no leading zeroes.

Output
For each test case, output one line containing "Case #x: y", where x is the case number (starting from 1)
and y is the minimum number of seconds it takes before you can have X delicious cookies.

We recommend outputting y to 7 decimal places, but it is not required.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("B-small-attempt0.in"));
            pw = new PrintWriter(new FileWriter("output.out"));

            int cases = Integer.parseInt(br.readLine());
            for (int t = 1; t <= cases; t++) {
                String[] line = br.readLine().split("\\s");
                double[] values = new double[3];
                for (int i = 0; i < line.length; i++) {
                    values[i] = Double.parseDouble(line[i]);
                }
                Case game = new Case(t, values[0], values[1], values[2]);
                pw.write(String.valueOf(game.result) + "\n");
            }
        } finally {
            if (br != null) {
                br.close();
            }
            if (pw != null) {
                pw.close();
            }
        }
    }
}
