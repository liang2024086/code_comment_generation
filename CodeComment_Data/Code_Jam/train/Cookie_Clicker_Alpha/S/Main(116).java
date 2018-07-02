package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1357;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  
  private static int HUGE_NUMBER = 100000000;
  
  public static void main(String[] args) throws IOException {
    PrintWriter    out = null;
    BufferedReader in  = null;
    
    try {
      // Parse input.
      in  = new BufferedReader(new FileReader("B-small-attempt0.in"));
      out = new PrintWriter(new FileWriter("output.txt"));
      
      int numTestCases = Integer.parseInt(in.readLine());
      for (int i = 0; i < numTestCases; i++) {
        String[] myArgs = in.readLine().split(" ");
        
        double R = 2.0;                           // Initial gathering rate.
        double C = Double.parseDouble(myArgs[0]); // Cost of a farm.
        double F = Double.parseDouble(myArgs[1]); // Farm gathering rate.
        double X = Double.parseDouble(myArgs[2]); // Goal.
        
        List<Double> timesFarms = new ArrayList<>();
        List<Double> bestTime   = new ArrayList<>();
        
        int optNumberFarms = 0;
        
        for (int n = 0; n < HUGE_NUMBER; n++) {
          double rate = R + F * n;
          
          double timeTillFarm = C / rate;
          double timeTillGoal = X / rate;
          
          if (n == 0) {
            bestTime.add(timeTillGoal);
            timesFarms.add(timeTillFarm);
            
          } else {
            double timeForFarms = timesFarms.get(n - 1); // Time to get n farms.
            double totalTime    = timeForFarms + timeTillGoal;
            
            bestTime.add(totalTime);
            timesFarms.add(timeTillFarm + timeForFarms);
            
            if (bestTime.get(n - 1) < totalTime) {
              optNumberFarms = n - 1;
              break;
            }
          }
        }
        
        // Print results.
        out.println("Case #" + (i + 1) + ": " + bestTime.get(optNumberFarms));
      }
    } finally {
      out.close();
      in.close();
    }
  }
}
