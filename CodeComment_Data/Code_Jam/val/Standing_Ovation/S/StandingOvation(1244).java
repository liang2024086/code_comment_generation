package methodEmbedding.Standing_Ovation.S.LYD1281;

import java.io.*;
import java.util.Scanner;


public class StandingOvation {
	public StandingOvation() {
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		for(int t = 1; t<=tests; t++){
			int n = in.nextInt();
			String ln = in.next();
			int ans = 0;
			int standing = 0;
			for(int i = 0; i<=n; i++){
				int cnt = ln.charAt(i)-'0';
				if(standing < i){
					ans += i-standing;
					standing = i;
				}
				standing += cnt;
			}
			System.out.printf("Case #%d: %d\n", t, ans);
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream(new File("A-small-attempt0.in")));
		System.setOut(new PrintStream(new File("A-small-attempt0.out")));
		new StandingOvation();
	}
}
