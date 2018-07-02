package methodEmbedding.Cookie_Clicker_Alpha.S.LYD620;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class CookieClickerAlpha {

	private static String in;
	private static BufferedReader buff;
	private static File arquivo = new File("output.txt");
	private static FileOutputStream fos;
	private static int cases;

	public static void main(String[] args) {
		// Prepare output
		try {
			fos = new FileOutputStream(arquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}

		// Prepare input and reading first line
		try {
			buff = new BufferedReader(new FileReader("C:/Users/Arthur/Documents/Workspace Java/goojam/B-small-attempt0.in"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}
		try {
			in = buff.readLine();
			cases = Integer.parseInt(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		for (int i = 1; i <= cases; i++) {	
			try {
				in = buff.readLine();
			} catch (IOException e){
				e.printStackTrace();
				System.exit(0);
			}
			
			String[] tokens = in.split(" ");
			double tempo = 0;
			double custoFazenda = Double.parseDouble(tokens[0]);
			double bonusPorFazenda = Double.parseDouble(tokens[1]);
			double objetivo = Double.parseDouble(tokens[2]);
			double bonusPorSegundo = 2;
			
			double melhorTentativa = -1;
			
			/*
			Will simulate the time it would take to wait X  
			 * and compares with the last iteration.
			 * If the time increment, the last iteration was the best.
			 */
			while (true) {
				double tempoExtraAteX = objetivo/bonusPorSegundo;
				
				if (melhorTentativa != -1 && melhorTentativa < (tempo + tempoExtraAteX))
						break;
				
				melhorTentativa = tempo + tempoExtraAteX;
				tempo += custoFazenda/bonusPorSegundo;
				bonusPorSegundo += bonusPorFazenda;
			}
			
			//Print
			try {
				String res = "Case #" + i + ": " + melhorTentativa + System.getProperty("line.separator");
				fos.write(res.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
			
			
		}
	}
}
