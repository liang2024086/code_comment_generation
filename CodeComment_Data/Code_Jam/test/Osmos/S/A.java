package method_all.Osmos.S.LYD94;


import java.io.*;
import java.util.Scanner;
import aa.algorithms;

public class A {
    public static void main(String[] args) throws IOException {

         InputStream in = new FileInputStream("in.txt");

         Scanner sc = new Scanner(in);
         int t = sc.nextInt();
         int[] ar;
         int a, n, m;
         int op = 0;
         for (int i = 0; i < t; ++i) {
             a = sc.nextInt();
             n = sc.nextInt();
             op = 0;
             ar = new int[n];
             for (int j = 0; j < n; ++j) {
                 ar[j] = sc.nextInt();
                 if (a == 1) {
                     System.out.println("Case " + (i + 1) + ": " + n);
                     continue;
                 }
                 sort(arr, ar + n);
                 m = n;
                 for (j = 0; j < n; ++j) {
                     if (ar[j] < a) {
                         a += ar[j];
                     } else {
                         while (ar[j] >= a) {
                             op++;
                             a = 2 * a - 1;
                         }
                         a += ar[j];
                     }
                     if (m > (op + n - j - 1))
                         m = op + n - j - 1;

                 }
                 System.out.println("Case " + (i + 1) + ": " + n);
             }
         }
         in.close();
     }

}
