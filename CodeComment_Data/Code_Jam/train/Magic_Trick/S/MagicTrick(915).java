package methodEmbedding.Magic_Trick.S.LYD1785;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class MagicTrick {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("A-small.out");
		

		int testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++) {
			int first = Integer.parseInt(br.readLine());
			ArrayList<String> firstM = new ArrayList<String>();
			for (int j = 0; j < 4; j++) {
				firstM.add(br.readLine());
			}
			
			int second = Integer.parseInt(br.readLine());
			ArrayList<String> secondM = new ArrayList<String>();
			for (int j = 0; j < 4; j++) {
				secondM.add(br.readLine());
			}
			
			ArrayList<String> res = new ArrayList<String>();
			String[] firstSplited = firstM.get(first - 1).split("\\s+");
			String[] secondSplited = secondM.get(second - 1).split("\\s+");
			for (String string : firstSplited) {
				for (String string2 : secondSplited) {
					if(string.equals(string2))
						res.add(string);
				}
			}
			
			if(res.size() == 1)
				pw.printf("Case #%d: %s\n", (i + 1), res.get(0));
			else if(res.size() == 0)
				pw.printf("Case #%d: Volunteer cheated!\n", (i + 1));
			else
				pw.printf("Case #%d: Bad magician!\n", (i + 1));
		}
		
		
		
		
		
		br.close();
		pw.close();
	}
}
