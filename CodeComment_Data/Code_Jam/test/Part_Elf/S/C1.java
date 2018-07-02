package method_new_test.Part_Elf.S.LYD26;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C1 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Taghi\\Downloads\\A-small-attempt1.in");
		DataInputStream in2 = new DataInputStream(file);
		Scanner in = new Scanner(new InputStreamReader(in2));
		int numberOfTestCases = in.nextInt();

		in.nextLine();
		for (int i = 0; i < numberOfTestCases; i++) {
			String fraction = in.nextLine();
			double numerator = Double.valueOf(fraction.substring(0,
					fraction.indexOf("/")));
			double denominator = Double.valueOf(fraction.substring(fraction
					.indexOf("/") + 1));
			double number = numerator / denominator;
			
			if (Math.log(denominator)/Math.log(2) != Math.round(Math.log(denominator)/Math.log(2)))
				System.out.println("Case #" + (i+1) + ": impossible");
			// To solve it : First let`s check if denominator is power of 2. If
			// not, then there is a problem probabl
			// Solve the number of generations.
			// If n is the number of generations -> at nth level elfness is
			// [1/2,1]
			// Then, next child would be [1/4,1/2] and other parent can be [0,1]
			// So, their child could be [1/8,3/4] and other parent can be [0,1]

			// n-> [1/2,1]
			// n-1-> [1/4,1/2]
			else
			{
			int result = 1;
			while (number < Math.pow(0.5, result) && result <= 40)
				result++;
			if (result < 40)
				System.out.println("Case #" + (i + 1) + ": " + result);
			}

		}
	}

}
