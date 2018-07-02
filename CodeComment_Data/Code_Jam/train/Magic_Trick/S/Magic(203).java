package methodEmbedding.Magic_Trick.S.LYD1455;

//import java.io.*;
import java.util.Scanner;

class Magic{
  public static void main(String[] args){
    //BufferedReader br = 
    //    new BufferedReader(new InputStreamReader(System.in));
    //String line = br.readLine();
    //int N = Integer.parseInt(line);
    Scanner s = new Scanner(System.in);
    int T = s.nextInt();
    for (int t = 1; t <= T; t++) {
      boolean[] chosen = new boolean[17];
      for (int i = 1; i <= 16; i++) {
        chosen[i] = true;
      } 
      int ans1 = s.nextInt();
      for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 4; j++) {
          int num = s.nextInt();
          if (i != ans1) {
            chosen[num] = false;
          }
        }
      }
      int ans2 = s.nextInt();
      for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 4; j++) {
          int num = s.nextInt();
          if (i != ans2) {
            chosen[num] = false;
          }
        }
      }
      int tot = 0;
      int ans = 0;
      for (int i = 1; i <= 16; i++) {
        if (chosen[i]){
          tot++;
          ans = i;
        }
      }
      System.out.print("Case #"+t+": ");
      if (tot == 0) {
        System.out.println("Volunteer cheated!");
      } else if (tot == 1) {
        System.out.println(ans);
      } else {
        System.out.println("Bad magician!");
      }
    }
  }
}




      

