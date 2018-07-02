package methodEmbedding.Counting_Sheep.S.LYD1364;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountingSheep {
	public static void main(String[] args) {
		String str = null;
		BufferedReader br = null;
		int noc = 0;

		try {
			br = new BufferedReader(new FileReader("F:\\A-small-attempt1.in"));

			noc = Integer.parseInt(br.readLine());

			int cnt = 1;

			while ((str = br.readLine()) != null) {
				int startNo = Integer.parseInt(str);

				List<Integer> visitedNos = new ArrayList<Integer>();
				visitedNos.add(0);
				visitedNos.add(1);
				visitedNos.add(2);
				visitedNos.add(3);
				visitedNos.add(4);
				visitedNos.add(5);
				visitedNos.add(6);
				visitedNos.add(7);
				visitedNos.add(8);
				visitedNos.add(9);

				int counter = 1;

				if (startNo == 0) {
					System.out.println("Case #" + cnt + ": INSOMNIA");
				} else {
					int currentNo = startNo;
					while (visitedNos.size() > 0) {
						currentNo = counter * startNo;

						List<Integer> removableNos = new ArrayList<Integer>();

						for (Integer val : visitedNos) {
							if (String.valueOf(currentNo).contains(
									String.valueOf(val))) {
								removableNos.add(val);
							}
						}
						visitedNos.removeAll(removableNos);
						counter++;
					}
					System.out.println("Case #" + cnt + ": " + currentNo);
				}

				cnt++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
