package methodEmbedding.Magic_Trick.S.LYD60;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("a.in"));;
		
		int times = sc.nextInt();
		for(int cu = 0; cu < times; cu++) {
			Set<Integer> possible = new HashSet<>();
			
			int r1 = sc.nextInt();
			sc.nextLine();
			for(int i = 1; i <= 4; i++) {
				if(r1 == i) {
					for(int b = 0; b < 4; b++) {
						possible.add(sc.nextInt());
					}
					sc.nextLine();
				} else {
					sc.nextLine();
				}
			}
			

			Set<Integer> possible2 = new HashSet<>();
			
			int r2 = sc.nextInt();
			sc.nextLine();
			for(int i = 1; i <= 4; i++) {
				if(r2 == i) {
					for(int b = 0; b < 4; b++) {
						possible2.add(sc.nextInt());
					}
					sc.nextLine();
				} else {
					sc.nextLine();
				}
			}
			
			possible.retainAll(possible2);
			
			System.out.print("Case #" + (cu+1) + ": "// + possible
					);
			if(possible.size() == 0) {
				System.out.println("Volunteer cheated!");
			} else if(possible.size() == 1) {
				System.out.println(possible.toArray()[0]);
			} else {
				System.out.println("Bad magician!");
			}
			
		}
	}

}
