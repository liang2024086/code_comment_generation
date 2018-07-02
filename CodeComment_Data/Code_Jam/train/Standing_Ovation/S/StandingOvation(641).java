package methodEmbedding.Standing_Ovation.S.LYD1277;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		int lines = scanner.nextInt();
		File outputFile = new File("output.txt");
		PrintWriter pw = new PrintWriter(outputFile);
		for(int x=0; x<lines; x++){
			int Smax = scanner.nextInt();
			String sstr = scanner.next();
			int Sum = Character.getNumericValue(sstr.charAt(0));
			int invited = 0;
			for(int i=1;i<sstr.length();i++){
				int value = Character.getNumericValue(sstr.charAt(i));
				if(value > 0 && Sum < i){
					invited += i - Sum;
					Sum = i + value;
				}
				else {
					Sum += value;
				}
				
				if(Sum > Smax) break;
			}
			
			pw.println("Case #"+(x+1)+": "+invited);			
		}		
		pw.close();
		scanner.close();
	}

}
