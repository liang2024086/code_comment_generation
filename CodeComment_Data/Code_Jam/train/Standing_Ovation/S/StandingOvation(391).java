package methodEmbedding.Standing_Ovation.S.LYD138;

/*
* Google Code Jam 2015
* Qualification Round
* Problem A
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


class StandingOvation
{
  public static void main(String[] args) throws IOException
  {
    if(args.length != 1)
    {
      System.exit(1);
    }

    BufferedReader inputFile = new BufferedReader(new FileReader(args[0]));
    int numCases = Integer.parseInt(inputFile.readLine());

    //Main loop
    for(int i=0; i<numCases; i++)
    {
      String temp[] = inputFile.readLine().split(" ");
      int shyMax = Integer.parseInt(temp[0]);

      if(temp[1].length() == 1) //can't be 0 because of the rules
      {
        System.out.println("Case #" + (i+1) + ": " + 0);
      }
        //StandingOvation.printOut(i+1, 1);
      else
      {
        int peopleNeeded=0;
        int peopleStanding=0;

        for(int j=0; j<temp[1].length(); j++)
        {
          int x = Character.getNumericValue(temp[1].charAt(j));
          if(j <= peopleStanding)
          {
            peopleStanding += x;
          }
          else
          {
            int addPeople = j - peopleStanding;
            peopleNeeded += addPeople;
            peopleStanding += addPeople + x;
          }
        }

        System.out.println("Case #" + (i+1) + ": " + peopleNeeded);

        //StandingOvation.printOutput(i+1, peopleNeeded);
      }
    }
  }

  /*
  //Function to print output for each case
  public static void printOutput(int case, int ans)
  {
    System.out.println("Case #" + case + ": " + ans);
  }
  */
}
