package methodEmbedding.Magic_Trick.S.LYD1870;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sharahul
 * 
 */
public class MagicTrickSimulator
{

    /**
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws IOException
    {
        System.out.println("Start Time: " + System.currentTimeMillis());
        File file = new File("C:/Users/sharahul/Downloads/A-small-attempt1.in");
        BufferedReader fileIn = new BufferedReader(new FileReader(file));
        Writer fileOut = new FileWriter("magicianSimulatorInput.out");
        try
        {
            int numTestCases = Integer.parseInt(fileIn.readLine());

            for (int loopCount = 0; loopCount < numTestCases; loopCount++)
            {
                int firstNum = Integer.parseInt(fileIn.readLine());
                Map<Integer, List<String>> firstCardMatrix = new HashMap<Integer, List<String>>();
                firstCardMatrix.put(1, Arrays.asList(fileIn.readLine().split(" ")));
                firstCardMatrix.put(2, Arrays.asList(fileIn.readLine().split(" ")));
                firstCardMatrix.put(3, Arrays.asList(fileIn.readLine().split(" ")));
                firstCardMatrix.put(4, Arrays.asList(fileIn.readLine().split(" ")));
                int secondNum = Integer.parseInt(fileIn.readLine());
                Map<Integer, List<String>> secondCardMatrix = new HashMap<Integer, List<String>>();
                secondCardMatrix.put(1, Arrays.asList(fileIn.readLine().split(" ")));
                secondCardMatrix.put(2, Arrays.asList(fileIn.readLine().split(" ")));
                secondCardMatrix.put(3, Arrays.asList(fileIn.readLine().split(" ")));
                secondCardMatrix.put(4, Arrays.asList(fileIn.readLine().split(" ")));
                List<String> output = new ArrayList<String>();
                output.addAll(firstCardMatrix.get(firstNum));
                output.retainAll(secondCardMatrix.get(secondNum));
                int caseNum = loopCount + 1;
                if (output.size() > 1)
                {
                    fileOut.write("Case #" + caseNum + ": Bad magician!\n");
                } else if (output.size() == 1)
                {
                    fileOut.write("Case #" + caseNum + ": " + output.get(0)+"\n");
                } else
                {
                    fileOut.write("Case #" + caseNum + ": Volunteer cheated!\n");
                }
            }
        }

        catch (Exception e)
        {
            // TODO: handle exception
        } finally
        {
            try
            {
                if (fileIn != null)
                {
                    fileIn.close();
                    System.out.println("End Time: " + System.currentTimeMillis());
                }
                if (fileOut != null)
                {
                    fileOut.close();
                }

            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
