package methodEmbedding.Speaking_in_Tongues.S.LYD1674;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class SpeakingInTongues {
  private static String googlese = "ejpmysljylckdkxveddknmcrejsicpdrysi" +
"rbcpcypcrtcsradkhwyfrepkymveddknkmkrkcd" +
"dekrkdeoyakwaejtysrreujdrlkgcjv";
  
  private static String english = "ourlanguageisimpossibletounderstand" +
"therearetwentysixfactorialpossibilities"+
"soitisokayifyouwanttojustgiveup";
  
  public static String input = "easy.txt";
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    Map<Character, Character> map = new HashMap<Character, Character>();
    for (int i = 0; i < googlese.length(); i++) {
      map.put(googlese.charAt(i), english.charAt(i));
    }
    
    map.put('q', 'z');
    map.put('z', 'q');

    BufferedReader in = new BufferedReader(new FileReader(input));
    
    int n = Integer.parseInt(in.readLine());
    for (int i = 1; i <= n; i++) {
      String line = in.readLine();
      
      StringBuilder builder = new StringBuilder();
      for (char c : line.toCharArray()) {
        if (c == ' ') builder.append(' ');
        else builder.append(map.get(c));
      }
      
      System.out.println("Case #" + i + ": " + builder);
    }
    
  }
}
