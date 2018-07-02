package methodEmbedding.Speaking_in_Tongues.S.LYD739;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class _2012_QR_ProblemA {
	public static void main(String[] args){
		try {
			BufferedReader in = new BufferedReader(new FileReader("C://B-large.in"));
			BufferedWriter out = new BufferedWriter(new FileWriter("C://B-large.out"));

			int numberOfTests = Integer.parseInt(in.readLine());
			for (int i = 0; i < numberOfTests; i++) {
				
				StringTokenizer st = new StringTokenizer(in.readLine());
				int N = Integer.parseInt(st.nextToken());
				int S = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				int alto =  (p-1)*3 + 1;
				int baixo = (p != 1) ? (p-1)*3 - 1 : 1;
				int quant = 0;
				int poss = 0;
				for (int j = 0; j < N; j++) {
					int nota = Integer.parseInt(st.nextToken());
					if (nota >= alto){
						quant++;
					}else{
						if (nota >= baixo){
							poss++;
						}
					}
				}
				quant += (poss > S) ?  S :  poss;
				
				out.append("Case #" + (i+1) +": " + quant);
				if (i + 1 < numberOfTests){
					out.newLine();
				}
				

			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
