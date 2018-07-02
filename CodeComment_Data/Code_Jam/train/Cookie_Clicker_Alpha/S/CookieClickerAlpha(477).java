package methodEmbedding.Cookie_Clicker_Alpha.S.LYD257;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CookieClickerAlpha {
	
	
	public static void main(String[] args)
	{
		BufferedReader reader = null;
		
		ArrayList<String> fullText = new ArrayList<String>();
		
		try {
			String line;
			
			reader = new BufferedReader(new FileReader("C:\\Users\\supir_000\\Desktop\\B-small-attempt0.in"));
			
			while ((line = reader.readLine()) != null)
			{
				fullText.add(line);
			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		Integer testCases = Integer.parseInt(fullText.get(0));
		
		for (int i = 1; i <= testCases; i++)
		{
			
			Double cookieAmount = 0.0;
			Double cookieRate = 2.0;
			Double farmCost = 500.0;
			Double farmRate = 4.0;
			Double goalAmount = 2000.0;
			Double timeToGoal = 0.0;
			Double timeToBuyFarm = 0.0;
			Double previousTimeToBuyFarm = 0.0;
			Double seconds = 0.0;
			Double totalTime = 0.0;
			Double futureRate = 0.0;
			Double potentialTime = 0.0;
			
			String line = fullText.get(i);
			String[] values = line.split(" ");
			
			farmCost = Double.parseDouble(values[0]);
			farmRate = Double.parseDouble(values[1]);
			goalAmount = Double.parseDouble(values[2]);
			
			timeToGoal = goalAmount / cookieRate;
			timeToBuyFarm = farmCost / cookieRate;
			
			previousTimeToBuyFarm = timeToBuyFarm;
			
			while (true)
			{
				cookieAmount += cookieRate;
				
				timeToGoal = goalAmount / cookieRate;
				timeToBuyFarm = farmCost / cookieRate;
				
				if (cookieAmount >= farmCost && timeToBuyFarm < timeToGoal)
				{
					cookieRate += farmRate;
					cookieAmount -= farmCost;
					
					timeToGoal = goalAmount / cookieRate;
					timeToBuyFarm = farmCost / cookieRate;
				}
				
				if (!previousTimeToBuyFarm.equals(timeToBuyFarm) )
				{
					totalTime += previousTimeToBuyFarm;
					previousTimeToBuyFarm = timeToBuyFarm;
				}
				
				futureRate = (cookieRate + farmRate);
				potentialTime = timeToBuyFarm + (goalAmount / futureRate);
				
				if (timeToGoal < potentialTime)
				{
					totalTime += timeToGoal;
					System.out.println("Case #" + i + ": " + totalTime);
					
					break;
				}
				
				seconds++;
			}
			
		}
		
	}
	
}
