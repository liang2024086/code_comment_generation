package methodEmbedding.Standing_Ovation.S.LYD943;


import java.util.Scanner;

public class AStandingOvation
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.next());
        for (int i = 0; i < testCases; i++)
        {
            int sMax = Integer.parseInt(sc.next());
            String shyP = sc.next();

            int[] shyL = new int[sMax + 1];
            for (int k = 0; k < shyP.length(); k++)
            {
                shyL[k] = Character.getNumericValue(shyP.charAt(k));
            }
            //for(int m: shyL) System.out.println("--"+m+"--");

            int clapping = 0;
            int toInvite = 0;
            for (int j = 0; j < shyL.length; j++)
            {
                int item = shyL[j];
                if (item != 0)
                {
                    if (j == 0)
                    {
                        clapping += item;
                    } else
                    {
                        int peopleToAdd = 0;
                        if (j > clapping)
                        {
                            peopleToAdd = j - clapping;
                        }
                        toInvite += peopleToAdd;
                        clapping += peopleToAdd;
                        clapping += shyL[j];
                    }
                }
            }
            System.out.printf("Case #%d: %d\n", (i + 1), toInvite);
        }
    }
}
