package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1310;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CookieClickerAlphaGamer {
    public static void main(String[] args) {
		try {
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			int numTestCases = Integer.parseInt(inputReader.readLine());
			NumberFormat format = new DecimalFormat("0.0000000");
			for(int i = 1; i <= numTestCases; i++) {
				String[] line = inputReader.readLine().split(" ");
				double r = 2.0;
				double c = Double.parseDouble(line[0]);
				double f = Double.parseDouble(line[1]);
				double x = Double.parseDouble(line[2]);
				
				double tc1 = 0;
				double tc2 = 0;
				double tfc1 = 0;
				double tfc2 = 0;
				double j = 0;
				while((tfc1 = x / (r + j * f)) > ((tfc2 = x / (r + (j + 1) * f)) + (tc2 = c / (r + j * f)))) {
					tc1 += tc2;
					j++;
				}
				tfc1 += tc1;
				System.out.println("Case #" + i + ": " + format.format(tfc1));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
