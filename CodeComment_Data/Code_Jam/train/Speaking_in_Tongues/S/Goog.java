package methodEmbedding.Speaking_in_Tongues.S.LYD813;

import java.util.*;
import java.io.*;

class Goog{
  
  
  public static void main(String[] args){
    try{
    BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("smallOutput.in"));
    char tongues[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char english[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    String sentence="";
    char currentChar;
    String engSent="";
    int engIndx=0;
    int tongIndx=0;
    int N = Integer.parseInt(br.readLine());
    char space = 32;
    for(int i=1;i<=N;i++){
      sentence = br.readLine();
      engSent="";
      for(int j=0;j<sentence.length();j++){
        
        currentChar = sentence.charAt(j);
        tongIndx = currentChar-97;
        
        if (tongIndx == -65){
          engSent += space;
        }else{
          engSent += english[tongIndx];
        }
        //engIndx=tongues[currentChar-97];
        
       // engSent += sentence.indexOf(currentChar);
        
        
      }
       System.out.println("Case #"+i+": "+engSent);
       
       bw.write("Case #"+i+": "+engSent);
       bw.newLine();
    }
    bw.close();
    br.close();
    }catch(IOException e){
      System.out.println("File error"+e);
    }
}
}
