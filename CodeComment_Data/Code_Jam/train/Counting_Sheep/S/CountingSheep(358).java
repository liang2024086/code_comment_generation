package methodEmbedding.Counting_Sheep.S.LYD1152;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("input.in"));
		PrintWriter out = new PrintWriter("output.txt");
		
		int numOfTests = Integer.valueOf(in.readLine());
		
		for(int i=1; i<=numOfTests; i++) {
			Set<Integer> seen = new HashSet<Integer>();
			int val = Integer.valueOf(in.readLine());
			if(val == 0) {
				out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			int tmpVal = val;
			int tmpVal2 = val;
			int multiplier = 1;
			while(seen.size()<10) {
				tmpVal = val * multiplier;
				tmpVal2 = tmpVal;
				while(tmpVal > 0) {
					int singleDigit = (int)tmpVal % 10;
					seen.add(singleDigit);
					tmpVal = tmpVal / 10;
				}
						
				
				multiplier++;
			}
			
			out.println("Case #" + i + ": " + tmpVal2);
		}
		
		in.close();
		out.close();
	}
}
