package methodEmbedding.Magic_Trick.S.LYD1263;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Elessar on 12.04.2014.
 */
public class CodeJam {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        int n = sc.nextInt();
        for (int iter = 0; iter < n ; iter++){
            int k = sc.nextInt();
            int[] a = new int[4];
            int[] b = new int[4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == k - 1)
                        a[j] = sc.nextInt();
                    else
                        sc.nextInt();
                }
            }

            k = sc.nextInt();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == k - 1)
                        b[j] = sc.nextInt();
                    else
                        sc.nextInt();
                }
            }
            int count = 0;
            int cart = -1;
            for (int i = 0; i < 4; i++)
                for (int t = 0; t < 4; t++){
                    if (a[i] == b[t]) {
                        count++;
                        cart = a[i];
                    }
                }
            pw.print("Case #" + (iter + 1) + ": ");
            if (count == 0)
                pw.println("Volunteer cheated!");
            else if (count == 1)
                pw.println(cart);
            else
                pw.println("Bad magician!");

        }
        pw.close();
        sc.close();
    }
}
