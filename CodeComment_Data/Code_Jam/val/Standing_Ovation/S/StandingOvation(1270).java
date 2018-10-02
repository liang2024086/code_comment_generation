package methodEmbedding.Standing_Ovation.S.LYD703;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class StandingOvation {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new FileReader("ovation.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ovation.out")));
		int n = Integer.parseInt(buf.readLine());
		for(int i = 0; i < n; i++){
			String[] s = buf.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			String b = s[1];
			int sum = 0;
			int ans = 0;
			for(int j = 0; j <= a; j++){
				sum = sum + Character.getNumericValue(b.charAt(j));
				if(sum > 0) sum--;
				else ans++;
			}
			out.println("Case #" + (i+1) + ": " + ans);
		}
		buf.close();
		out.close();
	}
}
