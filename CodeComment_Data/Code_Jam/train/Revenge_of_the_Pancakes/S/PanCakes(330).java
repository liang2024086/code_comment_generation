package methodEmbedding.Revenge_of_the_Pancakes.S.LYD811;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by deepnand on 4/9/16.
 */
public class PanCakes {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i = 0;
        while(i < T){
            i++;
            String pancakes = in.next();
            char[] pancakeArray = pancakes.toCharArray();
            int j = pancakeArray.length - 1;
            char state = '+';
            int flips = 0;
            for(; j>=0; j--){
                if(pancakeArray[j] != state){
                    flips++;
                    state = pancakeArray[j];
                }
            }
            System.out.println("Case #" + i +": "+ flips);
        }
    }
}
