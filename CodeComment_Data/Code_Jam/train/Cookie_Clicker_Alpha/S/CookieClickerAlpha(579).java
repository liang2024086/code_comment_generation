package methodEmbedding.Cookie_Clicker_Alpha.S.LYD920;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("input"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("output"));

			int numGames = Integer.parseInt(br.readLine());
			double rate;
			double cost;
			double farmRate;
			double goal;
			double time;
			double bestTime;
			double[] res = new double[numGames];
			for (int i = 0; i < numGames; i++) {
				String s[] = br.readLine().split(" ");
				cost = Double.parseDouble(s[0]);
				farmRate = Double.parseDouble(s[1]);
				goal = Double.parseDouble(s[2]);
				bestTime = -1;

				for (int f = 0;; f++) {
					rate = 2;
					time = 0;
					if (f >= 1)
						for (int j = 0; j < f; j++) {
							time += cost / (rate);
							rate += farmRate;
						}
					time += goal / (rate);
					if (bestTime == -1)
						bestTime = time;
					else if (time > bestTime)
						break;
					else if (time < bestTime)
						bestTime = time;
				}

				res[i] = bestTime;
			}

			for (int i = 0; i < numGames; i++) {
				bw.write("Case #" + (i + 1) + ": " + res[i] + "\n");
			}

			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
