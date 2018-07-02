package methodEmbedding.Counting_Sheep.S.LYD769;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new FileInputStream("A-small-attempt0.in"));
		int T = s.nextInt();
		 for (int i = 1; i <= T; i++) {
			long N = s.nextInt();
			if(N==0){
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			boolean[] digit = new boolean[10];
			int count = 0;
			for (long m = 1; ; m++) {
				String val = (N * m) + "";
				for (char c : val.toCharArray()) {
					int idx = Integer.parseInt("" + c);
					if (!digit[idx]) {
						count++;
						digit[idx] = true;
					}
				}
				if (count == 10){
					System.out.println("Case #" + i + ": " + val);
					break;
				}
			}
		}
		s.close();
	}

}
