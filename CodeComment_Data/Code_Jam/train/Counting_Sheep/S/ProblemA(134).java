package methodEmbedding.Counting_Sheep.S.LYD31;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new FileInputStream(new File("A-small-attempt0.in")));
		
		int T = scan.nextInt();
		String guide = "0123456789";
		
		for (int t=1; t<=T; t++) {
			char[] check = new char[10];
			
			BigInteger N = scan.nextBigInteger();
			BigInteger i = BigInteger.ONE;

			// naming N, 2xN, ...
			String finalResult = "";
			while ( !guide.equals(new String(check))) {
				BigInteger name = N.multiply(i);
				String result = name.toString();
				if (result.equals(finalResult)) {
					finalResult = "INSOMNIA";
					break;
				} else {
					finalResult = result;
				}
				for (int d = 0; d<result.length(); d++) {
					check[Integer.parseInt(""+result.charAt(d))] = result.charAt(d);
				}
				i = i.add(BigInteger.ONE);
			}
			
			System.out.println(String.format("Case #%d: %s",t,finalResult));
		}
		
		scan.close();
	}
}
