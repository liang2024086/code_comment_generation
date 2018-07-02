package methodEmbedding.Revenge_of_the_Pancakes.S.LYD25;

import java.io.*;

public class ProblemB{
  public static void main (String[]args) throws Exception{
    BufferedReader in = new BufferedReader (new FileReader("B-small-attempt0.in"));
    PrintWriter out = new PrintWriter (new FileWriter("out.txt"));
    int T = Integer.parseInt(in.readLine());
    for (int t = 0; t < T; t++){
     String S = in.readLine();
     boolean plus = true;
     int numSwaps = 0;
     for (int x = S.length()-1; x >=0; x--){
       if (plus && S.charAt(x) == '-'){
         plus = false;
         numSwaps++;
       }
       else if (!plus && S.charAt(x) == '+'){
         plus = true;
         numSwaps++;
       }
     }
     out.println("Case #"+(t+1)+": "+numSwaps);
    }
    out.close();
  }
}
