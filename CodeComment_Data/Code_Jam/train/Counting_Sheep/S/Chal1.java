package methodEmbedding.Counting_Sheep.S.LYD164;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Ihtesham on 4/8/2016.
 */

public class Chal1 {

    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        int elms = reader.nextInt();
        for(int i = 1; i <= elms; i++) {
            int start = reader.nextInt();
            int num = start;
            Set<Integer> h = new HashSet<Integer>();
            if(num != 0) {
                int count = 2;
                while(h.size() <10) {
                    while (num != 0) {
                        h.add(num % 10);
                        num = num / 10;
                    } //end while
                    num = start*count;
                    count++;
                }//end while
                System.out.println("Case #"+i+": "+ (start*(count-2)));
            }//end if
            else{
                System.out.println("Case #"+i+": INSOMNIA");

            }
        }//end for


    }//end main
}//end class
