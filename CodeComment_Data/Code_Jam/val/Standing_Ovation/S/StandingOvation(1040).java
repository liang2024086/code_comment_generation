package methodEmbedding.Standing_Ovation.S.LYD1226;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws Exception {
		String inBaseDir = "C:\\Users\\sampatk\\Downloads\\";
		String fileName = "A-small-attempt0.in";
		String outBaseDir = "C:\\Users\\sampatk\\workspace\\GCJ2015\\src\\";
		String outFile = "test.out";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inBaseDir + fileName)));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outBaseDir + outFile)));
		
		Scanner s = new Scanner(br);
		int T = s.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = s.nextInt() + 1;
			char[] c = s.next().toCharArray();
			
			int res = 0;
			int so = Integer.parseInt(c[0]+"");
			
			for(int j=1; j<N; j++) {
				if (so < j) {
					res += j-so;
					so = j;
				}
				
				so += Integer.parseInt(c[j]+""); 
			}
			
			String rs = "Case #" + (i+1) + ": "+ res;
			System.out.println(rs);
			bw.write(rs + System.lineSeparator());
		}
		
		s.close();
		br.close();
		bw.close();					
	}

}
