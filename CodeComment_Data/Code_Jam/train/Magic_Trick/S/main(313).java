package methodEmbedding.Magic_Trick.S.LYD1420;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int rta1;
		int rta2;
		String temp;
		String [] arr1 = new String[4];
		String [] arr2 = new String[4];
		String path = "./A-small-attempt1";
		String resCase;
		
		try {
			FileReader fileR = new FileReader(path + ".in");
			BufferedReader reader = new BufferedReader(fileR);
			
			FileWriter fileW = new FileWriter(path + ".out");
			PrintWriter writer = new PrintWriter(fileW);
			
			int numTestCase = Integer.parseInt(reader.readLine());
			
			for (int i=1; i<=numTestCase ; i++){
				resCase = "";
				rta1 = Integer.parseInt(reader.readLine());
				for (int j=1 ; j<=4 ; j++){
					temp = reader.readLine();
					if (j == rta1){
						arr1 = temp.split(" ");
					}
				}
				
				rta2 = Integer.parseInt(reader.readLine());
				for (int j=1 ; j<=4 ; j++){
					temp = reader.readLine();
					if (j == rta2){
						arr2 = temp.split(" ");
					}
				}
				
				for (int j=0 ; j<4 ; j++){
					for (int k=0 ; k<4 ; k++){
						if( arr1[j].equals(arr2[k]) ){
							if(resCase.equals("")){
								resCase = arr1[j];
							}else{
								resCase = "Bad magician!";
							}
						}
					}
				}
				
				if(resCase.equals("")){
					resCase = "Volunteer cheated!";
				}
				
				writer.println("Case #" + i + ": " + resCase);
			}
			writer.close();
			fileW.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
