package methodEmbedding.Magic_Trick.S.LYD1848;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class a1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			Scanner kb = new Scanner(new File("A-small-attempt1.in"));
			int testcase = kb.nextInt();
			for(int i = 0; i < testcase; i++) {
				int vol_choose_first = kb.nextInt();
				int[] first = new int[4];
				int temp = 0;
				for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						if(j == vol_choose_first-1) {
							first[k] = kb.nextInt();
						} else {
							temp = kb.nextInt();
						}
					}
				}
				
				int vol_choose_secound = kb.nextInt();
				int check = 0;
				int answer = 0;
				for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						if(j == vol_choose_secound-1) {
							temp = kb.nextInt();
							for(int m = 0; m < 4; m++) {
								if(first[m] == temp) {
									answer = temp;
									check++;
								}
							}
						} else {
							temp = kb.nextInt();
						}
					}
				}
				
				if(check == 0) {
					System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
				} else if(check == 1) {
					System.out.println("Case #" + (i+1) + ": " + answer);
				} else {
					System.out.println("Case #" + (i+1) + ": Bad magician!");
				}
			}
	}

}
