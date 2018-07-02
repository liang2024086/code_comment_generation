package methodEmbedding.Speaking_in_Tongues.S.LYD1005;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author RAVI
 */
public class Solution2012 {
     public static void main(String args[]){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C://outfilesmallname.txt"));
            BufferedReader in = new BufferedReader(new FileReader("C://A-small.in"));
            String str;
            HashMap code = new HashMap();
            code.put("a", "y");
            code.put("b", "h");
            code.put("c", "e");
            code.put("d", "s");
            code.put("e", "o");
            code.put("f", "c");
            code.put("g", "v");
            code.put("h", "x");
            code.put("i", "d");
            code.put("j", "u");
            code.put("k", "i");
            code.put("l", "g");
            code.put("m", "l");
            code.put("n", "b");
            code.put("o", "k");
            code.put("p", "r");
            code.put("q", "z");
            code.put("r", "t");
            code.put("s", "n");
            code.put("t", "w");
            code.put("u", "j");
            code.put("v", "p");
            code.put("w", "f");
            code.put("x", "m");
            code.put("y", "a");
            code.put("z", "q");
            int count=1;
            while ((str = in.readLine()) != null) {
                int testCaseCount = Integer.parseInt(str);
                for(int i=0;i<testCaseCount;i++){
                    String codeLang = in.readLine();
                    String outLang = "";
                    for(int j=0;j<codeLang.length();j++){
                        Object ch = code.get(""+codeLang.charAt(j));
                        if(ch!=null)
                            outLang +=ch;
                        else
                            outLang +=codeLang.charAt(j);
                    }
                    out.write("Case #"+count+": "+outLang+"\n");
                    count++;
                }
            }
        in.close();
        out.close();
    } catch (IOException e) {
    }
 }
     
    
}
