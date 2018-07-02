package methodEmbedding.Counting_Sheep.S.LYD1528;


import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int t = in.nextInt();  

		for (int i = 0; i < t; i++) {
			String[] ps = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
			ArrayList<String> s = new ArrayList<String>(Arrays.asList(ps));
			int n = in.nextInt();
			int j = 1;
			int k = n;

			if (n == 0 || n > 201) {
				System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
			} else {
				while (s.size() > 0) {
					k = j * n;

					String o = Integer.toString(k);
					String[] l = o.split("");
					 
					for (int v = 0; v < l.length; v++) {
						for (int m = 0; m < s.size(); m++) {
							if (l[v].equals(s.get(m))) {
								 s.remove(m);								 
								break;
							}
						}
					}
					j++;
				}
				System.out.println("Case #" + (i + 1) + ": " + k);

			}
		}

	}
}
