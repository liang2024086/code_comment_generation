package methodEmbedding.Speaking_in_Tongues.S.LYD383;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class ConvertFromGooglerese {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFilePath = null;
		if (args.length <= 0) {
			System.err.println("USAGE: Please enter the input file name");
			System.exit(0);
		} else {
			inputFilePath = args[0];
		}
		String outputFilePath = inputFilePath.substring(0, inputFilePath.indexOf('.'))
				+ ".out";
		System.out.println("Output File path = " + outputFilePath);
		Map<String, String> charValueMap = new HashMap<String, String>();
		charValueMap.put("a", "y");
		charValueMap.put("b", "h");
		charValueMap.put("c", "e");
		charValueMap.put("d", "s");
		charValueMap.put("e", "o");
		charValueMap.put("f", "c");
		charValueMap.put("g", "v");
		charValueMap.put("h", "x");
		charValueMap.put("i", "d");
		charValueMap.put("j", "u");
		charValueMap.put("k", "i");
		charValueMap.put("l", "g");
		charValueMap.put("m", "l");
		charValueMap.put("n", "b");
		charValueMap.put("o", "k");
		charValueMap.put("p", "r");
		charValueMap.put("q", "z");
		charValueMap.put("r", "t");
		charValueMap.put("s", "n");
		charValueMap.put("t", "w");
		charValueMap.put("u", "j");
		charValueMap.put("v", "p");
		charValueMap.put("w", "f");
		charValueMap.put("x", "m");
		charValueMap.put("y", "a");
		charValueMap.put("z", "q");

		try {
			DataInputStream in = new DataInputStream(new FileInputStream(
					inputFilePath));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(
					outputFilePath));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
			String strLine;
			boolean firstLine = true;
			int count = 1;
			while ((strLine = br.readLine()) != null) {
				if (firstLine) {
					firstLine = false;
					continue;
				} else {
					//System.out.println("strLine.length()=" + strLine.length());
					char [] arr = strLine.toCharArray();
					for (int i = 0; i < arr.length; i++) {
						if(arr[i]!= ' '){
							arr[i] = charValueMap.get(String.valueOf(arr[i])).charAt(0);
						}
					}
					strLine= String.valueOf(arr);
					//System.out.println("converted strLine = " + strLine);
					bw.append("Case #" + count + ": ");
					bw.write(strLine);
					bw.newLine();
				}
				bw.flush();
				count++;
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
