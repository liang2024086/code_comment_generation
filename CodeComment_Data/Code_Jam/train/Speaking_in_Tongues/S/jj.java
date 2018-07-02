package methodEmbedding.Speaking_in_Tongues.S.LYD408;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author exile
 */
public class GoogleLang {
    Map map = new HashMap();
    
    public GoogleLang(){
        map.put("y", "a");
        map.put("n", "b");
        map.put("f", "c");
        map.put("i", "d");
        map.put("c", "e");
        map.put("w", "f");
        map.put("l", "g");
        map.put("b", "h");
        map.put("k", "i");
        map.put("u", "j");
        map.put("o", "k");
        map.put("m", "l");
        map.put("x", "m");
        map.put("s", "n");
        map.put("e", "o");
        map.put("v", "p");
        map.put("z", "q");
        map.put("p", "r");
        map.put("d", "s");
        map.put("r", "t");
        map.put("j", "u");
        map.put("g", "v");
        map.put("t", "w");
        map.put("h", "x");
        map.put("a", "y");
        map.put("q", "z");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); 
        for (int i=0 ; i<n; i++){      	
            System.out.print("Case #"+(i+1)+": ");           
            String tmp = in.nextLine(); 
            for (int j=0 ; j<tmp.length(); j++){
               if ((tmp.toCharArray()[j]+"").compareToIgnoreCase(" ")!=0)
                System.out.print(map.get(tmp.toCharArray()[j]+""));
               else
                System.out.print(" ");
           }
           System.out.println("");
        }
    }
    
    public static void main(String args[]){
        GoogleLang app = new GoogleLang();
    }
}
