package methodEmbedding.Standing_Ovation.S.LYD1973;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Oditoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int nombreCas = in.nextInt();

		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= nombreCas; i++) {
			int sMax = in.nextInt();

			char[] auditoire = in.next().toCharArray();
			int index = 0;
			int invite = 0;

			while (index < sMax) {
				int current = Character.getNumericValue(auditoire[index]);
				if (current == 0) {
					invite++;
					index++;
				} else if(current == 1){
					index++;
				}else{
					int tmpIndex = index + current;
					index++;
					while(index < sMax && index < tmpIndex){
						tmpIndex += Character.getNumericValue(auditoire[index]);
						index++;
					}
				}
			}
			result.append("Case #").append(i).append(": ").append(invite).append("\n");
		}

		FileWriter writer = null;

		try {
			writer = new FileWriter("C:\\Users\\Jeff\\Documents\\codejam\\out.txt", false);
			writer.write(result.toString(), 0, result.length());
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
