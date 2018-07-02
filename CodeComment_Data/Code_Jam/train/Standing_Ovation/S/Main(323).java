package methodEmbedding.Standing_Ovation.S.LYD278;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

 
public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("A-small-attempt0.out")));
    
    int testCases = Integer.parseInt(br.readLine());
    
    
    
    for (int i = 0; i < testCases; i++) {
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      st.nextToken();
      String input = st.nextToken();
      
      int output = A.getNumberOfPeopleNeeded(input);
      
      bw.write("Case #" + String.valueOf(i+1) + ": " + output + "\n");
    }
    
    br.close();
    bw.close();    
    
  }

}
