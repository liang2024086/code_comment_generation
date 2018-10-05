package methodEmbedding.Cookie_Clicker_Alpha.S.LYD235;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class cookie {

	public static void main(String[] args){
		
		Scanner scan = null;
		try {
			scan = new Scanner(new File("C:\\Users\\Hans\\Desktop\\B-small-attempt0.in"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintStream ps = null;
		
		try {
			 ps = new PrintStream(new File("C:\\Users\\Hans\\Desktop\\Answers.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++){
			
			double C = scan.nextDouble();
			double F = scan.nextDouble();
			double X = scan.nextDouble();
			double seconds = 2.0;
			ArrayList<Double> sec = new ArrayList<Double>();

			while(true){
				
				double f = X/seconds;
				double g = C/seconds;
				double h = X / (F + seconds);
				double j = g + h;
				
				if(f<=j){
					sec.add(f);
					break;
				}else{
					sec.add(g);
					seconds += F;
				}

			}
			
			double TotalSeconds = 0;
			
			for(Double k : sec)
				TotalSeconds += k;
			
			ps.println("Case #" + (i+1) + ": " +String.format("%.7f", TotalSeconds));
			
		}
		
		scan.close();
		
	}

}

