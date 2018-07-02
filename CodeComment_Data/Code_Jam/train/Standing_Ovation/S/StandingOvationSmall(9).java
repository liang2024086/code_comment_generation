package methodEmbedding.Standing_Ovation.S.LYD1993;

/*
 * Problem A. Standing Ovation
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author jay
 */



public class StandingOvationSmall {
    //common for all problems
    static int testcase;
    static Scanner readInput;
    static PrintWriter pw;
    
    //problem specific variables
    static int maxShyness;
    static int allShyness[];
    static String shyness;
    
    
    public static void main(String[] args) throws FileNotFoundException {
       //read input scanner init
        readInput = new Scanner(new File("input"));
        testcase=readInput.nextInt();
        pw=new PrintWriter(new File("output"));
        int tu,req,ans;
        
        //read testcases
        for(int i=0;i<testcase;i++) {
            maxShyness = readInput.nextInt();
            allShyness=new int[maxShyness+1];
            shyness=readInput.next();
            
            for(int j=0;j<maxShyness+1;j++) { 
                allShyness[j]=Integer.parseInt(String.valueOf(shyness.charAt(j)));
            }
            
            tu=0;
            req=0;
            ans=0;
            
            for(int j=0;j<maxShyness+1;j++) { 
                req=tu-j;
                while(req<0) { 
                    ans=ans+1;
                    tu=tu+1;
                    req=tu-j;
                }
                tu=tu+allShyness[j];
            }
            
            pw.println("Case #"+ (i+1) +": "+ans);
            
            
        }
        pw.close();
        
    }    
}
