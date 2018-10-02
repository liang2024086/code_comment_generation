package methodEmbedding.Speaking_in_Tongues.S.LYD1116;


//Author KNIGHT0X300 

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       TreeMap<Character,Character> ts=new TreeMap<Character,Character>();
       ts.put('e', 'o');
       ts.put('j', 'u');
       ts.put('p', 'r');
       ts.put('m', 'l');
       ts.put('y', 'a');
       ts.put('s', 'n');
       ts.put('l', 'g');
       ts.put('c', 'e');
       ts.put('k', 'i');
       ts.put('d', 's');
       ts.put('x', 'm');
       ts.put('v', 'p');
       ts.put('n', 'b');
       ts.put('r', 't');
       ts.put('i', 'd');
       ts.put('b', 'h');
       ts.put('t', 'w');
       ts.put('a', 'y');
       ts.put('h', 'x');
       ts.put('w', 'f');
       ts.put('f', 'c');
       ts.put('o', 'k');
       ts.put('u', 'j');
       ts.put('g', 'v');
       ts.put('z', 'q');
       ts.put('q', 'z');
       ts.put(' ', ' ');
     
       String st=s.nextLine();
       for(int i=0;i<t;i++)
       {
       st=s.nextLine();
       st=st.toLowerCase();
        System.out.print("Case #"+(i+1)+": ");
       for(int j=0;j<st.length();j++)
       {
           System.out.print(ts.get(st.charAt(j)));
       
       }
       
           System.out.println("");
       
       
       
       
       
       
       
       
       
       
          
           
          
       }
        
    }
}
