package methodEmbedding.Standing_Ovation.S.LYD1965;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Akram Gaballah Ahmed
 */
public class A_Standing_Ovation {

	public static void main(String[] args) throws Exception{
		
		BufferedReader fin = new BufferedReader(
//				new InputStreamReader(System.in));
				new FileReader("C:\\a-akgaba\\problems\\in.txt"));
		BufferedWriter fout = new BufferedWriter(
//				new OutputStreamWriter(System.out));
				new FileWriter("C:\\a-akgaba\\problems\\out.txt"));
		
		int T = Integer.parseInt(fin.readLine());
		String line, word;
		int sz = 0, add = 0;
		int ch;
		
		for (int itr = 1; itr <= T; itr++) {
			
			add = 0;
			line = fin.readLine();
			word = line.substring(line.indexOf(' ')+1);
						
			sz = word.charAt(0)-'0';
			if(sz == 0) {sz++; add++;}
			
			for(int i = 1; i < word.length(); i++){
				
				sz --;
				
				ch = word.charAt(i)-'0';
				
				sz += ch;
				
				if(sz == 0){sz++; add++;}
				
			}
			
			fout.write("Case #"+itr+": "+add+"\n");
		}
		
		
		fin.close();
		fout.close();
	}
}
