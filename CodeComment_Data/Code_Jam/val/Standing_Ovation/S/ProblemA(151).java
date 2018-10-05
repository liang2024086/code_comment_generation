package methodEmbedding.Standing_Ovation.S.LYD2134;

import java.util.Formatter;
import java.util.Scanner;


public class ProblemA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Formatter format = new Formatter(System.out);
		int t = scanner.nextInt();
		for(int i=0;i<t;++i){
			int m = scanner.nextInt();
			String s = scanner.next();
			int added = 0;
			int currentCount = 0;
			for(int j=0;j<s.length();++j){
				int count = s.charAt(j) - '0';
				if(currentCount<j){
					added += j-currentCount;
					currentCount = j;
				}
				currentCount+=count;
			}
			format.format("Case #%d: %d%n", i+1, added);
		}
	}

}
