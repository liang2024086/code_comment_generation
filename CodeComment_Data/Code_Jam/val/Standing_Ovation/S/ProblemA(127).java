package methodEmbedding.Standing_Ovation.S.LYD1320;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemA {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(reader.readLine());
		
		for (int t = 1; t <= T; t++) {
			String[] line = reader.readLine().split(" ");
			int Smax = Integer.parseInt(line[0]);
			int[] people = new int[Smax + 1];
			int currentlyStanding = Integer.parseInt("" + line[1].charAt(0));
			//System.out.println("Currently standing: " + currentlyStanding);
			int result = 0;
			for (int shyness = 1; shyness < (Smax+1); shyness++) {
				people[shyness] = Integer.parseInt("" + line[1].charAt(shyness));
				if (people[shyness] > 0 && shyness > currentlyStanding) {
					int thresholdDiff = shyness - currentlyStanding;
					//System.out.println(people[shyness] + " people with shyness " + shyness + " require at least " + shyness + " people to stand, which are " + thresholdDiff + " more than currently standing");
					result += thresholdDiff;
					currentlyStanding += thresholdDiff;
				}
				currentlyStanding = currentlyStanding + people[shyness];
				//System.out.println("Currently standing: " + currentlyStanding + ", current shyness: " + shyness);
			}
			
			System.out.println("Case #" + t + ": " + result);		
		}
	
	}
	
}
