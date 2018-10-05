package methodEmbedding.Counting_Sheep.S.LYD597;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSheep {

	private static Map<Integer, Boolean> digiMap;
	private static Scanner sc;

	static {

		sc = new Scanner(System.in);
		digiMap = new HashMap<Integer, Boolean>();
		for (int i = 0; i < 10; i++)
			digiMap.put(i, false);

	}

	public static void main(String[] args) {

		int T, cnt = 2;
		String N,N2;

		T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			N2=N = sc.next();
     		if(N.equals("0")){
				System.out.println("Case #"+i+": "+"INSOMNIA");
			}else
			while (digiMap.containsValue(false)) {

				char[] c = N2.toCharArray();
				int[] d = new int[c.length];
				// convert string to int array
				for (int k = 0; k < c.length; k++)
					d[k] = Integer.parseInt(c[k] + "");

				for (int k : d)
					if (!digiMap.get(k))
						digiMap.put(k, true);

				if (!digiMap.containsValue(false)) {
					System.out.println("Case #" + i + ": " + N2);
					cnt = 2;
					break;
				}else{
						N2 = (Integer.parseInt(N)*cnt++)+"";
				}
			}
			for (int a = 0; a < 10; a++)
				digiMap.put(a, false);
			
		}
		sc.close();
	}
}
