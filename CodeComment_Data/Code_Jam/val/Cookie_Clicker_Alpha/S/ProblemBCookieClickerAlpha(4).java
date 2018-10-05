package methodEmbedding.Cookie_Clicker_Alpha.S.LYD735;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ProblemBCookieClickerAlpha {
	
	public static void main(String[] args){
		try {
//			BufferedReader br = new BufferedReader(new FileReader(new File("E:\\junk\\code jam problem1 input.txt")));
			BufferedReader br = new BufferedReader(new FileReader(new File("E:\\junk\\B-small-attempt0.in")));
			int numberOfTests = Integer.parseInt(br.readLine());//the first line of the file will be the number of tests which will follow, 	
																//it will blow up if not (could add a try catch for this but oh well)
			DecimalFormat df = new DecimalFormat("#.0000000");
			for(int i = 0; i < numberOfTests; i++){
				int caseNumber = i+1;
				double totalSecondsPassed = 0;
				double cookiesPerSecond = 2;
				
				String[] variables = br.readLine().split(" ");
				//C
				double cookieFarmPrice = Double.parseDouble(variables[0]);
				//F
				double cookieFarmProductionPerSecond = Double.parseDouble(variables[1]);
				//X
				double goal = Double.parseDouble(variables[2]);
				
				boolean missionAccomplished = false;
				while(!missionAccomplished){
					double secondsUntilGoal = goal/cookiesPerSecond;
					double secondsUntilGoalWith1FarmPurchase = goal/(cookiesPerSecond+cookieFarmProductionPerSecond) + cookieFarmPrice/cookiesPerSecond;
					double secondsToBuildFarm = cookieFarmPrice/cookiesPerSecond;
					
					if(secondsUntilGoal < secondsUntilGoalWith1FarmPurchase){
						totalSecondsPassed += secondsUntilGoal;
						missionAccomplished = true;
					}
					else{//buy a cookie farm
						totalSecondsPassed += secondsToBuildFarm;
						cookiesPerSecond += cookieFarmProductionPerSecond;
					}
				}

				String message = "Case #" + caseNumber + ": " + df.format(totalSecondsPassed);
				System.out.println(message);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

