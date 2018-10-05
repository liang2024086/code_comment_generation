package methodEmbedding.Counting_Sheep.S.LYD657;

//Chase Dawson
import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;
public class CountingSheep {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("a_small.in"));
      //Scanner input = new Scanner(System.in);
      int testCases = input.nextInt();
      boolean[] current;
      for(int x = 0; x < testCases; x++) {
         current = new boolean[10];
         BigInteger n = new BigInteger("" + input.nextInt());
         BigInteger n2 = new BigInteger(n.toString());
         if(n.equals(n.ZERO))
            System.out.println("Case #" + (x + 1) + ": INSOMNIA");
         else {
         BigInteger answer; 
         BigInteger val = new BigInteger("2");
         while(true) {
         char[] nn = n2.toString().toCharArray();
         for(char c: nn) {
               if(current[Integer.parseInt(c + "")] != true)
                  current[Integer.parseInt(c + "")] = true;
            }
            int count = 0;
            for(int c = 0; c < 10; c++) {
               if(current[c] == true)
                  count++;
            }
            if(count == 10) {
               answer = n2;
               break;
            }
            else {
               n2 = n.multiply(val);
               val = val.add(new BigInteger("1"));
            }
         }
         System.out.println("Case #" + (x + 1) + ": " + answer); }

      }
   }
}
