package methodEmbedding.Counting_Sheep.S.LYD1234;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class CountingSheep {
	public static void main(String arg[]) throws IOException {
		int t = 1, T;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		File output = new File("Output1.txt");
		FileWriter fw = new FileWriter(output);
		int count, x;
		boolean numbers[];
		while (T-- != 0) {
			count = 0;
			x = 1;
			numbers = new boolean[10];
			String s = br.readLine();
			long original = Long.parseLong(s);

			long n = original;
			if (n == 0) {
				fw.write("Case #" + t + ": INSOMNIA\n");
				System.out.println("Case #" + t + ": INSOMNIA");
				t++;
				continue;
			}
			
//			System.err.println("For " + original);
			while (count < 10) {

				n = original * x;
				s = n + "";
				
				for (int i = 0; i <= s.length() - 1; i++) {
					if (!numbers[s.charAt(i) - 48]) {
						count++;
						numbers[s.charAt(i) - 48] = true;
					}
				}
				if (count == 10) {
					break;
				}
				x++;		
//				System.err.println(n + " " + x + " " + count);
			}
			
			fw.write("Case #" + t + ": " + n + "\n");
			System.out.println("Case #" + t + ": " + n);
			t++;
		}

		fw.close();
	}
}
