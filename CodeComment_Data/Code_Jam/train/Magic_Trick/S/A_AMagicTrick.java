package methodEmbedding.Magic_Trick.S.LYD609;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringBuilder;
public class A_AMagicTrick
{
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder(2000);
		try(BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"))) {
			int T = Integer.parseInt(br.readLine());
			for (int t = 1; t <= T; t++) {
				// First question
				String[] f = new String[4];
				int row = Integer.parseInt(br.readLine());
				for (int r = 1; r <= 4; r++) {
					if (r == row) {
						f = br.readLine().split(" ");
					}
					else {
						br.readLine(); // Don't bother saving result
					}
				}
				// Second question
				String[] s = new String[4];
				row = Integer.parseInt(br.readLine());
				for (int r = 1; r <= 4; r++) {
					if (r == row) {
						s = br.readLine().split(" ");
					}
					else {
						br.readLine(); // Don't bother saving result
					}
				}
				
				String y = "";
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
//						System.err.println("f.length = " + f.length + ", s.length = " + s.length);
						if (f[i].equals(s[j])){
							if (y.equals(""))
								y = f[i];
							else
								y = "Bad magician!";
						}
					}
				}
				if (y.equals(""))
					y = "Volunteer cheated!";
				
				sb.append("Case #");
				sb.append(t);
				sb.append(": ");
				sb.append(y);
				sb.append(System.getProperty("line.separator"));
			}
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
			bw.write(sb.toString());
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
