package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1181;

import java.io.*;

public class MagicTrick {
  public static void main (String[] args) {
    try {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        
        String line = br.readLine();
        int nCase = Integer.parseInt(line);
        
        for (int i = 0; i < nCase; i++) {
          line = br.readLine();
          String[] tokens = line.split(" ");
          double C = Double.parseDouble(tokens[0]);
          double F = Double.parseDouble(tokens[1]);
          double X = Double.parseDouble(tokens[2]);
          
          double sumCookies = 0;
          double time = 0;
          double cookieRate = 2;
          while ((X / cookieRate) > (C / cookieRate) + (X / (cookieRate+F))) {
            time += (C / cookieRate);
            cookieRate += F;
          }
          time += X / cookieRate;
          
          System.out.println("Case #"+(i+1)+": "+time);
        }
        br.close();
    } catch (Exception e) {
    }
  };
};
