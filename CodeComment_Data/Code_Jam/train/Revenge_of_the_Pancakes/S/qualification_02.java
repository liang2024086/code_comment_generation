package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1009;

import java.util.Scanner;


public class qualification_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		T = scan.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0;
			String str;
			do {
				str = scan.nextLine();
			} while (str.trim().equals(""));
			int arr[] = new int[str.length()];
			for(int i=0;i<str.length();i++) {
				if (str.charAt(i) == '-') {
					arr[i] = 0;
				} else {
					arr[i] = 1;
				}
				//System.out.print(arr[i]);
			}
			//System.out.println("");
			int prev = arr[0];
			for (int i=1;i<str.length();i++) {
				int cur = arr[i];
				if (cur != prev) {
					cnt++;
					for(int j=0;j<i;j++) {
						arr[j] = 1 - arr[j];
					}
				}
				prev = cur;
			}
			
//			for(int i=0;i<str.length();i++) {
//				System.out.print(arr[i]);
//			}
			if (arr[0] == 0) {
				cnt++;
			}
			
			System.out.println("Case #" + tc + ": " + cnt);
		}

	}

}
