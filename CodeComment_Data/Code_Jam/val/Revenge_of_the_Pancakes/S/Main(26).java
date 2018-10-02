package methodEmbedding.Revenge_of_the_Pancakes.S.LYD253;

import java.util.Scanner;

/**
 * Created by akshit on 9/4/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loop = scanner.nextInt();
        int count = 0;

        while(count<loop){
            count++;
            int turns = 0;

            String input = scanner.next();
            char pre = '+';
            int i;
            for(i=0;i<input.length();i++){
                if(i==0){
                    pre = input.charAt(i);
                }else
                if(pre!=input.charAt(i)){
                    pre = input.charAt(i);
                    turns++;
                }
            }
            if(pre=='-')
                turns++;

            System.out.println("Case #"+count+": "+turns);
        }

        scanner.close();
    }

}
