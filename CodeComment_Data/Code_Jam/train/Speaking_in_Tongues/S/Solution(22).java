package methodEmbedding.Speaking_in_Tongues.S.LYD1137;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {

	private static final String INPUT  = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qee z";
	private static final String OUTPUT = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zoo q";
	
	public static void main(String[] args) throws IOException{
		char[] translationMatrix = new char[26];
		for (char index = 'a'; index <= 'z'; ++index){
			int stringIndex = INPUT.indexOf(index);
			if (stringIndex != -1)
				translationMatrix[index-'a'] = OUTPUT.charAt(stringIndex);
		}
		
		StringBuffer test = new StringBuffer();
		for (int j=0; j<INPUT.length(); ++j){
			char inp = INPUT.charAt(j);
			if (inp >= 'a' && inp <= 'z')
				inp = translationMatrix[inp-'a'];
			test.append(inp);
		}
		assert(OUTPUT.equals(test.toString()));
		
		BufferedReader br = new BufferedReader(new FileReader("small0.in"));
		BufferedWriter wr = new BufferedWriter(new FileWriter("output"));
		
		Integer inputCount = Integer.valueOf(br.readLine());
		for (int caseNumber = 1; caseNumber<= inputCount; ++caseNumber){
			String line = br.readLine();
			StringBuffer bf = new StringBuffer();
			bf.append("Case #");
			bf.append(caseNumber);
			bf.append(": ");
			for (int j=0; j<line.length(); ++j){
				char inp = line.charAt(j);
				if (inp >= 'a' && inp <= 'z')
					inp = translationMatrix[inp-'a'];
				bf.append(inp);
			}
			
			wr.write(bf.toString());
			wr.newLine();
			wr.flush();
		}
	}
	
}
