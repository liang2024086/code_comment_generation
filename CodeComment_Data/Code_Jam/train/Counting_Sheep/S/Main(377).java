package methodEmbedding.Counting_Sheep.S.LYD667;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static int T, mask, answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int i=0; i<10; i++) {
            mask |= 1 << i;
        }

        for(int t=0 ; t< T; t++) {
            BigInteger n = BigInteger.valueOf(sc.nextInt());

            if(n.intValue() == 0) {
                System.out.println(String.format("Case #%d: INSOMNIA", t+1));
                continue;
            }

            BigInteger bi = n;

            while(true) {
                String temp = bi.toString();
                for(int i=0; i< temp.length(); i++) {
                    answer |= 1 << temp.charAt(i) - '0';
                }

                if( (mask & answer) == mask) {
                    System.out.println(String.format("Case #%d: %s", t+1, temp));
                    break;
                }
                bi = bi.add(n);
            }

            answer = 0;
        }
    }
}
