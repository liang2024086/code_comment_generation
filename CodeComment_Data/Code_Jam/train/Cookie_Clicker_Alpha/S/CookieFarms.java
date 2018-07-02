package methodEmbedding.Cookie_Clicker_Alpha.S.LYD693;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class CookieFarms {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("/home/peddis/datafiles/data2ex.in"));
		String line= br.readLine();	int loopnum=1;
		while (null != (line = br.readLine())) {
			String[] input = line.split(" ");
			Double farmC = Double.parseDouble(input[0]);
			Double addF = Double.parseDouble(input[1]);
			Double maxX = Double.parseDouble(input[2]);			
			double produceC = 2; double time=0.0;
			while(true){
				double t1 = farmC/produceC;
				double t2 = maxX/produceC;
				produceC = addF+produceC;
				if(t2 > t1 + maxX/produceC){
					time = time + t1;
				}
				else {
					time = time + t2;
					break;
				}				
			}
			double finalValue = Math.round( time * 10000000.0 ) / 10000000.0;
			System.out.println("Case #"+ loopnum++ +": "+finalValue);
		}
	}
}
