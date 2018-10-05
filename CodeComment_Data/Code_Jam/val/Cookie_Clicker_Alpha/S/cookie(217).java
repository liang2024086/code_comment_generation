package methodEmbedding.Cookie_Clicker_Alpha.S.LYD365;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;

public class cookie {

	public static void main(String[] args) throws IOException {
		
		//declarations
		double C = 0.0;					//farm costs C cookies
		double F = 0.0;					//extra cookies per second
		double X = 0.0;					//cookies, that haven't spent on farms
		
		double inc = 2.0;
		double costs = 0.0;				//costs for farms
		double currTime = 0.0;
		double plusTime = 0.0;
		double endTime = 0.0;
		
		String x = null;
		int counter = 0;
		
		int numAttempts = 0;
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("B-small-attempt0.in");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		
		File file = new File("output.out");
		FileWriter writer = new FileWriter(file ,true);

		Locale.setDefault(Locale.US);
		DecimalFormat f = new DecimalFormat("#0.0000000"); 
		
		//program
		
		do{
			x = br.readLine();
			numAttempts = Integer.parseInt(x);
		}while(numAttempts < 1 || numAttempts > 100);
		
		for(int i = 1; i <= numAttempts; i++) {
			String[] a = null;
			
			x = br.readLine();
			a = x.split("\\s");
			
			C = Double.parseDouble(a[0]);
			F = Double.parseDouble(a[1]);
			X = Double.parseDouble(a[2]);
			
			if(C < 1.0 || C > 500.0){
				writer.write("C not in range!");
				C = 500.0;
			}
			
			if(F < 1.0 || F > 4.0){
				writer.write("F not in range!");
				C = 4.0;
			}
			
			if(X < 1.0 || X > 2000.0){
				writer.write("X not in range!");
				C = 2000.0;
			}
			
			inc = 2.0;
			counter = 0;
			costs = C / inc;
			
			do{
				if(counter == 0)
					currTime = X / inc;
				else
					currTime = plusTime;
				
				plusTime = costs + (X / (inc + F));
				
				inc = inc + F;
				costs = costs + (C/inc);
				
				if(currTime < plusTime)
					endTime = currTime;
				else
					endTime = plusTime;
				
				counter++;
			}while(plusTime < currTime);
			
			System.out.println("Case #" + i + ": " + f.format(endTime));
			writer.write("Case #" + i + ": " + f.format(endTime));
			writer.write(System.getProperty("line.separator"));
			
		}
		
		
		writer.flush();
        writer.close();
        br.close();
		
	}

}
