package methodEmbedding.Counting_Sheep.S.LYD884;

/**
 * Created by entri on 4/8/2016.
 */

import java.util.Scanner;

public class CountingSheep {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cases = Integer.parseInt(in.nextLine());

        for(int i = 1; i<=cases; i++) {
            boolean check = true;
            int count = 1;
            int n = Integer.parseInt(in.nextLine());
            int original = n;
            boolean[] digits = new boolean[10];
            while(check) {
                if(n == 0) {
                    System.out.printf("Case #%d: INSOMNIA%n", i);
                    break;
                }

                for (char num : (n + "").toCharArray())
                    digits[Integer.parseInt(num + "")] = true;

                check = false;
                for (boolean hasNum : digits)
                    if (!hasNum) {
                        check = true;
                        break;
                    }

                if (check) {
                    count++;
                    n = original*count;
                }
                else {
                    System.out.printf("Case #%d: %d%n", i, n);
                }
            }
        }
    }
}
