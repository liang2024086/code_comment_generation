package methodEmbedding.Cookie_Clicker_Alpha.S.LYD171;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		DecimalFormat myFormat = new DecimalFormat("0.0000000");

		StringBuffer strBuff = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<cases+1; i++){
			String[] caseInput = sc.nextLine().split(" ");
			double C = Double.parseDouble(caseInput[0]);
			double F = Double.parseDouble(caseInput[1]);
			double X = Double.parseDouble(caseInput[2]);
			
			
			double cPerSec = 2.0;
			double totalTime = 0.0;
			double firstCostTime = X/cPerSec;
			double trycostTime = 0.0;
			
			while(true){
				//calculate purchasing one
				totalTime += C/cPerSec; //add time cost to make 1 more factory
				cPerSec += F; // increase cookie per second
				
				trycostTime = X/cPerSec + totalTime; //recalculate new cost time for X cookies
				
				//calculate cost with current cPerSec 
				if(firstCostTime < trycostTime){
					break;
				}else{
					firstCostTime = trycostTime;
				}
			}
			strBuff.append("Case #"+i+": "+ myFormat.format(firstCostTime) +"\n");
		}
		
		System.out.print(strBuff.toString());
	}
	
}
