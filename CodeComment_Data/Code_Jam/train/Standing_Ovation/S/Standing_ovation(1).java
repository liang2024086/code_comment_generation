package methodEmbedding.Standing_Ovation.S.LYD971;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amobal01
 */

import java.io.*;
import java.util.*;
public class Standing_ovation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File f = new File("A-small-attempt0.in.txt");
        Scanner sc = new Scanner (f);
        File output = new File("output.txt");
        PrintWriter printer = new PrintWriter(output);
        int tests = sc.nextInt();
        for (int i=0;i<tests;i++) {
            // for each test case repeat the same code 
            int sMax = sc.nextInt();
            int standingPeople = 0;
            int peopleNeeded = 0;
            String str = sc.next();
            for (int shyness=0;shyness<=sMax;shyness++) {
                
                int peopleThisPos = Character.digit(str.charAt(shyness),10);
                if (shyness > standingPeople) {
                    int diff = shyness - standingPeople;
                    // we got the difference 
                    peopleNeeded += diff;
                    standingPeople += diff + peopleThisPos;
                }
                else {
                    standingPeople += peopleThisPos;
                }
            }
            
            printer.println("Case #"+(i+1)+": "+peopleNeeded);
        }
        printer.close();
    }
    
}
