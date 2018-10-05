package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1195;

//Christian Wen
//Problem B - Cookie Clicker Alpha

import java.util.*;
import java.io.*;

public class cookieClicker {
  
  public static void main (String args[]) throws IOException {
    
    String s;
    
    int tests;
    
    String temp [];
    Double vars [] = new Double [3];
    
    double timeLeft;
    double time;
    double timeBuy;
    double timeRound;
    double genC;
    
    BufferedReader bis = new BufferedReader(new FileReader("B-small-attempt0.in."));
    
    Writer writer = new BufferedWriter(new OutputStreamWriter(
    new FileOutputStream("output.txt"), "utf-8"));
    
    s = bis.readLine();
    tests = Integer.parseInt(s);
    
    for (int i = 1; i <= tests; i ++)
    {
      s = bis.readLine();
      temp = s.split(" ");
      
      time = 0;
      genC = 2;
      
      for (int x = 0; x < 3; x++)
      {
        vars [x] = Double.parseDouble(temp[x]);
      }
      
      timeLeft = vars[2] / genC;
      
      while (timeLeft > 0)
      {
        timeBuy = (vars[0]/genC);
        timeRound = timeBuy + (vars[2]/ (genC + vars[1]) );
        
        if (timeLeft <= timeRound)
        {
          time += timeLeft;
          timeLeft = 0;
        }
        else
        {
          timeLeft = timeRound - timeBuy;
          time += timeBuy;
          genC += vars[1];
        }
      }
      
      writer.write("Case #" + i + ": " + time + "\n");
      
    }
    writer.close();
  }
}
      
      
      
