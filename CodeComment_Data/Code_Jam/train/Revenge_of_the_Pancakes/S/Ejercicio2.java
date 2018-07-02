package methodEmbedding.Revenge_of_the_Pancakes.S.LYD93;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio2 {
	
	public static final String ficheroEntrada = 
			//"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejercicio2_prueba.txt";
			"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejercicio2_corto.txt";
			//"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejercicio2_largo.txt";
	public static final String ficheroSalida = 
			//"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejericio2_prueba_solucion.txt";
			"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejercicio2_corto_solucion.txt";
			//"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejercicio2_largo_solucion.txt";
	
	public static void main(String[] args) {
		
		FileWriter fiw 	= null;
		BufferedWriter bw = null;
		FileReader fir = null;
		BufferedReader br = null;
				
		try {
			
			fiw = new FileWriter(ficheroSalida);
			bw = new BufferedWriter(fiw);
			fir = new FileReader(ficheroEntrada);
			br = new BufferedReader(fir);
			
			Integer count = Integer.parseInt(br.readLine());
			for(int i=1; i<=count; i++){
				
				Integer vueltas = 0;
				String linea = br.readLine();
				System.out.println(linea);
				
				while(linea.contains("-")){
					
					Integer indice = 0;
					
					if(linea.charAt(0) == '+')				
						indice = linea.indexOf('-')-1;
					else
						indice = linea.lastIndexOf('-');

					if(indice == -1)
						indice = linea.length();					
					
					String orden = "";
					int j = 0;
					do{
						
						if(linea.charAt(j) == '+')
							orden = orden + "-";
						else
							orden = orden + "+";
						j = j +1;
					}while(j <= indice);
					
					linea = orden + linea.substring(indice + 1);
					System.out.println(linea);
					vueltas = vueltas + 1;
				}
				
				
				System.out.println("Case #" + i + ": " + vueltas);
				bw.write("Case #" + i + ": " + vueltas);
				bw.newLine();
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				br.close();
				fir.close();
				bw.close();
				fiw.close();
				
			} catch (Exception e2) {
				
				e2.printStackTrace();
			}
		}
	}
}
