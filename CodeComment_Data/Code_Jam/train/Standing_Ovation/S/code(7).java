package methodEmbedding.Standing_Ovation.S.LYD2176;

import java.util.Scanner;

public class code{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            int maxShyness = sc.nextInt();
            String audienceString = sc.next();
            int[] audience = new int[maxShyness+1];
            for(int shyness = 0; shyness < audience.length; shyness++){
                audience[shyness] = Character.getNumericValue(audienceString.charAt(shyness));
            }
            int friendsToInvite = 0;
            int applauding = 0;
            for(int j = 0; j < audience.length; j++){
                if((friendsToInvite + applauding) < j){
                    friendsToInvite++;
                }
                applauding += audience[j];
            }
            System.out.println("Case #" + (i+1) + ": " + friendsToInvite);
        }
    }
}
