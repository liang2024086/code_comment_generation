package methodEmbedding.Counting_Sheep.S.LYD1391;

import java.util.*;
import java.io.*;

public class countingSheep{
  public static void main(String[] args) throws IOException{
    try{
    FileWriter writer = new FileWriter("asmallprac.txt");
    File file = new File("A-small-attempt1.in");
    Scanner s = new Scanner(file);
    int cases = s.nextInt();
    int i = 1;
    String line = null;
    ArrayList<Integer> array = new ArrayList<>();
    for(int ij = 0; ij < 10; ij++){
     array.add(ij); 
    }
    ArrayList<Integer> valueAry = new ArrayList<>();
    while(s.hasNextInt()){
      
      int count = 1;
      int chosen = s.nextInt();;
      if(chosen == 0){
      System.out.println("Case #" + i + ": INSOMNIA");
      writer.write("Case #" + i + ": INSOMNIA");
      writer.write(System.lineSeparator());
      i++;
      continue;
      }
      while(array.size() != 0){
        int hold = chosen * count;
        String word = Integer.toString(hold);
        String[] words = word.split("");
        for(int j = 0; j < words.length; j++){
          int y = Integer.parseInt(words[j], 10);
          valueAry.add(y);
        }
        for(int jj = 0; jj < valueAry.size(); jj++){
         int checkVal = valueAry.get(jj);
         int position = array.indexOf(checkVal);
         if(position != -1){
          array.remove(position); 
         }
        }
      valueAry.clear();
      count++;
      if(array.size() == 0){
        System.out.println("Case #" + i + ": " + hold);
        writer.write("Case #" + i + ": " + hold);
        writer.write(System.lineSeparator());
      }
      }
      i++;
      array.clear();
      for(int ij = 0; ij < 10; ij++){
     array.add(ij); 
    }
    }
    writer.close();
    }
    catch(Exception e){
     throw e; 
    }
  }
}
