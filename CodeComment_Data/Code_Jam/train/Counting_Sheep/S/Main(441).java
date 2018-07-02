package methodEmbedding.Counting_Sheep.S.LYD1709;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Marcus on 4/8/2016.
 */
public class Main {

        public static void main(String ... orange) throws Exception
        {
            Scanner input = new Scanner(System.in);
            int numCases = input.nextInt();
            for (int n = 0; n < numCases; n++)
            {
                int N = input.nextInt();
                String answer = "INSOMNIA";
                if(N != 0) {
                    int[] digits = new int[10];
                    for(int i=1; i< Integer.MAX_VALUE; i++) {
                        int number = i * N;
                        int origNum = number;
                        while (number > 0) {
                            int digit = number % 10;
                            digits[digit]++;
                            number = number / 10;
                        }
                        List<Integer> arrayList = IntStream.of(digits).boxed().collect(Collectors.toList());
                        if(!arrayList.contains(0)){
                            answer = String.valueOf(origNum);
                            break;
                        }
                    }

                }
                System.out.printf("Case #%d: %s\n", n + 1, answer);
            }
        }

}
