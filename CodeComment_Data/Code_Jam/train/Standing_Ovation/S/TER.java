package methodEmbedding.Standing_Ovation.S.LYD1509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class TER {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int cases = Integer.parseInt(line);
		for (int i = 1; i < cases+1; i++) {
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int max = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int[] arr = new int[max+1];
			for(int j=0; j<max+1; j++) {
				arr[j] = Integer.parseInt(s.charAt(j)+"");
			}
			int stand = 0;
			int need = 0;
			for (int k = 0; k < max+1; k++) {
				stand += arr[k];
				if (stand <= k) {
					need++;
					stand++;
				}
			}
			System.out.println("Case #"+i+": " + need);
		}
	}
}
