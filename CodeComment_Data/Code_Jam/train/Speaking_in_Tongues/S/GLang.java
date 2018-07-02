package methodEmbedding.Speaking_in_Tongues.S.LYD729;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chamika
 */
public class GLang {
    public static void main(String[] args) {
        ArrayList<Character> alorg = new ArrayList<>();
        ArrayList<Character> alg = new ArrayList<>();
        alorg.add('a');alg.add('y');
        alorg.add('b');alg.add('n');
        alorg.add('c');alg.add('f');
        alorg.add('d');alg.add('i');
        alorg.add('e');alg.add('c');
        alorg.add('f');alg.add('w');
        alorg.add('g');alg.add('l');
        alorg.add('h');alg.add('b');
        alorg.add('i');alg.add('k');
        alorg.add('j');alg.add('u');
        alorg.add('k');alg.add('o');
        alorg.add('l');alg.add('m');
        alorg.add('m');alg.add('x');
        alorg.add('n');alg.add('s');
        alorg.add('o');alg.add('e');
        alorg.add('p');alg.add('v');
        alorg.add('q');alg.add('z');
        alorg.add('r');alg.add('p');
        alorg.add('s');alg.add('d');
        alorg.add('t');alg.add('r');
        alorg.add('u');alg.add('j');
        alorg.add('v');alg.add('g');
        alorg.add('w');alg.add('t');
        alorg.add('x');alg.add('h');
        alorg.add('y');alg.add('a');
        alorg.add('z');alg.add('q');
        alorg.add(' ');alg.add(' ');
        System.out.println(alorg.size() + " " + alg.size());
        Scanner s = new Scanner(System.in);
        
        int i = 1;
        while(true){
            String str = s.nextLine().trim(); 
            char[] c = str.toCharArray();
            System.out.print("Case #" +i +": ");
            for(char cc : c){
            System.out.print(alorg.get(alg.indexOf(cc)));
        }
            i++;
            System.out.println("");
           
        }
            
              
    }
}
