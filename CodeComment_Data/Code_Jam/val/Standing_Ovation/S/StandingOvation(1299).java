package methodEmbedding.Standing_Ovation.S.LYD2185;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Adewale_MAC
 */
public class StandingOvation {
    
    static BufferedWriter writer;

    static BufferedReader reader;

    
    public static void main(String [] args) throws IOException{
    
        File inFile = new File("standingovation.in"); // input file  
        File outFile = new File("standingovation.out"); // outfile  
        FileWriter fwriter = new FileWriter(outFile);
        writer = new BufferedWriter(fwriter);
        FileReader freader = new FileReader(inFile);
        reader = new BufferedReader(freader);

        String output;
        
        //int sum=0;
        
        int numCases = Integer.parseInt(reader.readLine());

        //System.out.println("numcases = " + numCases);
        // looping on number of cases  
        for (int i = 0; i < numCases; ++i) {
            int sum=0;
            int extra=0;
            int countZero =0;
            String[] intalizingString = reader.readLine().split(" ");
            
            int sMax = Integer.parseInt(intalizingString[0]);
            
            String audience = intalizingString[1];
            int [] audienceArray = new int[audience.length()];
            //char audienceArray[] = audience.toCharArray();
            
            for(int k=0; k<audience.length();k++)
                audienceArray[k] = Integer.parseInt(String.valueOf(audience.charAt(k)));
            
            sum+=audienceArray[0];
            
//System.out.print("audienceArray ----->");
            for(int j=1; j<audienceArray.length;j++){
                
                //System.out.print(audienceArray[j]);
                //System.out.println("audienceArray.length"+ audienceArray.length);
                //if(j!=sMax){
                    //sum+=audienceArray[j];
                    
//                    if(j==0){
//                    
//                        sum+=audienceArray[j];
//                    }
                    
                    
                    //System.out.println("audienceArray["+j+"]-->"+audienceArray[j]);
                    if(audienceArray[j]!=0){
                        
                        //System.out.println("j--->"+j);
                        
                        //System.out.println("sum--->"+sum);
                        
                        if(j>sum){
                            //System.out.println("j is > sum");
                            extra+= j - sum;
                            sum+=extra+audienceArray[j];
                            //System.out.println("extra -->"+extra);
                        
                        }else{
                        
                            sum+=audienceArray[j];
                        
                        }
                    
                    
                    }
                        
                    
//                    if(audienceArray[j]==0){
//                        
//                        //extra+=1;
//                        countZero+=1;
//                    
//                    }
                //}
                
                
                 //System.out.println("sum -->"+sum);
                
            }
            
            //System.out.println("");
            
            //System.out.println("sum -->"+sum);
            
            int result = sMax-sum;
            //System.out.println("result --->"+result);
            output = "Case #"+(i+1)+": "+extra;
            System.out.println(output);
            
            writer.write(output);
            
            writer.newLine();
            
        }
        
        writer.close();
    
    
    }
    
}
