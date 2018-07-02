package methodEmbedding.Counting_Sheep.S.LYD1578;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by depa on 2016. 4. 9..
 */
public class Problem1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int x = 1;
        Set<Integer> digits = null;
        while(T-- > 0){
            int N = sc.nextInt();
            digits= new HashSet<Integer>();
            if(N == 0){
                System.out.println("Case #"+ x+++": " + "INSOMNIA");
                continue;
            }
            int n = 0;
            // int nN = 0;
            while(digits.size() < 10){
                n++;
                int k = n * N;
                while(k > 0){
                    digits.add(k%10);
                    k = k / 10;
                }
            }

            System.out.println("Case #"+ x++ +": " + n * N);

        }
    }
}
