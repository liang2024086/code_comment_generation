package methodEmbedding.Magic_Trick.S.LYD1297;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MagicTrick {

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
			String resp = null;
			int[][] cartas = new int[2][4];
			int linhaDaCarta = 0;
			int linhaCorrente = 0;
			for(int vez=0; vez<2; vez++) {
				linhaDaCarta = Integer.parseInt(scanner.nextLine());
				String[] linha = null;
				for(linhaCorrente=0; linhaCorrente<linhaDaCarta; linhaCorrente++) {
					linha = scanner.nextLine().split(" ");
				}

				cartas[vez][0] = Integer.parseInt(linha[0]);
				cartas[vez][1] = Integer.parseInt(linha[1]);
				cartas[vez][2] = Integer.parseInt(linha[2]);
				cartas[vez][3] = Integer.parseInt(linha[3]);
				for(; linhaCorrente<4; linhaCorrente++) {
					scanner.nextLine().split(" ");
				}

			}
			int contCartasIguais = 0;
			int valorCarta = 0;
			for(int pos1=0; pos1<4; pos1++) {
				for(int pos2=0; pos2<4; pos2++) {
					if(cartas[0][pos1] == cartas[1][pos2]) {
						valorCarta = cartas[0][pos1]; 
						contCartasIguais++;
					}
				}	
			}

			if(contCartasIguais == 0) resp = "Volunteer cheated!";
			else if(contCartasIguais == 1) resp = String.valueOf(valorCarta);
			else resp = "Bad magician!";

			//imprime
			writer.println("Case #" + testCase + ": " + resp);
			System.out.println("Case #" + testCase + ": " + resp);			
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
