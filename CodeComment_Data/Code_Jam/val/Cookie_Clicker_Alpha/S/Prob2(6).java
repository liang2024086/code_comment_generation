package methodEmbedding.Cookie_Clicker_Alpha.S.LYD242;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Prob2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String inputName="tester2.txt";
		FileReader fileReader = new FileReader (inputName); 
		BufferedReader br = new BufferedReader (fileReader); 
		String line1= br.readLine();
		int tests= Integer.decode (line1);
		for (int i = 1; i <= tests; i++) {
			String line=br.readLine();
			String[] numbers=line.split(" ");
			double c= Double.parseDouble(numbers[0]);
			double f= Double.parseDouble(numbers[1]);
			double x= Double.parseDouble(numbers[2]);
			double time=0.0;
			double gain=2.0;
			while (true) {
				//at this point there are 0 cookies.
				if (x/gain<=c/gain+x/(gain+f)) {
					time+=x/gain;
					break;
				}
				else {
					time+=c/gain;
					gain+=f;
				}
			}
			System.out.println("case #"+i+": "+time);
		}
	}
}
