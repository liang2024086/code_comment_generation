package methodEmbedding.Counting_Sheep.S.LYD1198;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by leyang on 4/8/16.
 */
public class counting_sheep {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            int count = in.nextInt();

            if(count == 0){
                System.out.println("Case #" + (i+1) + ": INSOMNIA" );
            }
            else{
                HashSet<Integer> hs = new HashSet<>();
                int ori = count;
                for(int j = 0; hs.size() < 10; j++) {
                    count = ori * (j+1);

                    int temp = count;
                    while (temp != 0) {
                        hs.add(temp % 10);

                        if(temp % 10 == 0)
                            hs.add(0);

                        temp = temp / 10;
                    }
//                    if(temp != 0){
//                        hs.add(temp % 10);
//                    }

                }

                System.out.println("Case #" +(i+1)  + ": " + count);
            }

        }

    }
}
