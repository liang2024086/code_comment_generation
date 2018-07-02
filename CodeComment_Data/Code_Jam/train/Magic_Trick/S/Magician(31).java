package methodEmbedding.Magic_Trick.S.LYD178;

import java.util.*;
import java.io.*;
import java.util.Scanner;

class Magician{
  
    public static void main(String[] args){
    try{
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));  
      Scanner sc = new Scanner(new File("A-small-attempt1.in.txt"));
      int numTestCases = Integer.parseInt(sc.nextLine());
      for (int i = 0; i < numTestCases; i++){
        
        int firstAnswer = sc.nextInt();
        
        List<Integer> array = new ArrayList<Integer>();
        int currentLine = 0;
        for (int j = 0; j < (firstAnswer-1)*4; j++){  //Building array 
          currentLine = sc.nextInt();
        }
        for (int j = 0; j < 4; j++){
          array.add(sc.nextInt());
        }
        
        for (int j = 0; j < (4-firstAnswer)*4; j++){ 
          sc.nextInt();
        }

      int secondAnswer = sc.nextInt();
      
      List<Integer> array2 = new ArrayList<Integer>();
      int currentLine2 = 0;
      for (int j = 0; j < (secondAnswer-1)*4; j++){  //Building array 
        currentLine2 = sc.nextInt();
      }
      for (int j = 0; j < 4; j++){
        array2.add(sc.nextInt());
      }
      
      for (int j = 0; j < (4-secondAnswer)*4; j++){ 
        sc.nextInt();
      }

      
      List cards = new ArrayList();
        for (int l: array){
          for (int j: array2){
            if (l == j){
              cards.add(j);
            }
          }
        }
          
      
        
      if(cards.size() == 0){
          writer.write("Case #" + (i+1) + ": Volunteer cheated!");
          writer.newLine();
        }
        else if (cards.size() == 1){
          writer.write("Case #" + (i+1) + ": " + cards.get(0));
          writer.newLine();
        }
        else if (cards.size() > 1){
          writer.write("Case #" + (i+1) + ": Bad magician!");
          writer.newLine();
        }
      
        
        


      }
      writer.close();
    }
    
   catch (IOException e){
     return;

    }
  
  
  
  
  
}
}
