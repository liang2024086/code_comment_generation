package methodEmbedding.Cookie_Clicker_Alpha.S.LYD406;

import java.util.*;
import java.io.*;

public class Cookie {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("test.txt"));
		FileWriter writer = new FileWriter(new File("result.txt"));
		int numOfCases = scanner.nextInt();
		for (int i = 1; i <= numOfCases; i++) {
			double cookieForFarm = scanner.nextDouble();
			double speedForFarm = scanner.nextDouble();
			double target = scanner.nextDouble();
			double totalTime = 0;
			double speed = 2;
			while (true) {
				double waitTime = target / speed;
				double newSpeed = speed + speedForFarm;
				double produceTime = cookieForFarm / speed;
				if (waitTime > (produceTime + target / newSpeed)) {
					speed = newSpeed;
					totalTime += produceTime;
				} else {
					totalTime += waitTime;
					break;
				}
			}
			writer.write("Case #" + i + ": " + String.format("%.7f", totalTime) + "\n");
		}
		writer.close();
		scanner.close();
	}

}
