package methodEmbedding.Counting_Sheep.S.LYD669;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class Counting_Sheep {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(
				"/Users/SISQUAKE/workspace/code_jam/input/test_1.txt");

		BufferedReader br = new BufferedReader(fr);
		int n;

		n = Integer.parseInt(br.readLine());

		HashSet<Long> check_list = new HashSet<Long>();
		for (int i = 1; i <= n; i++) {
			check_list.clear();
			long c = Long.parseLong(br.readLine());
			int round = 1;
			int[] num = new int[10];
			int testEnd;
			long number, count;
			while (true) {
				count = c * round;
				number = count;
				while (number > 0) {
					num[(int) (number % 10)] = 1;
					number = number / 10;
				}
				if (check_list.contains(count)) {
					System.out.println("Case #" + i + ": " + "INSOMNIA");
					break;
				}
				testEnd = 0;
				for (int check : num) {
					testEnd += check;
				}

				if (testEnd == 10) {
					System.out.println("Case #" + i + ": " + count);
					break;
				}
				round++;
				check_list.add(count);

			}

		}
		fr.close();

	}
}
