package methodEmbedding.Cookie_Clicker_Alpha.S.LYD248;

// Double space files specified on command line.

import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CookieClickerAlpha
{
  static String fileName = "CookieClickerAlpha";
  static final int INITIAL_COOKIES = 2;
  static final String OUTPUT = "Case #%d: %.7f";
  public static void main( String [ ] args )
  {
    File file=new File(fileName + ".in");
    try
    {
      // Opening of files for input and output
      Scanner sc=new Scanner(file);
      PrintWriter writer = new PrintWriter(fileName + ".out");
      
      int T;
     
      
      T = sc.nextInt();
      
      for (int cases = 1; cases <= T; cases++){
        double c = sc.nextDouble();
        double f = sc.nextDouble();
        double x = sc.nextDouble();
        
        double minTime = x / INITIAL_COOKIES;
        
        double curCookies = INITIAL_COOKIES;
        double prevTime = c / curCookies;
        curCookies += f;
        
        while (true){
          double curTime = prevTime + x / curCookies;
          if (curTime >= minTime){
            break;
          } else {
            minTime = curTime;
            prevTime += c / curCookies;
            curCookies += f;
          }
        }
        
        writer.println(String.format(OUTPUT, cases, minTime));
      }
      
      sc.close();
      writer.close();
    }
    catch( IOException e )  
    { e.printStackTrace(System.out); }
    finally  
    {// Close the files if they have been opened.
      //file.delete();
    }
  }
  
}
