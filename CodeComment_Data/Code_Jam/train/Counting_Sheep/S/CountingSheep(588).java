package methodEmbedding.Counting_Sheep.S.LYD632;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep
{
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            String outputFormat = "Case #%s: %s";

            int numberOfValues = in.nextInt();

            for (int i = 1; i <= numberOfValues; i++)
            {
                long originalNumber = in.nextInt();

                if (originalNumber == 0)
                {
                    System.out.println(String.format(outputFormat, i, "INSOMNIA"));
                }
                else
                {
                    Set<Character> seenDigits = new HashSet<>();
                    int c = 1;

                    while (true)
                    {
                        long nextNumber = originalNumber * c++;
                        for (Character d : String.valueOf(nextNumber).toCharArray())
                        {
                            seenDigits.add(d);
                        }

                        if (seenDigits.size() == 10)
                        {
                            System.out.println(String.format(outputFormat, i, nextNumber));
                            break;
                        }
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
