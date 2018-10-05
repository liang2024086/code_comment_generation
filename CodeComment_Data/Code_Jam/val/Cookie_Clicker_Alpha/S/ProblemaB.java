package methodEmbedding.Cookie_Clicker_Alpha.S.LYD863;

import java.util.Scanner;

/* Cookie Clicker Alpha */

public class ProblemaB {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Integer qtdExecucoes = in.nextInt();

		Integer caso = 1;
		
		while(qtdExecucoes > 0){
			
			Double cookieSegundo = 2.0;
			Double tempoTotal = 0.0;
			
			Double custoFazenda = Double.valueOf( in.next() );
			Double fatorCookieSegundo = Double.valueOf( in.next() );
			Double qtdCookieNecessaria = Double.valueOf( in.next() );
			
			Double tempoBase = qtdCookieNecessaria / cookieSegundo;
			
			while(true){
				
				Double tempoDaCompra = custoFazenda / cookieSegundo;
				cookieSegundo += fatorCookieSegundo;
				
				Double tempoNovo = qtdCookieNecessaria / cookieSegundo;
				Double tempoComCompra = tempoDaCompra + tempoNovo;
				
				if(tempoBase <= tempoComCompra) {
					tempoTotal += tempoBase;
					System.out.println("Case #" + caso++ + ": " + tempoTotal);
					break;
				} else {
					tempoBase = tempoNovo;
					tempoTotal += tempoDaCompra;					
				}
			}
			
			qtdExecucoes--;
		}
	}
	
}
