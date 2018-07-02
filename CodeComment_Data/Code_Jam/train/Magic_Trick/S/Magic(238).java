package methodEmbedding.Magic_Trick.S.LYD1298;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Magic {
	public static void main(String args[]){
		int [][] matriz1=new int [4][4];
		int [][] matriz2=new int [4][4];
		
		File file = new File ("A-small-attempt1.in");
		File filEscritura = new File("result.in");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			PrintWriter pw = new PrintWriter(new FileWriter(filEscritura));
			String s ="";
			while((s=br.readLine())!=null){
				int nCasos = Integer.parseInt(s);
				if(nCasos>=1 && nCasos<=100){
					for(int cont=1;cont<=nCasos;cont++){
						s= br.readLine();
						int primeraFila = Integer.parseInt(s);
						int segundaFila;
						if(primeraFila>=1 &&primeraFila<=4){
							for (int filaMatriz=0;filaMatriz<4;filaMatriz++){
								String fila = br.readLine();
								
								String [] array = fila.split(" ");
								
								int colMatriz = 0;
								while(colMatriz<4){
									int num= Integer.parseInt(array[colMatriz]);
									if(num>=1 && num<=16){
										matriz1 [filaMatriz][colMatriz]= num;
									}
									colMatriz++;
								}
							}
							
							segundaFila = Integer.parseInt(br.readLine());
							
							if(segundaFila>=1 &&segundaFila<=4){
								for (int filaMatriz=0;filaMatriz<4;filaMatriz++){
									String fila = br.readLine();
									
									String [] array = fila.split(" ");
									
									int colMatriz = 0;
									while(colMatriz<4){
										int num= Integer.parseInt(array[colMatriz]);
										if(num>=1 && num<=16){
											matriz2 [filaMatriz][colMatriz]= num;
										}
										colMatriz++;
									}
								}
							}
							
							ArrayList <Integer> coinciden = new ArrayList<>();
									
							for(int i=0;i<matriz1.length;i++){
								for(int j=0;j<matriz2.length;j++){
									if(matriz1[primeraFila-1][i]==matriz2[segundaFila-1][j]){
										coinciden.add(matriz1[primeraFila-1][i]);
									}
								}
							}
							
							if(coinciden.size()==1){
								pw.println("Case #"+cont+": "+coinciden.get(0));
							}else if(coinciden.size()>1){
								pw.println("Case #"+cont+": "+"Bad magician!");
							}else if(coinciden.size()==0){
								pw.println("Case #"+cont+": "+"Volunteer cheated!");
							}
						}
					}
				}
				
			}
			br.close();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
