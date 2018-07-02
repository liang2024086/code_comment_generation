package methodEmbedding.Standing_Ovation.S.LYD473;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        for(int i=0; i<t; i++){

            int smax = in.nextInt();
            String s = in.next();

            int standingPeople = s.charAt(0)-48, extraPeople = 0;

            for(int j=1; j<=smax; j++){

                if(j <= standingPeople){
                    standingPeople += s.charAt(j)-48;
                } else {
                    extraPeople += j - standingPeople;
                    standingPeople = j + s.charAt(j) - 48;
                }

            }

            System.out.println("Case #" + (i+1) + ": " + extraPeople);

        }




    }
}
