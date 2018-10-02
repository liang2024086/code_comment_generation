package methodEmbedding.Standing_Ovation.S.LYD277;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemA {

	public ProblemA() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			for(int i=0; i<T; i++) {
				String line = br.readLine();
				String[] lines = line.split(" ");
				int Smax = Integer.parseInt(lines[0]);

				int clapper = 0;
				int add = 0;
				for(int j=0; j<Smax+1; j++) {

					if(clapper >= j) {
						clapper += Integer.parseInt(""+lines[1].charAt(j));
					} else if(lines[1].charAt(j) != '0') {
						int diff = j-clapper;
						add += diff;
						clapper += diff + Integer.parseInt(""+lines[1].charAt(j));
					}
					//System.out.println(j+" "+clapper+" "+add);
				}

				System.out.println("Case #"+(i+1)+": "+add);
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ProblemA();
	}
}
