package methodEmbedding.Magic_Trick.S.LYD608;

/**
 * Created by fredPersonal on 4/12/14.
 */

import java.io.*;
import java.util.*;

public class magicTrick
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Hello World");
            BufferedReader reader = new BufferedReader(new FileReader("A-Small-attempt0.in"));
            PrintWriter writer = new PrintWriter("A-small.out");

            int current = reader.read();
            int total = 0;

            while (current >= '0' && current <= '9')
            {
                total *= 10;
                total += current - '0';
                current = reader.read();
            }

           // System.out.println(total);

            int line1;
            int line2;

            int array1[][] = new int[4][4];
            int array2[][] = new int[4][4];
            int newTotal = 0;

            for (int i = 0; i < total; i++)
            {
                line1 = reader.read() - '0';
            //    System.out.println(line1);
                reader.read();

                for (int j = 0; j < 4; j++)
                {
                    for (int k = 0; k < 4; k++)
                    {
                        current = reader.read();
                        newTotal = 0;
                        while (current >= '0' && current <= '9')
                        {
                            newTotal *= 10;
                            newTotal += current - '0';
                            current = reader.read();
                        }
                    //    System.out.print(newTotal);
                  //      System.out.print(" ");
                        array1[j][k] = newTotal;
                    }
                //    System.out.println();
                }

                line2 = reader.read() - '0';
                //System.out.println(line2);
                reader.read();

                for (int j = 0; j < 4; j++)
                {
                    for (int k = 0; k < 4; k++)
                    {
                        current = reader.read();
                        newTotal = 0;
                        while (current >= '0' && current <= '9')
                        {
                            newTotal *= 10;
                            newTotal += current - '0';
                            current = reader.read();
                        }

                        array2[j][k] = newTotal;
                        //System.out.print(newTotal);
                        //System.out.print(" ");
                    }
                    //System.out.println();
                }


                int numbOfSame = 0;
                int number = 0;
                for (int j = 0; j < 4; j++)
                {
                    for (int k = 0; k < 4; k++)
                    {
                        if (array1[line1 - 1][k] == array2[line2 - 1][j])
                        {
                            numbOfSame++;
                            number = array1[line1 - 1][k];
                        }
                    }
                }

                System.out.println();

                writer.print("Case #" + (i + 1) + ": ");
                if (numbOfSame == 0)
                {
                    writer.println("Volunteer cheated!");
                }
                else if (numbOfSame == 1)
                {
                    writer.println(number);
                }
                else
                {
                    writer.println("Bad Magician!");
                }
            }

            writer.close();

        } catch (IOException e) {}
    }
}
