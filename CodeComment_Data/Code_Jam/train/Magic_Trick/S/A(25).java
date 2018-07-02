package methodEmbedding.Magic_Trick.S.LYD887;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A {
	
	// sorry... bad code. im tired
	
	public static void main(String[] args) throws Exception {
		int[] escolhidos = new int[4];
		int[] igual = new int[4];
		int[][] m = new int[4][4];
		
		BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
		File file = new File("out");
		file.createNewFile();
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( file) ));
		int T = Integer.parseInt(r.readLine());
		for (int i = 0; i < T; i++) {
			int e1 = Integer.parseInt(r.readLine());
			for (int j = 0; j < 4; j++) {
				String line = r.readLine();
				String[] split = line.split(" ");
				for (int k = 0; k < split.length; k++) {
					m[j][k] = Integer.parseInt(split[k]);
				}
			}
			escolhidos = Arrays.copyOf(m[e1-1], 4);

			int e2 = Integer.parseInt(r.readLine());
			for (int j = 0; j < 4; j++) {
				String line = r.readLine();
				if (j == e2 -1) {
					String[] split = line.split(" ");
					int qw = 0;
					for (int k = 0; k < split.length; k++) {
						 int r2 = Integer.parseInt(split[k]);
						 for (int l = 0; l < escolhidos.length; l++) {
							if (r2 == escolhidos[l])
								igual[qw++] = r2;
						}
					}
				}
			}
			
			int iii = 0;
			for (int j = 0; j < igual.length; j++) {
				if (igual[j] > 0) iii++;
			}

			
			
			if (iii ==0) {
				w.write("Case #" + (i +1) +": Volunteer cheated!\n");
			} else if (iii > 1) {
				w.write("Case #" + (i +1) +": Bad magician!\n");
			} else {
				w.write("Case #" + (i +1) +": " + igual[0] + "\n");
			}

			for (int j = 0; j < escolhidos.length; j++) {
				escolhidos[j] = 0;
				igual[j] = 0;
			}
		}
		w.flush();
	}

}
