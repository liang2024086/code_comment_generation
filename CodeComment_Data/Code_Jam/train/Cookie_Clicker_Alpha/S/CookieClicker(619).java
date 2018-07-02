package methodEmbedding.Cookie_Clicker_Alpha.S.LYD724;


import java.io.BufferedReader;
import java.io.FileReader;

public class CookieClicker {
	public static void main(String[] args) {
		String delims = "[ ]+";
		try {
			BufferedReader br = new BufferedReader(new FileReader("E:\\Code\\CodeJam2014\\CodeJam2014\\data\\B-small-attempt0.in"));
			String line = br.readLine();
			int nbTest = Integer.parseInt(line);
			for (int idx = 0 ; idx < nbTest ; ++idx)  {
				line = br.readLine();
				String[] split = line.split(delims);
				double F = 0;
				double C = 0;
				double goal = 0;
				goal = Double.parseDouble(split[2]);
				F = Double.parseDouble(split[1]);
				C = Double.parseDouble(split[0]);
				double nbCookies = 0;
				double currentRateCP = 2;
				double totalTime = 0;
				while (nbCookies < goal) {
					double timeToGoal = (goal - nbCookies) / currentRateCP;		
					double timeToNextFarm = (C - nbCookies) / currentRateCP;
					double timeToGoalWithNextFarm = ((goal - nbCookies) / (currentRateCP + F));
					double lostTime = C / (currentRateCP + F);
					double newTimeToGoal = lostTime + timeToGoalWithNextFarm;
					
					if (timeToGoal > timeToNextFarm) {
						if (nbCookies >= C && newTimeToGoal < timeToGoal) {
							nbCookies -= C;
							currentRateCP += F;
						}
						else if (nbCookies >= C) {
							totalTime += timeToGoal;
							nbCookies += currentRateCP * timeToGoal;
						}
						else {
							totalTime += timeToNextFarm;
							nbCookies += currentRateCP * timeToNextFarm;
						}
					}
					else {
						totalTime += timeToGoal;
						nbCookies += currentRateCP * timeToGoal;
					}
				}
				
				System.out.println("Case #" + (idx + 1) + ": " + totalTime);
			}
		}
		catch(Exception e)  {
			
		}
	}
}
