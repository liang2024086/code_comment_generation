package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1063;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class CookieClickerAlpha {
	private static String in;
	private static BufferedReader buf;
	private static File arquivo = new File("output.txt");
	private static FileOutputStream fos;
	private static int cases;

	public static void main(String[] args) {
		// Preparing output
		try {
			fos = new FileOutputStream(arquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}

		// Preparing input and reading the first line
		try {
			buf = new BufferedReader(new FileReader("E:/eclipse-standard-kepler-SR2-win32/cfm/workspace/B-small-attempt0.in"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}
		try {
			in = buf.readLine();
			cases = Integer.parseInt(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		for (int i = 1; i <= cases; i++) {	
			try {
				in = buf.readLine();
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
			
			/*Simulating */
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
