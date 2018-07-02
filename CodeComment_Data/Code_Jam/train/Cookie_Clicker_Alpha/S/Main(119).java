package methodEmbedding.Cookie_Clicker_Alpha.S.LYD429;

import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int cases = read.nextInt();
    for(int i=1; i<=cases; i++) {
      double C = read.nextDouble();
      double F = read.nextDouble();
      double X = read.nextDouble();
      double n = Math.floor(X/C - 2/F);
      if(n<0) n = 0;
      double time = 0;
      for(int j=0; j<=n-1; j++) {
        time += C/(2+j*F);
      }
      time += X/(2+n*F);
      System.out.printf("Case #%d: %.7f\n", i, time);
    }
  }
}
