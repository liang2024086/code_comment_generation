package methodEmbedding.Speaking_in_Tongues.S.LYD155;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_small_0 {		
	public static void main(String[] args) throws IOException {
		final char LOWER_CASE_A = 'a';
		final char SPACE = ' ';
		String inputFilePathString = "A-small-0.in";
		String outputFilePathString = "A-small-0.out";
		char[] mapping = {
				'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u',  
				'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w',  
				'j', 'p', 'f', 'm', 'a', 'q'
		};
		FileReader in = new FileReader(inputFilePathString);
		FileWriter out = new FileWriter(outputFilePathString);
		BufferedReader br = null;
		BufferedWriter bw = null;
		String lineHeaderString = "Case #";
		
		try {
			int testCaseCount = 0;
			br = new BufferedReader(in);
			bw = new BufferedWriter(out);
			
			// read the first line
			String strCountOfOneLine = br.readLine();
			System.out.println(strCountOfOneLine);
			testCaseCount = new Integer(strCountOfOneLine);
			System.out.println(testCaseCount);
			
			// read the following lines
			String s = null;
			char c = 'a';
			int i = 0;
			int j = 0;
			int k = 0;
			while ((s = br.readLine()) != null) {
				// parse one line
				char[] inputOfOneLine = s.toCharArray();
				for (i = 0; i < s.length(); ++i) {
					c = inputOfOneLine[i];
					if (c != SPACE) {
						j = (int)(c - LOWER_CASE_A);
						inputOfOneLine[i] = mapping[j];
					}
				}
				
				// write the output for this line
				++k;
				String realLineHeader = lineHeaderString + Integer.toString(k) + ": "; 
				bw.write(realLineHeader);
				bw.write(inputOfOneLine, 0, inputOfOneLine.length);
				bw.newLine();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
			bw.flush();
			bw.close();
		}
	}
}
