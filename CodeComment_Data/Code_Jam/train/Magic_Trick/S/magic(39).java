package methodEmbedding.Magic_Trick.S.LYD1098;

import java.util.StringTokenizer;
import java.util.Scanner;
public class magic {
	public static void main(String[] args) {
		int counter;
		int row;
		int guess = 0;
		int cheat;
		int number;
		StringTokenizer st;
		int[] numbers = new int[4];
		String text;
		Scanner scan = new Scanner(System.in);
		
		counter = Integer.parseInt(scan.nextLine());
		
		for (int i=1; i<= counter; i++) {
			cheat = 0;
			row = Integer.parseInt(scan.nextLine());
			for (int j=1; j<row; j++){
				scan.nextLine();
			}
			text = scan.nextLine();
			for (int j=row; j<4; j++){
				scan.nextLine();
			}
			st = new StringTokenizer(text);
			for (int j=0; j<4; j++) {
				numbers[j] = Integer.parseInt(st.nextToken());
			}
			
			//second step
			row = Integer.parseInt(scan.nextLine());
			for (int j=1; j<row; j++){
				scan.nextLine();
			}
			text = scan.nextLine();
			for (int j=row; j<4; j++){
				scan.nextLine();
			}
			st = new StringTokenizer(text);
			for (int j=0; j<4; j++) {
				number = Integer.parseInt(st.nextToken());
				for (int k =0; k<4; k++) {
					if (numbers[k] == number) {
						cheat++;
						guess = number;
					}
				}
			}
			
			switch(cheat){
				case 0:System.out.println("Case #" + i + ": Volunteer cheated!");
				break;
				case 1:System.out.println("Case #" + i + ": " + guess);
				break;
				default:System.out.println("Case #" + i + ": Bad magician!");
				break;
			}
		}
	}
}
