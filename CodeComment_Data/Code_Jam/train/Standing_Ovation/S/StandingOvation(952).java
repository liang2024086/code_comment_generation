package methodEmbedding.Standing_Ovation.S.LYD196;

import java.lang.System;
import java.util.*;

public class StandingOvation{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int caseN = 1;
        int lines = Integer.parseInt(sc.nextLine());
        for(int lineN = 0; lineN < lines; lineN++){
            String line = sc.nextLine();
            String[] values = line.split(" ");
            int friends = 0;
            int peopleStanding = Character.getNumericValue(values[1].charAt(0));
            for(int i = 1; i < values[1].length(); i++)
            {
                int x = Character.getNumericValue(values[1].charAt(i));
                //System.out.println(String.format("i: %d, peopleStanding: %d, x: %d", i, peopleStanding, x));
                if(i > peopleStanding){
                    //System.out.println(String.format("incrementing to %d, %d",peopleStanding, (i - peopleStanding)));
                    int inc = (i - peopleStanding);
                    peopleStanding += inc;
                    friends += inc;
                }
                peopleStanding += x;
            }
            System.out.println(String.format("Case #%d: %d", caseN++, friends));
        }
        sc.close();
        //System.out.println("end");
    }
}
