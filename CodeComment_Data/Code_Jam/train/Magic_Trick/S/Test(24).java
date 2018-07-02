package methodEmbedding.Magic_Trick.S.LYD349;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import com.utility.FileReader;
import com.utility.FileWriterUtility;


public class Test {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = FileReader.getBufferedReader("A-small-attempt0.in");
		BufferedWriter bw = FileWriterUtility.getBufferedWriter("output.txt");
		
		
		int t = Integer.valueOf(br.readLine());
		
		for (int i = 0; i < t; i++) {
			
			int t1 = Integer.valueOf(br.readLine());
			String[] s1 = null;
			String[] s2 = null;
			
			for (int j = 1; j < 5; j++) {
				
				String s = br.readLine();
				if (j == t1) {
					s1 = s.split(" "); 
				}
			}
			
			int t2 = Integer.valueOf(br.readLine());
			
			for (int j = 1; j < 5; j++) {
				
				String s = br.readLine();
				if (j == t2) {
					s2 = s.split(" "); 
				}
			}
			
			int common = 0;
			int temp = 0;
			for (String x : s1) {
				for (String y : s2) {
					if (x.equalsIgnoreCase(y)) {
						temp = Integer.valueOf(x);
						common++;
						break;
					}
				}
			}
			
			if (common == 0) {
				bw.write("Case #" + (i+1) + ": Volunteer cheated!");
				bw.write("\n");
			}
			else if (common == 1) {
				bw.write("Case #" + (i+1) + ": " + temp);
				bw.write("\n");
			}
			else {
				bw.write("Case #" + (i+1) + ": Bad magician!");
				bw.write("\n");
			}
		}
		br.close();
		bw.close();
		
	}
}
