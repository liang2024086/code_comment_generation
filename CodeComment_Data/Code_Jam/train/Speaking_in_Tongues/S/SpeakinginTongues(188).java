package methodEmbedding.Speaking_in_Tongues.S.LYD1181;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.TreeMap;


public class SpeakinginTongues {

    /**
     * Google Code Jam 2012: Problem A. Speaking in Tongues
     * @author hullarb
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
	String example =     "ejp mysljylc kd kxveddknmc re jsicpdrysi\nrbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\nde kr kd eoya kw aej tysr re ujdr lkgc jv"; 
	String exampleTran = "our language is impossible to understand\nthere are twenty six factorial possibilities\nso it is okay if you want to just give up";
	HashMap<Character,Character> dict = new HashMap<Character, Character>();
	dict.put('y','a'); dict.put('e','o');dict.put('q','z');dict.put('z', 'q');
	for(int i = 0; i < example.length(); i++)
	    dict.put(example.charAt(i),exampleTran.charAt(i));
	System.err.println("Size of dict: " + dict.size());
	for(Character c : dict.keySet())
	    System.err.println(c + " : " + dict.get(c));
	BufferedReader input = new BufferedReader(new FileReader(args[0]));
	OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(args[0].contains("in")?args[0].replace("in", "out"):args[0] + ".out"));
	int testCases = Integer.parseInt(input.readLine());
	for(int i = 0; i < testCases; i++) {
	    String line = input.readLine();
	    StringBuilder transalation = new StringBuilder();
	    for(int j = 0; j < line.length(); j++)
		transalation.append(dict.get(line.charAt(j)));
	    out.write("Case #" + (i + 1) + ": "  + transalation + "\n");
	}
	out.close();
	input.close();
    }

}
