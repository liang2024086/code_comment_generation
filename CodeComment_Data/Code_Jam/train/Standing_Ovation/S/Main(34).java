package methodEmbedding.Standing_Ovation.S.LYD949;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("1.txt"));
		FileWriter writer = new FileWriter("2.txt");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0 ; i < n; i++) {
			int numOfPeople = scanner.nextInt();
			String shyness = scanner.nextLine().substring(1);
			//System.out.println(numOfPeople + " " + shyness);
			int counter = 0;
			int result = 0;
			for (int j = 0; j < shyness.length(); j++) {
				int value = shyness.charAt(j) - '0';
				if (value > 0 && counter < j) {
					//System.out.println(j + " " + value + " " + counter);
					result += j - counter;
					counter += j - counter;
				}
				//System.out.println(counter);
				counter += value;
				//System.out.println(counter);
				//System.out.println(j + " " + value + " " + counter);
			}
			System.out.println(result);
			writer.write("Case #" + (i + 1) + ": " + result + "\n");
		}
		writer.close();
		scanner.close();
	}

}
