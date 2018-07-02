package methodEmbedding.Counting_Sheep.S.LYD1360;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio1 {
	
	public static final String ficheroEntrada = 
			"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejercicio1_prueba.txt";
	public static final String ficheroSalida = 
			"/home/jesus/WORKSPACES/codejam2016/CodeJam2016/ficheros/ejercicio1_prueba_solucion.txt";
	
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
				
				String ret= "";
				Long N = Long.parseLong(br.readLine());
				Long index = 1L;
				
				if(N.equals(0L)){
					
					ret = "INSOMNIA";
				}
				else{
					
					String[] numeros= {"","","","","","","","","",""};
					boolean salir = false;
					Long X = index * N;
					while(!salir){
												
						String cadenaX = Long.toString(X);
						for(int j=0; j<cadenaX.length(); j++)
							if(numeros[Integer.parseInt(cadenaX.substring(j, j+1))].equals(""))
								numeros[Integer.parseInt(cadenaX.substring(j, j+1))] = "x";
						salir = true;
						for(int j=0; j<10; j++)
							if(numeros[j].equals(""))
								salir = false;
						
						index = index + 1;
						ret = Long.toString(X);
						X = index * N;
					}		
				}

				System.out.println("Case #" + i + ": " + ret);
				bw.write("Case #" + i + ": " + ret);
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
