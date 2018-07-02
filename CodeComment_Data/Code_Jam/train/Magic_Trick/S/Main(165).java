package methodEmbedding.Magic_Trick.S.LYD286;

import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int cases = read.nextInt();
    boolean[][] flags = new boolean[17][2];
    for(int i=1; i<=cases; i++) {
      for(int k=0; k<flags.length; k++) {
        flags[k][0] = false;
        flags[k][1] = false;
      }
      int row = read.nextInt();
      int j;
      for(j=0; j<4*(row-1); j++) { read.nextInt(); }
      for(int l=0; l<4; l++) { j++; flags[read.nextInt()][0] = true; }
      for(; j<16; j++) { read.nextInt(); }

      row = read.nextInt();
      for(j=0; j<4*(row-1); j++) { read.nextInt(); }
      for(int l=0; l<4; l++) { j++; flags[read.nextInt()][1] = true; }
      for(; j<16; j++) { read.nextInt(); }

      int count = 0;
      int ans = 0;
      for(int k=1; k<=16; k++) {
        if(flags[k][0] && flags[k][1]) {
          count++;
          ans = k;
        }
      }

      System.out.printf("Case #%d: ", i);
      if(count == 1) {
        System.out.println(ans);
      } else if(count == 0) {
        System.out.println("Volunteer cheated!");
      } else {
        System.out.println("Bad magician!");
      }
    }
  }
}
