package methodEmbedding.Standing_Ovation.S.LYD2157;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eastexalter
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (new File ("A-small-attempt0.in"));
        
        
        FileWriter fw = new FileWriter ("A-small-attempt0-out.txt");
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter outFile = new PrintWriter (bw);
        
        int test = scan.nextInt();
        String outText;
        
        int sMax;
        String sCase;
        int total;
        int numOfPeople;
        int needed;
        int numOfFriends;
        
        for (int i = 1 ; i <= test; i++) {
            total = 0;
            numOfFriends = 0;
            sMax = scan.nextInt();
            sCase = scan.next();
            
            total = Character.getNumericValue(sCase.charAt(0));
            for (int j = 1; j <= sMax; j++) {
                numOfPeople = Character.getNumericValue(sCase.charAt(j));
                //needed = j * numOfPeople;
                if (j > total) {
                    numOfFriends = numOfFriends + j - total;
                    total = total + numOfPeople + j - total;
                }
                else {
                    total = total + numOfPeople;
                }
                
            }
            
            outFile.println("Case #" + i + ": " + numOfFriends);
        }
        outFile.close();
    }
    
}
