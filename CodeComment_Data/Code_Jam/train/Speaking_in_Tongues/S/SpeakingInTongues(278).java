package methodEmbedding.Speaking_in_Tongues.S.LYD983;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class SpeakingInTongues {

	public static void main(String[] args) {
		
		BufferedReader inFile = null;
		try {
			inFile = new BufferedReader(
				    new InputStreamReader(
				        new BufferedInputStream(new FileInputStream("A-small-attempt0.in")),
				        "UTF-8"
				    )
				);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String moveTable = "ynficwlbkuomxsevzpdrjgthaq";
		
		try {
			int numCases = Integer.parseInt(inFile.readLine());
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt"), "UTF-8"));

			for (int caseNum = 0; caseNum < numCases; caseNum++) {	
				
				String line = inFile.readLine();
				String[] words = line.split(" ");
				
				bw.append("Case #" + (caseNum+1) + ": ");
				for (String word : words) {
					for (int letter = 0; letter < word.length(); letter++) {
						char decrypt = (char) (moveTable.indexOf(word.charAt(letter)) + 'a');
						bw.write(decrypt);
					}
					bw.append(' ');
				}
				bw.newLine();
			}
			bw.flush();
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
