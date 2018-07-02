package methodEmbedding.Revenge_of_the_Pancakes.S.LYD784;

import java.util.*;

public class B{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        for(int i = 0; i < test; i++){
            String pancake = in.next();
            int length = pancake.length();
            boolean plus = false;
            int flipCounter = 0;

            for(int j = 0; j < length; j++){
                if(pancake.charAt(j) == '+'){
                    plus = true;
                } else{
                    while(j < length && pancake.charAt(j++) == '-'){}

                    if(plus){
                        flipCounter += 2;
                    } else{
                        plus = true;
                        flipCounter++;
                    }

                    pancake = pancake.substring(0, j).replace('-', '+') + pancake.substring(j, pancake.length());

                    //System.out.println(pancake + " " + flipCounter);
                    j--;
                }
            }

            System.out.println("Case #" + (i+1) + ": " + flipCounter);
        }
    }
}
