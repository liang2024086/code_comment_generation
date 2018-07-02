package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1369;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieClickerAlpha {
	private static String in;
	private static BufferedReader buf;
	private static File arquivo = new File("output.txt");
	private static FileOutputStream fos;
	private static int cases;

	public static void main(String[] args) {
		// Preparando output
		try {
			fos = new FileOutputStream(arquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}

		// Preparando input e lendo primeira linha
		buf = new BufferedReader(new InputStreamReader(System.in));
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
			
			/*Vai simulando o tempo que levaria pra esperar X e compara com
			 * o da ultima itera??o. Se o tempo aumento, o da ultima itera??o
			 * era o melhor.
			 */
			//Se n?o entendeu pensa de novo
			//E de novo
			while (true) {
				double tempoExtraAteX = objetivo/bonusPorSegundo;
				
				if (melhorTentativa != -1 && melhorTentativa < (tempo + tempoExtraAteX))
						break;
				
				melhorTentativa = tempo + tempoExtraAteX;
				tempo += custoFazenda/bonusPorSegundo;
				bonusPorSegundo += bonusPorFazenda;
			}
			
			//Imprime
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
