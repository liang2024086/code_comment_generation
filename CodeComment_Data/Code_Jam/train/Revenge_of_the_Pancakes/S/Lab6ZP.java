package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1117;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//Zachary Polansky
//CSC171
//Lab02
//LinkedList





public class Lab6ZP {

   
  
    
    public static  void  main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner sin = new Scanner(System.in);
        int n = Integer.parseInt(sin.next());
        for(int i=0; i<n; i++){
            String s = sin.next();
            s+='+';
            int counter = 0;
            for(int j=0; j<s.length()-1; j++){
                if(s.charAt(j)!=s.charAt(j+1)){
                    counter++;
                }
            }
            System.out.println("Case #" + (i+1) + ": " + counter);
          
        }
       
        
    }
    
  
} 
