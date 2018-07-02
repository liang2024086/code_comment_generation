package methodEmbedding.Speaking_in_Tongues.S.LYD1402;

import java.util.*;
import java.io.*;

public class problemb {
  
  public static void main (String[] args){
    
    //settingup input and output
    Scanner in = null;
    PrintWriter out = null;
    try{
      in = new Scanner(new File("asmall.txt"));
      out = new PrintWriter(new FileOutputStream("out.txt"), true);
    }catch(Exception e){
      System.out.println("file not found");
    }
    
    int n = in.nextInt(); // number of cases
    in.nextLine();
    
    for(int currentCase = 1; currentCase <= n; currentCase++){
      String oldCode = in.nextLine();
      String newCode = "";
      for(char c : oldCode.toCharArray()){
        switch(c){
          case ' ': break;
          case 'y': c = 'a'; break;
          case 'n': c = 'b'; break;
          case 'f': c = 'c'; break;
          case 'i': c = 'd'; break;
          case 'c': c = 'e'; break;
          case 'w': c = 'f'; break;
          case 'l': c = 'g'; break;
          case 'b': c = 'h'; break;
          case 'k': c = 'i'; break;
          case 'u': c = 'j'; break;
          case 'o': c = 'k'; break;
          case 'm': c = 'l'; break;
          case 'x': c = 'm'; break;
          case 's': c = 'n'; break;
          case 'e': c = 'o'; break;
          case 'v': c = 'p'; break;
          case 'z': c = 'q'; break;
          case 'p': c = 'r'; break;
          case 'd': c = 's'; break;
          case 'r': c = 't'; break;
          case 'j': c = 'u'; break;
          case 'g': c = 'v'; break;
          case 't': c = 'w'; break;
          case 'h': c = 'x'; break;
          case 'a': c = 'y'; break;
          case 'q': c = 'z'; break;
        }
        newCode = newCode + c;
      }
      out.println("Case #" + currentCase + ": " + newCode);
      
    }
    in.close();
    out.close();
  } 
}
