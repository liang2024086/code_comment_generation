package methodEmbedding.Cookie_Clicker_Alpha.S.LYD484;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


public class Q2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.0000000");
		File file = new File("input.txt");  
		File dest = new File("output.txt");  
		BufferedReader reader = new BufferedReader(new FileReader(file));  
		BufferedWriter writer  = new BufferedWriter(new FileWriter(dest));  
		String data = reader.readLine();
		int num = Integer.parseInt(data);
		for (int t = 1; t <= num; t++){
			writer.write("Case #"+t+": ");
			data = reader.readLine();
			String value[] = data.split(" ");
			double C = Double.valueOf(value[0]).doubleValue();
			double F = Double.valueOf(value[1]).doubleValue();
			double X = Double.valueOf(value[2]).doubleValue();
			double I = 2;
			double timef = 0;
			double time1 = X/I;
			double time2 = 500000;
			while (time2 > time1) {
				time2 = time1;
				timef = timef + C/I;
				I = I+F;
				time1 = X/I+timef;
			}
			writer.write(df.format(time2)+"\n");
		}
		reader.close();
		writer.flush();
		writer.close();
	}

}
