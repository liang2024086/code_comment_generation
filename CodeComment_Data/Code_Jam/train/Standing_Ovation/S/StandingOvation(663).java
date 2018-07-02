package methodEmbedding.Standing_Ovation.S.LYD2209;

import java.io.*;

public class StandingOvation {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));

			int amtOfTests = Integer.parseInt(br.readLine());
			for (int i = 1; i <= amtOfTests; i++) {
				String[] sarr = br.readLine().split(" ");

				int maxShyness = Integer.parseInt(sarr[0]);
				String s = sarr[1];

				int standing = Integer.parseInt(s.substring(0, 1));
				int personToAdd = 0;

				for (int j = 1; j <= maxShyness; j++) {
					int n = Integer.parseInt(s.substring(j, j+1));
					if (n == 0) {
						continue;
					}
					if (standing >= maxShyness) {
						break;
					}				
					if (standing >= j) {
						standing += n;
					} else {
						personToAdd += (j-standing);
						standing += personToAdd;
						standing += n;
					}
				}

				System.out.println("Case #" + i + ": " + personToAdd);			
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
