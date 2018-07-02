package methodEmbedding.Counting_Sheep.S.LYD663;

import java.util.*;
import java.io.*;

public class FirstGCI {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int amount = scan.nextInt();
    
    for (int i = 0; i < amount; i++) {
      int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      int num = scan.nextInt();
      
      int counter = 1;
      int lastNum = num;
      
      while ((arr[0] == 0 || arr[1] == 0 || arr[2] == 0 ||
             arr[3] == 0 || arr[4] == 0 || arr[5] == 0 ||
             arr[6] == 0 || arr[7] == 0 || arr[8] == 0 ||
             arr[9] == 0) && counter < 100) {
        
        lastNum = num*counter;
        counter++;
        
        String currStr = lastNum + "";
        for (int c = 0; c < currStr.length(); c++) {
          arr[Integer.parseInt(currStr.charAt(c)+"")]++;
        }
     
      }
      
      if (arr[0] == 0 || arr[1] == 0 || arr[2] == 0 ||
             arr[3] == 0 || arr[4] == 0 || arr[5] == 0 ||
             arr[6] == 0 || arr[7] == 0 || arr[8] == 0 ||
             arr[9] == 0) {
        System.out.println("Case #" + (i+1)+": INSOMNIA");
      } else {
        System.out.println("Case #" + (i+1)+": " + lastNum);
      }
      
    }
    
    
  }
}
