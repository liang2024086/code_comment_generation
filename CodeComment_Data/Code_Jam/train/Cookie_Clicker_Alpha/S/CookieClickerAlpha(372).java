package methodEmbedding.Cookie_Clicker_Alpha.S.LYD95;

import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File(args[0]));
		FileWriter out = new FileWriter("cookieout.txt");
		
		int T = in.nextInt();
		for (int caseNum = 1; caseNum <= T; caseNum++) {
			double C = in.nextDouble();						//Cost of a farm
			double F = in.nextDouble();						//output of a farm
			double X = in.nextDouble();						//GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOL!!!
			double payback = C / F;							//How long until a farm pays for itself?
			int numFarms = Math.max((int) ((X / payback - 2) / F), 0);	//How many farms does it make sense to build?
			double timer = 0.0;
			
			for (int i = 0; i < numFarms; i++) {
				timer += C / (2 + F * i);
			}
			
			timer += X / (2 + F * numFarms);
			
			out.write("Case #" + caseNum + ": " + timer + "\n");
		}
		
		in.close();
		out.close();
		
	}

}
