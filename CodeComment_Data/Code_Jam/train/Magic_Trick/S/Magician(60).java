package methodEmbedding.Magic_Trick.S.LYD603;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class Magician {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("test.txt"));
		FileWriter writer = new FileWriter(new File("result.txt"));
		String ss = scanner.nextLine();
		int numOfCases = Integer.parseInt(ss);
		for (int i = 0; i < numOfCases; i++) {
			int firstRow = Integer.parseInt(scanner.nextLine());
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				String line = scanner.nextLine();
				if (j == firstRow - 1) {
					String[] nums = line.split(" ");
					for (String s : nums) {
						set.add(Integer.parseInt(s));
					}
				}
			}
			int secondRow = Integer.parseInt(scanner.nextLine());
			HashSet<Integer> set2 = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				String line = scanner.nextLine();
				if (j == secondRow - 1) {
					String[] nums = line.split(" ");
					for (String s : nums) {
						int value = Integer.parseInt(s);
						if (set.contains(value)) {
							set2.add(value);
						}
					}
				}
			}
			System.out.println(set2.size());
			writer.write("Case #" + (i + 1 ) + ": ");
			if (set2.size() == 1) {
				writer.write(set2.iterator().next() + "\n");
			} else if (set2.size() > 1) {
				writer.write("Bad magician!\n");
			} else {
				writer.write("Volunteer cheated!\n");
			}
		}
		writer.close();
		scanner.close();
	}

}
