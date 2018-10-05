package methodEmbedding.Standing_Ovation.S.LYD970;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int T = inp.nextInt();

        for (int i = 0; i < T; i++) {
            int res = 0;
            int s = inp.nextInt();
            String per = inp.next();
            int sum = Integer.parseInt(per.charAt(0)+"");
            for (int j = 1; j <= s; j++) {
                int temp = Integer.parseInt(per.charAt(j)+"");
                if(sum < j && temp > 0){
                    res += (j-sum);
                    sum += (j-sum);
                }
                sum += temp;
            }
            System.out.println("Case #"+(i+1)+": "+res);
        }


    }
}
