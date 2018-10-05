package methodEmbedding.Magic_Trick.S.LYD787;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String as[]) {

		int T, first, second;
		List<Integer> firstList = new ArrayList<Integer>();
		List<Integer> secondList = new ArrayList<Integer>();

		try {
			Scanner sc = new Scanner(System.in);
			T = sc.nextInt();
			String s[] = new String[T];
			for (int i = 0; i < T; i++) {
				firstList.clear();
				secondList.clear();
				first = sc.nextInt();
				for (int j = 0; j < 16; j++) {
					int N = sc.nextInt();
					if (j >= (first - 1) * 4 && j < first * 4)
						firstList.add(N);
					
				}
				second = sc.nextInt();
				for (int j = 0; j < 16; j++) {
					int N = sc.nextInt();
					if (j >= (second - 1) * 4 && j < second * 4)
						secondList.add(N);
					
				}

				//
				int flag = 0;
				int value = 0;
				for (int j = 0; j < 4; j++) {
					if (firstList.contains(secondList.get(j))) {
						flag++;
						value = secondList.get(j);
					}
				}
				if (flag == 0) {
					s[i] = "Volunteer cheated!";
				} else if (flag == 1) {
					s[i] = String.valueOf(value);
				} else {
					s[i] = "Bad magician!";
				}

			}
			
			for(int i=0;i<T;i++){
				System.out.println("Case #"+(i+1)+": "+s[i]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
