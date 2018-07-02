package methodEmbedding.Standing_Ovation.S.LYD1896;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int caseTotal = keyboard.nextInt();
		keyboard.nextLine();

		for(int i = 1; i <= caseTotal; i++ ) {

			String[] lineTemp = keyboard.nextLine().split(" ");
			int friendNum = 0;
			int totalAudience = 0;
			int standAud = 0;
			int shyMax = Integer.parseInt(lineTemp[0]);

			// total audience
			for(int j = 0; j <= shyMax; j++) {

				totalAudience = totalAudience + Integer.parseInt(Character.toString(lineTemp[1].charAt(j)));
			}

			// calculate
			for(int j = 0; j <= shyMax; j++) {

				if (Integer.parseInt(Character.toString(lineTemp[1].charAt(j))) != 0) {

					if (standAud >= j) {
						standAud = standAud + Integer.parseInt(Character.toString(lineTemp[1].charAt(j)));
					}
					else {

						boolean loopSwitch = true;
						while (loopSwitch) {

							friendNum++;
							if ((standAud+friendNum) >= j) {

								standAud = standAud + friendNum;
								loopSwitch = false;
							}

						}
					}
				}

				else {

					if (standAud <= j) {
						friendNum++;
						standAud++;
					}

					/*
					if (j == 0) {

						friendNum++;
						standAud++;
					}

					else if (standAud >= j) {
					}
					else {

						boolean loopSwitch = true;
						while (loopSwitch) {

							friendNum++;
							if ((standAud+friendNum) >= j) {

								standAud = standAud + friendNum;
								loopSwitch = false;
							}

						}
					}
					*/
				}
			}


			System.out.println("Case #" + i + ": " + friendNum);
		}

	}
}
