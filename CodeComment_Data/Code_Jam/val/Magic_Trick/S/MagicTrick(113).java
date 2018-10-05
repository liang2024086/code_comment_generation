package methodEmbedding.Magic_Trick.S.LYD1872;

import java.util.*;

class MagicTrick
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        int firstRow, secondRow;
        int[] firstConfig = new int[16], secondConfig = new int[16];

        // Keeps track of how many cards match in the first and second config.
        // If no cards match (count == 0), then volunteer lied; if count == 1,
        // then the card should be outputed; if count > 1, then bad magician.
        int count;

        String result = "";

        for (int i = 0; i < T; i++)
        {
            count = 0;

            // Read in the first guess
            firstRow = s.nextInt() - 1;
            s.nextLine();

            // Read in the card configuration (4 by 4)
            for (int j = 0; j < 16; j++)
            {
                firstConfig[j] = s.nextInt();
            }

            // Read in the second guess
            secondRow = s.nextInt() - 1;
            s.nextLine();

            // Read in the card configuration (4 by 4)
            for (int j = 0; j < 16; j++)
            {
                secondConfig[j] = s.nextInt();
            }

            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 4; k++)
                {
                    if (firstConfig[firstRow * 4 + j] ==  secondConfig[secondRow * 4 + k])
                    {
                        count++;
                        result = String.valueOf(firstConfig[firstRow * 4 + j]);
                    }
                }
            }


            if (count == 0)
            {
                result = "Volunteer cheated!";
            }
            else if (count > 1)
            {
                result = "Bad magician!";
            }
            System.out.printf("Case #%d: %s\n", i + 1, result);
        }
    }
}
