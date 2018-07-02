package methodEmbedding.Magic_Trick.S.LYD1759;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    int row = 0;
    int counter = 0;
    String answer = "";
    int[] array = new int [4];
    try {
      BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt2.in"));
      PrintWriter out = new PrintWriter (new FileWriter ("output.txt"));
      int cases = Integer.parseInt (in.readLine());
      for (int x = 1; x <= cases; x++) {
        row = Integer.parseInt (in.readLine()) - 1;
        for (int y = 0; y < 4; y++)
          if (y == row) {
          StringTokenizer st = new StringTokenizer (in.readLine());
          for (int z = 0; z < 4; z++)
            array[z] = Integer.parseInt (st.nextToken());
      }
        else
          in.readLine();
        row = Integer.parseInt (in.readLine()) - 1;
        for (int y = 0; y < 4; y++)
          if (y == row) {
          StringTokenizer st2 = new StringTokenizer (in.readLine());
          int[] array2 = {Integer.parseInt (st2.nextToken()), Integer.parseInt (st2.nextToken()), Integer.parseInt (st2.nextToken()), Integer.parseInt (st2.nextToken())};
          for (int z = 0; z < 4; z++) {
            for (int a = 0; a < 4; a++) {
              if (array[z] == array2[a]) {
              counter++;
              if (counter == 1)
                answer = array[z] + "";
              break;
            }
            }
          }
          if (counter > 1)
            out.println ("Case #" + x + ": Bad magician!");
          else if (counter == 1)
            out.println ("Case #" + x + ": " + answer);
          else
            out.println ("Case #" + x + ": Volunteer cheated!");
        }
        else
          in.readLine();
        counter = 0;
      }
      in.close();
      out.close();
    }
    catch (IOException e) {
    }
  }
}
