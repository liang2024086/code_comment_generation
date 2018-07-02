package methodEmbedding.Magic_Trick.S.LYD316;

/*
Ethan Gill
@ethansinjin
*/

import java.util.Scanner;
import java.io.*;

public class codeJamPartA{
   
   public static void main(String[] args){
      int numberOfProblems;
      int firstChoice;
      int secondChoice;
      int [][]boardOne = new int[4][4];
      int [][]boardTwo = new int[4][4];
      
      int currentCase = 1;
      String line = null;
      String badM = "Bad magician!";
      String badV = "Volunteer cheated!";
      
      try{
		   BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
         line = reader.readLine();
         numberOfProblems = Integer.parseInt(line);
         
         for(int i = 1; i<= numberOfProblems; i++){
            //parse first choice
            line = reader.readLine();
            firstChoice = Integer.parseInt(line);
            
            
            //parse first board
            for(int j=0;j<4;j++){
               line = reader.readLine();
               String[] partsOfLine = line.split("\\s+");
               
               for(int k=0;k<4;k++){
                  boardOne[j][k] = Integer.parseInt(partsOfLine[k]);
               
               } 
            }
            
            //parse second choice
            line = reader.readLine();
            secondChoice = Integer.parseInt(line);
            
            //parse second board
            for(int j=0;j<4;j++){
               line = reader.readLine();
               String[] partsOfLine = line.split("\\s+");
               
               for(int k=0;k<4;k++){
                  boardTwo[j][k] = Integer.parseInt(partsOfLine[k]);
           
               } 
            }
            
            //do the logic to determine which case is true
            
            int matches = 0;
            int curRes = -1;
            for(int j=0;j<4;j++){
               //start with the row the user selected in boardOne
               
               int possibility = boardOne[firstChoice-1][j];
               for(int k=0;k<4;k++){
                  if(boardTwo[secondChoice-1][k] == possibility){
                     curRes = possibility;
                     matches++;
                     break;
                  }
               }
            }
            
            if(matches==1 && curRes!=-1){
            System.out.printf("Case #%d: %d\n",currentCase,curRes);
            } else if(matches>1){
            System.out.printf("Case #%d: %s\n",currentCase,badM);
            } else{ //matches<1
            System.out.printf("Case #%d: %s\n",currentCase,badV);
            }
            currentCase++;
         }
         //end of outer for
		}catch(IOException e){
         System.out.println("An error occurred importing the questions.");
      }
      
      
     
   }
}
