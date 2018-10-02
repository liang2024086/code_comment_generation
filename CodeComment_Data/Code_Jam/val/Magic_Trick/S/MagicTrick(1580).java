package methodEmbedding.Magic_Trick.S.LYD2204;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class MagicTrick
{

    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(new FileInputStream("A-small-attempt1-in.txt"));
            Formatter output = new Formatter("A-small-attempt1-out.txt");

            int T = input.nextInt();
            int a1;
            int a2;
            int[][] sq1 = new int[4][4];
            int[][] sq2 = new int[4][4];
            String y = "";
            for (int i = 0; i < T; i++)
            {
                a1 = input.nextInt()-1;
                for (int j=0; j<4; j++)
                {
                    for (int k=0; k<4; k++)
                    {
                        sq1[j][k] = input.nextInt();
                    }
                }
                a2 = input.nextInt()-1;
                for (int j=0; j<4; j++)
                {
                    for (int k=0; k<4; k++)
                    {
                        sq2[j][k] = input.nextInt();
                    }
                }
                List<Integer> pos = new ArrayList<>();
                for (int j=0; j<4; j++)
                {
                    for (int k=0; k<4; k++)
                    {
                        System.out.println(sq1[a1][j] + " en " + sq2[a2][k]);
                        if (sq1[a1][j] == sq2[a2][k])
                        {
                            System.out.println("succes !");
                            pos.add(sq1[a1][j]);
                        }
                    }
                }
                if (pos.size() == 0)
                    y = "Volunteer cheated!";
                else if (pos.size() == 1)
                    y = pos.get(0) + "";
                else if (pos.size() > 1)
                    y = "Bad magician!";
                else
                    System.exit(1);
                output.format("Case #%d: %s \n", i+1, y);
            }
            if (output != null && input != null)
            {
                output.close();
                input.close();
            }
        } catch (FileNotFoundException ex)
        {
            System.err.println("An error has occured.");
            System.exit(1);
        }
    }   
}
