package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1175;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by r0h17 on 4/9/16.
 */
public class pancake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.nextLine();
        for (int i = 0; i < input; i++) {
            String[] array = in.nextLine().split("|");
            int change = 0;
            for (int j = 1; j < array.length; j++) {
                if(!array[j].equalsIgnoreCase(array[j-1])){
                    change++;
                }
            }
            if(!array[array.length-1].equalsIgnoreCase("+")){
                change++;
            }
            System.out.println("Case #"+(i+1)+": "+change);
        }

    }

}
