package methodEmbedding.Magic_Trick.S.LYD3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class ejericio1sln {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\SantiagoG\\Desktop\\A-small-attempt0.in");
		File fout =  new File("C:\\Users\\SantiagoG\\Desktop\\output.txt");
		BufferedReader input;
		BufferedWriter output;
		int numeroCasos = 0;
		int[][] arregloCartas1 = new int[4][4];
		int [][] arregloCartas2 = new int[4][4];
		int filaArreglo1 = 0;
		int filaArreglo2 = 0;
		boolean arreglo1 = false;
		boolean arreglo2 = false;
		try {
			input = new BufferedReader(new FileReader(f));
			output = new BufferedWriter(new FileWriter(fout));
			String[] cartas;
			numeroCasos = Integer.parseInt(input.readLine());
			String linea = "";
			arreglo1 = true;
			arreglo2 = true;
			int cont = 0;
			boolean encontrada = true;
			int contadorCasos = 1;
			
			while(contadorCasos <= numeroCasos && linea!=null){
				if (arreglo1){
					filaArreglo1 = Integer.parseInt(input.readLine());
					for (int i = 0; i<4;i++){
						linea = input.readLine();
						cartas = linea.split(" ");
						for (int j = 0; j<4;j++){
							arregloCartas1[i][j] = Integer.parseInt(cartas[j]);
						}
					}
					arreglo1=false;
				}
				if (arreglo2){
					filaArreglo2 = Integer.parseInt(input.readLine());
					for (int i = 0; i<4;i++){
						linea = input.readLine();
						cartas = linea.split(" ");
						for (int j = 0; j<4;j++){
							arregloCartas2[i][j] = Integer.parseInt(cartas[j]);
						}
					}
					arreglo2=false;
				}
				int numeroEncontrado = 0;
				for (int i = 0; i<4;i++){
					for (int j = 0; j<4;j++){
						if(arregloCartas1[filaArreglo1-1][i] == arregloCartas2[filaArreglo2-1][j]){
							cont++;
							encontrada = true;
							numeroEncontrado = arregloCartas1[filaArreglo1-1][i];
						}
					}
				}
				if(encontrada && cont == 1){
					output.write("Case #"+contadorCasos+": "+numeroEncontrado+"\r"+"\n");
				}else if (encontrada && cont >1){
					output.write("Case #"+contadorCasos+": Bad magician!"+"\r"+"\n");
				}else{
					output.write("Case #"+contadorCasos+": Volunteer cheated!"+"\r"+"\n");
				}
				arreglo1 = true;
				arreglo2 =true;
				contadorCasos++;
				cont =0;
			}
			input.close();
			output.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
