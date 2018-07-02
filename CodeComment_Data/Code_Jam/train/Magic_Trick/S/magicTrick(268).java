package methodEmbedding.Magic_Trick.S.LYD2179;

import ecs100.*;
import java.io.*;
import java.util.*;

public class magicTrick {
    public static void main(String args[]) {
        File input = new File(UIFileChooser.open());
        File output = new File("Output.txt");
        
        int answer1 = 0;
        int answer2 = 0;
        int Tdone = 0;
        int rowsRead = 0;
        
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        
        int finalOne = 0;
        int finalTwo = 0;
        int finalThree = 0;
        int finalFour = 0;
        
        int secondOne = 0;
        int secondTwo = 0;
        int secondThree = 0;
        int secondFour = 0;
        
        int finalSecondOne = 0;
        int finalSecondTwo = 0;
        int finalSecondThree = 0;
        int finalSecondFour = 0;
        
        try {
            Scanner scan = new Scanner(input);
            PrintStream out = new PrintStream(output);
            //while (scan.hasNext()) {
                int T = scan.nextInt();
                
                while (Tdone != T) {
                    answer1 = scan.nextInt();
                    
                    while (rowsRead != 4) {
                        one = scan.nextInt();
                        two = scan.nextInt();
                        three = scan.nextInt();
                        four = scan.nextInt();
                        
                        rowsRead++;
                        
                        if (rowsRead == answer1) {
                            finalOne = one;
                            finalTwo = two;
                            finalThree = three;
                            finalFour = four;
                        }
                    }
                    
                    rowsRead = 0;
                    
                    answer2 = scan.nextInt();
                    
                    while (rowsRead != 4) {
                        secondOne = scan.nextInt();
                        secondTwo = scan.nextInt();
                        secondThree = scan.nextInt();
                        secondFour = scan.nextInt();
                        
                        rowsRead++;
                        
                        if (rowsRead == answer2) {
                            finalSecondOne = secondOne;
                            finalSecondTwo = secondTwo;
                            finalSecondThree = secondThree;
                            finalSecondFour = secondFour;
                        }
                    }
                    
                    rowsRead = 0;
                    
                    //comparison of rows
                    
                    int possibleAnswers = 0;
                    int finalAnswer = 0;
                    
                    if (finalOne == finalSecondOne) {
                        possibleAnswers++;
                        finalAnswer = finalOne;
                    }
                    if (finalOne == finalSecondTwo) {
                        possibleAnswers++;
                        finalAnswer = finalOne;
                    }
                    if (finalOne == finalSecondThree) {
                        possibleAnswers++;
                        finalAnswer = finalOne;
                    }
                    if (finalOne == finalSecondFour) {
                        possibleAnswers++;
                        finalAnswer = finalOne;
                    }
                    
                    if (finalTwo == finalSecondOne) {
                        possibleAnswers++;
                        finalAnswer = finalTwo;
                    }
                    if (finalTwo == finalSecondTwo) {
                        possibleAnswers++;
                        finalAnswer = finalTwo;
                    }
                    if (finalTwo == finalSecondThree) {
                        possibleAnswers++;
                        finalAnswer = finalTwo;
                    }
                    if (finalTwo == finalSecondFour) {
                        possibleAnswers++;
                        finalAnswer = finalTwo;
                    }
                    
                    if (finalThree == finalSecondOne) {
                        possibleAnswers++;
                        finalAnswer = finalThree;
                    }
                    if (finalThree == finalSecondTwo) {
                        possibleAnswers++;
                        finalAnswer = finalThree;
                    }
                    if (finalThree == finalSecondThree) {
                        possibleAnswers++;
                        finalAnswer = finalThree;
                    }
                    if (finalThree == finalSecondFour) {
                        possibleAnswers++;
                        finalAnswer = finalThree;
                    }
                    
                    if (finalFour == finalSecondOne) {
                        possibleAnswers++;
                        finalAnswer = finalFour;
                    }
                    if (finalFour == finalSecondTwo) {
                        possibleAnswers++;
                        finalAnswer = finalFour;
                    }
                    if (finalFour == finalSecondThree) {
                        possibleAnswers++;
                        finalAnswer = finalFour;
                    }
                    if (finalFour == finalSecondFour) {
                        possibleAnswers++;
                        finalAnswer = finalFour;
                    }
                    
                    Tdone++;
                    
                    if (possibleAnswers == 1) {
                        out.printf("Case #%d: %d%n", Tdone, finalAnswer);
                    }
                    if (possibleAnswers > 1) {
                        out.printf("Case #%d: Bad magician!%n", Tdone);
                    }
                    if (possibleAnswers == 0) {
                        out.printf("Case #%d: Volunteer cheated!%n", Tdone);
                    }
                }
            //}
        }
        catch(IOException e) {
            UI.printf("File Failure %s %n", e);
        }
    }
}
