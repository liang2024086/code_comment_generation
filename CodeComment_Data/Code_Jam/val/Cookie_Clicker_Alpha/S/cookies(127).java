package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1069;

import java.util.*;

public class cookies {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String [] answers = new String[n];
    
    for (int i = 0; i < n; i++) {
      
      double c = s.nextDouble();
      double f = s.nextDouble();
      double x = s.nextDouble();
      
      double v = 2;
      double vmax = (x-c)*f/c;
      double sum = 0;
      
      while (v <= vmax) {
        sum += c/v;
        v += f;
      }
      
      answers [i] = "Case #"+(i+1)+": "+(sum + x / v);
        
    }

    for (int i = 0; i < n; i++)
      System.out.println(answers[i]);
  }
}
