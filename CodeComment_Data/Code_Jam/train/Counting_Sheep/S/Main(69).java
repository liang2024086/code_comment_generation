package methodEmbedding.Counting_Sheep.S.LYD1161;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner sr = new Scanner(new File("/Users/Yogurt/Downloads/A-small-attempt0.in"));
        int t;
        BigInteger n,q;
        int c;
        while (sr.hasNext()) {
            t = sr.nextInt();
            c = 0;
            for (int i = 0; i < t; i++) {
                c++;
                n = sr.nextBigInteger();
                q = new BigInteger(n.toString());
                if (n.equals(BigInteger.ZERO)) {
                    System.out.println("Case #" + c + ": INSOMNIA");
                    continue;
                }
                int sum = 0;
                int[] num = new int[10];
                while (true){
                    for(int j = 0;j < 10;j++){
                        if(num[j] != 1){
                            if(n.toString().contains(String.valueOf(j))){
                                num[j] = 1;
                                sum++;
                            }
                        }
                    }
                    if(sum == 10){
                        System.out.println("Case #" + c + ": "+n);
                        break;
                    }else{
                        n = n.add(q);
                    }
                }
            }
        }
        sr.close();
    }
}
