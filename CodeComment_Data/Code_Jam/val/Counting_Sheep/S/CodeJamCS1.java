package methodEmbedding.Counting_Sheep.S.LYD1661;

import java.io.BufferedReader;
import java.io.FileReader;

public class CodeJamCS1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prsangal\\Documents\\code\\ip.txt"));

		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; ++i) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
			} else {
				boolean i0 = false;
				boolean i1 = false;
				boolean i2 = false;
				boolean i3 = false;
				boolean i4 = false;
				boolean i5 = false;
				boolean i6 = false;
				boolean i7 = false;
				boolean i8 = false;
				boolean i9 = false;
				int orgN = n;
				String temp = "";
				while (!(i0 && i1 && i2 && i3 && i4 && i5 && i6 && i7 && i8 && i9)) {

					temp = Integer.toString(n);

					if (!i0 && temp.contains("0")) {
						i0 = true;
					}
					if (!i1 && temp.contains("1")) {
						i1 = true;
					}
					if (!i2 && temp.contains("2")) {
						i2 = true;
					}
					if (!i3 && temp.contains("3")) {
						i3 = true;
					}
					if (!i4 && temp.contains("4")) {
						i4 = true;
					}
					if (!i5 && temp.contains("5")) {
						i5 = true;
					}
					if (!i6 && temp.contains("6")) {
						i6 = true;
					}
					if (!i7 && temp.contains("7")) {
						i7 = true;
					}
					if (!i8 && temp.contains("8")) {
						i8 = true;
					}
					if (!i9 && temp.contains("9")) {
						i9 = true;
					}
					n = n + orgN;
				}
				System.out.println("Case #" + i + ": " + (n - orgN));
			}
		}

	}

}
