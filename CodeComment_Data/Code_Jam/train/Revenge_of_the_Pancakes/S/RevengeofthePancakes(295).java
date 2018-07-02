package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1202;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by pallavi on 9/4/16.
 */
public class RevengeofthePancakes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("in.txt")));
        PrintWriter writer = new PrintWriter("out.txt");
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            char[] ch = scanner.next().toCharArray();
            int c = 1;
            for (int j = 1; j < ch.length; j++) {
                if (ch[j] != ch[j-1]) {
                    c++;
                }
            }
            if (ch[ch.length-1] == '+') c--;
            writer.println("Case #" + i + ": " + c);
        }
        writer.close();
        scanner.close();
    }
}
