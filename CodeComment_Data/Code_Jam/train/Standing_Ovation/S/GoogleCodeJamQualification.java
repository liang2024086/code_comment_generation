package methodEmbedding.Standing_Ovation.S.LYD24;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 *
 * @author ricky
 */
public class GoogleCodeJamQualification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(new File("A-small-attempt1.in"));
        PrintWriter writer = new PrintWriter("Solution.txt", "UTF-8");
        String firstLine = sc.nextLine();
        System.out.println(firstLine);
        int numberOfCases = Integer.parseInt(firstLine);
        for(int i = 0; i < numberOfCases;){
            String currentLine = sc.nextLine();
            String[] tokens = currentLine.split(" ");
            int maxShyness = Integer.parseInt(tokens[0]);
            int currentStanding = 0;
            int friend = 0;
            System.out.print(i+": ");
            for(int j = 0; j <= maxShyness; j++){
                int valueAt = tokens[1].charAt(j)-48;
                System.out.print(valueAt);
                if(currentStanding >= j){
                    currentStanding += valueAt;
                }
                else if(valueAt == 0){
                    continue;
                }
                else{
                    friend+=j-currentStanding;
                    currentStanding += friend;
                    currentStanding += valueAt;
                    System.out.println("");
                    System.out.println("friend: "+friend+" currentStanding: "+currentStanding+" maxShy: "+j);
                }
                if(currentStanding >= maxShyness){
                    break;
                }
            }
            System.out.println("");
            i++;
            writer.println("Case #"+i+": "+friend);
        }
        writer.close();
        
        // TODO code application logic here
    }
    
}
