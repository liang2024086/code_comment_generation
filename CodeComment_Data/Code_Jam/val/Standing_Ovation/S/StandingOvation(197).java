package methodEmbedding.Standing_Ovation.S.LYD1634;

import java.util.*;

public class StandingOvation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=1; i<T+1; i++) {
            int sMax = sc.nextInt();
            String tS = sc.next();
            int[] S = new int[sMax + 1];
            int goal = 0, invites = 0;
            for(int c=0; c<tS.length(); c++) {
                S[c] = Integer.parseInt(tS.substring(c, c+1));
                
                // System.out.println("c " + c);
                // System.out.println("goal " + goal);
                for(int pL=S[c]; pL>0; pL--) {

                    if((invites + goal) < c) {
                        invites = c - goal;
                        //System.out.println("Invites " + invites);
                    }
                    /*while((invites + goal) <= c) {
                        invites++;
                        System.out.println("Invites " + invites);
                    }*/
                }
                if(S[c] == 0) {
                    if((invites + goal) < c) {
                        invites = c - goal;
                        //System.out.println("Invites " + invites);
                    }
                }
                goal += S[c];
                /*
                else {
                    if(invites + goal < c)
                        invites += goal < c ? c - (goal + invites) - 1: 0;
                }*/
                
                
            }

            System.out.println("Case #" + i + ": " + invites);
        }
    }
}
