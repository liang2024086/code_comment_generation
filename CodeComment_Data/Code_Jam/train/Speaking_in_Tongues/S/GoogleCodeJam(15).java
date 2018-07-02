package methodEmbedding.Speaking_in_Tongues.S.LYD344;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Muhammad Zahran
 */
public class GoogleCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        // TODO code application logic here
        PrintWriter w =  new PrintWriter(new FileWriter("out.txt"));
        BufferedReader r = new BufferedReader(new FileReader("input.txt"));            
        //String line = r.readLine(); 
        
        String[] cases = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
                          "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
                          "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
                                          
        String[] results = {"our language is impossible to understand",
                            "there are twenty six factorial possibilities",
                            "so it is okay if you want to just give up"};               
        
        TreeMap<String, String> t = new TreeMap<String, String>();
        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < cases[i].length(); j++) 
            {                
                t.put(Character.toString(cases[i].charAt(j)), Character.toString(results[i].charAt(j)));
            }
        }
        t.put("q", "z");
        t.put("z", "q");        
//        System.out.println("Googlese" + " => " + "English");
//        for(Map.Entry<String,String> entry : t.entrySet()) 
//        {
//         String key = entry.getKey();
//         String value = entry.getValue();
//         System.out.println(key + " => " + value);
//        }
        ///////////////////////////////
        int count = Integer.parseInt(r.readLine());
        //int count = 3;
        String[] testcases = new String[count];
        for (int i = 0; i < count; i++) 
        {
             testcases[i] = r.readLine();
            //testcases[i] = cases[i];
            String replace = "";
            for (int j = 0; j < testcases[i].length(); j++) 
            {
                replace += t.get(Character.toString(testcases[i].charAt(j)));
            }
            int cnt = i+1;
            w.println("Case #" + cnt + ": " + replace);
        }
        w.close();
                
      
        
    }
}
