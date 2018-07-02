package methodEmbedding.Counting_Sheep.S.LYD1422;

import java.util.Scanner;

public class Jam1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int j = 1; j < t + 1; j++){            
            long n = s.nextLong();
            if(n == 0){
                System.out.println("Case #" + j + ": INSOMNIA");
                continue;
            }
            boolean[] used = new boolean[10];
            for (int i = 0; i < 10; i++) used[i] = false;
            int all = 0;
            long m = 0;
            while(all < 10){
                m += n;
                long newm = m;
                while(newm > 0){
                    if(!used[(int)(newm % 10)]){
                        all++;
                        used[(int)(newm % 10)] = true;
                    }
                    newm /= 10;
                }
            }
            System.out.println("Case #" + j + ": " + m);
        }
    }
}
