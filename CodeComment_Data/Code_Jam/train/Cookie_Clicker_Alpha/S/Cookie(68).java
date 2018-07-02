package methodEmbedding.Cookie_Clicker_Alpha.S.LYD135;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cookie {

	public static void main(String[] args) throws IOException {
		double c, f, x, t, rate = 2;
		double timeStep, minTime = Double.POSITIVE_INFINITY;
		double timeAggregate = 0.0;
		File input = new File("B-small-attempt1.in");
		Scanner scan = new Scanner(input);
		t = scan.nextInt();
        File output = new File("output.txt");
        if(!output.createNewFile()) System.err.print("Can't create file");
        FileWriter write = new FileWriter(output.getAbsoluteFile());
        BufferedWriter br = new BufferedWriter(write);
		for (int i = 0; i < t;i++) {
			rate=2;
			c = scan.nextDouble();
			f = scan.nextDouble();
			x = scan.nextDouble();
			timeStep =  c / rate;
			System.out.println("timeStep Initial "+timeStep);
			timeAggregate =  x / rate;
			System.out.println("timeAggregate Initial "+timeAggregate);
			minTime = timeAggregate;
				while (true) {
					rate += f;
					
					double temp=timeStep;
					timeStep +=  c / rate;
					
					timeAggregate = temp +  x / rate;
					
					if (timeAggregate < minTime) {
						minTime = timeAggregate;
						
					}else break;
				}
				br.write("Case #"+ (i+1)+ ": "+String.valueOf(minTime)+"\n");
		}
       scan.close();
       br.close();
	}
}
