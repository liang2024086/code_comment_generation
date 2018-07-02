package methodEmbedding.Counting_Sheep.S.LYD278;


import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Mohit on 4/8/2016.
 */
public class CountingSheep {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);;

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; ++i){
            int num = scanner.nextInt();
            scanner.nextLine();

            int digitsFound = 0;
            HashSet<Integer> set = new HashSet<>();
            boolean[] digits = new boolean[10];

            int originalNumber = num;
            int count = 1;

            while (digitsFound != 10){
                num = originalNumber * count;
                if (set.contains(num)){
                    System.out.println("Case #" + (i+1) + ": INSOMNIA");
                    break;
                }
                String numStr = String.valueOf(num);
                for (char c : numStr.toCharArray()){
                    int digit = c - '0';
                    if (!digits[digit]){
                        digits[digit] = true;
                        ++digitsFound;
                    }
                }
                set.add(num);
                ++count;
            }
            if (digitsFound == 10)
                System.out.println("Case #" + (i+1) + ": " + num);
        }

        scanner.close();

    }
}
