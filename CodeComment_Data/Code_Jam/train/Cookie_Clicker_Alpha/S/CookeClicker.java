package methodEmbedding.Cookie_Clicker_Alpha.S.LYD519;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class CookeClicker {
	
	public static void main(String[] args) throws IOException {
		double c = 0, f = 0, x = 0, ff, total;
		int t= 0;
		
		FileReader input = null;
		try {
			input = new FileReader("B-small-attempt0.in");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    BufferedReader br = new BufferedReader(input);
		
	    String line = br.readLine();
		t = Integer.parseInt(line);
		
		for (int i = 0; i<t; i++){
			total = 0;
			ff = 2.0;
			line = br.readLine();
			String[] aux = line.split(" ");
			c = Double.parseDouble(aux[0]);
			f = Double.parseDouble(aux[1]);
			x = Double.parseDouble(aux[2]);
			
			while ((c/ff+x/(ff+f))<(x/ff)){
				total = total + c/ff;
				ff+=f;
			}
			DecimalFormat df = new DecimalFormat("#.#######");
			System.out.println("Case #"+(i+1)+": "+df.format(total+x/ff));
		}
	}
}
