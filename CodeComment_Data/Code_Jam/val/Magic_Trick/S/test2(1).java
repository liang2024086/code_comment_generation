package methodEmbedding.Magic_Trick.S.LYD793;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class test2
{
  public static void main(String[] args) throws Exception
  {
    String fileLocation = "/Users/qchen/Downloads/A-small-attempt0.in";
    FileInputStream fStream = new FileInputStream(fileLocation);
    DataInputStream in = new DataInputStream(fStream);
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    String line = reader.readLine();

    int count = Integer.valueOf(line).intValue();

    PrintWriter out = new PrintWriter("output");
    for(int i = 1; i <= count; i++) {
      int firstAnswer = Integer.valueOf(reader.readLine()).intValue();
      HashSet<Integer> first = new HashSet<Integer>();
      ArrayList<Integer> answer = new ArrayList<Integer>();
      for(int r = 1; r <= 4; r++) {
        String row = reader.readLine();
        if(r == firstAnswer) {
          String[] candidates = row.split(" ");
          for(String candidate: candidates) {
            first.add(Integer.valueOf(candidate));
          }
        }
      }

      int secondAnswer = Integer.valueOf(reader.readLine()).intValue();
      for(int r = 1; r <= 4; r++) {
        String row = reader.readLine();
        if(r == secondAnswer) {
          String[] candidates = row.split(" ");
          for(String candidate: candidates) {
            if(first.contains(Integer.valueOf(candidate))) {
              answer.add(Integer.valueOf(candidate));
            }
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      sb.append("Case #").append(i).append(": ");
      if(answer.size() == 0) {
        sb.append("Volunteer cheated!");
      } else if(answer.size() == 1) {
        sb.append(answer.get(0));
      } else {
        sb.append("Bad magician!");
      }

      System.out.println(sb);
    }
  }
}
