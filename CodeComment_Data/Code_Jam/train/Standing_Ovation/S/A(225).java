package methodEmbedding.Standing_Ovation.S.LYD1678;

import java.util.*;

public class A {
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	int nCase = scanner.nextInt();
	
	for (int nc = 1; nc <= nCase; nc++) {
		int smax = scanner.nextInt();
		String sms = scanner.next();
		int[] audience = new int[smax+1];
		for (int i = 0; i <= smax; i++)
			audience[i] = sms.charAt(i) - '0';
		
		int ans = 0;
		int stand = audience[0];
		for (int i = 1; i <= smax; i++) {
			if (audience[i] > 0 && stand < i) {
				ans += (i - stand);
				stand += (i - stand);
			}
			stand += audience[i];
		}
		System.out.println("Case #" + nc + ": " + ans);
	}
}
}
