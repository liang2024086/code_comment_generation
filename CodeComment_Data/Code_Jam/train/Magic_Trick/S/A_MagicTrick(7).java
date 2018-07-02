package methodEmbedding.Magic_Trick.S.LYD778;


import java.io.*;
import java.util.*;
import java.util.logging.*;

public class A_MagicTrick
{
    private final static Logger LOGGER = Logger.getLogger(A_MagicTrick.class.getName());

    public static void main(String[] args)
    {
        Integer nCases = 0;

        try
        {
            FileReader input = new FileReader("inputFiles/2014/Round_Qualification/A-small-attempt0.in");
            BufferedReader bufRead = new BufferedReader(input);
            String myLine = null;

            // First line is always the number of cases.
            if ((myLine = bufRead.readLine()) != null)
            {
                nCases = Integer.parseInt(myLine);
            }

            for (int caseNo = 1; caseNo <= nCases; caseNo++)
            {
                Integer ans1 = 0;
                Integer ans2 = 0;
                List<List<Integer>> arrangement1 = new ArrayList<>();
                List<List<Integer>> arrangement2 = new ArrayList<>();

                if ((myLine = bufRead.readLine()) != null)
                {
                    ans1 = Integer.parseInt(myLine);
                }

                for (int i = 0; i < 4; i++)
                {
                    if ((myLine = bufRead.readLine()) != null)
                    {
                        List<String> strList = Arrays.asList(myLine.split(" "));
                        List<Integer> list = new ArrayList<>();

                        for (String str : strList)
                        {
                            list.add(Integer.parseInt(str));
                        }

                        arrangement1.add(list);
                    }
                }

                if ((myLine = bufRead.readLine()) != null)
                {
                    ans2 = Integer.parseInt(myLine);
                }

                for (int i = 0; i < 4; i++)
                {
                    if ((myLine = bufRead.readLine()) != null)
                    {
                        List<String> strList = Arrays.asList(myLine.split(" "));
                        List<Integer> list = new ArrayList<>();

                        for (String str : strList)
                        {
                            list.add(Integer.parseInt(str));
                        }

                        arrangement2.add(list);
                    }
                }

                String answer = "";
                List<Integer> possibleAnswers1 = arrangement1.get(ans1 - 1);
                List<Integer> possibleAnswers2 = arrangement2.get(ans2 - 1);
                List<Integer> answerList = new ArrayList<>();

                for (Integer possibleAnswer : possibleAnswers2)
                {
                    if (possibleAnswers1.contains(possibleAnswer))
                    {
                        answerList.add(possibleAnswer);
                    }
                }

                if (answerList.size() > 1)
                {
                    answer = "Bad magician!";
                }
                else if (answerList.size() < 1)
                {
                    answer = "Volunteer cheated!";
                }
                else if (answerList.size() == 1)
                {
                    answer = answerList.get(0).toString();
                }

                System.out.println("Case #" + caseNo + ": " + answer);
            }
        }
        catch (IOException e)
        {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }
}
