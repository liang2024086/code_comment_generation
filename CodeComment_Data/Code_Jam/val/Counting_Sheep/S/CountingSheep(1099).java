package methodEmbedding.Counting_Sheep.S.LYD1431;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader(new File("C:\\Users\\WHZZ\\Desktop\\A-small-attempt0.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				new File("C:\\Users\\WHZZ\\Desktop\\answer.txt")));
		String s = br.readLine();
		int T = Integer.valueOf(s);
		for (int i = 0; i < T; i++) {
			long num = Long.valueOf(br.readLine());
			long c = num * 100, index = 1;
			Set<Long> set = new HashSet<>();
			boolean found = false;
			if (num == 0) {
				System.out.println("INSOMNIA");
				bw.write("Case #" + (i + 1) + ": " + "INSOMNIA\n");
				continue;
			}
			while (i < c) {
				long n = num * index;
				long curr = n;
				while (n > 0) {
					long d = n / 10;
					long k = n - d * 10;
					set.add(k);
					if (set.size() == 10) {
						found = true;
						break;
					}
					n = d;
				}
				if (found) {
					System.out.println(curr);
					bw.write("Case #" + (i + 1) + ": " + curr + "\n");
					break;
				}
				index++;
			}
			if (!found) {
				System.out.println("INSOMNIA");
				bw.write("Case #" + (i + 1) + ": " + "INSOMNIA\n");
			}
		}
		bw.close();
	}

}
