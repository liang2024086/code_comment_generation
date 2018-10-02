package methodEmbedding.Magic_Trick.S.LYD1920;

import java.util.*;
import java.io.*;

public class MagicTrick{
  public static void main(String[] args){
    File file = new File("magicinput.txt");
    BufferedWriter writer = null;
    try {
      Scanner in = new Scanner(file);
      writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("magicoutput.txt"), "utf-8"));
      
      int T = Integer.parseInt(in.nextLine());
      
      for (int t = 1; t <= T; t++){
        int row = in.nextInt();
        Set<Integer> cards = new HashSet<Integer>();
        
        int i = 0;
        while (i < (row-1)*4){
          in.nextInt();
          i++;
        }
        
        for (int j = 0; j < 4; j++, i++)
          cards.add(in.nextInt());  
       
        while (i < 16){
          in.nextInt();
          i++;
        }
        
        row = in.nextInt();
        i = 0;
        
        while (i < (row-1)*4){
          in.nextInt();
          i++;
        }
        
        int soln = -1;
        for (int j = 0; j < 4; j++, i++){
          int temp = in.nextInt();
          
          if (cards.contains(temp))
            soln = temp;
          
          cards.remove(temp);
        }
        
        while (i < 16){
          in.nextInt();
          i++;
        }
      
        if (cards.size() == 3)     
          writer.write("Case #" + t + ": " + soln);
        else if (cards.size() == 4)
          writer.write("Case #" + t + ": Volunteer cheated!");
        else
          writer.write("Case #" + t + ": Bad magician!");
        
        if (t!=T)
          writer.newLine();
      }
      in.close();
      writer.close();
    } catch (Exception e){
      e.printStackTrace();
    }
    
  }
}
