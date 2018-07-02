package methodEmbedding.Speaking_in_Tongues.S.LYD1508;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class FileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long casos = 0; //cantidad de casos a leer
		long lineasporcaso = 1; //lineas que tiene cada caso
		boolean numlineasvar = false; //si cada vez cambia el n?mero de lineas
		try{
			// Open the file that is the first 
			// command line parameter
			FileInputStream fstream = new FileInputStream("c:\\fichero.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			//Read File Line By Line
			strLine = br.readLine();
			casos = Long.parseLong(strLine);
			for (int i=0; i<casos; i++){
				if (numlineasvar){
					lineasporcaso = Long.parseLong(br.readLine());
				}
				List<String> lineas = new ArrayList<String>();
				for(int j=0; j<lineasporcaso; j++){
					lineas.add(br.readLine());
				}
				
			Solver solucionador = new Langoogle(lineas);
			System.out.println("Case #"+(i+1)+": "+solucionador.solve());
				
				
				
			}
			//Close the input stream
			in.close();
		}
		catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
			}
		}
}
