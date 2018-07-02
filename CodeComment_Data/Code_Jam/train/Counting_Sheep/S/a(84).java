package methodEmbedding.Counting_Sheep.S.LYD1344;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Adil
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in); 
        
    int t = in.nextInt();  
    for (int y = 1; y <= t; ++y) {
      int b = 0;
      String a = in.next();
        int newData = Integer.parseInt(a);
        
        ArrayList sweet = new ArrayList<Integer>(); 
        for (int i=0; i<10; i++){ 
            sweet.add(i); 
        } 
        ArrayList<Integer> array = new ArrayList<Integer>(); 
        
        int j = 0;
        
        if (newData == 0) {
            System.out.println("Case #" + y +": INSOMNIA");
        } else {
        // creates an array
        while(!sweet.equals(array)){  
        b = newData * (j+1);
        String c = String.valueOf(b);
              
        int[] dataInt = new int[c.length()]; 
        String[] dataString = new String[c.length()]; 
        char[] dataChar = c.toCharArray();  


        for (int i = 0; i < c.length(); i++) { 
        dataString[i] = Character.toString(dataChar[i]); 
        dataInt[i] = Integer.parseInt(dataString[i]); 
        array.add(dataInt[i]); 

        }
        // sorts
        Collections.sort(array);
        //System.out.println(array);
        
        // removes duplicates
        Set<Integer> arrayWithoutDuplicates = new LinkedHashSet<Integer>(array);
        array.clear();
        array.addAll(arrayWithoutDuplicates);
       // System.out.println(array);
        j++;
        //System.out.println(b);
    }
      System.out.println("Case #" + y + ": " +(b));
    }  
    } 
    }
    
}
