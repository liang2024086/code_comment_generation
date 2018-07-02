package methodEmbedding.Revenge_of_the_Pancakes.S.LYD241;

import java.util.*;

public class Flip {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int cas = in.nextInt();
		in.nextLine();
		
		for(int i = 1; i <= cas; i++) {
			System.out.print("Case #" + i + ": ");
			String line = in.nextLine();
			int c = line.length();
			char arr[] = line.toCharArray();
			int lastUn = c-1;
			int flips = 0;
			while(arr[lastUn] == '+') {
				lastUn--;
				if(lastUn == -1) break;
			}
			while(lastUn >= 0) {
				if(arr[0] == '+') {
					//flip + prefix
					int j = 0;
					while(arr[j] == '+') {
						arr[j++] = '-';
					}
					flips++;
				} else {
					//flip up to unsolved
					for(int j = 0; j <= lastUn; j++) {
						arr[j] = arr[j] == '+' ? '-' : '+';
					}
					for(int j = 0; j < (lastUn+1)/2; j++) {
						char t = arr[j];
						arr[j] = arr[lastUn - j];
						arr[lastUn - j] = t;
					}
					//update lastUn
					while(arr[lastUn] == '+') {
						lastUn--;
						if(lastUn == -1) break;
					}
					flips++;
				}
			}
			System.out.println(flips);
		}
	}
}
