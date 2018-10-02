package methodEmbedding.Revenge_of_the_Pancakes.S.LYD469;

import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args) throws Exception
  {
    Scanner in = new Scanner(new File("B-small-attempt0.in.txt"));
    PrintWriter out = new PrintWriter(new FileWriter("output"));

    int noOfCases = in.nextInt();
    in.nextLine();

    // Each case.
    for (int caseIndex = 1; caseIndex <= noOfCases; caseIndex++) 
    {
      char[] line = in.nextLine().toCharArray();
      int unsortedLength = line.length;
      int steps = 0;
      while (unsortedLength > 0)
      {
        if (line[unsortedLength - 1] == '+')
        {
          unsortedLength--;
        } //if
        else
        {
          if (line[0] == '-')
          {
            char[] shortLine = new char[unsortedLength];
            for (int index = 0; index < unsortedLength; index++)
            {
              shortLine[index] = line[unsortedLength - 1 - index] == '+'? '-' : '+';
            } // for
            System.arraycopy(shortLine, 0, line, 0, unsortedLength);
            steps++;
            unsortedLength--;
          } // if
          else
          {
            int pos = unsortedLength - 2;
            boolean found = false;
            while (!found)
            {
              if (line[pos] == '+')
                found = true;
              else
                pos--;
            } // while
            char[] shortLine = new char[pos + 1];
            for (int index = 0; index < pos + 1; index++) 
            {
              shortLine[index] = line[pos - index] == '+'? '-' : '+';
            } // for
            System.arraycopy(shortLine, 0, line, 0, pos + 1);
            steps++;
          } // else
        } // else
      } // while

      out.println("Case #" + caseIndex + ": " + steps);
    } // for

    out.close();
    in.close();

  } // main
} // class Main
