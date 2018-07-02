package methodEmbedding.Speaking_in_Tongues.S.LYD466;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashMap;

public class SpeakingInTongues {
    public static void main(String[] args) throws IOException {
        Integer T = 0;
        String G = new String();
        
        char temp;
        HashMap alphabet = new HashMap();
        alphabet.put(' ', ' ');        
        alphabet.put('a', 'y');
        alphabet.put('b', 'h');
        alphabet.put('c', 'e');
        alphabet.put('d', 's');
        alphabet.put('e', 'o');
        alphabet.put('f', 'c');
        alphabet.put('g', 'v');
        alphabet.put('h', 'x');
        alphabet.put('i', 'd');
        alphabet.put('j', 'u');
        alphabet.put('k', 'i');
        alphabet.put('l', 'g');
        alphabet.put('m', 'l');
        alphabet.put('n', 'b');
        alphabet.put('p', 'r');
        alphabet.put('o', 'k');
        alphabet.put('r', 't');
        alphabet.put('s', 'n');
        alphabet.put('t', 'w');
        alphabet.put('u', 'j');
        alphabet.put('v', 'p');
        alphabet.put('w', 'f');
        alphabet.put('q', 'z');
        alphabet.put('x', 'm');
        alphabet.put('y', 'a');
        alphabet.put('z', 'q');
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        do{
            T = Integer.parseInt(br.readLine());
        }while(T>30 || T<1);
        
        for(int j=1; j<=T; j++){
            G = br.readLine();
            if(G.length() > 100){
                j--;
            }else {
                 System.out.print("Case #"+j+": ");
                for(int i=0; i<G.length(); i++){
                    System.out.print(alphabet.get(G.charAt(i)));
                }
                System.out.println();
            }
        }
    }
}
