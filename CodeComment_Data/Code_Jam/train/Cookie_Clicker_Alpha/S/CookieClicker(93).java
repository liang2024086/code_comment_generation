package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1453;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;


public class CookieClicker {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw;
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Downloads\\codejam.out");
		bw = new BufferedWriter(new OutputStreamWriter(fos));
		Scanner reader = new Scanner (System.in);
		int nCases = reader.nextInt();

		for(int i=1; i<=nCases; i++) {
			reader.nextLine();
			double rate = 2.0;
			double C = reader.nextDouble();
			double F = reader.nextDouble();
			double X = reader.nextDouble();
			
			double result = 0;
			while(true) {
				double time = X / rate;
				double newTime = C / rate + X / (rate + F);
				if(time <= newTime) {
					result += time;
					break;
				} else {
					result += C / rate;
					rate += F;
				}
			}
			
			String line ="Case #" + i + ": " + result;
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
		
		bw.close();
	}
}
