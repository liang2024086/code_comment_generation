package methodEmbedding.Cookie_Clicker_Alpha.S.LYD650;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CookieClickerAlpha {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input/input.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output/output.out"));
		int n = Integer.parseInt(br.readLine());
		String result = "";
		for(int i = 1; i <= n; i ++)
		{
			result = result + "Case #" + i + ": ";
			double rate = 2;
			double second = 0;
			String a = br.readLine();
			double c = Double.parseDouble(a.split(" ")[0]);
			double f = Double.parseDouble(a.split(" ")[1]);
			double x = Double.parseDouble(a.split(" ")[2]);
			while(true)
			{
				double rs = second + x / rate;
				double sec = c / rate;
				second = second + sec;
				rate = rate + f;
				if(second + x / rate < rs)
				{
					continue;
				}
				else
				{
					result = result + rs;
					break;
				}
			}
			if(i != n)
			{
				result = result + "\n";
			}
		}
		bw.write(result);
		br.close();
		bw.close();
	}
}



















