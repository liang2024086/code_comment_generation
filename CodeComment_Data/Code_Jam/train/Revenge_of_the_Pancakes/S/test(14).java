package methodEmbedding.Revenge_of_the_Pancakes.S.LYD584;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pr = new PrintWriter(new File("output.txt"));
		int T = Integer.parseInt(br.readLine());
		int t = 1;

		while (T-- > 0) {
			int count = 0;
			char[] c = br.readLine().toCharArray();
			for (int i = c.length - 1; i>=0; i--) {
				if(c[i] == '-')
				{
					count++;
					for (int j = 0; j <= i; j++) {
						if(c[j] == '+')
							c[j] = '-';
						else
							c[j] = '+';
					}
				}
			}

			pr.printf("Case #%d: %d\n", t++, count);
		}

		pr.flush();
		pr.close();
	}
}
