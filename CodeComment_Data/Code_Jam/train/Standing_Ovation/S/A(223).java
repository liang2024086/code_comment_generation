package methodEmbedding.Standing_Ovation.S.LYD1866;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * User: RK
 */
public class A {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("test_codejam/a.in"));
        PrintWriter out = new PrintWriter(new FileOutputStream("test_codejam/a.out"));
//        Scanner in = new Scanner(System.in);
//        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        int test = 1;
        while (t-->0) {
            int len = in.nextInt();
            String s = in.nextLine().trim();
            int answer = 0;
            int current = s.charAt(0) - '0';
            for (int i=0;i<len;i++) {
                int z = s.charAt(i+1)-'0';
                if (z>0 && i+1>current) {
                    answer+=(i+1)-current;
                    current+=(i+1)-current;
                }
                current+=z;
            }
            out.println("Case #" + test + ": " + answer);
            test++;
        }
        out.close();
    }

}
