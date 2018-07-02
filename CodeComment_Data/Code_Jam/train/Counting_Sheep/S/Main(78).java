package methodEmbedding.Counting_Sheep.S.LYD1487;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = scanner.nextInt();
        for (int i = 1; i <= t; ++i) {
          int count = 0;
          BigInteger n = scanner.nextBigInteger();
          if (!n.equals(BigInteger.ZERO)) {
            boolean[]
                num_map =
                {false, false, false, false, false, false, false, false, false, false};
            BigInteger temp, current = n;
            do {
              temp = current;
              do {

                int digit = (temp.divideAndRemainder(BigInteger.valueOf(10)))[1].intValue();
                if (!num_map[digit]) {
                  num_map[digit] = true;
                  count++;
                }
                temp = temp.divide(BigInteger.valueOf(10));


              } while (temp.signum() == 1);

              current = current.add(n);


            } while (count < 10);
            System.out.println("Case #" + i + ": " + current.subtract(n));

          } else {
            System.out.println("Case #" + i + ": " + "INSOMNIA");
          }
        }

    }
}
