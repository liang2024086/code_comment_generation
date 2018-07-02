package methodEmbedding.Magic_Trick.S.LYD357;

import java.io.*;
import java.util.*;

public class Magician {
  public static void main(String[] args){
    String fileName = "/Users/sovanlandypheng/Desktop/jam/A-small-attempt0.in";
    
    BufferedReader br = null;    
    try {
 
      String sCurrentLine;
 
      br = new BufferedReader(new FileReader(fileName));
      PrintWriter  out = new PrintWriter(new File("/Users/sovanlandypheng/Desktop/jam/output.txt"));
      int n = Integer.parseInt(br.readLine());
      System.out.println(n);
      for(int i=1;i <= n; i++){
        int row1 = Integer.parseInt(br.readLine());
        System.out.println(row1);
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int j=1 ; j<=4; j++){
          String st = br.readLine();
          System.out.println(st);
          StringTokenizer sb = new StringTokenizer(st, " ");
          if(j == row1){
            for(int k=1;k<=4;k++){
              int x = Integer.parseInt(sb.nextToken());
              map.put(x , true);
            }
          }
        }
        System.out.println(map.toString());
        int row2 = Integer.parseInt(br.readLine());
        int counter = 0; 
        int value = 0;
        for(int j=1 ; j<=4; j++){
          StringTokenizer sb = new StringTokenizer(br.readLine());
          if(j == row2){
            for(int k=1;k<=4;k++){
              int x = Integer.parseInt(sb.nextToken());
              if(map.containsKey(x)){
                counter++; value = x;
              }
            }
          }
        }
        
        out.print("case #"+i+": ");
        
        if(counter == 0){
          out.print("Volunteer cheated!");
        }
        else if (counter ==1){
          out.print(value);
        }
        else{
          out.print("Bad magician!");
        }
        out.println();
        
      }
      
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null)br.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
 
  }

}
