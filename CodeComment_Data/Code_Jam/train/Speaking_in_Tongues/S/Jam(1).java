package methodEmbedding.Speaking_in_Tongues.S.LYD1533;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Jam {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
       BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
       
       String HINT = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
       String KEY =  "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";

       Map<Character, Character> m = new TreeMap<Character, Character>();
       m.put('q', 'z');
       m.put('z', 'q');
       m.put(' ', ' ');
       
       for(int i = 0; i< HINT.length(); i++){
           m.put(HINT.charAt(i), KEY.charAt(i));
       }
       
       int T = Integer.parseInt(br.readLine().trim());
       for(int t = 1; t<=T; t++){
           String in = br.readLine().trim();
           StringBuilder out = new StringBuilder("Case #"+t+": ");
           for(Character c: in.toCharArray()){
               out.append(m.get(c));
           }
           bw.write(out.toString());
           bw.newLine();
       }
       
       br.close();
       bw.close();
    }
}
