package methodEmbedding.Standing_Ovation.S.LYD236;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StandingOvation
{
    // private static String FILENAME = "sample.in";
    private static String FILENAME = "A-small-attempt2.in";
    // private static String FILENAME = "B-large.in";
    
    public static void main(String[] args)
    {
        BufferedReader br = null;
        String outFileName;
        if (FILENAME.contains("small"))
        {
            outFileName = "small.out";
        }
        else if (FILENAME.contains("large"))
        {
            outFileName = "large.out";
        }
        else
        {
            outFileName = "sample.out";
        }

        try
        {
            FileWriter fstream = new FileWriter(outFileName);
            BufferedWriter out = new BufferedWriter(fstream);

            br = new BufferedReader(new FileReader(FILENAME));
            int numberTestCases = Integer.parseInt(br.readLine());

            System.out.println("Number of Cases: " + numberTestCases);
            
            for (int i = 1; i <= numberTestCases; i++)
            {
                System.out.println("TestCase #" + i);
                int numFriends = 0;
                int numStanding = 0;
                
                // get inputs
                String[] inputVar = br.readLine().split(" ");
                
                
                int maxShyNess = Integer.parseInt(inputVar[0]);
                String audience = inputVar[1];
                
                for (int a = 0; a < audience.length(); a++)
                {
                    int numLevel = Integer.parseInt(audience.substring(a, a + 1));
                    
                    System.out.println("Shyness level: " + a);
                    System.out.println("# of members: " + numLevel);
                    
                    // determine how many will just stand up
                    if (numStanding >= a)
                    {
                        System.out.println(numStanding + " >= " + a);
                        numStanding += numLevel;
                    }

                    // do we need to invite a friend to hit next level?
                    if (numStanding < (a + 1))
                    {
                        System.out.println(numStanding + " < " + (a + 1));
                        numFriends++;
                        numStanding++;
                    }

                    
                    System.out.println("Total number Standing: " + numStanding);
                    System.out.println("Total Friends invited: " + numFriends);
                }
                
                System.out.println("====================================");
                System.out.println("Number of friends needed: " + numFriends);
                out.write("Case #" + i + ": " + numFriends + "\r\n");
                System.out.println("====================================");
                
            } // next test case
            
            
            out.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                br.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }
          
    }
}
