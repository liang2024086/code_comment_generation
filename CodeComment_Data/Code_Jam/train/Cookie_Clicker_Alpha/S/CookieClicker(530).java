package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1394;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CookieClicker {
	public static void main(String[] args) throws Exception {
		String baseDir = "C:\\Users\\sampatk\\workspace\\GCJ2014\\src\\qualification\\";
		String inFileName = baseDir + "B-small-attempt0.in";
		String outFileName = baseDir + "output.txt";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inFileName)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFileName));
		
		int nt = Integer.parseInt(br.readLine());
		for(int i=0; i<nt; i++) {
			String strs[] = br.readLine().split("\\s+");
			double C = Double.parseDouble(strs[0]);
			double F = Double.parseDouble(strs[1]);
			double X = Double.parseDouble(strs[2]);
			
			double secs = 0;
			double nc = 2;

			while(true) {
				double xs = X/nc;
				double cs = C/nc+(X/(nc+F));
				if(xs <= cs) {
					secs += xs;
					break;
				} else {
					secs += C/nc;
				}
				nc += F;
			}
			
			String output = "Case #" + (i+1) + ": " + secs;
			System.out.println(output);
			bw.write(output + System.lineSeparator());
		}
		
		bw.close();
		br.close();
	}	
}
