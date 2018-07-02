package methodEmbedding.Cookie_Clicker_Alpha.S.LYD982;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cookie {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		int case_amount = Integer.parseInt(br.readLine());

		double[][] case_values = new double[3][case_amount];
		for (int i = 0; i < case_amount; i++) {
			String[] split = br.readLine().split("\\s");
			for (int j = 0; j < 3; j++)
				case_values[j][i] = Double.parseDouble(split[j]);
		}

		for (int i = 0; i < case_amount; i++) {
			double cookies = 0;
			double time = 0;
			double slope = 2.0;
			double dawf = 0;

			while (cookies < case_values[2][i]) {

				// if (cookies >= case_values[0][i]) {
				// double time1 = (case_values[2][i] - cookies +
				// case_values[0][i])
				// / (slope + case_values[1][i]);
				// double time2 = (case_values[2][i] - cookies) / slope;
				// if (time1 < time2) {
				// slope += case_values[1][i];
				// cookies -= case_values[0][i];
				// }
				// }
				//
				// double desiredcookies = (case_values[2][i] *
				// case_values[1][i] + case_values[0][i]
				// * slope)
				// / case_values[1][i];
				// desiredcookies = desiredcookies < case_values[0][i] ?
				// case_values[0][i]
				// : desiredcookies;
				// if (desiredcookies <= case_values[2][i]
				// && desiredcookies >= case_values[0][i] && desiredcookies >
				// cookies) {
				// time += (desiredcookies - cookies) / slope;
				// cookies = desiredcookies;
				// } else {
				// time += ((case_values[2][i] - cookies) / slope);
				// cookies = case_values[2][i];
				// }

				if (cookies >= case_values[0][i]) {
					double time1 = (case_values[2][i] - cookies + case_values[0][i])
							/ (slope + case_values[1][i]);
					double time2 = (case_values[2][i] - cookies) / slope;
					if (time1 < time2) {
						slope += case_values[1][i];
						cookies -= case_values[0][i];
					} else {
						double desiredcookies = (case_values[2][i]
								* case_values[1][i] + case_values[0][i] * slope)
								/ case_values[1][i];
						if (desiredcookies < case_values[2][i]) {
							time += (desiredcookies - cookies) / slope;
							cookies = desiredcookies;
							continue;
						}
					}
				}

				if (case_values[2][i] - cookies >= case_values[0][i]) {
					dawf = (case_values[0][i] - (cookies % case_values[0][i]));
					if(dawf< 1e-9)
						dawf = case_values[0][i];					
					time += (dawf / slope);
					cookies += dawf;
				} else {
					time += ((case_values[2][i] - cookies) / slope);
					cookies += (case_values[2][i] - cookies);
				}

			}

			System.out.println("Case #" + (i + 1) + ": " + time);

		}

	}
}
