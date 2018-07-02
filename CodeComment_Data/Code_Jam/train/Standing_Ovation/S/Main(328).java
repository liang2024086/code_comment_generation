package methodEmbedding.Standing_Ovation.S.LYD1476;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=N; i++){
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int width = Integer.parseInt(st.nextToken());
			String number = st.nextToken();
			
			String[] splited = number.split("");
			
			
			
			long[] vet1 = new long[width+1];
			for (int j=0; j<(width+1); j++) {
				vet1[j] = (Integer.parseInt(splited[j+1]));
			}
			
			
			long need = 0;
			long howManyStood = 0;
			
			
			for (int j=0; j<(width+1); j++) {		
				long helper = vet1[j];
				
				if (vet1[j]!=0) {
					if(j>howManyStood) {
						need+=(j-howManyStood);
						helper = need + vet1[j];
					}
				} 
				
				howManyStood += helper;
			}
			
			
			
			sb.append("Case #" + i + ": " + need +"\n");
			
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
