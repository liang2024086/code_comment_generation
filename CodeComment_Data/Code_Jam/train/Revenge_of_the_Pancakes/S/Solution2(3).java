package methodEmbedding.Revenge_of_the_Pancakes.S.LYD0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws FileNotFoundException {
        File infile = new File("in/B-small-attempt0.in");
        Scanner in = new Scanner(infile);
        PrintWriter out = new PrintWriter("out/B-output.txt");
        int cases = Integer.valueOf(in.nextLine());

        for (int i = 1; i <= cases; i++) {
            String line = in.nextLine();
            out.write("Case #" + i + ": ");
            int count = 0;

            if (!line.contains("-")) {
                out.write(count + "\n");
                continue;
            }

            while (line.contains("-")) {
                count++;
                String tmp = "";
                int lastMinus = line.lastIndexOf("-");
                for (int j = 0; j <= lastMinus; j++) {
                    if (line.charAt(j) == '+')
                        tmp += "-";
                    else
                        tmp += "+";
                }
                tmp += line.substring(lastMinus + 1, line.length());
                line = tmp;
            }

            out.write(count + "\n");
        }

        in.close();
        out.close();
    }
}
