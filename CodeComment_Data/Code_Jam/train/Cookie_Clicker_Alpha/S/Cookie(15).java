package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1055;



import java.util.Locale;
import java.util.Scanner;

public class Cookie {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int qtde = sc.nextInt();
		double valorFazenda, taxa, valorDesejado,  taxaAnterior=2;
		double tempo=0, tempoTotal=0;
		
		double tempoComFazenda = 0;
		double tempoSemFazenda = 0;
		
		for(int i = 1; i<= qtde; i++){
			valorFazenda = sc.nextDouble();
			taxa = sc.nextDouble();
			valorDesejado = sc.nextDouble();
			
			//CHEGUEI NO VALOR DA FAZENDA
			tempoSemFazenda = valorDesejado/2;
			tempoComFazenda = valorFazenda/2;
			
			if(tempoSemFazenda-tempoComFazenda < 0){
				System.out.printf("Case #%d: %.7f\n",i,tempoSemFazenda);
			}else{
				tempoTotal += tempoComFazenda;
				//System.out.println("Primeiro Tempo "+ tempoComFazenda);
				int j = 0;
				while(true){
					//System.out.println("================");
					
					if(j!=0){
						tempoTotal += valorFazenda/taxaAnterior;
						//System.out.println("Somei "+(valorFazenda/taxaAnterior));
					}
					//System.out.println("Tempo Tottal"+tempoTotal);

					//System.out.println("Taxa semFazenda "+taxaAnterior);
					tempoSemFazenda = ((valorDesejado-valorFazenda)/taxaAnterior);
					//System.out.println("Tempo sem fazenda"+tempoSemFazenda);
					
					taxaAnterior+=taxa;
					
					tempoComFazenda = valorDesejado/taxaAnterior;
					//System.out.println("Tempo com fazenda"+ tempoComFazenda);
					
					if(Double.compare(tempoSemFazenda, tempoComFazenda) < 0){
						tempoTotal += tempoSemFazenda;
						System.out.printf("Case #%d: %.7f\n",i,tempoTotal);
						//System.out.println(tempoTotal);
						//System.out.println("Quebrei");
						break;
					}
					j++;
				}
				tempoTotal = 0;
				taxaAnterior = 2;
				j = 0;
				
			}
		}
	}
	
}
