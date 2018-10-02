package methodEmbedding.Magic_Trick.S.LYD1658;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {
	public static void main(String[] args) throws Exception {
		String baseDir = "C:\\Users\\sampatk\\workspace\\GCJ2014\\src\\qualification\\";
		String inFileName = baseDir + "A-small-attempt0.in";
		String outFileName = baseDir + "output.txt";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inFileName)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFileName));
		
		int nt = Integer.parseInt(br.readLine());
		for(int i=0; i<nt; i++) {
			int a1 = Integer.parseInt(br.readLine());
			Set<Integer> original = new HashSet<Integer>();
			for(int j=1; j<=4; j++) {
				if(j == a1) {
					String[] strs = br.readLine().split("\\s+");
					for(int k=0; k<strs.length; k++) {
						original.add(Integer.parseInt(strs[k]));
					}
				} else {
					br.readLine();
				}
			}

			int count = 0;
			int res = -1;
			int a2 = Integer.parseInt(br.readLine());
			for(int j=1; j<=4; j++) {
				if(j == a2) {
					String[] strs = br.readLine().split("\\s+");
					for(int k=0; k<strs.length; k++) {
						int r = Integer.parseInt(strs[k]);
						if(original.contains(r)) {
							res = r;
							count++;
						}
					}
				} else {
					br.readLine();
				}
			}

			String out = res + "";
			if(count == 0) {
				out = "Volunteer cheated!";
			} else if(count > 1) {
				out = "Bad magician!";
			}

			String output = "Case #" + (i+1) + ": " + out;
			System.out.println(output);
			bw.write(output + System.lineSeparator());
		}
		
		bw.close();
		br.close();
	}
}
