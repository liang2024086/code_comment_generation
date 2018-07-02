package methodEmbedding.Standing_Ovation.S.LYD645;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class A_Small {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("input.txt");
	    BufferedReader br = new BufferedReader(fr);
		String line1 = br.readLine();
		int testCount = Integer.parseInt(line1);
		
		for(int i = 1; i<=testCount; i++) {
			String lineCase = br.readLine();
			int Smax = Integer.parseInt(lineCase.substring(0,1));
			int missing = 0;
			int standing = 0;
			for(int j = 0; j<=Smax; j++) {
				int sj = Integer.parseInt(lineCase.substring(2+j,3+j));
				if(standing + missing < j && sj > 0) {
					missing += j - standing - missing;
				}
				standing += sj;
			}
			System.out.println("Case #" + i + ": " + missing);
		}
		br.close();
	}
}
