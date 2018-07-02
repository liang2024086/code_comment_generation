package methodEmbedding.Counting_Sheep.S.LYD410;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static googlecodejam.PanCakes.writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Adewale_MAC
 */
public class CountingSheep {
    
    static BufferedWriter writer;

    static BufferedReader reader;
    private static Integer lastSeenNumber;

    public static void main(String [] args) throws IOException{
        
        File inFile = new File("counting_sheep.in"); // input file  
        File outFile = new File("counting_sheep.out"); // outfile  
        FileWriter fwriter = new FileWriter(outFile);
        writer = new BufferedWriter(fwriter);
        FileReader freader = new FileReader(inFile);
        reader = new BufferedReader(freader);
        List<Integer> seenSet; 
         
        int numCases = Integer.parseInt(reader.readLine().trim());
        
        for(int tc=1; tc<=numCases; tc++){
            
            int N = Integer.parseInt(reader.readLine().trim());
            seenSet = new ArrayList<Integer>();
            
            int number;
            int j=1;
            while(seenSet.size()!=10 && N!=0){
               number = N*j;
                
                //System.out.println("Number : "+number);
               String digits = String.valueOf(number);
                //System.out.println("digits: "+digits);
               for(int k=0; k<digits.length();k++){
                   
                //System.out.println("digits.charAt(k) : "+digits.charAt(k));
                   //if(digits.length()==2){
                       
                       //seenSet.add(Integer.parseInt(digits));
                       
                       if(seenSet.contains(Integer.parseInt(String.valueOf(digits.charAt(k))))){
                       
                   
                       }else{
                       
                           //System.out.println("seenSet.add(Integer.parseInt(String.valueOf(digits.charAt(k)))): "+digits.charAt(k));
                           seenSet.add(Integer.parseInt(String.valueOf(digits.charAt(k))));
                       
                   
                       }
                       
                       
                       if(seenSet.size()==10){
                   
               
                           //System.out.println("seenSet.get(9): "+seenSet.get(9));
                           lastSeenNumber = Integer.parseInt(digits);
                           break;
               
            
                       }
                       
//                   }else{
//                   
//                       if(seenSet.contains(Integer.parseInt(digits))){
//                       
//                   
//                       }else{
//                       
//                           seenSet.add(Integer.parseInt(digits));
//                       
//                   
//                       }
//                       
//                   }
               }
               
               
               
               
               
               j++;
            }
            //System.out.println("seenSet.size() : "+seenSet.size());
            if(seenSet.size()==10){
                   
                System.out.println("Case #"+tc+": "+lastSeenNumber);
                writer.write("Case #"+tc+": "+lastSeenNumber);
               
            }else{
             
                System.out.println("Case #"+tc+": INSOMNIA");
                writer.write("Case #"+tc+": INSOMNIA");
               
            }
            
            writer.newLine();
            
            //System.out.println("--------------------------------------------");
        }
        
        writer.close();
        
    }
}
