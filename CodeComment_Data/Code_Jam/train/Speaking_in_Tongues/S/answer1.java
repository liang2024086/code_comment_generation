package methodEmbedding.Speaking_in_Tongues.S.LYD881;

import java.util.*;

/**
 *
 * @author Jhon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
  
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
         Hashtable dictionary = new Hashtable<>();
        dictionary.put('a', 'y');
        dictionary.put('b', 'h');
        dictionary.put('c', 'e');
        dictionary.put('d', 's');
        dictionary.put('e', 'o');
        dictionary.put('f', 'c');
        dictionary.put('g', 'v');
        dictionary.put('h', 'x');
        dictionary.put('i', 'd');
        dictionary.put('j', 'u');
        dictionary.put('k', 'i');
        dictionary.put('l', 'g');
        dictionary.put('m', 'l');
        dictionary.put('n', 'b');
        dictionary.put('o', 'k');
        dictionary.put('p', 'r');
        dictionary.put('q', 'z');
        dictionary.put('r', 't');
        dictionary.put('s', 'n');
        dictionary.put('t', 'w');
        dictionary.put('u', 'j');
        dictionary.put('v', 'p');
        dictionary.put('w', 'f');
        dictionary.put('x', 'm');
        dictionary.put('y', 'a');
        dictionary.put('z', 'q');
        
        int a=Integer.parseInt(cin.nextLine());
        String[] data = new String[a];
        String[] dataOut = new String[a];
        
        for(int i = 0 ;i < a;i++){
           data[i]=cin.nextLine();
        }
        
        for(int i = 0 ;i < a;i++){
            dataOut[i]="";
            for(int j = 0; j < data[i].length();j++){
               if(data[i].charAt(j) == ' '){
                    dataOut[i]+=" ";
               }else{
              dataOut[i]+= String.valueOf(dictionary.get(data[i].charAt(j)));
               }
           }
           System.out.println("Case #"+(i+1)+": "+dataOut[i]);
        }
       
        
    }
    
    
}
