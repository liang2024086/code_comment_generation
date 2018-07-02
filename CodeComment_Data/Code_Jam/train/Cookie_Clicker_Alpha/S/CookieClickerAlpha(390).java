package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1287;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CookieClickerAlpha {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//----Alterar aqui----//
		String pacote = "qualificationround";						
		String nomeArqEntrada = "B-small-attempt3.in";
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

		for(int testCase=1; testCase <= totalTestCase; testCase++) {
			String linha = scanner.nextLine();
			String[] param = linha.split(" ");
			double custo = Double.parseDouble(param[0]);
			double taxaDeProducaoPorFarm = Double.parseDouble(param[1]);
			double objetivo = Double.parseDouble(param[2]);
			List<Double> tempos = new ArrayList<>();
			tempos.add(Double.MAX_VALUE);

			int i=0;
			while(true) {
				double tempo = 0.0;
				int farmsCompradas = 0;
				double taxaAtual = 2.0;
				double cookies = 0.0;

				while(true){
				if(farmsCompradas < i) {
					if(custo < objetivo) {
						double resto = custo - cookies;
						tempo += resto/taxaAtual;
						cookies = 0.0;
						taxaAtual += taxaDeProducaoPorFarm;
						farmsCompradas++;
					}
					else {
						double resto = objetivo - cookies;
						tempo += resto/taxaAtual;
						cookies = objetivo;			
						break;
					}
				}
				else {
					double resto = objetivo - cookies;
					tempo += resto/taxaAtual;
					cookies = objetivo;
					break;
				}
			}
				tempos.add(tempo);
				if(tempos.get(i+1) >= tempos.get(i)) {
					break;
				}
				i++;
			}			

			//imprime
			writer.printf("Case #%d: %.7f\n", testCase, + tempos.get(i));
			System.out.printf("Case #%d: %.7f\n", testCase, tempos.get(i));			

		}
		//---- Fim da l?gica ----//

		writer.close();
	}

}
