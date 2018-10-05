package methodEmbedding.Revenge_of_the_Pancakes.S.LYD777;

import java.util.Scanner;

/**
 * Created by leyang on 4/8/16.
 */
public class pancakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();

        for (int i = 0; i < num; i++) {
            String pancakes = in.nextLine();

            char[] arr = pancakes.toCharArray();
            char temp = arr[0];
            int count = 0;

            if(arr[0] == '-')
                count++;

            for (int j = 1; j < arr.length; j++) {

                if(arr[j] == '-' && temp == '/'){
                    continue;
                }
                if (arr[j] == '+' && temp == '-') {
                    if(arr[0] != '-')
                        count += 1;
                } else if (arr[j] == '-' && temp == '+') {
                    count += 2;
                    temp = '/';
                    continue;
                }

                temp = arr[j];
            }

            System.out.println("Case #" + (i+1) + ": " + count);
        }

    }
}
