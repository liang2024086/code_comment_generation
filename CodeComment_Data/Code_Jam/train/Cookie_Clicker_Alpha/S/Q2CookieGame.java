package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1434;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2CookieGame {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"input.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						"out.txt"))) {
			int testCases = Integer.valueOf(reader.readLine());
			for (int i = 0; i < testCases; i++) {
				writer.write(String.format("Case #%d: ", i + 1));
				Double currSeconds = 0.0;
				Double currRate = 2.0;
				String[] currTestValues = reader.readLine().split(" ");
				Double factoryCost = Double.valueOf(currTestValues[0]);
				Double factoryRate = Double.valueOf(currTestValues[1]);
				Double goal = Double.valueOf(currTestValues[2]);
				boolean goalReached = false;
				Double currGoalTime = null, factoryBuildTime = null, upgradedRate = null, upgradedGoalTime = null;
				while (!goalReached) {
					currGoalTime = goal / currRate;
					factoryBuildTime = factoryCost / currRate;
					upgradedRate = currRate + factoryRate;
					upgradedGoalTime = factoryBuildTime + (goal / upgradedRate);
					if (currGoalTime < upgradedGoalTime) {
						writer.write(String.format("%f\n", currGoalTime
								+ currSeconds));
						goalReached = true;
					} else {
						currSeconds += factoryBuildTime;
						currRate = upgradedRate;
					}
				}
			}
			System.out.println("Done");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
