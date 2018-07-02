package methodEmbedding.Counting_Sheep.S.LYD43;


import java.util.*;
import java.io.*;
public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("outputA.txt"));
        //Scanner in  = new Scanner(new File("input.txt"));
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            List<Integer> list = new LinkedList<Integer>();
            for (int j = 0; j <= 9; j++) {
                list.add(j);
            }
            int n = in.nextInt();
            if (n == 0) {
                out.println("Case #" + i + ": INSOMNIA");

            }
            else {
                int result = n;
                int j = 1;
                while (!list.isEmpty()) {
                    result = j * n;
                    int sub = result;
                    while (sub != 0) {
                        list.remove(new Integer(sub % 10));
                        sub = sub / 10;
                    }
                    j++;
                }
                out.println("Case #" + i + ": " + result);
            }
        }
    }
}
