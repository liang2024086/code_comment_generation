package methodEmbedding.Magic_Trick.S.LYD2006;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Christian Alexander on 4/11/14.
 */
public class magic {
    public static void main(String[] args)
    {
        int numCases = 0;
        try
        {
            PrintWriter writer = new PrintWriter("small.out");

            Scanner scanner = new Scanner(new File("small.in"));
            numCases = scanner.nextInt();
            for(int i = 0; i < numCases; i++)
            {
                int rowSelectedFirst = scanner.nextInt();
                ArrayList<Integer> rowFirst = new ArrayList<Integer>();
                for(int j = 0; j < (rowSelectedFirst - 1); j++)
                {
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                }

                rowFirst.add(scanner.nextInt());
                rowFirst.add(scanner.nextInt());
                rowFirst.add(scanner.nextInt());
                rowFirst.add(scanner.nextInt());

                for(int j = 0; j < (4 - rowSelectedFirst); j++)
                {
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                }

                int rowSelectedSecond = scanner.nextInt();
                for(int j = 0; j < (rowSelectedSecond - 1); j++)
                {
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                }
                ArrayList<Integer> rowSecond = new ArrayList<Integer>();

                rowSecond.add(scanner.nextInt());
                rowSecond.add(scanner.nextInt());
                rowSecond.add(scanner.nextInt());
                rowSecond.add(scanner.nextInt());

                for(int j = 0; j < (4 - rowSelectedSecond); j++)
                {
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                    scanner.nextInt();
                }

                int numResults = 0;
                String result = "";

                for(Integer num : rowSecond)
                {
                    if(rowFirst.contains(num) && numResults == 0)
                    {
                        result = num.toString();
                        numResults++;
                    }
                    else if (rowFirst.contains(num))
                    {
                        result = "Bad magician!";
                    }
                }

                if(numResults == 0)
                {
                    result = "Volunteer cheated!";
                }

                writer.printf("Case #%d: %s\n", i+1, result);
            }
            writer.close();
        } catch (FileNotFoundException e)
        {

        }

    }
}
