package methodEmbedding.Standing_Ovation.S.LYD628;

import java.util.Scanner;

/**
 * Created by Lukas on 11/04/2015.
 */
public class StandingOvation {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 0; i < N; i++){
            int m = input.nextInt();
            int standing = 0;
            int friends = 0;
            String line = input.nextLine().trim();

            for(int j = 0; j <= m; j++){
                int x = line.charAt(j) - '0';
                if(standing >= j){
                    standing += x;
                }
                else{
                    if(x > 0) {
                        friends += j - standing;
                        standing = x + j;
                    }
                }
            }
            System.out.printf("Case #%d: %d%n",i+1, friends);
        }
    }
}
