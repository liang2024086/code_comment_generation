package methodEmbedding.Revenge_of_the_Pancakes.S.LYD911;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RevengePancakes {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		OutputStreamWriter output1 = new OutputStreamWriter(System.out);
		try {
			int tests = -1, curTest = 0;
			tests = Integer.parseInt(reader.readLine());
			for (curTest=1; curTest<=tests; curTest++){ 
				String row=reader.readLine();
				int c=row.charAt(row.length()-1)=='-'?1:0;
				for (int i=0; i<row.length()-1; i++) {
					if (row.charAt(i)!=row.charAt(i+1)) c++;
				}
				
				String line = String.format("Case #%d: %d\n", curTest, c);
				output1.write(line);
			}
			output1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
