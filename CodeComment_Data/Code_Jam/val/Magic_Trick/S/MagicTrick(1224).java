package methodEmbedding.Magic_Trick.S.LYD1493;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MagicTrick {

	public static void main(String[] args) {
		try {
			FileInputStream fstream = new FileInputStream("in.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			FileWriter ofstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(ofstream);

			int t = Integer.parseInt(br.readLine());

			for (int i = 1; i <= t; ++i) {
				int[] c = new int[17];
				for (int cc = 1; cc <= 2; ++cc) {
					int l = Integer.parseInt(br.readLine());
					for (int j = 1; j <= 4; ++j) {
						String s = br.readLine();
						if (j == l) {
							StringTokenizer st = new StringTokenizer(s);
							while (st.hasMoreElements()) {
								++c[Integer.parseInt(st.nextToken())];
							}
						}
					}
				}
				int count = 0;
				int y = 0;
				for(int j=1;j<=16;++j) {
					if(c[j] == 2) {
						++count;
						y = j;
					}
				}
				
				if(count == 1) 
					out.write("Case #" + i + ": " + y + "\r\n");
				if(count == 0)
					out.write("Case #" + i + ": Volunteer cheated!\r\n");
				if(count > 1)
					out.write("Case #" + i + ": Bad magician!\r\n");
			}

			in.close();
			out.close();
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}

	}
}
