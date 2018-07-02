package methodEmbedding.Magic_Trick.S.LYD2212;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class A {


	public static void main(String[] args) {
		try {			
		
			BufferedReader buf = new BufferedReader(new FileReader(new File("/Users/Shefali/VIKAS/Eeclipse_workspace/CodeJam/src/A.in")));
			
			int T = Integer.parseInt(buf.readLine());	
			String [] cardsRow1 = new String[] {};
			String [] cardsRow2 = new String[] {};
			
			for (int i=0; i<T; i++) {				
				int row1 = Integer.parseInt(buf.readLine());
				for (int j=0; j<4; j++) {	
					String str = buf.readLine();
					if (j+1 == row1) {
						cardsRow1 = str.split(" ");
					}
				}
				int row2 = Integer.parseInt(buf.readLine());
				for (int j=0; j<4; j++) {	
					String str = buf.readLine();
					if (j+1 == row2) {
						cardsRow2 = str.split(" ");
					}
				}
				String result = "Volunteer cheated!";
				int cnt = 0;
				for (int j=0; j<4; j++) {	
					for (int k=0; k<4; k++) {	
						if (cardsRow1[j].equals(cardsRow2[k])) {
							result = cardsRow1[j];
							cnt++;
							if (cnt>1) {
								result = "Bad magician!";
								break;
							}								
						}
					}
					if (cnt>1) break;
				}				

				System.out.println("Case #" + (i+1) + ": " + result);
			}
			
		}
		catch (IOException e) {	
			e.printStackTrace();
		} 
	}

}
