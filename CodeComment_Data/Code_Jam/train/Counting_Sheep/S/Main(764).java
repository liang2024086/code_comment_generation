package methodEmbedding.Counting_Sheep.S.LYD455;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static boolean a[];
    public static int n, sum, count;

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("A-small-attempt2.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int q = scanner.nextInt();
        for (int t=1;t<=q;t++) {
            n = scanner.nextInt();
            a = new boolean[10];
            count = 10;
            sum = 0;
            if (n==0) {
                System.out.println("Case #" + t + ": INSOMNIA");
            } else {
                while (true) {
                    sum += n;
                    int tmp = sum;
                    int d;
                    while (tmp > 0) {
                        d = tmp % 10;
                        if (!a[d]) {
                            a[d] = true;
                            count--;
                            if (count == 0) {
                                System.out.println("Case #" + t + ": " + sum);
                                break;
                            }
                        }
                        tmp = tmp / 10;
                    }
                    if (count == 0) {
                        break;
                    }
                }
            }
        }
    }

}
