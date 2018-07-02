package methodEmbedding.Magic_Trick.S.LYD579;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Magician {
	
	public static void main(String[] args) {
		File archivo = new File(args[0]);
		FileReader fr;
		String linea;
		int i = 0,  ocurrences = 0, caso = 0; //,casos = 0;
		String vector_aux_1[] = new String[4], vector_aux_2[] = new String[4], trick = new String();
		int num_line_1 = 0, num_line_2 = 0;
		BufferedReader br = null;
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while ((linea = br.readLine()) != null) {
				i++;
				if (i == 1) {
					//casos = Integer.parseInt(linea);
				} else {
					switch (i){
						case 2: 
							caso++;
							num_line_1 =  Integer.parseInt(linea);
							break;
						case 3:			
							if (num_line_1 == 1){
								vector_aux_1 = linea.split(" ");
							}
							break;
						case 4:
							if (num_line_1 == 2){
								vector_aux_1 = linea.split(" ");
							}
							break;
						case 5:
							if (num_line_1 == 3){
								vector_aux_1 = linea.split(" ");
							}
							break;
						case 6: 
							if (num_line_1 == 4){
								vector_aux_1 = linea.split(" ");
							}
							break;
						case 7: 
							num_line_2 =  Integer.parseInt(linea);
							break;
						case 8:			
							if (num_line_2 == 1){
								vector_aux_2 = linea.split(" ");
							}
							break;
						case 9:
							if (num_line_2 == 2){
								vector_aux_2 = linea.split(" ");
							}
							break;
						case 10:
							if (num_line_2 == 3){
								vector_aux_2 = linea.split(" ");
							}
							break;
						case 11: 
							if (num_line_2 == 4){
								vector_aux_2 = linea.split(" ");
							}
							for (int j = 0; j < vector_aux_1.length; j++){
								for (int k = 0; k < vector_aux_2.length; k++){
									if (vector_aux_1[j].equals(vector_aux_2[k])){
										ocurrences++;
										trick = vector_aux_1[j];
									}
									
								}
							}
							
							if (ocurrences == 1){
								System.out.println("Case #" + caso + ": " + trick );
							}else if(ocurrences > 1){
								System.out.println("Case #" + caso + ": " + "Bad magician!" );
							}else if (ocurrences < 1){
								System.out.println("Case #" + caso + ": " + "Volunteer cheated!" );
							}
							
							ocurrences = 0;
							i = 1;
							break;
					}
					
					

				}
			}
			
			

		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
