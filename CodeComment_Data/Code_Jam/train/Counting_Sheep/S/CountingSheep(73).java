package methodEmbedding.Counting_Sheep.S.LYD426;


import java.math.BigInteger;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String ... allgood) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int t = 1; t <= numCases; t++)
		{
			BigInteger n = input.nextBigInteger() ;  
			
			String a;
			
			if (n.equals(BigInteger.ZERO)) {
				a = "INSOMNIA";
			} else {
				StringBuilder map = new StringBuilder("          ");

				a = n.toString();
				for ( int i = 1 ; ! map.toString().equals("0123456789") ; i++ ) {
					a = n.multiply(BigInteger.valueOf(i)).toString();
					for ( int j = 0 ; j<a.length() ; j++) {
						char c = a.charAt(j);
						if ( c>=48 && c<=57) {
							map.setCharAt(c-48, c);
						}
					}
				}
			}
			
			System.out.println("Case #"+t+": "+a);
		}
	}
}
