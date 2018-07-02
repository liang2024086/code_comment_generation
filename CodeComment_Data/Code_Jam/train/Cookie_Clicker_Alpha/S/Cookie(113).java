package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1099;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class Cookie {
	private static BufferedReader br;
	public static void main(String[] args) throws IOException {
		if(args.length < 1) {
			System.out.println("Error, usage: java ClassName inputfile");
			System.exit(1);
		}

		br = new BufferedReader(new FileReader(args[0]));


		int numTestCase = Integer.parseInt(br.readLine());
		String[] valuesInTheRow = new String[3];
		
		
		for(int i=0;i<numTestCase;i++){
			valuesInTheRow = br.readLine().split(" ");
			double c = Double.parseDouble(valuesInTheRow[0]);
			double f = Double.parseDouble(valuesInTheRow[1]);
			double x = Double.parseDouble(valuesInTheRow[2]);
			double total_time_cur_rate=0;
			double prev =0;
			double current_rate=2;
			double prev_time=0;
			while(prev>=total_time_cur_rate){
				prev = prev_time+ (x/current_rate); 
				prev_time=prev_time+(c/current_rate);
				current_rate=current_rate+f;
				total_time_cur_rate = prev_time+ (x/current_rate);
			}
			System.out.println("Case #"+(i+1)+": "+ new DecimalFormat("#.#######").format(prev));
		}
	}
}
