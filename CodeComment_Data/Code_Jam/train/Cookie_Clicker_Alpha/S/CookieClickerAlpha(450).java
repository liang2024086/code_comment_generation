package methodEmbedding.Cookie_Clicker_Alpha.S.LYD144;


import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Scanner;

class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MathContext mc = new MathContext(10);
		
		int t = Integer.parseInt(s.nextLine());
		
		for (int i = 1; i <= t; ++i){
			// solve
			BigDecimal time = new BigDecimal(0);
			String[] inputs = s.nextLine().split(" ");
			BigDecimal c = new BigDecimal(inputs[0]);
			BigDecimal f = new BigDecimal(inputs[1]);
			BigDecimal x = new BigDecimal(inputs[2]);
			
			BigDecimal m = new BigDecimal("2");
			
			BigDecimal q = c.multiply(m);
			BigDecimal w = q.divide(f, mc);
			BigDecimal e = w.add(c);
			
			while (x.compareTo(c.multiply(m).divide(f, mc).add(c)) != -1){
				time = time.add(c.divide(m, mc));
				m = m.add(f);
			}

			time = time.add(x.divide(m, mc));

			System.out.println("Case #" + i + ": " + time.toString());
		}
		
		s.close();
	}
}
