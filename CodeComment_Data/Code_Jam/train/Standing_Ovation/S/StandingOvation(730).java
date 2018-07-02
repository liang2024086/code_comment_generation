package methodEmbedding.Standing_Ovation.S.LYD1446;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StandingOvation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//----Alterar aqui----//
		String pacote = "qualificationround";						
		String nomeArqEntrada = "A-small-attempt0.in";
		//----Fim da altera??o----//

		int unused;
		Scanner scanner = null;
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("src\\" + pacote + "\\" + nomeArqEntrada + ".out", "UTF-8");
			scanner = new Scanner(new FileInputStream("src\\" + pacote + "\\" + nomeArqEntrada));
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		//---- Aqui vai a l?gica ----//
		int totalTestCase = Integer.parseInt(scanner.nextLine());
		System.out.println(totalTestCase);
		
		for(int testCase=1; testCase <= totalTestCase; testCase++) {
			String linhaCaso = scanner.nextLine();
			int audiencia = Integer.parseInt(linhaCaso.substring(0, 1));
			int offset = 2;
			int acumulado = 0;
			int amigos = 0;
			for(int shyness=0; shyness<=audiencia; shyness++) {
				int shypersons = Integer.parseInt(linhaCaso.substring(offset+shyness, offset+shyness+1));
				while(shyness > acumulado) {
					acumulado++;
					amigos++;
				}
				acumulado += shypersons;
			}

			//imprime
			writer.println("Case #" + testCase + ": " + amigos);
			System.out.println("Case #" + testCase + ": " + amigos);			
		}
		//---- Fim da l?gica ----//

		//----Trechos ?teis----//
		/* 	
		int totalTestCase = Integer.parseInt(scanner.nextLine());

		for(int testCase=1; testCase <= totalTestCase; testCase++) {
			String resp = null;
			String linha = scanner.nextLine();
			String[] param = linha.split(" ");
			long l1 = Long.parseLong(param[0]);
			long l2 = Long.parseLong(param[1]);

			for(int a=0; a<itensNaLoja; a++) {
				for(int b=a+1; b<itensNaLoja; b++) {
				//mais l?gica
				}
			}

			//imprime
			writer.println("Case #" + testCase + ": " + resp);
			System.out.println("Case #" + testCase + ": " + resp);			
		}

		 */
		//----Fim dos trechos ?teis----//

		writer.close();
	}
}
