package methodEmbedding.Counting_Sheep.S.LYD1380;

import java.util.Scanner;


public class CountingSheep {

	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		final int testsCount = scan.nextInt();
		
		for (int i = 1; i <= testsCount; i++) {
			int n = scan.nextInt();
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			String seenDigits = "0123456789";
			int multiplier = 1;
			while (true) {
				String number = String.valueOf(multiplier++*n);
				for (int j = 0; j < number.length(); j++) {
					seenDigits = seenDigits.replace(number.charAt(j), 'S');
				}
				if (seenDigits.equals("SSSSSSSSSS")) {
					System.out.println("Case #" + i + ": " + number);
					break;
				}
			}
		}
	}
}
