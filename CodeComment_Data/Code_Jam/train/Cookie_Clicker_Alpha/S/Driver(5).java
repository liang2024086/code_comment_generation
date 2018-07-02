package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1588;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	
	static int numCases;
	static double cookieRate, farmRate, farmPrice, winPrice, previousValue, newValue, timeToNextFarm, timeToGoal, accFarm;
	static boolean flag;
	
	public static void main(String[] args){
	    File file = new File("E:/Programming/Eclipse Workspace/codejam_1_cookies/src/input.txt");

	    try {

	        Scanner sc = new Scanner(file);
	        numCases = sc.nextInt();
	        //System.out.println(numCases);
	        
	        for (int i=0; i<numCases; i++){
	        	flag = true;
	        	accFarm = (float) 0.0;
	        	cookieRate = 2;
	        	farmPrice = sc.nextDouble();
	        	farmRate = sc.nextDouble();
	        	winPrice = sc.nextDouble();
	        	//System.out.println(cookieRate + " " + farmPrice + " " + winPrice);
	        	
	        	previousValue = winPrice/cookieRate;
	        	do{
	        		
	        		//building a farm
	        		accFarm += (farmPrice/cookieRate);
	        		cookieRate += farmRate;
	        		timeToGoal = winPrice/cookieRate;
	        		newValue = (accFarm + timeToGoal); 
	        		if (newValue > previousValue){
	        			//return previousvalue
	        			flag = false;
	        		}
	        		else{
	        			previousValue = newValue;
	        		}
	        		
//	        		flag = false;
	        	}while (flag == true);
	        	//System.out.println(accFarm + "  " + cookieRate + " " + timeToGoal + " " + newValue);
	        	int ending = i+1;
	        	System.out.print("Case #" + ending + ": ");
	        	System.out.printf("%.7f", previousValue);
	        	System.out.println();
	        	
	        }
	        
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}

}
