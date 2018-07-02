package methodEmbedding.Standing_Ovation.S.LYD1131;

import java.io.*;

public class A {
  
  public static String in = "A-small-attempt0.in";
  public static String out = "A-small-attempt0.out";
  
  public static Long T;
  
  public static String S;
  
  public static String line;
  
  public static Long Smax;
  
  public static String[] lineA;
  
  public static Long eddig;
  
  public static Long kell;
  
  public static Long most;
  
  public static void main(String[] args) throws IOException {
    BufferedReader be = new BufferedReader(new FileReader(in));
    BufferedWriter ki = new BufferedWriter(new FileWriter(out));
    
    String line = be.readLine();
    T = Long.parseLong(line);
    
    for(int i = 1; i <= T; i++){
      line = be.readLine();
      lineA = line.split(" ");
      Smax = Long.parseLong(lineA[0]);
      S = lineA[1];
      
      eddig = Long.parseLong(((Character)S.charAt(0)).toString());
      kell = new Long("0");
      
      for(int j = 1; j <= Smax; j++) {
        while(eddig < j) {
          eddig++;
          kell++;
        }
        eddig += Long.parseLong(((Character)S.charAt(j)).toString());
      } // for j
      
      ki.write("Case #" + i + ": " + kell +"\n");
      System.out.println("Case #" + i + ": " + kell +"\n");
    } // for i
    
    ki.flush();
    ki.close();
    be.close();
    
  }
  
}
