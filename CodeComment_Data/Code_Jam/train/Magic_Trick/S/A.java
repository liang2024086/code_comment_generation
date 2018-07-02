package methodEmbedding.Magic_Trick.S.LYD1686;

import java.io.*;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("D:\\GCJ\\src\\A-small-attempt0.in");
        Writer writer = new FileWriter("D:\\GCJ\\src\\a-out.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        Scanner sc = new Scanner(in);

        int a[], b[], t, i, j, k;
        a = new int[4];
        b = new int[4];
        int p, q;
        t = sc.nextInt();

        for (i = 1; i <= t; i++) {
            p = sc.nextInt();
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++)
                    if (j == p - 1)
                        a[k] = sc.nextInt();
                    else
                        q = sc.nextInt();
            }

            q = sc.nextInt();
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++)
                    if (j == q - 1)
                        b[k] = sc.nextInt();
                    else
                        p = sc.nextInt();
            }

            p = 0;
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++) {
                    if (a[j] == b[k]) {
                        p++;
                        q = b[k];
                    }
                }
            }
            if (p == 0) {
                System.out.println("Case #" + i + ": Volunteer cheated!");
                bufferedWriter.write("Case #" + i + ": Volunteer cheated!");
                bufferedWriter.newLine();

            } else if (p == 1) {
                System.out.println("Case #" + i + ": " + q);
                bufferedWriter.write("Case #" + i + ": " + q);
                bufferedWriter.newLine();
            } else {
                System.out.println("Case #" + i + ": Bad magician!");
                bufferedWriter.write("Case #" + i + ": Bad magician!");
                bufferedWriter.newLine();
            }
        }
        in.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
