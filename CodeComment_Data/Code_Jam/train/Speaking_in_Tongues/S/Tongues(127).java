package methodEmbedding.Speaking_in_Tongues.S.LYD473;

import java.io.*;
import java.util.*;
public class Tongues
{
    public static void main(String [] args) throws Exception
    {
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('a','y');
        map.put('b','h');
        map.put('c','e');
        map.put('d','s');
        map.put('e','o');
        map.put('f','c');
        map.put('g','v');
        map.put('h','x');
        map.put('i','d');
        map.put('j','u');
        map.put('k','i');
        map.put('l','g');
        map.put('m','l');
        map.put('n','b');
        map.put('o','k');        
        map.put('p','r');
        map.put('q','z');
        map.put('r','t');
        map.put('s','n');
        map.put('t','w');
        map.put('u','j');
        map.put('v','p');
        map.put('w','f');
        map.put('x','m');
        map.put('y','a');
        map.put('z','q');
        map.put(' ', ' ');
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("B-small.out")));
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++)
        {
            String k = br.readLine();
            String ans = "";
            for(int j = 0; j < k.length(); j++)
            {
                ans+=map.get(k.charAt(j));
            }                     
           out.println("Case #"+i+": "+ans);  
        }
        out.close();
    }
}
