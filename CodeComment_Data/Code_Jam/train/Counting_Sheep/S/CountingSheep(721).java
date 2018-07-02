package methodEmbedding.Counting_Sheep.S.LYD246;

import java.util.Scanner;

public class CountingSheep{

    public static void main(String[] args){
        int T;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        for(int caseNum = 1 ; caseNum <= T ; caseNum++){
            int N = scanner.nextInt();
            if(N == 0){
                System.out.println("Case #"+caseNum+": "+"INSOMNIA");
            }
            else{
                int current = N;
                int count = 0;
                boolean[] digits = new boolean[10];
                while(count != 10){
                    int tmp = current;
                    while(tmp != 0){
                        if(digits[tmp%10] == false){
                            digits[tmp%10] = true;
                            count++;
                        }
                        tmp /= 10;
                    }
                    if(count == 10){
                        System.out.println("Case #"+caseNum+": "+current);
                        break;
                    }
                    current += N;
                }
            }
        }
    }
}
