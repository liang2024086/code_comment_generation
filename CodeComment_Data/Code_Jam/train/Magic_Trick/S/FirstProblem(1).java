package methodEmbedding.Magic_Trick.S.LYD1321;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class FirstProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberTests = 0;
		int result;
		int first_answer = 0, second_answer = 0, contor = 0;
		int[] first_array, second_array;
		int i = 0, number_elements = 0;

		first_array = new int[4];
		second_array = new int[4];

		String fileName = "A-small-attempt0.in";

		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader bufferReader = new BufferedReader(inputFile);

			FileWriter fstream = new FileWriter("output");
			BufferedWriter outputbuffer = new BufferedWriter(fstream);
			String line;

			line = bufferReader.readLine();
			numberTests = Integer.parseInt(line); // numarul de teste
	

			int nr = 0;
			while (nr < numberTests) {
				
				
				line = bufferReader.readLine();
				first_answer = Integer.parseInt(line); // primul raspuns
				contor = 0;

				// parcurg pana la linia resp
				while (contor < first_answer) {
					line = bufferReader.readLine();
					contor++;
				}

				// introduc in first_array elementele
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreElements()) {
					first_array[number_elements] = Integer.parseInt(st
							.nextToken());
					number_elements++;
				}

				// parcurg urmatoarele linii pana termin
				while (contor < 4) {
					line = bufferReader.readLine();
					contor++;
				}

				// al doilea raspuns
				second_answer = Integer.parseInt(bufferReader.readLine());
				// parcurg pana la linia respectiva
				contor = 0;
				while (contor < second_answer) {
					line = bufferReader.readLine();
					contor++;
				}

				StringTokenizer st2 = new StringTokenizer(line);
				// introduc elementele in al doilea vector
				number_elements = 0;
				while (st2.hasMoreElements()) {
					second_array[number_elements] = Integer.parseInt(st2
							.nextToken());
					number_elements++;
				}

				// termin de parcurs
				while (contor < 4) {
					line = bufferReader.readLine();
					contor++;
				}
			
				// aflu elementele comune din vectori
				int j = 0, common_elements = 0, correct_card = 0;
				for (i = 0; i < 4; i++) {
					for (j = 0; j < 4; j++) {
						if (first_array[i] == second_array[j]) {
							correct_card = first_array[i];
							common_elements++;
						}
					}
				}
				
				nr++;
				if (common_elements > 1) {
					
					outputbuffer.write("Case #" + nr + ":" + " "
							+ "Bad magician!" + "\n");
				}
				if (common_elements == 1) {
					
					outputbuffer
							.write("Case #" + nr + ":" + " " + correct_card + "\n");
				}
				if (common_elements == 0) {
					
					outputbuffer.write("Case #" + nr + ":" + " "
							+ "Volunteer cheated!" + "\n");
				}
				
				number_elements = 0;
				
			}
			
			bufferReader.close();
			outputbuffer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
