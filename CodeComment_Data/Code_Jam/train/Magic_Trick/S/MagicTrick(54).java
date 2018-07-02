package methodEmbedding.Magic_Trick.S.LYD1421;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class MagicTrick {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new FileReader("input_mt.txt"));
      BufferedWriter out = new BufferedWriter(new FileWriter("output_mt.txt"));
      int num_input = Integer.parseInt(in.readLine());
      Date dt = new Date();
      System.out.println("Start:   " + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds());
      for (int i = 0; i < num_input; i++) {
        int ans1 = Integer.parseInt(in.readLine());
        List<String> row1 = new ArrayList<String>();
        for (int j = 0; j < 4; j++) {
          if (j + 1 == ans1) {
            row1.addAll(Arrays.asList(in.readLine().split(" ")));
          } else {
            in.readLine();
          }
        }

        int ans2 = Integer.parseInt(in.readLine());
        List<String> row2 = new ArrayList<String>();
        for (int j = 0; j < 4; j++) {
          if (j + 1 == ans2) {
            row2.addAll(Arrays.asList(in.readLine().split(" ")));
          } else {
            in.readLine();
          }
        }

        String result = "";

        if (row1.retainAll(row2)) {
          if (row1.size() == 1) {
            result = row1.get(0);
          } else if (row1.size() == 0)  {
            result = "Volunteer cheated!";
          } else {
            result = "Bad magician!";
          }

        } else {
          result = "Bad magician!";
        }

        out.write("Case #" + (i + 1) + ": " + result + "\n");
        System.out.println("Case #" + (i + 1) + ": " + result );
      }
      dt = new Date();
      System.out.println("End:   " + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds());
      in.close();
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
