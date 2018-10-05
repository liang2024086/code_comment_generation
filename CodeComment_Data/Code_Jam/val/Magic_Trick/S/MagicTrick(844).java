package methodEmbedding.Magic_Trick.S.LYD1203;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class MagicTrick {

   
    public static void main(String[] args) throws IOException {
        
        int cases = 0;
        int caseNum = 1;
        int answer = 0;
        int[][] cards = new int[4][4];
        int[] answerRow = new int[4];
        
        
        Scanner in = new Scanner(new File("input.in"));
        PrintWriter out = null;

        try {
            out = new PrintWriter("output.out");
        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        
        cases = in.nextInt();
        boolean secondAnswer = false;
        int numMatches = 0;
        int res = 0;
        
        while (in.hasNextInt()) {
            answer = in.nextInt() - 1;
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    cards[i][j] = in.nextInt();
                    if(secondAnswer && i == answer){
                        for(int k = 0; k < 4; k++){
                            if(cards[i][j] == answerRow[k]){
                                numMatches += 1;
                                res = answerRow[k];
                            }
                        }
                    }
                }
            }
            
            if(secondAnswer){
                if(numMatches == 0){
                    out.println("Case #" + caseNum + ": Volunteer cheated!");
                    System.out.println("Case #" + caseNum + ": Volunteer cheated!");
                }else if(numMatches == 1){
                    out.println("Case #" + caseNum + ": " + res);
                    System.out.println("Case #" + caseNum + ": " + res);
                }else{
                    out.println("Case #" + caseNum + ": Bad magician!");
                    System.out.println("Case #" + caseNum + ": Bad magician!");
                }
                caseNum++;
                numMatches = 0;
            }
            else{
                answerRow[0] = cards[answer][0];
                answerRow[1] = cards[answer][1];
                answerRow[2] = cards[answer][2];
                answerRow[3] = cards[answer][3];
            }
            
            secondAnswer = !secondAnswer;
            
        }
        
        in.close();
        out.close();
    }
}
