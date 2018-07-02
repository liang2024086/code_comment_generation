package methodEmbedding.Counting_Sheep.S.LYD1239;


import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kapil
 */
public class Test001 {
    
    public static void main(String args[]) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      
        int testCases = input.nextInt();
        int[] cases = new int[testCases];
        for(int i = 1; i <= testCases; i++) {
            cases[i-1] = input.nextInt();
        }
        
        for(int i = 0; i < testCases; i++) {
            Boolean[] check = new Boolean[10];
            
            for(int z =0 ;z < 10; z++) {
                check[z] = false;
            }
            
            
            int j = 1;
            while(true) {
                int temp = j *  cases[i];
                
                
                while(temp > 0) {
                    
                    int x = temp % 10;
                    check[x] = true;
                    temp /= 10;
                    
                }
                
                
                
                j++;
                boolean ck = false;
                for(int k = 0; k < 10; k++) {
                    if(check[k] == false) {
                        ck = false;
                        break;
                    }
                    ck = true;
                }
                if(ck) {
                    System.out.println("Case #" + (i + 1) + ": " + ((j - 1) * cases[i]) );
                    break;
                } else if(temp == cases[i]){
                    System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA ");
                    break;
                }
                
                temp = j * cases[i];
                
            }
            
            
           
        }
    }
    
    
    
}
