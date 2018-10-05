package methodEmbedding.Counting_Sheep.S.LYD361;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class CountingSheep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = Integer.parseInt(sc.nextLine());
		Set<Integer> set = new HashSet<>();
		IntStream.range(0, total).forEach(t -> {
			int n = Integer.parseInt(sc.nextLine());
			if (n < 1) {
				System.out.println("Case #" + (t + 1) + ": " + "INSOMNIA");
			} else {
				int x = 1;
				while (true) {
					int a = n * x++;
					while (a > 0) {
						set.add(a % 10);
						a = a / 10;
					}
					if (set.size() == 10) {
						System.out.println("Case #" + (t + 1) + ": " + n * (x - 1));
						break;
					}
				}
				set.clear();
			}
		});
	}
}
