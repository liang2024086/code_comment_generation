package method_new_test.Part_Elf.S.LYD100;

import java.math.BigInteger;
import java.util.Scanner;


public class A_1C {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		in.nextLine();
		
		for (int caseno = 1; caseno <= tc; caseno++)
		{
			String line = in.nextLine();
			String[] fracStr = line.split("/");
			long p = Long.parseLong(fracStr[0]),
				 q = Long.parseLong(fracStr[1]);
			
			long gcd = BigInteger.valueOf(p).gcd(BigInteger.valueOf(q)).longValue();
			p /= gcd;
			q /= gcd;
			
			int count = 0;
			while (q % 2 == 0)
			{
				if (p < q)
				{
					count++;
				}
				q /= 2;
			}
			if (q != 1)
			{
				System.out.println("Case #" + caseno + ": impossible");
			}
			else
			{

				System.out.println("Case #" + caseno + ": " + count);
			}		
		}
	}
}
