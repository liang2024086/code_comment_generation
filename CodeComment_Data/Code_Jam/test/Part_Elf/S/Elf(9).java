package method_new_test.Part_Elf.S.LYD51;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class Elf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rounds = in.nextInt();
		for (int i = 1; i <= rounds; i++) {
			// TODO write code
			String s1[] = in.next().split("/");
			int p = Integer.parseInt(s1[0]);
			//BigInteger p = BigInteger.valueOf(in.nextInt());
			int q = Integer.parseInt(s1[1]);
			BigDecimal fraction;
			try{
				fraction = new BigDecimal(p).divide(new BigDecimal(q));
			}catch (ArithmeticException e) {
				System.out.print("Case #"+i+": ");
				System.out.print("impossible");
				// TODO write formatted output
				System.out.println();
				continue;
			}
			int count=0;
			BigDecimal d=new BigDecimal(1);
			while (d.compareTo(fraction)>0){
				if(count>40) {
					System.out.print("Case #"+i+": ");
					System.out.print("impossible");
					// TODO write formatted output
					System.out.println();
					continue;
				}
				d=d.divide(new BigDecimal(2));
				count++;
			}
			
			System.out.print("Case #"+i+": ");
			System.out.print(count);
			// TODO write formatted output
			System.out.println();
		}
	}

}
