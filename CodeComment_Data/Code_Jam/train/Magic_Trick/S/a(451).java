package methodEmbedding.Magic_Trick.S.LYD770;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());

		int row, cont, index = 0, c = 0, i,j;
		String [] a1 = null, a2 = null;
		String line;
		while (c++ < total) {

			row = Integer.parseInt(br.readLine().trim());
			for (i = 1; i <= 4; i++) {
				line  = br.readLine();
				if(i == row){
					a1 = line.trim().split("\\s");
				}
			}
			row = Integer.parseInt(br.readLine().trim());
			for (i = 1; i <= 4; i++) {
				line  = br.readLine();
				if(i == row){
					a2 = line.trim().split("\\s");
				}
			}
			
			cont = 0;
			for (i = 0; i < 4; i++) {
				for (j = 0; j < 4; j++) {
					if(a1[i].equals(a2[j]))
					{
						cont++;
						index = i;
						
					}
				}
			}
			
			line = "Case #"+c+": ";
			if(cont == 0){
				System.out.println(line + "Volunteer cheated!");
			}
			else if(cont == 1){
				System.out.println(line + a1[index]);
			}
			else{
				System.out.println(line + "Bad magician!");
			}
		}
	}

}
