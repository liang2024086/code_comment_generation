package methodEmbedding.Counting_Sheep.S.LYD265;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {
	
	static final String FILE_IN = "A-small-attempt0 (1).in";
	static final String FILE_OUT = "out.txt";

	public static void main(String[] args) throws IOException {		
		BufferedReader r = new BufferedReader(new FileReader(FILE_IN));
		BufferedWriter w = new BufferedWriter(new FileWriter(FILE_OUT));
		
		int T = Integer.parseInt(r.readLine());
		long N, lineNum;
		int caseNum = 0;
		while (r.ready()){
			caseNum++;
			lineNum = Long.parseLong(r.readLine());
			N = lineNum;
			
			if (N == 0) {
				w.write("Case #"+caseNum+": INSOMNIA\n");
				continue;
			}
			
			Set<Long> unseen = new HashSet<Long>();
			for (long i=0; i<=9; i++){
				unseen.add(i);
			}
			
			long MaxN = (Long.MAX_VALUE/2) + 1;
			while (N < MaxN){
				long n = N;
				while (n > 0){
					unseen.remove(n % 10);
					n = n / 10;
				}
				if (unseen.isEmpty()) {
					w.write("Case #"+caseNum+": "+Long.toString(N)+"\n");
					break;
				}
				else
					N += lineNum;
			}
			if (N >= MaxN)
				w.write("Case #"+caseNum+": INSOMNIA\n");
			
		}
		
		r.close();
		w.close();
	}

}
