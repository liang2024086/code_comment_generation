package methodEmbedding.Standing_Ovation.S.LYD79;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class StandingOvation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/home/e/Downloads/A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/e/Documents/StandingOvation.out"));
		int times = Integer.parseInt(br.readLine());
		for(int time = 1; time <= times; time++) {
			int sum = 0;
			int added = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int smax = Integer.parseInt(st.nextToken());
			char[] audience = st.nextToken().toCharArray();
			if(smax != 0) {
				for(int i = 0; i < audience.length; i++) {
					if(sum < i) {
						int temp = i-sum;
						added += temp;
						sum += temp;
					}
					sum += Character.getNumericValue(audience[i]);
				}
			}
			bw.write("Case #" + time + ": " + added + "\n");
		}
		br.close();
		bw.close();
	}
}
