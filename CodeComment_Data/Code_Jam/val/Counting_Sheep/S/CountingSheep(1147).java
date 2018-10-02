package methodEmbedding.Counting_Sheep.S.LYD1204;


import java.util.Scanner;

public class CountingSheep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int count = 0;
            int prevn = n;
            int orgn = n;
            int times = 1000;
            do {
                int cur = n;
                for (int j = 0; cur != 0; j++) {
                    int rem = cur % 10;
                    if (arr[rem] != 1) {
                        arr[rem] = 1;
                        count++;
                        if (count == 10) {
                            break;
                        }
                    }
                    cur /= 10;
                }
                if (count == 10) {
                    break;
                }
                prevn = n;
                n += orgn;
                times--;
            } while (prevn != n && times > 0);
            if (times != 0 && prevn != n) {
                System.out.println("Case #"+(i+1)+" "+n);
            } else {
                System.out.println("Case #"+(i+1)+" "+"INSOMNIA");
            }
        }
    }
}
