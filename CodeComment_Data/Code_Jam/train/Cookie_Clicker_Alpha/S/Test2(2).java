package methodEmbedding.Cookie_Clicker_Alpha.S.LYD37;


import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\prob2input.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				input.add(line.trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int numT = Integer.parseInt(input.get(0));
		for (int i = 1; i <= numT; i++) {
			ArrayList<String> vals1 = new ArrayList<String>(Arrays.asList(input.get(i).trim().split(" ")));
			double c = new BigDecimal(vals1.get(0)).doubleValue();
			double f = new BigDecimal(vals1.get(1)).doubleValue();
			double x = new BigDecimal(vals1.get(2)).doubleValue();
			
			double ans = 0.0;
			for (int n = 0; n > -1; n++) {
				double val1 = new BigDecimal(x/((n * f) + 2)).doubleValue();
				double val2 = new BigDecimal(c/((n * f) + 2)).doubleValue();
				double val3 = new BigDecimal(x/(((n+1) * f) + 2)).doubleValue();
				if (val1 > val2+val3) {
					ans = ans+val2;
				} else {
					ans = ans+val1;
					break;
				}
			}
			
			System.out.println("Case #"+i+": "+new BigDecimal(ans).setScale(7, RoundingMode.HALF_UP));
		}
		return;
	}
}
