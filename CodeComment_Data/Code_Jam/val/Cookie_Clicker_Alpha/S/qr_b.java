package methodEmbedding.Cookie_Clicker_Alpha.S.LYD909;


import java.io.*;

public class qr_b {
	
	public static void main(String[] args) {		
		try {				
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Adam\\workspace\\codejam2014_1\\B-small-attempt0.in"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Adam/workspace/codejam2014_1/B.out"));

			int testCases = Integer.parseInt(reader.readLine());
			
			for(int i = 1; i <= testCases; i+=1) {
			
					String[] input = reader.readLine().split(" ");

					final double FARM_COST = Double.parseDouble(input[0]);
					final double FREQ_INCREASE = Double.parseDouble(input[1]);
					final double XARGET = Double.parseDouble(input[2]);
					
					double freq = 2d;
					double currentTime = 0d;
					double cookies = 0d;
					double timeToFarm = FARM_COST / freq;		
					double timeToX = currentTime + (XARGET - cookies) / freq;
					double timeToXFarm = currentTime + (XARGET / freq);
					
					double bestTime = timeToX; //naive
					
					while(true) {
						//we've amassed enough cookies to buy a farm - should we?
						currentTime += FARM_COST / freq;
					
						//don't buy the farm - how long until we hit X?
						timeToX = currentTime + ((XARGET - FARM_COST) / freq);
					
						//buy the farm - how long until we hit X?
						freq += FREQ_INCREASE;
						timeToXFarm = currentTime + (XARGET / freq);
					
						//which is better - buy the farm and keep going, or just let the cookies amass?
						double bestChoice = timeToX < timeToXFarm ? timeToX : timeToXFarm;
					
						if(bestChoice < bestTime) {
							bestTime = bestChoice;
						} else {
							break;
						}
					}
					
					writer.write("Case #" + i + ": " + String.format("%.7f", bestTime));
					
					if(i != testCases) {
						writer.write("\n");
					}
					
					writer.flush();
				
			}
		} catch (Exception e){ 
			throw new RuntimeException(e);
		}
	}
}
