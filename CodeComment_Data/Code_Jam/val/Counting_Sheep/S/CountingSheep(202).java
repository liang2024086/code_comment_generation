package methodEmbedding.Counting_Sheep.S.LYD751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingSheep {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		List<String> out = new ArrayList<>();
		int T = Integer.parseInt(stdin.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(stdin.readLine());
			if (N == 0) {
				out.add("INSOMNIA");
			} else {
				int x = 0;
				Set<Integer> digits = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.toSet());
				Set<Integer> set = new HashSet<>();
				while (!set.containsAll(digits)) {
					x += N;
					int d = x;
					while (d > 0) {
						set.add(d % 10);
						d /= 10;
					}
				}
				out.add(Integer.toString(x));
			}
		}
		for (int i = 0; i < T; i++) {
			System.out.println("Case #" + (i + 1) + ": " + out.get(i));
		}
	}
}
