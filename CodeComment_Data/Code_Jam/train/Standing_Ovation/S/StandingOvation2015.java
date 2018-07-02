package methodEmbedding.Standing_Ovation.S.LYD797;

import java.util.Scanner;

/**
 * Date: 4/11/15
 *
 */
public class StandingOvation2015 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=testCases;i++){
            System.out.print(String.format("Case #%d: ",i));
            String[] T = scanner.nextLine().trim().split(" ");
            long smax = Long.parseLong(T[0]);
            String shyness = T[1];
            long standingAudience = 0;
            long addedAudience = 0;
            for(int s=0;s<shyness.length();s++){
                if(standingAudience>=s){
                    standingAudience += Long.parseLong(String.valueOf(shyness.charAt(s)));
                }else{
                    long add= s-standingAudience;
                    addedAudience +=add;
                    standingAudience +=add;
                    standingAudience += Long.parseLong(String.valueOf(shyness.charAt(s)));
                }
            }
            System.out.println(addedAudience);
        }
    }
}
