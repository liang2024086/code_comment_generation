package methodEmbedding.Speaking_in_Tongues.S.LYD1323;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author strigazi
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class CodejamQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        
        
        Map<Character,Character> m = new TreeMap();
        String str[] = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
                        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
                        "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
        String str2[] = {"our language is impossible to understand",
                         "there are twenty six factorial possibilities",
                         "so it is okay if you want to just give up"};
        for(int j=0;j<3;j++){
            for(int i=0;i<str[j].length();i++){
                if(!m.containsKey(str[j].charAt(i))){
                    m.put(str[j].charAt(i), str2[j].charAt(i));
                }
            }
        }
        //m.remove(' ');
        m.put('z', 'q');
        m.put('q', 'z');
        
        TextFile file = new TextFile("input.txt");
        Iterator<String> it = file.iterator();
        
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        
        String next;
        next = it.next();
        Integer cases = new Integer(Integer.parseInt(next));
        
        int len=0;
        int count = 0;
        while(it.hasNext()){
            count++;
            next = it.next();
            len = next.length();
            out.print("Case #"+count+": ");
            for(int i=0;i<len;i++){
                out.print(m.get(next.charAt(i)));
            }
            out.println();
        }
        
        
        
        //System.out.println(m.toString());
        //System.out.println(m.size());
        
        out.close();
        // TODO code application logic here
    }
}

