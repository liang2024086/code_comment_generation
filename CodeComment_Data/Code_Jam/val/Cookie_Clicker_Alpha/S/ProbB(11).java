package methodEmbedding.Cookie_Clicker_Alpha.S.LYD525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;


/**
 * @author Paul LaMotte
 *
 */
public class ProbB {

	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream(new FileOutputStream("ProbB.out")));
			Scanner scan = new Scanner(new FileInputStream("ProbB.in"));
			int cases = Integer.parseInt(scan.nextLine());
			for (int l = 0; l < cases ; l++) {
				double cost = scan.nextDouble();
				double farmRate = scan.nextDouble();
				double win = scan.nextDouble();
				
				double seconds = 0;
				double currRate = 2;
				
				double bestRate = currRate;
				
				while (win > 0) {
					double secToWin = win / currRate;
					if (cost > win) {
						// we won, just sit it out
						seconds += secToWin;
						break;
					}
					double nextFarmSec = cost / currRate;
					double nextFarmWin = nextFarmSec + (win / (currRate + farmRate));
					if (nextFarmWin < secToWin) {
						currRate += farmRate;
						seconds += nextFarmSec;
					} else {
						seconds += secToWin;
						break;
					}
				}
				
				System.out.printf("Case #%d: %.7f%n", l+1, seconds);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
