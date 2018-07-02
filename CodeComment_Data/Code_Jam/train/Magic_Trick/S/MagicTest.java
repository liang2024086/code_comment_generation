package methodEmbedding.Magic_Trick.S.LYD1401;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MagicTest {

  public static void main(String[] args) {
    List<String> lineDataList = null;
    int rowNum2 = 0;
    int testCaseNum = 1;
    int dataPresenceCount = 0;
    String actualNum = null;
    try (FileReader fin = new FileReader("D:/in.txt");
        BufferedReader br = new BufferedReader(fin);
        FileWriter fout = new FileWriter("D:/out.txt");
        BufferedWriter bw = new BufferedWriter(fout);) {

      int numOfTests = Integer.parseInt(br.readLine());
      while (numOfTests > 0) {
        int rowNum1 = Integer.parseInt(br.readLine());
        if (rowNum1 >= 1 && rowNum1 <= 4) {
          for (int j = 1; j <= 4; j++) {
            if (j == rowNum1) {
              String lineData = br.readLine();
              String lineValues[] = lineData.split(" ");
              lineDataList = Arrays.asList(lineValues);
            }
            else {
              br.readLine();
            }
          }
          rowNum1++;
        }
        rowNum2 = Integer.parseInt(br.readLine());
        if (rowNum2 >= 1 && rowNum2 <= 4) {
          for (int j = 1; j <= 4; j++) {
            if (j == rowNum2) {
              dataPresenceCount = 0;
              actualNum = null;
              String lineData = br.readLine();
              String lineValues[] = lineData.split(" ");
              for (String linedata : lineValues) {
                if (lineDataList.contains(linedata)) {
                  dataPresenceCount++;
                  actualNum = linedata;
                }
              }
            }
            else {
              br.readLine();
            }
          }
          bw.write("Case #" + testCaseNum + ": ");
          System.out.print("Case #" + testCaseNum + ": ");
          if (dataPresenceCount == 1) {
            bw.write(actualNum);
            System.out.print(Integer.parseInt(actualNum));
          }
          else
            if (dataPresenceCount > 1) {
              bw.write("Bad magician!");
              System.out.print("Bad magician!");
            }
            else
              if (dataPresenceCount == 0) {
                bw.write("Volunteer cheated!");
                System.out.print("Volunteer cheated!");
              }
          System.out.println();
          bw.write("\n");
          rowNum2++;
        }
        numOfTests--;
        testCaseNum++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }

  }

}
