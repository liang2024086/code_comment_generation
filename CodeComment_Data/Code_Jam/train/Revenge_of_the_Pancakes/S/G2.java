package methodEmbedding.Revenge_of_the_Pancakes.S.LYD968;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class G2 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\B-small-attempt0.in");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("D:\\B.out");
			BufferedWriter bw = new BufferedWriter(fw);
			String s = br.readLine();
			int t = Integer.parseInt(s);
			for (int i = 1; i <= t; i++)
			{
				s = br.readLine();
				int ans = 0;
				for (int j = 0; j < s.length() - 1; j++)
					if (s.charAt(j) != s.charAt(j + 1))
						ans++;
				if (s.charAt(s.length() - 1) == '-')
					ans++;
				bw.write("Case #" + i + ": " + ans + "\n");
			}
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
