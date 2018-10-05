package methodEmbedding.Counting_Sheep.S.LYD529;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws Exception {
		String bd = "C:\\Users\\sampatk\\workspace\\gcj16\\src\\gcj16";
		String in = bd + "\\test.txt";
		String out = bd + "\\out.txt";
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out)));		
		Scanner s = new Scanner(new InputStreamReader(new FileInputStream(in)));

		int T = s.nextInt();
		for(int i=1; i<=T; i++) {
			long N = s.nextLong();
			Map<Integer, Boolean> m = new HashMap<Integer, Boolean>();
			String op = "Case #" + i + ": ";
			
			boolean f = false;
			if (N > 0) {
				for(long j=N; (Long.MAX_VALUE-j) >= N; j+=N) {
					long tj = j;
					while(tj > 0) {
						int d = (int)(tj%10);
						tj /= 10;
						
						m.put(d, true);
					}
					
					if (m.size() == 10) {
						f = true;
						op = op + j;
						
						break;
					}
				}
			}
			
			if (! f) op = op + "INSOMNIA";
			
			bw.write(op + System.lineSeparator());
			System.out.println(op);
		}
		
		s.close();
		bw.close();
	}
}
