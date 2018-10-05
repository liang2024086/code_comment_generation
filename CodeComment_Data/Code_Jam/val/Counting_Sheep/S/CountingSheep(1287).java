package methodEmbedding.Counting_Sheep.S.LYD1464;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingSheep {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int t = in.nextInt(); 
        for (int i = 1; i <= t; ++i) {
            
            int n = in.nextInt();
           
            StringBuffer digits = new StringBuffer("0123456789");
            int multiplier = 1;
            int number = n;
            int lastNumber = -1;
            StringBuffer trace = new StringBuffer();
            while(digits.length() > 0) {
                number = multiplier * n;
                if (lastNumber == number) {
                    break;
                }
                String s = Integer.toString(number);
                int length = s.length();
                for (int j=0; j<length; j++) {
                    String digit = Character.toString(s.charAt(j));
                    int index = digits.indexOf(digit);
                    if (index >= 0) {
                        digits.deleteCharAt(index);
                    }
                }
                //trace.append("[" + multiplier + "*" + n + "=" +  number + "]" + digits + "\n");
                multiplier++;
                lastNumber = number;
            }
            
            if (digits.length() > 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
            } else {
                System.out.println("Case #" + i + ": " + number);
                //System.out.println(trace.toString());
            }
        }
        in.close();
    }
}
