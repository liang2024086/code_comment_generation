package methodEmbedding.Magic_Trick.S.LYD1735;



import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtde = sc.nextInt();
		for(int i = 1; i <= qtde; i++){
			int total = 0;
			int linhaA = sc.nextInt();
			int[][] numerosA = new int[5][4];
			for(int j = 1; j < 5; j++){
				for(int k = 0; k < 4; k++){
					numerosA[j][k] = sc.nextInt();
				}
			}
			int linhaB  = sc.nextInt();
			int[][] numerosB = new int[5][4];
			for(int j = 1; j < 5; j++){
				for(int k = 0; k< 4; k++){
					numerosB[j][k] = sc.nextInt();
				}
			}
			int resposta = 0;
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					if(numerosA[linhaA][j] == numerosB[linhaB][k]){
						total+= 1;
						resposta = numerosA[linhaA][j];
					}
				}
			}
			if(total == 0){
				System.out.println("Case #"+i+": Volunteer cheated!");
			}
			else if(total >=2){
				System.out.println("Case #"+i+": Bad magician!");
			}else{
				System.out.println("Case #"+i+": "+resposta);
			}
		}

	}

}
