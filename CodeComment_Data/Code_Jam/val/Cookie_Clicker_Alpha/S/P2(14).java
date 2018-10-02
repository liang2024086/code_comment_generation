package methodEmbedding.Cookie_Clicker_Alpha.S.LYD200;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P2 {

    public static DecimalFormat df = new DecimalFormat("0.0000000");
    
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("B-small-attempt1.in"));
		FileWriter writer = new FileWriter(new File("out.txt"));
		
		int T = scanner.nextInt();
		for (int i=0; i<T; i++) {
			double C = scanner.nextDouble(), F = scanner.nextDouble(), X = scanner.nextDouble();
			double min = Double.MAX_VALUE;
			double MF = X;
			
			double dt = 0;
			double dc = 2;
			
			for (int f = 0; f < MF; f++) {
				
				double _dt = (C / dc);
				double _xt = (X / dc);
				double time = _xt + dt;
				
				if (time < min)
					min = time;
				else
					break;

				
				dt += _dt;
				dc += F;
			}
			System.out.println("Case #" + (i+1) + ": " + df.format(min));
			writer.write("Case #" + (i+1) + ": " + df.format(min) + "\n");
		}
		
		scanner.close();
		writer.close();
	}

}
