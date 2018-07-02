package methodEmbedding.Counting_Sheep.S.LYD789;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class countingSheep {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int length = scanner.nextInt();
		for (int i = 0; i < length; i++)
			numbers.add(scanner.nextInt());
		ArrayList<Integer> answers = new ArrayList<Integer>();
		HashSet<Integer> digits = new HashSet<>();
		for (int i = 0; i < length; i++){
			int number = numbers.get(i);
			if (number == 0){
				answers.add(0);
			}
			 else {
							while (digits.size() != 10) {
								int temp = number;
								while (temp > 0) {
									digits.add(temp % 10);
									temp = temp / 10;
								}
								number += numbers.get(i);
							}
							answers.add(number - numbers.get(i));
							digits.clear();
						}
		}
		for (int i = 0; i < length; i++){
			int num = i+1;
			if (answers.get(i) == 0)
				System.out.println("Case #" + num + ": INSOMNIA");
			else {
				System.out.println("Case #" + num + ": " + answers.get(i));
			}
		}
	}
}
