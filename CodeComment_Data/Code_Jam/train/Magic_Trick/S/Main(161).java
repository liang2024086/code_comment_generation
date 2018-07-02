package methodEmbedding.Magic_Trick.S.LYD1630;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static void main(String[] args) throws IOException {
    PrintWriter    out = null;
    BufferedReader in  = null;
    
    try {
      // Parse input.
      in  = new BufferedReader(new FileReader("A-small-attempt0.in"));
      out = new PrintWriter(new FileWriter("output.txt"));
      
      int numTestCases = Integer.parseInt(in.readLine());
      for (int i = 0; i < numTestCases; i++) {
        
        // Get the first row chosen by the volunteer.
        int choice1 = Integer.parseInt(in.readLine()) - 1;
        for (int j = 0; j < choice1; j++) {
          in.readLine(); // This line is not needed.
        }
        String[] row1 = in.readLine().split(" ");
        for (int j = choice1 + 1; j < 4; j++) {
          in.readLine(); // This line is not needed.
        }
        
        // Get the second row chosen by the volunteer.
        int choice2 = Integer.parseInt(in.readLine()) - 1;
        for (int j = 0; j < choice2; j++) {
          in.readLine(); // This line is not needed.
        }
        String[] row2 = in.readLine().split(" ");
        for (int j = choice2 + 1; j < 4; j++) {
          in.readLine(); // This line is not needed.
        }
        
        // Get the intersection of the rows.
        List<String> intersection = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
          for (int k = 0; k < 4; k++) {
            if (row1[j].equals(row2[k])) {
              intersection.add(row1[j]);
              break;
            }
          }
        }
        
        // Print results.
        out.print("Case #" + (i + 1) + ": ");
        if (intersection.size() == 0) {
          // Volunteer cheated!
          out.println("Volunteer cheated!");
        } else if (1 < intersection.size()) {
          // Bad magician!
          out.println("Bad magician!");
        } else {
          // Size of intersection is 1. Output this number.
          out.println(intersection.get(0));
        }
      }

    } finally {
      out.close();
      in.close();
    }
  }
}
