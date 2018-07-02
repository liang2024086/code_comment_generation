package methodEmbedding.Standing_Ovation.S.LYD2056;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			OutputStream fout = new FileOutputStream("out.txt");
			String str = br.readLine();
			int t = Integer.parseInt(str);
			for (int T = 1; T <= t; T++) {
				str = br.readLine();
				int bl = str.indexOf(' ');
				int n = Integer.parseInt(str.substring(0, bl));
				char[] ch = str.substring(bl + 1).toCharArray();
				str = "Case #" + T + ": ";
				int p = ch[0] - 48, ans = 0;
				for (int i = 1; i <= n; i++) {
					if (ch[i] != '0') {
						if (p >= i) {
							p += (ch[i] - 48);
						} else {
							ans += (i - p);
							p = i + ch[i] - 48;
						}
					}
				}
				str += ans;
				str += "\n";
				System.out.print(str);
				fout.write(str.getBytes());
			}
			fout.flush();
			fout.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
