package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1154;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;


public class cookieclicker {
	public static void main(String[] args){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
		File file = fileChooser.getSelectedFile();
		try{
			Scanner scan = new Scanner(file);
			int numCases = scan.nextInt();
			int caseNum = 1;
			for (int i = 0; i < numCases; i++){
				String line = scan.nextLine();
				if (line.equals("")) line = scan.nextLine();
				String[] nums = line.split(" ");
				double C = Double.parseDouble(nums[0]);
				double F = Double.parseDouble(nums[1]);
				double X = Double.parseDouble(nums[2]);
				double cookies = 0;
				double cps = 2;
				double time = 0;
				double timeToGoal = X/cps;
				double timeToFarm = C/cps;
				double timeToNextGoal = timeToFarm + (X/(cps+F));
				while (timeToGoal > timeToNextGoal){
					time += timeToFarm;
					cps += F;
					timeToGoal = X/cps;
					timeToFarm = C/cps;
					timeToNextGoal = timeToFarm + (X/(cps+F));
				}
				double total = time + timeToGoal;
				System.out.println("Case #" + caseNum + ": " + total);
				caseNum++;
			}
			
		}
		catch(IOException e){System.out.println(e);}
	}
}
