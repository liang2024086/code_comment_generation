package methodEmbedding.Standing_Ovation.S.LYD854;

import java.io.*;


public class CJQA {

	public static final boolean DEBUG = false; 

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		if (DEBUG) System.out.println("Test cases: "+ T);

		for (int t=1;t<=T;t++) { // test case loop
			if (DEBUG) System.out.println("Begin test case " + t);
			String[] line = br.readLine().split(" ");

			int maxShyness = Integer.parseInt(line[0]);

			// If the max shyness is 0 we don't need any friends
			if (maxShyness == 0) { 
				System.out.println("Case #" + t + ": 0");
				continue;
			}

			char[] numOfShyChar = line[1].toCharArray();

			int[] numShy = new int[maxShyness+1];

			for (int i=0;i<maxShyness+1;i++) {
				numShy[i] = Character.getNumericValue(numOfShyChar[i]);
			}


			int currentClapping = numShy[0]; // The number of spontaneous clappers.
			int position = 1;
			int friendsRequired = 0;
			if (currentClapping == 0) { // If there are no spontaneous clappers, we must add one.
				friendsRequired++; currentClapping++;
			}
			while (currentClapping < maxShyness) {
				if (DEBUG) System.out.println("Pos:" + position + " Clp:" + currentClapping + " Num@Pos: "+numShy[position]);
				if (currentClapping >= position) { currentClapping += numShy[position]; position++; }
				else {
					while (currentClapping < position) {
						currentClapping++; 
						friendsRequired++;
						if (DEBUG) System.out.println("Add friend.");
					}
				}
			}

			System.out.println("Case #" + t + ": "+ friendsRequired);

		}

	}

}
