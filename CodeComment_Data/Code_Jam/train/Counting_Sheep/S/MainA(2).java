package methodEmbedding.Counting_Sheep.S.LYD594;

import java.util.Scanner;

public class MainA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        outer: for (int t = 1; t <= T; t++) {
            long N = sc.nextLong();
            sc.nextLine();
            if(N==0) {
                System.out.println("Case #" + t + ": " + "INSOMNIA");
                continue;
            }
            int arr[] = new int[10];
            int count = 0;
            for(int i=1; i<999999999; i++) {
                long o = N*i;
                char str[] = Long.toString(o).toCharArray();
                for(char c:str) {
                    if(arr[c-'0']==0) {
                        count++;
                        arr[c-'0'] = 1;
                    }
                    if(count==10) {
                        System.out.println("Case #" + t + ": " + o);
                        continue outer;
                    }
                }
            }
            System.out.println("Case #" + t + ": " + "INSOMNIA");
        }
    }
}
