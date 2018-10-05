package methodEmbedding.Magic_Trick.S.LYD2217;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		int t = Integer.parseInt(scanner.next());
		int caseNum = 1;
		while(caseNum <= t) {
			boolean[] array = new boolean[17];
			int first = Integer.parseInt(scanner.next());
			int temp = 1;
			while(temp++ < first) {
				scanner.next();
				scanner.next();
				scanner.next();
				scanner.next();
			}
			array[Integer.parseInt(scanner.next())] = true;
			array[Integer.parseInt(scanner.next())] = true;
			array[Integer.parseInt(scanner.next())] = true;
			array[Integer.parseInt(scanner.next())] = true;
			while(++first <= 4) {
				scanner.next();
				scanner.next();
				scanner.next();
				scanner.next();
			}
			
			int second = scanner.nextInt();
			temp = 1;
			while(temp++ < second) {
				scanner.next();
				scanner.next();
				scanner.next();
				scanner.next();
			}
			int answer = 0;
			for(int i = 0; i < 4; i++) {
				int number = Integer.parseInt(scanner.next());
				if(array[number] == true) {
					if(answer == 0) {
						answer = number;
					}
					else {
						answer = -1;
					}
				}
			}
			while(++second <= 4) {
				scanner.next();
				scanner.next();
				scanner.next();
				scanner.next();
			}
			if(answer > 0) {
				System.out.println("Case #" + caseNum + ": " + answer);
			}
			else if(answer == 0) {
				System.out.println("Case #" + caseNum + ": Volunteer cheated!");
			}
			else {
				System.out.println("Case #" + caseNum + ": Bad magician!");
			}
			caseNum++;
		}
		scanner.close();
	}

}
