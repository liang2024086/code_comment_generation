package methodEmbedding.Counting_Sheep.S.LYD817;

import java.util.*;
public class Sheep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int counter = 1;
        int[] hold = new int[10];
        while(cases-- > 0){
            hold = new int[10];
            int count = 0;
            int n = in.nextInt();
            if (n == 0)
                System.out.println("Case #"+counter+": "+ "INSOMNIA");
            else{
                int j = 0;
                while(count!=10){
                   j++;
                   char[] chars = ("" + (n*j)).toCharArray();
                   for(int i = 0; i < chars.length; i++){
                       if (hold[chars[i] - 48]==0){
                           count++;
                           hold[chars[i] - 48]=1;
                       }
                   }
                }
                System.out.println("Case #"+counter+": "+ n*j);
            }
            counter++;
        }
    
    }
    
}
