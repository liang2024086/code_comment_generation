package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1261;

import java.util.Locale;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double tempo, tempoT, tempoAnterior;
		double c, f, x;
		double velocidade;
		boolean menorTempo;
		
		Scanner sc = new Scanner (System.in);
		int casos = (sc.nextInt())+1;

		for (int i = 1; i < casos; i++) {
			tempo = 0;
			velocidade = 2;
			menorTempo = false;

			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			
			tempoAnterior = x/velocidade;
			
			while (!menorTempo){
				tempo += (c/velocidade);
				velocidade += f;
				tempoT = tempo;				
				tempoT += (x/velocidade);

				if (tempoT <= tempoAnterior){
					tempoAnterior = tempoT;

				}
				else {
					tempo = tempoAnterior;
					menorTempo = true;

				}



			}
	
			System.out.printf("Case #%d: %.7f\n", i , tempo);

		}
		sc.close();
		
	}

}
