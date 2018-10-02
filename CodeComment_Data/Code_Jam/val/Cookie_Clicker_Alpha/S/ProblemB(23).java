package methodEmbedding.Cookie_Clicker_Alpha.S.LYD888;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ProblemB {
	
	public static void main(String[] args) {	
		try {
			Scanner file = new Scanner(new FileInputStream("B-small-attempt0.in"));
			int cases = file.nextInt();
			
			for(int i=0; i<cases; i++) {
				System.out.print("Case #"+(i+1)+": ");
				double cfPrice = file.nextFloat();
				double cfRate = file.nextFloat();
				double goal = file.nextFloat();
				
				double rate = 2.0F;
				
				ArrayList<Double> priceSecs = new ArrayList<Double>();
				ArrayList<Double> goalSecs = new ArrayList<Double>();

				int upgrades = 0;
				double thisUpgrade = 1000000.0F;
				double lastUpgrade = 1000000.0F;
				do {
					if(upgrades>=1) {
						lastUpgrade = thisUpgrade; // Refresh
						priceSecs.add(cfPrice/rate+priceSecs.get(upgrades-1));
						thisUpgrade = goal/rate+priceSecs.get(upgrades-1);
						goalSecs.add(thisUpgrade);
					} else {
						priceSecs.add(cfPrice/rate);
						thisUpgrade = goal/rate;
						goalSecs.add(thisUpgrade);
					}
					
					rate+=cfRate;
					upgrades++;
					
				} while(thisUpgrade<lastUpgrade); 
				
				System.out.println(lastUpgrade);
				
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
