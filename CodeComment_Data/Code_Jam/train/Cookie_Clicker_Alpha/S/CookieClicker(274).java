package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1116;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class CookieClicker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(args[0]));
			PrintWriter writer = new PrintWriter(args[1]);
			int numberOfTestCases = Integer.parseInt(br.readLine());
			DecimalFormat df = new DecimalFormat("#.#######");
			for (int i = 0; i < numberOfTestCases; i++) {
				String line = br.readLine();
				String[] split = line.split(" ");
				double C = Double.parseDouble(split[0]);
				double F = Double.parseDouble(split[1]);
				double X = Double.parseDouble(split[2]);
				double howManyIReceive = 2.0;
				double timeToBuyAFarm = C/howManyIReceive;
				double timeToWait = X/howManyIReceive;
				double time = 0;
				while (timeToBuyAFarm+X/(howManyIReceive+F) < timeToWait){
					howManyIReceive += F;
					time += timeToBuyAFarm;
					timeToBuyAFarm = C/howManyIReceive;
					timeToWait = X/howManyIReceive;
				}
				time += timeToWait;
				writer.println("Case #"+(i+1)+": "+df.format(time));
			}
			br.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
