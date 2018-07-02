package methodEmbedding.Magic_Trick.S.LYD1975;


/**
 * @author BigMacDaddy
 */

import java.io.*;
import java.util.*;
public class ClickCookies
{
    public static void main(String args[]) throws IOException
    {
        //String tempInput = "";
        PrintWriter outputs = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        File cookieInput = new File("Cookies.txt");
        Scanner sf = new Scanner(cookieInput);
        int repeats = Integer.parseInt(sf.nextLine());
        for (int i = 1; i <= repeats; i++)
        {
            int tally = 0;
            String cards = "";
            int[][] arrangement1 = new int[4][4];
            int[][] arrangement2 = new int[4][4];
            int answer1 = Integer.parseInt(sf.nextLine());
            for (int j = 0; j < 4; j++)
            {
                String currentRow = sf.nextLine() + " ";
                for (int k = 0; k < 4; k++)
                {
                    arrangement1[j][k] = Integer.parseInt(currentRow.substring(0, currentRow.indexOf(" ")));
                    currentRow = currentRow.substring(currentRow.indexOf(" ") + 1);
                }
            }
            int answer2 = Integer.parseInt(sf.nextLine());
            for (int l = 0; l < 4; l++)
            {
                String currentRow = sf.nextLine() + " ";
                for (int m = 0; m < 4; m++)
                {
                    arrangement2[l][m] = Integer.parseInt(currentRow.substring(0, currentRow.indexOf(" ")));
                    currentRow = currentRow.substring(currentRow.indexOf(" ") + 1);
                }
            }

            for (int n = 0; n < 4; n++)
            {
                for (int o = 0; o < 4; o++)
                {
                    if (arrangement1[answer1-1][n] == arrangement2[answer2-1][o])
                    {
                        tally++;
                        cards = cards + arrangement2[answer2-1][o] + " ";
                    }
                }
            }

            if (!cards.equals(""))
            {
                cards = cards.substring(0, cards.lastIndexOf(" "));
            }
            
            if (tally == 0)
            {
                outputs.println("Case #" + i + ": Volunteer cheated!");
            }
            else if (tally > 1)
            {
                outputs.println("Case #" + i + ": Bad magician!");
            }
            else
            {
                outputs.println("Case #" + i + ": " + cards);
            }
        }
        outputs.close();
        sf.close();
    }
}
