package methodEmbedding.Revenge_of_the_Pancakes.S.LYD546;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RevengeOfPancakes {
	public static void main(String[] args) {
		String str = null;
		BufferedReader br = null;
		int noc = 0;

		try {
			br = new BufferedReader(new FileReader("F:\\B-small-attempt0.in"));

			noc = Integer.parseInt(br.readLine());

			int index = 1;

			while ((str = br.readLine()) != null) {
				String startOrder = str.trim();

				String expectedOrder = new String(new char[startOrder.length()])
						.replace('\0', '+');

				int cnt = 0;

				while (!startOrder.equals(expectedOrder)) {

					int substringlength = 0;

					for (int i = startOrder.length() - 1; i >= 0; i--) {
						substringlength = i + 1;
						if (startOrder.charAt(i) == '-') {
							break;
						}
					}

					String part1 = startOrder.substring(0, substringlength);
					String part2 = startOrder.substring(substringlength,
							startOrder.length());

					int part1substringlength = 0;

					for (int i = 0; i < part1.length(); i++) {
						part1substringlength = i;
						if (part1.charAt(i) == '-') {
							break;
						}
					}

					if (part1substringlength == 0) {
						part1 = new StringBuffer(part1).reverse().toString();
						part1 = part1.replaceAll("\\+", "a")
								.replaceAll("\\-", "\\+")
								.replaceAll("a", "\\-");

						startOrder = part1 + part2;
					} else {
						String part1Sub1 = part1.substring(0,
								part1substringlength);
						String part1Sub2 = part1.substring(
								part1substringlength, part1.length());

						part1Sub1 = new StringBuffer(part1Sub1).reverse()
								.toString();
						part1Sub1 = part1Sub1.replaceAll("\\+", "a")
								.replaceAll("\\-", "\\+")
								.replaceAll("a", "\\-");

						startOrder = part1Sub1 + part1Sub2 + part2;
					}

					cnt++;

				}

				System.out.println("Case #" + index + ": " + cnt);
				index++;
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
