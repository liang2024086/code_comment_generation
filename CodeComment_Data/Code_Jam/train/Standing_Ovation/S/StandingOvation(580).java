package methodEmbedding.Standing_Ovation.S.LYD1630;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation{
  
  public static void main(String[] args){
    
    File input = new File("A-small-attempt7.in");
    
    try{
      Scanner line = new Scanner(input);
      int caseCount = line.nextInt();
      PrintWriter writer = new PrintWriter("A-small-attempt7.out");
      
      int[] audienceList = new int[10];
      int sum = 0;
      
      for(int i = 0; i < caseCount; i++){
        String sMax = line.next();
        int sMaxInt = Integer.parseInt(sMax);
        sum = sum + 1;
        
        String audience = line.next(); 
        for(int index = 0; index < audience.length(); index++){
          String digit = audience.substring(index, index+1);
          audienceList[index] = Integer.parseInt(digit);
        }
        int total = 0, invites = 0;
        for(int index = 0; index < audience.length(); index++){
          int newInvites = 0;
          if(index > total){
            invites = (index - total) + invites;
            newInvites = index - total;
          }
          total = total + audienceList[index] + newInvites;
        }
        writer.println("Case #" + sum + ": " + invites);
      }
      line.close();
      writer.close();
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }
}
