package methodEmbedding.Standing_Ovation.S.LYD1575;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringBuilder sb = new StringBuilder();
	
	
	int S = Integer.parseInt(br.readLine());
	
	
	for(int i = 1; i<=S; i++){
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int qt = Integer.parseInt(st.nextToken())+1;		
		String s = st.nextToken();
		
		
		int count = 0, resp = 0;
		for(int j = 0; j<qt; j++){
			
			int x = s.charAt(j)-'0';

			if((count+resp)<j){
				resp += (j-(count+resp));
			}
			count += x;
		}
		sb.append("Case #").append(i).append(": ").append(resp).append("\n");
		
	}
	
	
	bw.write(sb.toString());
	bw.flush();
	}

}
