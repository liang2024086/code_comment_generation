package methodEmbedding.Standing_Ovation.S.LYD130;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("QualificationRound2015//A.in"));
		System.setOut(new PrintStream("QualificationRound2015//A.out"));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++){
			System.out.print(String.format("Case #%d: ",t));
			String tmp[] = br.readLine().trim().split("\\s+");
			int l = Integer.parseInt(tmp[0]);
			String s = tmp[1];
			int ans = 0;
			int count = 0;
			for (int i = 0 ; i <= l ; i++){
				if (count < i) {
					ans += i-count;
					count = i;
				}
				count += s.charAt(i)-'0';
			}
			System.out.println(ans);
		}
	}

}
