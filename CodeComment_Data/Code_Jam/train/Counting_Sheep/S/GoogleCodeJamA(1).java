package methodEmbedding.Counting_Sheep.S.LYD6;

import java.util.Scanner;

public class GoogleCodeJamA {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int test = 1; test <= t; test ++) {
            int n = in.nextInt();
            int num = n;

            int a[] = new int [20];
            boolean b[] = new boolean[10];
            int left = 10;

            int j = 0;

            while (num > 0) {
                a[j++] = num % 10;
                if (!b[num % 10]) {
                    b[num % 10] = true;
                    left --;
                }
                num /= 10;
            }



            for (int i = 0; i<100 && left > 0; i++) {
                a[0] += n;

                j = 0;
                while (a[j] > 9) {


                    a[j + 1] += a[j] / 10;
                    a[j] %= 10;

                    if (!b[a[j]]) {
                        b[a[j]] = true;
                        left --;
                    }

                    j++;
                }

                if (!b[a[j]]) {
                    b[a[j]] = true;
                    left --;
                }

            }
            System.out.print("Case #"+(test)+": ");
            if (left == 0) {
                j = a.length - 1;

                while (j > 0 && a[j] == 0) j--;

                for (int i = j; i>=0;i--) {
                    System.out.print(a[i]);
                }
                System.out.println();
            } else {
                System.out.println("INSOMNIA");
            }


        }

        in.close();
    }
}
