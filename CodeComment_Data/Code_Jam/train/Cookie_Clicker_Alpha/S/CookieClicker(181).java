package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1207;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CookieClicker {

	public CookieClicker(String inputFile){
		final String template = "Case #";
		StringBuilder result = new StringBuilder();
		input = null;
		output = null;
		int nbcas, dec, i;
		String[] decoupe = null;
		
		int N = 0;
		double C, F, X, value, curr;
		try {
			input = new BufferedReader(new FileReader(inputFile));
			output = new BufferedWriter(new FileWriter("cookieclicker.output"));
			
			nbcas = Integer.parseInt(input.readLine());
			dec = nbcas;
			while (dec > 0){
				decoupe = input.readLine().split(" ");
				C = Double.parseDouble(decoupe[0]);
				F = Double.parseDouble(decoupe[1]);
				X = Double.parseDouble(decoupe[2]);
				value = X/2.0;
				N = 0;
				do{
					curr = 0.0;
					N++;
					for (i = 0; i < N; i++){
						curr += C/(2.0 + i*F);
					}
					curr += X/(2.0 + N*F);
					if (curr < value)
						value = curr;
					else
						break;
				} while (true);
				
				result.append(template).append(nbcas - dec + 1).append(": ");
				output.write(String.format("%s%.7f\n", result.toString(), value));
				
				result.delete(0, result.length());
				
				dec--;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if (input != null)
					input.close();
				if (output != null)
					output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {

		new CookieClicker("C:\\Users\\The Best\\Downloads\\B-small-attempt1.in");
		System.out.println("Traitement termin?");
	}

	BufferedReader input;
	BufferedWriter output;
}
