package methodEmbedding.Revenge_of_the_Pancakes.S.LYD220;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProblemB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.next();
		int time = 1;
		while (s.hasNext()) {
			String r = s.next();
			Set set = new HashSet<>();
			r = r.split("\\s+")[0];
			//System.out.println("imput" + r);
			char[] arr = r.toCharArray();
			int count = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] != arr[i + 1]) {
					// flip bits
					for (int j = 0; j < i + 1; j++) {
						arr[j] = arr[i + 1];

					}
					count++;
				}
			}
			for (char e : arr) {
				set.add(e);
			}
			//System.out.println(set.toString()+"set");
			if (set.contains('-')) {
				//System.out.println("hello");
				count++;
			}
			//System.out.println(arr);
			System.out.println("Case" + "  #" + time + ": " + count);
			time++;
		}
	}
}
