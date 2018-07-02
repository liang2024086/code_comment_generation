package methodEmbedding.Revenge_of_the_Pancakes.S.LYD301;

import java.util.*;
import java.io.*;
public class main {
  public static void main(String[] args) throws FileNotFoundException {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    //EJERCICIO
    String[] pancakes;
    String[] aux;
    boolean sw = false;
    boolean sw2 = false;
    int pos = 1;
    int cont = 0;
    
    int N = Integer.parseInt(in.nextLine());
    for (int i = 1; i <= N; ++i) {
        pancakes = null;
        pancakes = in.nextLine().split("");
        sw = false;
        sw2 = false;
        cont = 0;
        
        while(!sw){
            if(pancakes[1].equals("+")){
                for (int j = 1; j < pancakes.length; j++) {
                   if(pancakes[j].equals("-")){
                       pos = j-1;
                       break;
                   }else
                   if( j == (pancakes.length-1)){
                       sw2 = true;
                   } 
                }
            }else
            if (pancakes[1].equals("-")){
                for (int j = 1; j < pancakes.length; j++) {
                    if(pancakes[j].equals("+")){
                       pos = j-1;
                       break;
                   }else
                   if( j == (pancakes.length-1)){
                       pos = pancakes.length-1;
                   }
                }
            }
           
            if(!sw2){
                if(pancakes.length == 2){
                    pancakes[1] = "+";
                    cont = 1;
                }else{
                    aux = new String[pos];

                    for (int j = 0; j < aux.length; j++) {
                        if(pancakes[pos].equals("+")){
                            aux[j] = "-";
                        }else{
                            aux[j] = "+";
                        }
                        pos = pos - 1;                   
                    }


                    for (int j = 0; j < aux.length; j++) {
                        pancakes[j+1] = aux[j];
                    }
                    cont += 1;
                } 
            }
            
            for (int j = 1; j < pancakes.length; j++) {
                if(pancakes[j].equals("-")){
                    break;
                }else
                if(j == (pancakes.length-1)){
                    sw = true;
                    System.out.println("Case #"+i+": "+cont);
                }
            }
            
        }
    }
  }
  
}
