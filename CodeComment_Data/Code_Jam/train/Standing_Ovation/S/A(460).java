package methodEmbedding.Standing_Ovation.S.LYD1376;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer out = new StringBuffer();
		
		int t, stand, need;
		String[] line;
		String peoples;
		
		t = Integer.parseInt(in.readLine());
		for (int i = 1; i <= t; i++) {
			if (i != 1) {
				out.append("\n");
			}
			line = in.readLine().split(" ");
			peoples = line[1];
			
			stand = 0;
			need = 0;
			for (int j = 0; j < peoples.length(); j++) {
				int p = Integer.parseInt(peoples.substring(j,j+1));
				if (stand < j) {
					need += (j - stand);
					stand += (j - stand);
				}
				stand += p;
			}
			out.append(String.format("Case #%d: %d", i, need));
		}
		System.out.print(out);
	}
}
