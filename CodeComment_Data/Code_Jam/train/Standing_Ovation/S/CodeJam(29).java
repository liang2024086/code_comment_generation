package methodEmbedding.Standing_Ovation.S.LYD2119;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class CodeJam
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String firstLine = in.readLine();
    int noOfCases = Integer.parseInt(firstLine);
    for (int j = 1; j<=noOfCases; j++)
    {
      String line = in.readLine();

      String[] twoints = line.split("\\s+");
      int sMax = twoints[0].charAt(0) - '0';
      int invited = 0;
      int audienceSoFar = 0;
      for (int i=0; i<= sMax; i++)
      {
        if (twoints[1].charAt(i) != '0')
        {  
          if (audienceSoFar < i) {
            invited += i - audienceSoFar;
            audienceSoFar += invited;
          }
          audienceSoFar += twoints[1].charAt(i) - '0';
        }
      } 

      System.out.println("Case #" + j + ": " + invited);
      
    }
  }
}
