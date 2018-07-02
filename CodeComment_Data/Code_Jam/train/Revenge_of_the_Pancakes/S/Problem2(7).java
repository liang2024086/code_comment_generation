package methodEmbedding.Revenge_of_the_Pancakes.S.LYD345;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by depa on 2016. 4. 9..
 */
public class Problem2 {
    public static void main(String args[]) throws FileNotFoundException {
        File input = new File("./src/B-small-attempt0.in");
        Scanner sc = new Scanner(input);
        int T = sc.nextInt();
        int x = 1;

        while(T-- > 0){
            char[] panCake =  sc.next().toCharArray();

            int index = 0;
            int length = panCake.length;
            char befChar = panCake[0];
            int count = 0;
            while(true){

                if(index == 0){
                    befChar = panCake[index];
                    panCake[index] = panCake[index] == '+' ? '-': '+';
                } else {
                    if(befChar == panCake[index]){
                        panCake[index] = panCake[index] == '+' ? '-': '+';
                    } else {
                        index = 0;
                        count++;
                        continue;
                    }
                }

                if(index == length - 1){
                    if(befChar == '-' ){
                        count++;
                    }
                    break;
                }
                index++;
            }
            System.out.println("Case #"+ x++ +": " + count);

        }
    }
}
