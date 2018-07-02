package methodEmbedding.Standing_Ovation.S.LYD1902;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indu_Bhagavatula
 */
public class StandingOvationTester {
    static final String INPUT_FILE="A-small-attempt1.in";
    static final String OUTPUT_MESSAGE = "Case #";
    
    
    public static void main(String args[]){
        FileReader fr=null;
        BufferedReader br=null;
        int numberOfTestCases;
        int maxShyness;
        int[] audienceConfiguration;
        //System.out.println();
        try{
            fr = new FileReader(INPUT_FILE);
            br = new BufferedReader(fr);
            String strLine;
            String[] strTestCaseTokens;
            
            numberOfTestCases = Integer.parseInt(br.readLine());
            StandingOvation objStandingOvation;
            for(int iTestCaseNumber=1;iTestCaseNumber<=numberOfTestCases;iTestCaseNumber++){
                strLine = br.readLine();
                strTestCaseTokens = strLine.split(" ");
                
                maxShyness = Integer.parseInt(strTestCaseTokens[0]);
                audienceConfiguration = new int[maxShyness+1];
                
                for(int index=0;index<strTestCaseTokens[1].length();index++){
                    audienceConfiguration[index]= strTestCaseTokens[1].charAt(index)-'0';
                }
                System.out.println(OUTPUT_MESSAGE+ iTestCaseNumber + ": "+StandingOvation.calculateNumberOfFriends(audienceConfiguration));
            }
            
            
        }
        catch(IOException ioe){
            System.err.println("Error occurred while reading");
            System.exit(-1);
        }
        finally{
            try{
                br.close();
                fr.close();
            }
            catch(Exception e){
                System.err.println("Error occurred while closing the readers");
            }
        }
    }
}
