package methodEmbedding.Counting_Sheep.S.LYD1294;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ts = 1; ts <= t; ts++) {
			int n = s.nextInt();
			String res = "INSOMNIA";
			if (n != 0) {
				Map<Character, Boolean> map = new HashMap<Character, Boolean>();
				for (int i = 1; i < 1000000; i++) {
					long r = n * i;
					String str = String.valueOf(r);
					for (int j = 0; j < str.length(); j++) {
						map.put(str.charAt(j), true);
					}
					if (map.size() == 10) {
						res = str;
						break;
					}
				}
			}
			System.out.println("Case #"+ts+": "+res);
		}
	}

}
