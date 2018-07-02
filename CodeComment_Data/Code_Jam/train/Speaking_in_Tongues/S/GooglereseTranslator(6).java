package methodEmbedding.Speaking_in_Tongues.S.LYD1282;

// Speaking in Tongues
// 
// Based on the problem hint and below translations from test cases, the following character mapping can be duduced
//
//
// so it is okay if you want to just give up
// de kr kd eoya kw aej tysr re ujdr lkgc jv
//
// there are twenty six factorial possibilities
// rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
//
// our language is impossible to understand
// ejp mysljylc kd kxveddknmc re jsicpdrysi
//
//
// a - y
// b - n
// c - f
// d - i
// e - c
// f - w
// g - l
// h - b
// i - k
// j - u
// k - o
// l - m
// m - x
// n - s
// o - e
// p - v
// q - z
// r - p
// s - d
// t - r
// u - j
// v - g
// w - t
// x - h
// y - a
// z - q

import java.io.*;

public class GooglereseTranslator {
	public static void main(String[] args) throws Exception {
		String inputPath = args[args.length-2];
		String outputPath = args[args.length-1];
		
		BufferedReader br = new BufferedReader(new FileReader(inputPath));
		int numberOfTestCases = Integer.parseInt(br.readLine());
		
		StringBuilder output = new StringBuilder();
		
		String englishTable = "abcdefghijklmnopqrstuvwxyz ";
		String googlereseTable = "ynficwlbkuomxsevzpdrjgthaq ";
		
		for (int i=1; i<=numberOfTestCases; i++) {
			output.append("Case #" + i + ": ");
			
			String text = br.readLine();
			for (int charIndex = 0; charIndex < text.length(); charIndex++) {
				char c = text.charAt(charIndex);
				int tableIndex = googlereseTable.indexOf(c);
				output.append(englishTable.charAt(tableIndex));
			}
			
			output.append("\n");
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath));
		String outputString = output.toString();
		bw.write(outputString, 0, outputString.length());
		bw.close();
	}
}
