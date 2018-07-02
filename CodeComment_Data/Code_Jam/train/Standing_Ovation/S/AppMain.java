package methodEmbedding.Standing_Ovation.S.LYD664;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AppMain
{
    public static void main(String[] args)
    {
        try
        {
            File inputFile = new File("F:\\A-small-practice.in");
            File outputFile = new File("F:\\A-small-practice.out");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            int numberOfTestCases = Integer.parseInt(bufferedReader.readLine());
            HashMap<Integer, Integer> levelCountMap = new HashMap<Integer, Integer>();

            for (int i = 1; i <= numberOfTestCases; i++)
            {
                String input = bufferedReader.readLine();
                int sMax = Integer.parseInt(String.valueOf(input.charAt(0)));
                String distribution = input.substring(1).trim();
                int neededPeople = 0;
                levelCountMap.clear();

                for (int j = 0; j <= sMax; j++)
                {
                    int alreadyStandingPeople = 0;

                    for (Map.Entry<Integer, Integer> entry : levelCountMap.entrySet())
                    {
                        alreadyStandingPeople = alreadyStandingPeople + entry.getValue();
                    }
                    int numberInCurrentLevel = Integer.parseInt(String.valueOf(distribution.charAt(j)));

                    if ((alreadyStandingPeople + neededPeople) < j && numberInCurrentLevel > 0)
                    {
                        neededPeople = neededPeople + (j - (alreadyStandingPeople+neededPeople));
                    }

                    levelCountMap.put(j + 1, numberInCurrentLevel);
                }

                bufferedWriter.write("Case #" + i + ": " + neededPeople + "\n");
            }

            bufferedWriter.close();
            bufferedWriter.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
