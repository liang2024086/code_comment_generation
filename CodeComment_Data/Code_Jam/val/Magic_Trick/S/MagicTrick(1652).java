package methodEmbedding.Magic_Trick.S.LYD1179;

//Google code jam
import java.util.*;
import java.io.*;
import java.text.*;


public class MagicTrick
{

   public static void main(String[] args) throws IOException
   {
      String input = "A-small-attempt0.in";
      String output = "output.txt";
      File inputFile = new File(input);
      File outputFile = new File(output);
      Scanner read = new Scanner(inputFile);
      PrintWriter print = new PrintWriter(outputFile);
      int numCases = read.nextInt();
      read.nextLine();
      
      int skipRow, skipRow2;
      int correctRow, correctRow2;
      int[] rowArray;
      int[] rowArray2;
      String[] caseOutput = new String[numCases];
      
      
      for(int i=1; i <= numCases; i++)
      {
         int answer;
         correctRow = read.nextInt();
         skipRow = 5 - correctRow;
         rowArray = new int[4];
         
         for (int j = 1; j <= correctRow; j++)
         {
            read.nextLine();
         }
         
         for (int k = 0; k < 4; k++)
         {
            rowArray[k] = read.nextInt();
         }
         
         for (int l = 0; l < skipRow; l++)
         {
            read.nextLine();
         }
         
         correctRow2 = read.nextInt();
         skipRow2 = 5 - correctRow2;
         rowArray2 = new int[4];
         
         for (int j = 1; j <= correctRow2; j++)
         {
            read.nextLine();
         }
         
         for (int k = 0; k < 4; k++)
         {
            rowArray2[k] = read.nextInt();
         }
         
         for (int l = 0; l < skipRow2; l++)
         {
            read.nextLine();
         }
         
         int numAnswers = 0;
         int[] answers = new int[4];
         
         for (int m = 0; m < 4; m++)
         {
            for (int n = 0; n < 4; n++)
            {
               if (rowArray[m] == rowArray2[n])
               {
                  answers[numAnswers] = rowArray[m];
                  numAnswers++;
               }
             }
          }
          
      if (numAnswers == 0)
         caseOutput[i-1] = "Case #" + i + ": Volunteer cheated!";
      else if (numAnswers == 1)
         caseOutput[i-1] ="Case #" + i + ": " + answers[0];
      else
         caseOutput[i-1] = "Case #" + i + ": Bad magician!";
         
       print.println(caseOutput[i-1]);    
          
                                    
      }
      print.close();
     
   
   }  
   
} 
