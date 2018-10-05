package methodEmbedding.Magic_Trick.S.LYD724;

import java.util.Scanner;
public class MagicTrick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int i = 0;
		int[][] array = new int[4][4];
		int[] magic1 = new int[4];
		int[] magic2 = new int[4];
		int count = 0, temp = 0;
		int choice1,choice2;
		while(i < t){
			count = 0;
			choice1 = scan.nextInt();
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array[j].length; k++) {
					array[j][k] = scan.nextInt();
				}
			}
			for (int j = 0; j < magic1.length; j++) {
				magic1[j] = array[choice1-1][j];
			}
			choice2 = scan.nextInt();
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array[j].length; k++) {
					array[j][k] = scan.nextInt();
				}
			}
			for (int j = 0; j < magic2.length; j++) {
				magic2[j] = array[choice2-1][j];
			}
			
			for (int j = 0; j < magic1.length; j++) {
				for (int k = 0; k < magic2.length; k++) {
					if(magic1[j] == magic2[k]){
						count++;
						temp = magic1[j];
					}	
				}
			}

			if(count == 1)
				System.out.println("Case #" + (i+1)+": " + temp );
			else if(count>1)
				System.out.println("Case #" + (i+1)+": Bad magician!" );
			else
				System.out.println("Case #" + (i+1)+": Volunteer cheated!" );
			i++;
		}
		
	}

}
