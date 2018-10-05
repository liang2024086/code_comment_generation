package methodEmbedding.Standing_Ovation.S.LYD2218;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ProblemA {
	
	public static void main(String[] args) {
		
		try {
			
			FileWriter fiw = new FileWriter("/home/jesus/WORKSPACES/codejm2015a/CodeJam2015/ficheros/A-small-attempt0.in_sol");
			BufferedWriter bw = new BufferedWriter(fiw);
			FileReader fir = new FileReader("/home/jesus/WORKSPACES/codejm2015a/CodeJam2015/ficheros/A-small-attempt0.in");
			BufferedReader br = new BufferedReader(fir);
			
			String linea = null;
			while((linea = br.readLine()) != null) {
				
				Integer T = Integer.parseInt(linea);
				for(int i=0; i<T; i++) {
					
					int ret = 0;
					// hay infinitos clientes
					String[] datos = br.readLine().split(" ");
					
					// Un miembro con un nivel de timidez Si debe esperar hasta que Si miembros de la udicencia se hayan levantado
					// antes de poder levantarse
					// Si Si = 0 el miembro siempre se levantara independientemente de lo que hagan los demas
					// Hay que invitar a los miembros necesarios para que todos aplaudan
					// Cada invitado puede tener el nivel de timidez que queramos, no necesariamente el mismo
					// Cual es el minimo n??mero de invitados necesarios?
					
					Integer max_timidez = Integer.parseInt(datos[0]);
					if(!max_timidez.equals(0)) {
						Integer[] timidez = new Integer[datos[1].length()];
						for(int j=0; j<datos[1].length(); j++)
							timidez[j] = Integer.parseInt(datos[1].substring(j, j+1));
						//timidez[0] siempre se levantas
						//timidez[1] se levanta si timidez[0] >= timidez[1] ...
						
						int total_levantados = timidez[0];
						for(int j=0; j<max_timidez; j++){
							
							if(total_levantados < j + 1) {
								ret = ret + ( (j+1) - total_levantados);
								total_levantados = total_levantados + ( (j+1) - total_levantados);
							}
							total_levantados = total_levantados + timidez[j+1];
						}
					}
					System.out.println("Case #" + (i+1) + ": " + ret);
					bw.write("Case #" + (i+1) + ": " + ret);
					bw.newLine();
				}
			}
			
			br.close();
			fir.close();
			bw.close();
			fiw.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
