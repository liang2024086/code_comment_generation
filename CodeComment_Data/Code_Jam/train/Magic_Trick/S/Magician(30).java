package methodEmbedding.Magic_Trick.S.LYD2144;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Magician {

   public static void main(String[] args) throws IOException {
   
      String fileName = args[0].trim();
      Scanner inputFile = new Scanner(new File(fileName));
   
      String result = "";
      String print = "";
   
      String numCasesStr = inputFile.nextLine();
      int numCases = Integer.parseInt(numCasesStr);
   
      int matchCount = 0;
      int index = 0;
      
      String[] firstArray = new String[4];
      String[] secondArray = new String[4];
   
      while (index < numCases) {
      
         matchCount = 0;
         result = "";
      
         String firstLineStr = inputFile.nextLine();
         int firstLine = Integer.parseInt(firstLineStr);
         
         int arrayIndex = 1;
         while (arrayIndex <= firstLine) {
            String[] temp = inputFile.nextLine().split(" ");
            int rowIndex = 0;
            arrayIndex++;
            while (rowIndex < 4) {
               firstArray[rowIndex] = temp[rowIndex];
               rowIndex++;
            }
         }
         
         // finish reading first block
         int finishFirst = 4 - firstLine;
         int finishFirstIndex = 0;
         while (finishFirstIndex < finishFirst) {
            inputFile.nextLine();
            finishFirstIndex++;
         }
         
         String secondLineStr = inputFile.nextLine();
         int secondLine = Integer.parseInt(secondLineStr);
         
         int secondIndex = 1;
         while (secondIndex <= secondLine) {
            String[] tempTwo = inputFile.nextLine().split(" ");
            int secondRowIndex = 0;
            secondIndex++;
            while (secondRowIndex < 4) {
               secondArray[secondRowIndex] = tempTwo[secondRowIndex];
               secondRowIndex++;
            }
         }
         
         // finish reading second block
         int finishSecond = 4 - secondLine;
         int finishSecondIndex = 0;
         while (finishSecondIndex < finishSecond) {
            inputFile.nextLine();
            finishSecondIndex++;
         }
         
         int matchIndex = 0;
         while (matchIndex < 4) {
            if (firstArray[matchIndex].equals(secondArray[0])) {
               result = firstArray[matchIndex];
               matchCount++;
            }
            matchIndex++;
         }
      
         matchIndex = 0;
         while (matchIndex < 4) {
            if (firstArray[matchIndex].equals(secondArray[1])) {
               result = firstArray[matchIndex];
               matchCount++;
            }
            matchIndex++;
         }
      
         matchIndex = 0;
         while (matchIndex < 4) {
            if (firstArray[matchIndex].equals(secondArray[2])) {
               result = firstArray[matchIndex];
               matchCount++;
            }
            matchIndex++;
         }
      
         matchIndex = 0;
         while (matchIndex < 4) {
            if (firstArray[matchIndex].equals(secondArray[3])) {
               result = firstArray[matchIndex];
               matchCount++;
            }
            matchIndex++;
         }
         
         String answer = "";
         
         if (result == "") {
            answer = "Volunteer cheated!";
         }
         else if (matchCount > 1) {
            answer = "Bad magician!";
         }
         else {
            answer = result;
         }
         
         int caseNum = index + 1;
         if (index > 0) {
            print += "\n";
         }
         print += "Case #" + caseNum + ": " + answer;
      
         index++;
      }
      
               
      File file = new File("/users/johncook/magicianOut.out");
   		// if file doesnt exists, then create it
      if (!file.exists()) {
         file.createNewFile();
      }
         
      FileWriter fw = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(print);
      bw.close();
   
      
      
     
   }
}
