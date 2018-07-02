package methodEmbedding.Magic_Trick.S.LYD1187;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codejam2014A {

		public static void main(String[] args) throws IOException {
			BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
			String a0 = m.readLine();
			int t = Integer.parseInt(a0);
			int in = 0;

			while (in < t) {
				String out = "";
				int card = Integer.parseInt(m.readLine());
				String firstRow = "";
				for (int i = 1; i <= 4; i++) {
					String a1 = m.readLine();
					if (i == card) {
						firstRow = a1;
					}
				}
				
				int card2 = Integer.parseInt(m.readLine());
				String secondRow = "";
				for (int i = 1; i <= 4; i++) {
					String a1 = m.readLine();
					if (i == card2) {
						secondRow = a1;
					}
				}
			
				String [] a = firstRow.split(" ");
				String [] b = secondRow.split(" ");
				boolean boolFirst = true;
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < b.length; j++) {
						if (a[i].equals(b[j])) {
							if (boolFirst) {
								out +=a[i];
								boolFirst = false;
							} else {
								out = "Bad magician!";
								break;
							}
						}	
					}
				}
				if (out.isEmpty()) {
					out = "Volunteer cheated!";
				}
				System.out.println("Case #" + (in + 1) + ": " + out);
				in++;
			}

	}
}
