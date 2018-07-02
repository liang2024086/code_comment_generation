package methodEmbedding.Standing_Ovation.S.LYD1047;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by joshua on 4/11/15.
 */
public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fin = new Scanner(new File("/home/joshua/Downloads/input.txt"));
		int T = fin.nextInt();

		for(int t=0; t<T; t++) {
			fin.next();
			String allPeople = fin.next();
			fin.nextLine();

			int friends = 0;
			int peepCounter = 0;
			for(int n=0; n<allPeople.length(); n++) {
				int people = Character.getNumericValue(allPeople.charAt(n));

				if(peepCounter + friends >= n) {
					peepCounter += people;
				}
				else {
					friends++;
					peepCounter += people;
				}
			}

			System.out.println("Case #" + Integer.toString(t+1) + ": " + Integer.toString(friends));
		}

		fin.close();
	}
}
