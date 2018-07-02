package methodEmbedding.Speaking_in_Tongues.S.LYD925;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Enumeration;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class a_small_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String outputFormat = "Case #%s: %s";

		String realInput = "A-small-0.in";
		String realOutput = "A-small-0.out";

		// DataInputStream dis = new DataInputStream(System.in);
		// String fileName = dis.readLine();
		// System.out.println("Input file:" + fileName);

		String sampleInput = "input_s_0.txt";
		String sampleOutput = "output_s_0.txt";
		FileInputStream sampleInputfstream = new FileInputStream(sampleInput);
		DataInputStream sampleInputin = new DataInputStream(sampleInputfstream);
		BufferedReader sampleInputfis = new BufferedReader(
				new InputStreamReader(sampleInputin));

		FileInputStream sampleOutputfstream = new FileInputStream(sampleOutput);
		DataInputStream sampleOutputin = new DataInputStream(
				sampleOutputfstream);
		BufferedReader sampleOutputfis = new BufferedReader(
				new InputStreamReader(sampleOutputin));

		String sampleInputLine, sampleOutputLine;
		int numOfLines = Integer.parseInt(sampleInputfis.readLine());

		// hashtable contains 'correct char' and 'mapped char'
		Hashtable ht = new Hashtable();
		ht.put('a', 'y');
		ht.put('o', 'e');
		ht.put('z', 'q');
		int sampleCount = 0;
		while ((sampleInputLine = sampleInputfis.readLine()) != null) {
			sampleOutputLine = sampleOutputfis.readLine();
			String formattedOutputCaseString = String.format(outputFormat,
					new String[] { String.valueOf(sampleCount++), "\0" });
			System.out.println("FormattedOutCas1:" + formattedOutputCaseString
					+ ".");
			sampleOutputLine = sampleOutputLine
					.substring(formattedOutputCaseString.length() - 1);
			// sampleOutputLine =
			// sampleOutputLine.replaceAll(formattedOutputCaseString, ">");
			System.out.println("FormattedOutCas2:" + sampleOutputLine + ".");
			int charCount = sampleInputLine.length();
			for (int i = 0; i < charCount; i++) {
				ht.put(sampleInputLine.charAt(i), sampleOutputLine.charAt(i));
			}
		}
		System.out.println("Size of ht:" + ht.size() + "... HT:" + ht);

		int smallChar = 97;
		for (int i = smallChar; i < smallChar + 26; i++) {
			if (!ht.containsKey((char) i)) {
				for (int j = smallChar; j < smallChar + 26; j++) {
					if (!ht.contains((char) j)) {
						ht.put((char) i, (char) j);
					}
				}
			}
		}

		FileInputStream realInputfstream = new FileInputStream(realInput);
		DataInputStream realInputin = new DataInputStream(realInputfstream);
		BufferedReader realInputfis = new BufferedReader(new InputStreamReader(
				realInputin));

		FileOutputStream realOutputfstream = new FileOutputStream(realOutput, false);
		DataOutputStream realOutputin = new DataOutputStream(realOutputfstream);
		BufferedWriter realOutputfis = new BufferedWriter(
				new OutputStreamWriter(realOutputin));

		String realInputLine;

		sampleCount = 1;
		numOfLines = Integer.parseInt(realInputfis.readLine());
		while ((realInputLine = realInputfis.readLine()) != null) {
			StringBuffer concatRealOutput = new StringBuffer();
			int charCount = realInputLine.length();
			for (int i = 0; i < charCount; i++) {
				char realChar = realInputLine.charAt(i);
				concatRealOutput.append(ht.get(realChar));
			}
			if(sampleCount > 1) {
				realOutputfis.write("\n");
			}
			String formattedOutputCaseString = String.format(outputFormat,
			new String[] { String.valueOf(sampleCount++), concatRealOutput.toString() });
			realOutputfis.write(formattedOutputCaseString);
		}
		
		realOutputfis.close();

		System.out.println("Full Size of ht:" + ht.size() + "... HT:" + ht);
	}
}
