package methodEmbedding.Speaking_in_Tongues.S.LYD703;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String[] s2 = {"our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up","a zoo"};
        String[] s1 = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
"de kr kd eoya kw aej tysr re ujdr lkgc jv","y qee"};
        Map<Character, Character> alph = new TreeMap<Character, Character>();
        for(int i = 0; i < s1.length; i++ ){
            for(int j = 0; j < s1[i].length(); j++){
                alph.put(s1[i].charAt(j), s2[i].charAt(j));
            }
        }
        BufferedReader reader = new BufferedReader(new FileReader(new File("t.txt")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("out.txt")));
        int num = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < num; i++) {
            String orig = reader.readLine();
            writer.write("Case #" + (i+1) + ": ");
            for(int j = 0; j < orig.length(); j++){
                 if(alph.containsKey(orig.charAt(j))){
                     writer.write(alph.get(orig.charAt(j)));
                 }   else {
                     writer.write('q');
                 }
            }
            if(i < num-1){
                writer.write('\n');
            }
        }
        writer.close();
        reader.close();
    }
}
