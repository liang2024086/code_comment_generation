package methodEmbedding.Magic_Trick.S.LYD1291;

import java.util.*;
public class Magic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y; int count; int answer; int k;

		for (int i = 0; i < x; i ++) {
			int[] array = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0};
			count = 0; answer = -1;
				y = scanner.nextInt();
				scanner.nextLine();
				for (int j = 0; j < y-1; j++) {
					String s = scanner.nextLine();
				}

				array[scanner.nextInt()] = 1;
				array[scanner.nextInt()] = 1;
				array[scanner.nextInt()] = 1;
				array[scanner.nextInt()] = 1;

				scanner.nextLine();
				for (int j = y; j < 4; j++) {
					String s = scanner.nextLine();
				}

				y = scanner.nextInt();

				scanner.nextLine();
				for (int j = 0; j < y-1; j++) {
					scanner.nextLine();
				}

				k = scanner.nextInt();

				if (array[k] == 1) {
					count++;
					answer = k; 
				}

				k = scanner.nextInt();

				if (array[k] == 1) {
					count++;
					answer = k;
				}

				k = scanner.nextInt();

				if (array[k] == 1) {
					count++;
					answer = k;
				}

				k = scanner.nextInt();

				if (array[k] == 1) {
					count++;
					answer = k;
				}

				if (count == 0) {
					System.out.println("Case #"+(i+1) + ": Volunteer cheated!");
				} else if (count == 1) {
					System.out.println("Case #"+(i+1) + ": " + answer);
				} else {
					System.out.println("Case #"+(i+1) + ": Bad magician!");
				}

				scanner.nextLine();
				for (int j = y; j < 4; j++) {
					scanner.nextLine();
				}
		}

	}
}
