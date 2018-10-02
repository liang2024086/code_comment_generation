package methodEmbedding.Counting_Sheep.S.LYD1084;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();
		Set<Long> numbersSeen = null;
		int result = 0;
		System.out.println();
		for (int i = 0; i < noOfTestCases; i++) {
			int num = s.nextInt(); 
			if (num == 0) {
				result = num;
			} else {
				numbersSeen = new HashSet<Long>();
				int j = 1;
				while(true) {

					long temp = num * j;
					while (temp > 0) {
						long digit = temp % 10;
						temp = temp / 10;
						//System.out.println("adding digit : "+digit);
						numbersSeen.add(digit);

					}
					if (numbersSeen.size() == 10) {
						result = num * j;
						break;
					}
					j++;
				}

			}
			
			System.out.println("Case #"+(i+1)+": "+((result == 0)? "INSOMNIA":result));
		}

	}

}
