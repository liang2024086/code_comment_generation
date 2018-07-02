package methodEmbedding.Standing_Ovation.S.LYD1915;

import java.util.Scanner;

/**
 * Created by jarrett on 10/04/15.
 */
public class A {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numCases =Integer.parseInt(in.nextLine());
        for(int i = 0; i<numCases; i++){
            String[] input = in.nextLine().split(" ");
            int sMax = Integer.parseInt(input[0]);
            String audience = input[1];
            int j;
            int friends = 0;
            int applauders = 0;
            boolean nextRound;
            for(j=0; j<=sMax;j++){
                nextRound = false;
                while(!nextRound){
                    if(j<=applauders){
                        applauders += Integer.parseInt(Character.toString(audience.charAt(j)));
                        nextRound = true;
                    }
                    else{
                        friends++;
                        applauders++;
                    }
                }
            }
            System.out.println("Case #" + (i+1) + ": " + friends);











        }
    }

}
