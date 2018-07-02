package methodEmbedding.Speaking_in_Tongues.S.LYD488;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: vikash
 * Date: 14/04/12
 * Time: 9:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class SpeakingInTongues {
    private static Map<Character, Character> charMap_ = new HashMap<Character, Character>();

    public static void main(String[] args) throws Exception {
        charMap_.put('a','y');
        charMap_.put('b','h');
        charMap_.put('c','e');
        charMap_.put('d','s');
        charMap_.put('e','o');
        charMap_.put('f','c');
        charMap_.put('g','v');
        charMap_.put('h','x');
        charMap_.put('i','d');
        charMap_.put('j','u');
        charMap_.put('k','i');
        charMap_.put('l','g');
        charMap_.put('m','l');
        charMap_.put('n','b');
        charMap_.put('o','k');
        charMap_.put('p','r');
        charMap_.put('q','z');
        charMap_.put('r','t');
        charMap_.put('s','n');
        charMap_.put('t','w');
        charMap_.put('u','j');
        charMap_.put('v','p');
        charMap_.put('w','f');
        charMap_.put('x','m');
        charMap_.put('y','a');
        charMap_.put('z','q');
        charMap_.put(' ', ' ');
        BufferedReader br = new BufferedReader(new FileReader("/Users/vikash/SpeakingIn.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/vikash/SpeakingOut.txt"));
        int testCases = Integer.parseInt(br.readLine());
        int currentTest = 1;
        while(currentTest <= testCases) {
           char[] input = br.readLine().toCharArray();
            String output = "Case #" + currentTest + ": ";
            for(int i=0; i<input.length; i++) {
                output += charMap_.get(input[i]);
            }
            bw.write(output);
            bw.newLine();
            currentTest++;
        }
        bw.close();
        br.close();
    }
}
