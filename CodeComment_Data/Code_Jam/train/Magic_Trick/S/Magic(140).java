package methodEmbedding.Magic_Trick.S.LYD980;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Magic {
		public static void main(String[] args) throws IOException {
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					System.out));
			StringBuilder sb = new StringBuilder();
			
			//StringTokenizer st = new StringTokenizer(br.readLine());
			StringTokenizer st;
			int t = Integer.parseInt(br.readLine());
			int r1, r2, n = 0, v1[], v2[], c = 1;
			v1 = new int[4];
			v2 = new int[4];
			
			while(t-- > 0){
				
				n = 0;
				r1 = Integer.parseInt(br.readLine());
				while(n < 4){
					if (n + 1 != r1){
						br.readLine();
					}else {
						st = new StringTokenizer(br.readLine());
						v1[0] = Integer.parseInt(st.nextToken());
						v1[1] = Integer.parseInt(st.nextToken());
						v1[2] = Integer.parseInt(st.nextToken());
						v1[3] = Integer.parseInt(st.nextToken());
					}
					n++;
				}
				
				n = 0;
				r2 = Integer.parseInt(br.readLine());
				while(n < 4){
					if (n + 1 != r2){
						br.readLine();
					}else {
						st = new StringTokenizer(br.readLine());
						v2[0] = Integer.parseInt(st.nextToken());
						v2[1] = Integer.parseInt(st.nextToken());
						v2[2] = Integer.parseInt(st.nextToken());
						v2[3] = Integer.parseInt(st.nextToken());
					}
					n++;
				}
				
				int cont = 0;
				int valor = -1;
				for (int i = 0; i < v2.length; i++) {
					for (int j = 0; j < v2.length; j++) {
						if (v1[i] == v2[j]){
							cont++;
							valor = v1[i];
						}
					}
				}
				sb.append("Case #");
				sb.append(c);
				sb.append(": ");
				if (cont == 1){
					sb.append(valor);
				}else if (cont == 0){
					sb.append("Volunteer cheated!");
				}else sb.append("Bad magician!");
				//if (t > 0 ){
						sb.append("\n");
				//}
				c++;
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
}
