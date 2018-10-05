package methodEmbedding.Standing_Ovation.S.LYD168;

import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 1; i<=N ; i++){
            int maxShyLvl = s.nextInt();
            String members = s.next();

            int membersApplause = Character.getNumericValue(members.charAt(0));
            int friends = 0;


            for(int j =1; j<members.length(); j++){
                int membersInGroup = Character.getNumericValue(members.charAt(j));
                if(membersInGroup == 0)
                    continue;
                if(j<=membersApplause)
                    membersApplause += membersInGroup;
                else {
                    friends += j - membersApplause;
                    membersApplause += membersInGroup + friends;
                }
            }

            System.out.println("Case #" + i + ": " + friends);
        }
    }
}
