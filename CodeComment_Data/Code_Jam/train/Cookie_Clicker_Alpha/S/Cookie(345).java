package methodEmbedding.Cookie_Clicker_Alpha.S.LYD866;

import java.util.*;
import java.io.*;

public class Cookie{
  public static void main(String[] args){
    File file = new File("cookieinput.txt");
    BufferedWriter writer = null;
    try {
      Scanner in = new Scanner(file);
      writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("cookieoutput.txt"), "utf-8"));
      
      int T = in.nextInt();
      
      for (int t = 1; t <= T; t++){
        double C = in.nextDouble();
        double F = in.nextDouble();
        double X = in.nextDouble();
        
        double time = 0.0f;
        double currCookies = 0.0f;
        double rate = 2.0f;
        
        while (true){
          //see if we are close enough
          double timeLeftIfNoBuy = (X-currCookies)/rate;
          double timeLeftIfBuy = C/rate + X/(rate+F);
          
          if (timeLeftIfNoBuy < timeLeftIfBuy){//then don't buy
            time+= timeLeftIfNoBuy;
            break;
          }
          else{//better to buy
            time+= (C-currCookies)/rate;
            currCookies = 0;
            rate+= F;
          }
        }
                
        writer.write("Case #" + t + ": " + String.format("%.7f", time));
        if (t!=T)
          writer.newLine();
      }
      in.close();
      writer.close();
    } catch (Exception e){
      e.printStackTrace();
    }
    
  }
}
