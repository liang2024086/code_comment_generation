package methodEmbedding.Counting_Sheep.S.LYD585;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nestorkokoafantchao
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
    List<Integer> T = new ArrayList<>();
    
    File file = new File("A-small-attempt7.in");
    
    //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    Scanner in = new Scanner(file);
    
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
     
    for (int i = 0; i < t; i++) {
         
        int  n = in.nextInt();
        T.add(n);
  
    }
    
    Strucs struc;
        struc = new Strucs(T);
    
    
    struc.getResult();
     
      
    }
    
   
   
    
}





