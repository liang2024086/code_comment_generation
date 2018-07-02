package methodEmbedding.Revenge_of_the_Pancakes.S.LYD71;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *
 * @author gitanshu.behal
 * Created on : 09-Apr-2016
 *
 */

public class Ques2 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(
				new FileReader("/home/local/JASPERINDIA/gitanshu.behal/Desktop/Jam/Q2/input1.in"));
		BufferedWriter wr = new BufferedWriter(
				new FileWriter("/home/local/JASPERINDIA/gitanshu.behal/Desktop/Jam/Q2/output1.out"));

		int testCases = Integer.parseInt(br.readLine());
		for (int I = 1; I <= testCases; I++) {

			Helper panCakes = new Helper(br.readLine());
			wr.write("Case #" + I + ": " + Integer.toString(panCakes.solve()));
			wr.newLine();
		}
		wr.close();
	}
}
