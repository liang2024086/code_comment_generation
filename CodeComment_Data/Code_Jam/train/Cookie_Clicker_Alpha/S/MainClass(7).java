package methodEmbedding.Cookie_Clicker_Alpha.S.LYD548;

import java.text.DecimalFormat;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		String fileInPath = "/Users/Kell3el2oS/Desktop/B-small-attempt0.in";
		String fileOutPath = "/Users/Kell3el2oS/Desktop/cookieClickerCodeJam.out";

		try {

			StringBuffer allResult = new StringBuffer();

			FileUtil fileUtil = new FileUtil();

			List<String> inputList = fileUtil.fileReader(fileInPath);

			int inputSize = Integer.parseInt(inputList.get(0));

			double c = 0.0;

			double f = 0.0;

			double x = 0.0;

			for (int inputNumber = 1; inputNumber <= inputSize; inputNumber++) {

				double speed = 2.0;

				String temp[] = inputList.get(inputNumber).split(" ");

				c = Double.parseDouble(temp[0]);
				f = Double.parseDouble(temp[1]);
				x = Double.parseDouble(temp[2]);

				double timeForFarm = 0.0;

				double totalTimeForFarm = 0.0;

				double currentTime = x / speed;

				double previousTime = 0.0;

				do {

					previousTime = currentTime;

					int index = 1;

					for (int i = 0; i < index; i++) {

						timeForFarm = c / speed;

						speed = speed + f;

						totalTimeForFarm = totalTimeForFarm + timeForFarm;

					}

					currentTime = totalTimeForFarm + (x / speed);

				} while (currentTime < previousTime);

				
				allResult.append("Case #" + inputNumber + ": " + String.format("%.07f", previousTime) + "\n");

			}

			System.out.println(allResult);
			fileUtil.fileWriter(fileOutPath, allResult.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
