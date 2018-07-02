package methodEmbedding.Counting_Sheep.S.LYD650;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Frist {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.next();
		int time =1;
		while (s.hasNextInt()) {
			int t = s.nextInt();
			int count = 1;
			if (t != 0) {
				String r = t + "";
				Set set = new HashSet<>();

				for (char e : r.toCharArray()) {
					set.add(e);
				}
				//System.out.println(set.toString());
				while (set.size() < 10) {
					count++;
					t = count * t/(count-1);
					//System.out.println(t);
					r = t + "";
					for (char e : r.toCharArray()) {
						set.add(e);
					}
					//System.out.println(set.toString());
				}
				System.out.println("Case"+"  #"+time+ ": "+t);

			} else {
				System.out.println("Case"+"  #"+time+ ": "+"INSOMNIA");
			}
			time++;
		}
	}
}
