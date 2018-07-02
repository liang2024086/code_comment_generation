package methodEmbedding.Standing_Ovation.S.LYD1235;

import java.util.Scanner;

public class StandingOvation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++)
        {
            int Smax = sc.nextInt();
            String audience = sc.next();

            int peopleClapping = 0;
            int friendsNeeded = 0;
            for (int level = 0; level < audience.length(); level++)
            {
                int audienceMembers = Character.getNumericValue(audience.charAt(level));
                if (audienceMembers > 0)
                {
                    int levelFriendsNeeded = 0;
                    if (peopleClapping < level)
                    {
                        levelFriendsNeeded = level - peopleClapping;
                    }
                    peopleClapping += audienceMembers + levelFriendsNeeded;
                    friendsNeeded += levelFriendsNeeded;
                }
            }
            System.out.println(String.format("Case #%d: %d", i, friendsNeeded));
        }
    }
}
