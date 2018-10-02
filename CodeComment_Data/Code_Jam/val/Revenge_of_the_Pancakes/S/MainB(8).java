package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1099;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainB {

    public static int n, sum;
    public static FileWriter fw;
    public static String s;
    public static char now;

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            fw = new FileWriter("B-small.out");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
//            scanner = new Scanner(System.in);
            scanner = new Scanner(new File("B-small-attempt0.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int q = scanner.nextInt();
        for (int t=1;t<=q;t++) {
            s = scanner.next();
            sum = 0;
            now = s.charAt(0);
            for (int i=1;i<s.length();i++) {
                if (s.charAt(i) != now) {
                    sum++;
                    now = s.charAt(i);
                }
            }
            sum = (now == '+') ? sum : sum+1;
            try {
                fw.write("Case #" + t + ": " + sum + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
