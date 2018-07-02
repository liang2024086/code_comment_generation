package methodEmbedding.Standing_Ovation.S.LYD1766;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Round1BOpgave1
{

    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(new FileInputStream("A-small-in.txt"));
            Formatter output = new Formatter("A-small-out.txt");

            int T = input.nextInt();
            int Smax;
            String audience;
            
            for (int i = 0; i < T; i++)
            {
                int y = 0;
                int membersClapping = 0;
                Smax = input.nextInt();
                audience = input.next();
                for (int j = 0; j < Smax +1; j++)
                {
                    if (membersClapping < j)
                    {
                        y += (j - membersClapping);
                        membersClapping = j;
                    }
                    membersClapping += Character.getNumericValue(audience.charAt(j));
                }
                output.format("Case #%d: %s \n", i + 1, y);
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
