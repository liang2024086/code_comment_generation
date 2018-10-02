package methodEmbedding.Speaking_in_Tongues.S.LYD92;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;


public class SpeakingInTongues {
	
	static TreeMap<Character, Character> codeMap;
	static {
		// Build Mapping structure.
		codeMap = new TreeMap<Character, Character>();
		
		codeMap.put('y', 'a');
		codeMap.put('e', 'o');
		codeMap.put('q', 'z');
		codeMap.put('z', 'q');
		
		ArrayList<String> input = new ArrayList<String>();
		input.add("ejp mysljylc kd kxveddknmc re jsicpdrysi");
		input.add("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd");
		input.add("de kr kd eoya kw aej tysr re ujdr lkgc jv");
		
		ArrayList<String> output = new ArrayList<String>();
		output.add("our language is impossible to understand");
		output.add("there are twenty six factorial possibilities");
		output.add("so it is okay if you want to just give up");
		
		for(int i=0; i <input.size(); i++) {
			char[] in = input.get(i).toCharArray();
			char[] out = output.get(i).toCharArray();
			for(int j=0; j < in.length; j++) {
				Character temp = codeMap.get(in[j]);
				if(temp == null) {
					codeMap.put(in[j], out[j]);
				} else if(!temp.equals(out[j])) {
					System.out.println("Anamoly " + temp + "!=" + out[j]);
					System.exit(0);
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream(new File("/home/sai/Downloads/A-small-attempt0.in"));
			BufferedReader buff = new BufferedReader(new InputStreamReader(fi));
			
			FileOutputStream fo = new FileOutputStream(new File("/home/sai/Downloads/A-small-attempt0.out"));
			BufferedWriter buffOut = new BufferedWriter(new OutputStreamWriter(fo));
			
			int noOfTestcase = Integer.parseInt(buff.readLine());			
			ArrayList<String> output = new ArrayList<String>();
			
			for(int i=0; i<noOfTestcase; i++) {
				String temp = buff.readLine();
				StringBuffer buffer = new StringBuffer();
				char[] arr = temp.toCharArray();
				for (int j = 0; j < arr.length; j++) {
					buffer.append(codeMap.get(arr[j]));
				}
				output.add(buffer.toString());
			}
			int caseNumber =1;
			for(String out: output) {
				buffOut.write("Case #"+caseNumber++ + ": "+ out + "\n");
			}
			
			buffOut.flush();
			buffOut.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//	private static void decode(String[] str) {
//		
//	}

}

