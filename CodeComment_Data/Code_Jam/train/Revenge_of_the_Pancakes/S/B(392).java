package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1213;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class B {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("B-small-attempt0.in"));
//        Scanner sc = new Scanner(new File("B-large.in"));
//        Scanner sc = new Scanner(System.in);
//        PrintStream out = System.out;
        PrintStream out = new PrintStream(new FileOutputStream("B-small.out"));
//        PrintStream out = new PrintStream(new FileOutputStream("B-large.out"));
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String next = sc.next();
            List<Boolean> list = new ArrayList<>(next.length());
            char[] chars = next.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char aChar = chars[j];
                if (aChar == '-') {
                    list.add(false);
                } else {
                    list.add(true);
                }
            }
            for (int j = 0; ; j++) {
                HashSet<Boolean> set = new HashSet<>(list);
                set.remove(true);
                if (set.isEmpty()) {
                    out.print("Case #" + (i + 1) + ": ");
                    out.println(j);
                    break;
                } else {
                    int lastIndexOf = list.lastIndexOf(false);
                    for (int k = 0; k <= lastIndexOf; k++) {
                        list.set(k, !list.get(k));
                    }
                }
            }

        }
    }
}
