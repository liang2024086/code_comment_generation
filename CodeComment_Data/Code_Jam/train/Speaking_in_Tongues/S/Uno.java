package methodEmbedding.Speaking_in_Tongues.S.LYD17;

import java.util.*;
import java.io.*;

public class Uno {
    public static void main(String[] args) throws IOException {
        String ins = "ejp mysljylc kd kxveddknmc re jsicpdrysi" +
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" +
                "de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String outs = "our language is impossible to understand" +
                "there are twenty six factorial possibilities" +
                "so it is okay if you want to just give up";
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < ins.length(); i++) {
            map.put(ins.charAt(i), outs.charAt(i));
        }
        //Know 'a' -> 'y', 'o' -> 'e', and 'z' -> 'q'
        map.put('y','a');
        map.put('e','o');
        map.put('q','z');
        map.put('z', 'q');
        BufferedReader in = new BufferedReader(new FileReader("uno.txt"));
        int T = Integer.parseInt(in.readLine());
        for(int t = 0; t < T; t++) {
            String ans = "";
            for(char c:in.readLine().toCharArray()) {
                if(!map.containsKey(c)) {
                    System.out.println("Dang " + c);
                    assert false;
                } else {
                    ans += map.get(c);
                }
            }
            System.out.println("Case #" + (t+1) + ": " + ans);
        }
    }
}
