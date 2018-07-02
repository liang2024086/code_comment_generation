package methodEmbedding.Counting_Sheep.S.LYD1428;

import java.util.*;
import java.io.*;

public class Beatrix{
 
  public static void main(String[] args){
    ArrayList<Integer> seen = new ArrayList<Integer>();
    
    try{
      Scanner scanner = new Scanner(new File("A-small-attempt2.in"));
      
      int T = scanner.nextInt();
      
      for(int i=1; i<=T; i++){
        System.out.print("Case #" + i + ": ");
        
        int N = scanner.nextInt();
        
        if(N==0){
          System.out.println("INSOMNIA");
          continue;
        }
        else{
          int Ncopy = 0;
          for(int j=1; seen.size() != 10; j++){
            Ncopy = N * j;
            int Ncopycopy = Ncopy;
            while(Ncopycopy != 0){
              if(!seen.contains(Ncopycopy%10)){
                seen.add(Ncopycopy%10);
              }
                Ncopycopy /= 10;
            }
          }
          System.out.println(Ncopy+"");
        }
        seen = new ArrayList<Integer>();
      }
      
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
