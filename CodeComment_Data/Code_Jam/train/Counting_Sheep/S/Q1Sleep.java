package methodEmbedding.Counting_Sheep.S.LYD1623;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import com.google.common.collect.Sets;

public class Q1Sleep {

	public static String INSOMNIA = "INSOMNIA";
	
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("input.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
			int testCases = Integer.valueOf(reader.readLine());
			for (int i = 0; i < testCases; i++) {
				Set<Character> numberSet = Sets.newHashSet('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
				writer.write(String.format("Case #%d: ", i+1));
				int number = Integer.valueOf(reader.readLine());
				if (number == 0) {
					writer.write(INSOMNIA + "\n");
				} else {
					int j = 1;
					String curNum = "";
					while (!numberSet.isEmpty()) {
						curNum = String.valueOf(number * j);
						for (int k = 0; k < curNum.length(); k++) {
							numberSet.remove(curNum.charAt(k));
						}
						j++;
					}
					writer.write(curNum + "\n");
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Finished!");
	}
}
