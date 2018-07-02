package methodEmbedding.Cookie_Clicker_Alpha.S.LYD779;


import com.google.util.IOUtil;

public class CookieClicker {

	public static void main(String[] args) {
		// I'd just like whoever is reading this to know.. I am in the army in a field
		// on a stupid training thing. I have my laptop + android for a hotspot.
		// I am gave up a change of clothes to fit my laptop in my rucksack.
		// we have off for 6 hours and its supposed to be for sleep.

		IOUtil io = new IOUtil("C:\\Users\\Tom\\Downloads\\B-small-attempt0.in", "C:\\Users\\Tom\\Downloads\\testout.txt");
		int numberOfCases = io.getInt();
		for(int caseNum = 1; caseNum <= numberOfCases; caseNum++){
			double temp[] = io.getDoubles();
			double amountToBuyFarm = temp[0];
			double increaseAmount = temp[1];
			double amountToWin = temp[2];
			double growth = 2.0;
			double time = 0.0;
			boolean canStillBuyFarm = true;
			
			if(amountToWin < amountToBuyFarm){
				time = (amountToWin / growth);
				canStillBuyFarm = false;
			}
			while(canStillBuyFarm){
				time += amountToBuyFarm / growth;
				double withAnotherFarm = amountToWin / (growth + increaseAmount);
				double withoutAnotherFarm = (amountToWin - amountToBuyFarm) / growth;
				if (withAnotherFarm < withoutAnotherFarm){
					growth += increaseAmount;
				} else {
					time += withoutAnotherFarm;
					canStillBuyFarm = false;
				}
			}
			io.writePretty(String.valueOf(time));
		}
		io.close();
	}
}
