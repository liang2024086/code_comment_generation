package methodEmbedding.Standing_Ovation.S.LYD1365;

import java.io.*;
import java.util.*;

public class ProblemA
{
    public static void main(String[] args)
    {
        File file = new File("in.txt");

        Reader reader;

        try
        {
            reader = new BufferedReader( new InputStreamReader( new FileInputStream(file)));

            int next = reader.read();

            int total = 0;

            while (next != 10)
            {
                total *= 10;
                total += next - '0';
                next = reader.read();
            }

            System.out.println(total);

            PrintWriter writer = new PrintWriter("out.txt");

            for (int i = 0; i < total; i++)
            {
                //System.out.println("In for loop");
                writer.print("Case #" + (i+1) + ": ");

                int maxShyness = 0;
                next = reader.read();
                //System.out.println((char)next);
                while ((char) next != ' ')
                {
                    maxShyness *= 10;
                    maxShyness += next - '0';
                    next = reader.read();
                }

                System.out.println(maxShyness);

                int currentStanders = 0;
                int currentNeedToAdd = 0;

                for (int j = 0; j <= maxShyness; j++)
                {
                    if (j > currentStanders)
                    {
                        int toAdd = j - currentStanders;
                        currentNeedToAdd += toAdd;
                        currentStanders += toAdd;
                    }

                    currentStanders += reader.read() - '0';
                    System.out.print(currentStanders);
                }

                System.out.println("Need to add: " + currentNeedToAdd);
                writer.print(currentNeedToAdd);
                writer.println();

                // bring us to next line
                System.out.println((char)reader.read());
            }

            writer.close();

        }
        catch (FileNotFoundException e) {}
        catch (IOException e) {}
        catch (Error e) {}
    }
}
