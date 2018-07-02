package methodEmbedding.Speaking_in_Tongues.S.LYD932;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * http://code.google.com/codejam/contest/1460488/dashboard
 * 
 * @author Weiwei Cheng
 */
public class SpeakingInTongues {

    public static void main(String[] args) throws Exception {
        
        String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi " +
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd " + 
                "de kr kd eoya kw aej tysr re ujdr lkgc jv";


        String output = "our language is impossible to understand " +  
                "there are twenty six factorial possibilities " +
                "so it is okay if you want to just give up";
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i=0; i<input.length(); i++){
            map.put(input.charAt(i), output.charAt(i));
        }
       
        int count = 0;
        for(Map.Entry<Character, Character> entry: map.entrySet()){
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
            count++;
        }

        // and we know this from the question description
        map.put('z', 'q');
        map.put('q', 'z');
        System.out.println(++count);
        
        BufferedReader br = new BufferedReader(new FileReader("123123.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("_output.in"));
        
        br.readLine();
        
        String line = null;
        count = 0;
        
        while((line=br.readLine())!=null){
            
            bw.append("Case #" + ++count + ": ");
            
            for(int i=0; i<line.length(); i++){
                bw.append(map.get(line.charAt(i)));
            }
            
            bw.newLine();
        }

        br.close();
        bw.close();
        
    }
    
}
