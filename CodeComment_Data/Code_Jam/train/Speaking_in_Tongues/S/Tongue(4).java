package methodEmbedding.Speaking_in_Tongues.S.LYD550;

import java.util.*;
import java.io.*;
public class Tongue {
   public static void main(String[] args)throws IOException {
    Scanner sc = new Scanner(new File("input.txt"));
    Map<String, String> map = new HashMap<String, String>();
    String line = "";
    String result = "";
    map.put("a","y");
    map.put("b","h");
    map.put("c","e");
    map.put("d","s");
    map.put("e","o");
    map.put("f","c");
    map.put("g","v");
    map.put("h","x");
    map.put("i","d");
    map.put("j","u");
    map.put("k","i");
    map.put("l","g");
    map.put("m","l");
    map.put("n","b");
    map.put("o","k");
    map.put("p","r");
    map.put("q","z");
    map.put("r","t");
    map.put("s","n");
    map.put("t","w");
    map.put("u","j");
    map.put("v","p");
    map.put("w","f");
    map.put("x","m");
    map.put("y","a");
    map.put("z","q");
    map.put(" "," ");
    
    
    int loop = sc.nextInt();
    sc.nextLine();
    
    for (int i = 0 ; i < loop ; i++)  {
      line = sc.nextLine();
      for (int j = 0; j< line.length() ; j++){
        result += map.get(Character.toString(line.charAt(j)));
      }
      System.out.println("Case #"+(i+1)+": "+result);
      result = "";
    }
   }
}
