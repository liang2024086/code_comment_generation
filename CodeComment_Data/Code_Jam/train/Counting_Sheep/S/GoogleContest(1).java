package methodEmbedding.Counting_Sheep.S.LYD1042;


import java.util.Arrays;
import java.util.Scanner;

public class GoogleContest {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numCases = stdin.nextInt();

        for (int loop = 1; loop <= numCases; loop++) {

            int n = stdin.nextInt();
            int[] digits = {0,0,0,0,0,0,0,0,0,0};
            boolean found = false;
            long value = 0;
            int curN = n;
            
            for (int i = 2; i < 1000; i++) {
                int number = curN; // = some int

                while (number > 0) {
                    digits[number % 10] = 1;
                    number = number / 10;
                }
                boolean allOne = true;
                for (int j = 0; j < 10; j++) {
                    if(digits[j]== 0){
                        allOne = false;
                    }
                }
                if(allOne){
                    found = true;
                    value = curN;
                    break;
                }else{
                    curN=n*i;
                }
            }

            System.out.println("Case #" + loop + ": " + (found?String.valueOf(value):"INSOMNIA"));
        }
    }

}
