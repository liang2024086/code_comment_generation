package methodEmbedding.Magic_Trick.S.LYD1456;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (new File ("A-small-attempt1.in"));
        
        FileWriter fw = new FileWriter ("smallOutAttemt1.txt");
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter outFile = new PrintWriter (bw);
        
        int test = scan.nextInt();
        int firstChoice;
        int secondChoice;
        int tempScan;
        
        int[] firstNums;
        firstNums = new int[4];
        int[] secondNums;
        secondNums = new int[4];
        
        int found;
        int foundNum;
        
        int checkNum1;
        int checkNum2;
        
        String outText;
        for (int i = 1 ; i <= test; i++) {
            firstChoice = scan.nextInt();
            
            // Empty loop to reach the chosen row
            for (int j = 1; j<firstChoice; j++) {
                for (int k = 1; k<=4; k++) {
                    tempScan = scan.nextInt();
                }
            }
            
            // Loop to read the nums in the chosen row 
            for (int j = 0; j<4; j++) {
                firstNums[j] = scan.nextInt();
            }
            
            // Empty loop to reach the second choice
            for (int j = 1; j<=4-firstChoice; j++) {
                for (int k = 1; k<=4; k++) {
                    tempScan = scan.nextInt();
                }
            }
            
            // Second Choice
            secondChoice = scan.nextInt();
            
            // Empty loop to reach the chosen row
            for (int j = 1; j<secondChoice; j++) {
                for (int k = 1; k<=4; k++) {
                    tempScan = scan.nextInt();
                }
            }
            
            // Loop to read the nums in the chosen row 
            for (int j = 0; j<4; j++) {
                secondNums[j] = scan.nextInt();
            }
            
            // Empty loop to reach the second choice
            for (int j = 1; j<=4-secondChoice; j++) {
                for (int k = 1; k<=4; k++) {
                    tempScan = scan.nextInt();
                }
            }
            
            found = 0;
            foundNum = 0;
            for (int j = 0; j<4; j++) {
                checkNum1 = firstNums[j];
                for (int k = 0; k<4; k++) {
                    checkNum2 = secondNums[k];
                    if (checkNum1 == checkNum2) {
                        found++;
                        foundNum = checkNum1;
                    }
                }
            }
            
            if (found == 0) {
                outText = "Volunteer cheated!";
            }
            else if (found == 1) {
                outText = "" + foundNum;
            }
            else {
                outText = "Bad magician!";
            }
            outFile.println("Case #" + i + ": " + outText);
        }
        outFile.close();
    }
}
