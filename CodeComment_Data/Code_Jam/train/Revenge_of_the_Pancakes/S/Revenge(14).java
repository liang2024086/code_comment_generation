package methodEmbedding.Revenge_of_the_Pancakes.S.LYD332;

import java.util.Scanner;


public class Revenge {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int i = 1; i <= T; i++){
            String str = in.next();
            int num = 0;
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                switch(str.charAt(j)){
                    case '-':
                        if(num == -1){
                            continue;
                        }
                        else if(num == 1){
                            count++;
                            num = -1;
                        }else{
                            num = -1;
                        }
                        break;
                    case '+':
                        if(num == 1){
                            continue;
                        }else if(num == -1){
                            count++;
                            num = 1;
                        }else{
                            num = 1;
                        }
                        break;
                }
            }
            System.out.printf("Case #%d: %d\n", i, num == 1? count: count + 1);
        }

    }
}
