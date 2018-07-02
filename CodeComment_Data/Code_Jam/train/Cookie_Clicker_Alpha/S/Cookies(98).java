package methodEmbedding.Cookie_Clicker_Alpha.S.LYD707;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Cookies {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner inputFile = new Scanner(new FileReader("inputfile.txt"));
		
		int tests = inputFile.nextInt();
		double c,f,x, cookies, cookiesPerSec;
		double secondsToFarm, secondsToWin, secondsUsed, secondsToWinWithFarm;
		for(int i = 0; i<tests; i++) {
			cookies = 0;
			cookiesPerSec = 2;
			secondsUsed = 0;
			c = inputFile.nextDouble();
			f = inputFile.nextDouble();
			x = inputFile.nextDouble();
			do {
				secondsToFarm = c/cookiesPerSec;
				secondsToWin = x/cookiesPerSec;
				secondsToWinWithFarm = (secondsToFarm) + x/(cookiesPerSec+f);
				if(secondsToWinWithFarm < secondsToWin) {
					secondsUsed += secondsToFarm;
					cookies = 0;
					cookiesPerSec += f;
				} else {
					secondsUsed += secondsToWin;
					cookies = x;
					break;
				}
			} while(cookies < x);
			System.out.println("Case #" + (int) (i+1) + ": " + secondsUsed);
		}
	}

}
