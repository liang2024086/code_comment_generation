package methodEmbedding.Cookie_Clicker_Alpha.S.LYD589;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class cookieclicker {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(
					new FileReader(
							"/Users/iwatson/work/ec-workspace/google-comp/input/B-small-attempt0.in"));

			BufferedWriter bw = new BufferedWriter(
					new FileWriter(
							"/Users/iwatson/work/ec-workspace/google-comp/output/B-small-attempt0.out"));

			int input_count = Integer.parseInt(br.readLine());
			String[] problem;

			double time_total, time_wait, time_til_farm, time_with_another_farm, cookie_total;
			double production_rate;
			double X_win, C_farmcost, F_farmrate;

			for (int i = 0; i < input_count; i++) {
				problem = br.readLine().split(" ");
				C_farmcost = Double.parseDouble(problem[0]);
				F_farmrate = Double.parseDouble(problem[1]);
				X_win = Double.parseDouble(problem[2]);

				System.out.println("C=" + C_farmcost + " F=" + F_farmrate
						+ " X=" + X_win);

				time_total = 0;
				production_rate = 2;
				cookie_total = 0;

				while (true) {

					time_wait = X_win / production_rate;
					time_til_farm = C_farmcost / production_rate;

					time_with_another_farm = time_til_farm + X_win
							/ (production_rate + F_farmrate);

					if (time_wait <= time_with_another_farm) {

						// then WAIT with current production - then we are done:
						time_total += time_wait;
						break;
					} else {
						// we're buying another farm:
						// wait til buy farm empty out cookie bank back to zero
						time_total += time_til_farm;
						production_rate += F_farmrate;
					}
				}

				bw.write("Case #" + (i + 1) + ": " + time_total + "\n");
				bw.flush();
			}

			bw.flush();
			bw.close();

			System.out.println("done");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
