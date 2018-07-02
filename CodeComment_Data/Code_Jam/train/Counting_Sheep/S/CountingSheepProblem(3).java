package methodEmbedding.Counting_Sheep.S.LYD783;


import java.util.Scanner;

public class CountingSheepProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int T = sc.nextInt();
        for (int t=1; t<=T; t++) {
            int N = sc.nextInt();
            if (N==0) {
                System.out.println("Case #"+t+": "+"INSOMNIA");
                continue;
            }
            boolean picked[] = new boolean[10];
            for (int i = 1; i <= 100; i++) {
                char[] nseq = Integer.toString(i*N).toCharArray();
                for (char c : nseq) {
                    picked[c-'0'] = true;
                }
                boolean b = true;
                for (int j = 0; j < 10; j++) b = b && picked[j];
                if (b) {
                    System.out.println("Case #"+t+": "+i*N);
                    break;
                }
            }
        }
    }
}
