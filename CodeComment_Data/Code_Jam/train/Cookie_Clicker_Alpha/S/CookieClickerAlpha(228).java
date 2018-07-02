package methodEmbedding.Cookie_Clicker_Alpha.S.LYD902;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader(
					"src/io/input.txt");
			FileWriter fw = new FileWriter(
					"src/io/output.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				String l = br.readLine();
				String[] la = l.split(" ");
				double c = Double.parseDouble(la[0]);
				double f = Double.parseDouble(la[1]);
				double x = Double.parseDouble(la[2]);
				System.out.println("C >> " + c);
				System.out.println("F >> " + f);
				System.out.println("X >> " + x);
				double de = 2, s = 0, a = x / 2, b;
				while (true) {
					b = x / de;
					if(s + b > a) break;
					else {
						a = s + b;
						s += c / de;
						de += f;
					}
				}
				System.out.println(a);
				bw.write("Case #" + (i+1) + ": " + a + "\n");
			}
			bw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
