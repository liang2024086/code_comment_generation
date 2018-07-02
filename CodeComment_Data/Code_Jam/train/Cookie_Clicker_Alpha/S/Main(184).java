package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1485;

import java.io.File;
import java.util.Scanner;


public class Main {

	public static double cFile;
	public static double fFile;
	public static double xFile;
	
	public static void main(String[] args) {
		
		//Time bestTime = new Time(30, 2, 100);
		Time bestTime = new Time();
		//bestTime.initialize(500, 4, 2000);
		//bestTime.buyFarm();
		//bestTime.initialize(30, 2, 100);
		//System.out.println("");
		//bestTime.buyFarm();

	
	try
	{
		Scanner scanner = new Scanner (new File("D:/input.txt"));
		int loop = scanner.nextInt();
		while(loop != 0)
    	{
			cFile = scanner.nextDouble();
			fFile = scanner.nextDouble();
			xFile = scanner.nextDouble();
			
			bestTime.initialize(cFile, fFile, xFile);
			bestTime.buyFarm();
    	
			loop--;
    	}
	}
		
	catch(Exception e){
		     System.out.println(e);
		    }
	

	}
}
