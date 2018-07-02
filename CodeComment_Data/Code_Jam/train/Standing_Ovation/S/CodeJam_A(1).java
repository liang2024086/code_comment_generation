package methodEmbedding.Standing_Ovation.S.LYD1139;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class CodeJam_A {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
		int tests = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < tests; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			st.nextToken();
			String s = st.nextToken();
			long count = 0;
			long ans  = 0;
			for (int j = 0; j < s.length(); j++) {
				int needed = Integer.parseInt(s.charAt(j)+"");
				if(j>count && needed > 0){
					ans += j-count;
					count += j-count;
				}
				
				count += needed;
			}
			
			
			sb.append("Case #"+(i+1)+": " + ans+"\n");
		}
		
		File file = new File("codejam.txt");
		file.createNewFile();
		FileWriter f = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(f);
		
		bw.write(sb.toString());
		bw.close();
		bf.close();
	}

}
