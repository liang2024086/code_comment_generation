package methodEmbedding.Magic_Trick.S.LYD2055;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		//for each test
		for(int i = 0; i< t; i++) {
			//record the test number
			int x = i + 1;
			//get which row it's in
			int firstQ = Integer.parseInt(scan.nextLine());
			//skip through and only record the relevant row
			for(int j = 1; j < firstQ; j++) {
				scan.nextLine();
			}
			//make it an array
			String[] fl = scan.nextLine().split(" ");
			int[] intFl = new int [fl.length];
			for(int k = 0; k < intFl.length; k++) {
				intFl[k] = Integer.parseInt(fl[k]);
			}
			//skip through the unrecorded scans
			firstQ = 4 - firstQ;
			for(int l = 0; l < firstQ; l++) {
				scan.nextLine();
			}
			//record which row it's in after shuffle
			int secondQ = Integer.parseInt(scan.nextLine());
			//skip through unnecessary rows
			for(int j = 1; j < secondQ; j++) {
				scan.nextLine();
			}
			//record only the relevant row
			String[] sl = scan.nextLine().split(" ");
			int[] intSl = new int [4];
			for(int m = 0; m < intSl.length; m++) {
				intSl[m] = Integer.parseInt(sl[m]);
			}
			//skip through the unrecorded scans
			secondQ = 4 - secondQ;
			for(int l = 0; l < secondQ; l++) {
				scan.nextLine();
			}
			int y = 0;
			int count = 0;
			for (int a : intFl) {
				for (int b : intSl) {
					if (a == b) {
						count++;
						y = a;
				    }
				}
			}
			if (count == 1) {
				System.out.println("Case #" + x + ": " + y);
			}
			if(count > 1) {
				System.out.println("Case #" + x + ": Bad magician!");
				
			}
			if(y == 0) {
				System.out.println("Case #" + x + ": Volunteer cheated!");
			}
		}
		scan.close();
	}
}
