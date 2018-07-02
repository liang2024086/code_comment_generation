package methodEmbedding.Cookie_Clicker_Alpha.S.LYD488;

import java.io.*;
import java.math.*;

public class Main{
	
	private static final BigDecimal TWO = new BigDecimal(2);
	static{
		TWO.setScale(20);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(in.readLine());
		for (int tn = 1; tn <= cases; ++tn){
			String line = in.readLine();
			String[] parts = line.split(" ");
			
			BigDecimal c = new BigDecimal(parts[0]);
			BigDecimal f = new BigDecimal(parts[1]);
			BigDecimal x = new BigDecimal(parts[2]);
			
			c.setScale(20);
			f.setScale(20);
			x.setScale(20);
			
			System.out.printf("Case #%d: ", tn);
			
			BigDecimal n = new BigDecimal(1);
			n.setScale(20);
			BigDecimal t = x.divide(TWO);
			while (true){
				BigDecimal d =
					x.divide(TWO.add(f.multiply(n)), 20, BigDecimal.ROUND_HALF_UP)
					.add(c.subtract(x).divide(TWO.add(f.multiply(n.subtract(BigDecimal.ONE))), 20, BigDecimal.ROUND_HALF_UP));
				
				if (d.compareTo(BigDecimal.ZERO) > 0)
					break;
				
				t = t.add(d);
				n = n.add(BigDecimal.ONE);
			}
			
			System.out.println(t.toPlainString());
		}
		
	}

}
