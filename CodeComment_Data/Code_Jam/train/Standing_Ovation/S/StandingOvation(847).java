package methodEmbedding.Standing_Ovation.S.LYD1485;

import java.util.Scanner;

/**
 * Created by halmas94 on 4/11/15.
 */
public class StandingOvation {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int t = 1; t<=T; t++){
            int S = scan.nextInt();
            char[] word = scan.next().toCharArray();
            int[] members = new int[S+1];
            for(int i = 0; i<=S; i++) {
                members[i] = Character.getNumericValue(word[i]);
            }

            int totalSoFar = 0;
            int friends = 0;
            for(int i = 0; i<=S; i++){
                if(totalSoFar<i) {
                    int nFriends = i - totalSoFar;
                    friends += nFriends;
                    totalSoFar += nFriends;
                }
                totalSoFar+=members[i];
            }
            System.out.printf("Case #%d: %d\n", t, friends);
        }
    }
}
