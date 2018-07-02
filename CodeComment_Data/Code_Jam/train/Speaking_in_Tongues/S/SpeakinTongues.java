package methodEmbedding.Speaking_in_Tongues.S.LYD660;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class SpeakinTongues
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
			throws Exception
	{
		String mapping0 = "aoz ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String mapping1 = "yeq our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		
		Map<Character, Character> mapping = new HashMap<Character, Character>();
		for (int i=0; i<mapping0.length(); i++) {
			mapping.put (new Character (mapping0.charAt(i)), new Character (mapping1.charAt(i)));
		}
		
		// Search the missing source and target letters
		char c0 = ' ';
		char c1 = ' ';
		for (char c = 'a'; c <= 'z' ; c++) {
			if (!mapping.containsKey (new Character(c)))  c0 = c;
			if (!mapping.containsValue (new Character(c)))  c1 = c;
		}
		if ((c0 == ' ') || (c1 == ' '))  System.err.println ("ERROR FINDING MISSING LETTERS");
		mapping.put (new Character(c0), new Character(c1));
		
		// Check ok
		int numLetters = 'z' - 'a' + 2;
		if (mapping.size() == numLetters) {
			System.out.println ("Letters registered OK: " + mapping.size());
		} else {
			System.out.println ("Letters registered ERROR: " + mapping.size() + " / " + numLetters);
		}
		
		
		long t0 = System.currentTimeMillis();
		String sIn = "src/_2012/_0/a_tongues/A-small-attempt1.in";
		if (args.length > 0)  sIn = args[0];
		String sOut = sIn;
		if (sOut.endsWith (".in")) sOut = sOut.substring (0, sOut.length() - 3);
		sOut = sOut + ".out";
		
		LineNumberReader in = new LineNumberReader (new FileReader (sIn));
		PrintWriter out = new PrintWriter (new FileWriter (sOut));
	
		String linea0 = in.readLine();
		int numCasos = Integer.parseInt (linea0);
		
		for (int i=0; i<numCasos; i++) {
			System.out.println ("Case #" + (i+1));
			String s = in.readLine();
			
			StringBuffer res = new StringBuffer();
			for (int j=0; j<s.length(); j++) {
				Character c = mapping.get (new Character (s.charAt(j)));
				if (c == null)  System.err.println ("null!!!: " + s.charAt(j));
				res.append (c);
			}
			
			out.println ("Case #" + (i+1) + ": " + res);
		}
		
		
		out.close();
		
		long t1 = System.currentTimeMillis();
		long seg = ((t1 - t0) / 1000);
		double mins = seg / 60d;
		
		System.out.println ("OK - " + mins + " minutos");
	}

}
