package methodEmbedding.Counting_Sheep.S.LYD424;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
/**
 *
 * @author hlohlomis
 */
public class CountingSheep {

    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"));
            String line = "";
            int caseNumber = 1;
            int i; // multiplier
            int N;
            int T = Integer.parseInt(br.readLine());
            System.out.println(T +"cases");
            boolean digitsFound = false; // to check if all digits are found
            String countedNumbers = "";  // to compile a string of all counted numbers where i will check for the digits
            String test;
            for(caseNumber=1 ; caseNumber<=T; caseNumber++)
            {
                line = br.readLine();
                N = Integer.parseInt(line);
                // reset the multiplier, compiled numbers and set the digits
                // found to false for the next N
                i = 1; 
                countedNumbers = "";
                digitsFound = false;
                if(N==0)
                {
                    System.out.println("Case #" + caseNumber+": INSOMNIA");
                    bw.write("Case #" + caseNumber+": INSOMNIA");
                    bw.newLine();
                    
                }
                else
                {
                    while(!digitsFound)
                    {
                        countedNumbers = countedNumbers.concat(Integer.toString(N*i));                       
     
                        if(countedNumbers.contains("0")&&countedNumbers.contains("1")&&
                           countedNumbers.contains("2")&&countedNumbers.contains("3")&&
                           countedNumbers.contains("4")&&countedNumbers.contains("5")&&
                           countedNumbers.contains("6")&&countedNumbers.contains("7")&&
                           countedNumbers.contains("8")&&countedNumbers.contains("9"))
                        {
                            System.out.println("Case #" + caseNumber+": "+N*i);
                            bw.write("Case #" + caseNumber+": "+N*i+"\n");
                            bw.newLine();
                            digitsFound = true;
                            i++;
                        }
                        else
                        {
                            i++;
                        }
                        
                    }
                }
                
            }
            bw.close();
        }
        catch(Exception e)
        {
            System.out.print(e.toString());
        }
                    
    }
 }
    

    
    

