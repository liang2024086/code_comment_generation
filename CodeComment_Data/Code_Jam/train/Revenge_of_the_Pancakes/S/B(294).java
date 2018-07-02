package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1027;

import java.io.*;
import java.util.Scanner;

/**
 * Created by dyh12 on 2016/4/9.
 */
public class B {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("B-large.in");
        PrintStream out = new PrintStream(new FileOutputStream("B-large.out"));
        System.setIn(fis);
        System.setOut(out);
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= t; ++i) {
            int sum = 0;
            String s = in.nextLine();
            s = s + "+";
            for (int j = 0; j < s.length() - 1; j++){
                if (! s.substring(j,j+1).equals(s.substring(j+1,j+2))) sum++;
            }
            System.out.println("Case #" + i + ": " + sum);
        }
    }
}
