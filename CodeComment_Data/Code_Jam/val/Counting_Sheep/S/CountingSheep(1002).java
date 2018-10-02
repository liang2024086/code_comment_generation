package methodEmbedding.Counting_Sheep.S.LYD514;


import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {
	public static void main (String args[]) throws Exception {
		Scanner scanner = new Scanner(new File("/Users/perumalmani/Documents/workspace/perumal/Test/src/com/test/countingSheepInput.txt"));
		int [] input = new int [100000];
		int i = 0;
		while(scanner.hasNextInt())
		{
			input[i++] = scanner.nextInt();
		}
		int totalcase = input[0];
		int inputNumber, originalInputNumber, resultNumber;
		Set<Integer> digits = new HashSet<Integer>();
		for (i=1; i <= totalcase; i++) {
			inputNumber = input[i];
			originalInputNumber = inputNumber;
			for (int digit = 0; digit <10; digit++) {
				digits.add(digit);
			}
			for (int count = 1; count <= 1000000; count++) {
				inputNumber = count * originalInputNumber;
				resultNumber = inputNumber;
				while (inputNumber > 0) {
				    digits.remove(inputNumber%10);
				    inputNumber = inputNumber / 10;
				}
				if (digits.isEmpty()) {
					System.out.println("Case #"+i+": "+ resultNumber);
					break;
				}
				else if (originalInputNumber <= 0 || count > 1000000) {
					System.out.println("Case #"+i+": INSOMNIA");
					break;
				}
			}
		}
	}
}
