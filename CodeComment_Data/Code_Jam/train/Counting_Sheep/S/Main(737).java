package methodEmbedding.Counting_Sheep.S.LYD1600;


import java.util.*;
import java.io.*;

public class Main {
    private static Integer output;

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            try
            {
                int n = in.nextInt();

            if (n == 0) {
                System.out.println("Case #" + i + ": " + "INSOMNIA");
            } else {
                Integer[] numbers = new Integer[10];
                Integer[] numbersFinal = new Integer[10];
                numbers = new Integer[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                int num = n;
                int sum = 0;
                for (int j = 1; j <= 1000; j++) {
                    num = j * n;
                    sum = 0;
                    char[] chars = Integer.toString(num).toCharArray();
                    for (int k = 0; k < chars.length; k++) {
                        int temp = Character.getNumericValue(chars[k]);
                        numbers[temp] = 1;
                    }
                    for(int l=0;l< numbers.length;l++){
                        sum = sum+numbers[l];
                    }
                    if (sum == 10) {
                        System.out.println("Case #" + i + ": " + Integer.toString(num));
                        break;
                    }
                }
                if(sum != 10) {
                    System.out.println("Case #" + i + ": " + "INSOMNIA");
                }
            }
            }
            catch(Exception e ){
                System.out.println(e.toString());
            }
        }
    }
}
