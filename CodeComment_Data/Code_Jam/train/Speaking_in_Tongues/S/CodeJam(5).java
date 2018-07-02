package methodEmbedding.Speaking_in_Tongues.S.LYD754;

import java.io.*;
import java.util.*;

public class CodeJam {
	public static void main (String[] args) throws IOException {
		int i, j, k;
		long startTime = System.currentTimeMillis();
		File inFile  = new File("A-small-attempt0.in");  // File to read from
		File outFile = new File("A-small-practice.out");
		
		BufferedReader reader = new BufferedReader(new FileReader(inFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
	
		HashMap<Character, Character> cipher = new HashMap<Character, Character>();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] enc = new String[3];
		enc[0] = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		enc[1] = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		enc[2] = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		String[] dec = new String[3];
		dec[0] = "our language is impossible to understand";
		dec[1] = "there are twenty six factorial possibilities";
		dec[2] = "so it is okay if you want to just give up";
		
		for(i = 0; i < enc.length; i++) {
			for(j = 0; j < enc[i].length(); j++) {
				cipher.put(enc[i].charAt(j), dec[i].charAt(j));
			}
		}
		cipher.put('q', 'z');
		char rem = '0';
		for(i = 0; i < alphabet.length(); i++) {
			//System.out.print(alphabet.charAt(i) + " ");
			if(cipher.containsKey(alphabet.charAt(i))) {
				//System.out.print(cipher.get(alphabet.charAt(i)));
			} else {
				rem = alphabet.charAt(i);
			}
			//System.out.print("\n");
		}
		
		for(i = 0; i < alphabet.length(); i++) {
			char alpha = alphabet.charAt(i);
			if(!cipher.containsValue(alpha)) {
				cipher.put(rem, alpha);
			}
		}
		//System.out.println(cipher.get(rem));
		
		String line = null;
		line = reader.readLine();
		int cases = Integer.parseInt(line);
		int counter = 1;
		
        while ((line=reader.readLine()) != null) {
        	char[] decipher = new char[line.length()];
        	for(i = 0; i < line.length(); i++) {
        		decipher[i] = cipher.get(line.charAt(i));
        	}
        	
        	writer.write("Case #"+counter+": ");
        	
        	writer.write(decipher);
        	
        	writer.newLine();
        	counter++;        		
        }
        
        writer.close();       
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total Time: " + totalTime);		
	}
 }
