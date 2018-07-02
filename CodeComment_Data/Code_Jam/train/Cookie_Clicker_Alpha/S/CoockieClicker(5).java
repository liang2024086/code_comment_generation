package methodEmbedding.Cookie_Clicker_Alpha.S.LYD157;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStreamReader;


public class CoockieClicker {
	
	private static String in;
	private static BufferedReader buffer;
	private static File arquivo = new File("output.txt");
	private static FileOutputStream fos;
	private static int casos;
	
	
	public static void main(String[] args) {
		
		//inicializa o output
		try {
			fos = new FileOutputStream(arquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}
		//le a entrada
		try {
			buffer = new BufferedReader(new FileReader("C:/Users/Yuji/workspace/teste/B-small-attempt0.in"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}
		
		//le quantos casos serao feitos
		try {
			in = buffer.readLine();
			casos = Integer.parseInt(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		//vai testando [
		for (int i = 1; i <= casos; i++) {
			
			try {
				in = buffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
			
			String[] ratios = in.split(" ");
			
			double custoFazenda = Double.parseDouble(ratios[0]);
			double coockieFazenda = Double.parseDouble(ratios[1]);
			double coockieFinal = Double.parseDouble(ratios[2]);
			
			double coockieProducao = 2;
			
			double tempo = 0;
			double melhorTentativa = 0;
			
			while(true){
				double tempoAteX = coockieFinal/coockieProducao;
				melhorTentativa = custoFazenda/coockieProducao + coockieFinal/(coockieProducao+coockieFazenda);
				if (melhorTentativa<tempoAteX){
					tempo += custoFazenda/coockieProducao;
					coockieProducao += coockieFazenda;
				}else{
					tempo += tempoAteX;
					break;
				}
				
			}
			
			/*while (true) {
				double tempoExtraAteX = coockieFinal/coockieProducao;
				
				if (melhorTentativa != -1 && melhorTentativa < (tempo + tempoExtraAteX))
					break;
					
				melhorTentativa = tempo + tempoExtraAteX;
				tempo += custoFazenda/coockieProducao;
				coockieProducao += coockieFazenda;
			}*/

				
				/*coockieAtual += coockieProducao;
				tempo += 1;
				if (coockieAtual == custoFazenda){
					double A = (coockieFinal - coockieAtual)/coockieProducao;
					double B = (coockieFinal)/(coockieProducao+coockieFazenda);
					if(B>A){
						coockieProducao += coockieFazenda;
						coockieAtual = 0;
					}
				}*/
			try {
				String res = "Case #" + i + ": " + tempo + System.getProperty("line.separator");
				fos.write(res.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

}
