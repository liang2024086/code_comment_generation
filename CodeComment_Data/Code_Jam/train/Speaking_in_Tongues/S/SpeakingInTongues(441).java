package methodEmbedding.Speaking_in_Tongues.S.LYD542;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpeakingInTongues
{
  public static void main(String[] args)
  {
    String googlerese1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
    String googlerese2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
    String googlerese3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";

    String english1 = "our language is impossible to understand";
    String english2 = "there are twenty six factorial possibilities";
    String english3 = "so it is okay if you want to just give up";

    char[] conversion = new char[26];
    conversion[24] = 'a';
    conversion[4] = 'o';
    conversion[16] = 'z';
    conversion[25] = 'q';

    int offset = 97;

    for (int pos = 0; pos < googlerese1.length(); pos++)
    {
      int charPos = (int) googlerese1.charAt(pos) - offset;
      if (charPos >= 0)
      {
        conversion[charPos] = english1.charAt(pos);
      }
    }

    for (int pos = 0; pos < googlerese2.length(); pos++)
    {
      int charPos = (int) googlerese2.charAt(pos) - offset;
      if (charPos >= 0)
      {
        conversion[charPos] = english2.charAt(pos);
      }
    }

    for (int pos = 0; pos < googlerese3.length(); pos++)
    {
      int charPos = (int) googlerese3.charAt(pos) - offset;
      if (charPos >= 0)
      {
        conversion[charPos] = english3.charAt(pos);
      }
    }

    try
    {
      BufferedReader reader = new BufferedReader(new FileReader(args[0]));
      FileWriter fileWriter = new FileWriter(args[1]);

      String casesNo = reader.readLine();

      for (int n = 0; n < Integer.parseInt(casesNo); n++)
      {
        String line = reader.readLine();

        if (n != 0) fileWriter.write("\n");
        fileWriter.write("Case #" + (n + 1) + ": ");

        for (int pos = 0; pos < line.length(); pos++)
        {
          int charPos = (int) line.charAt(pos) - offset;
          if (charPos >= 0)
          {
            fileWriter.write(conversion[charPos]);
          }
          else
          {
            fileWriter.write(" ");
          }
        }
      }

      fileWriter.flush();
      fileWriter.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
