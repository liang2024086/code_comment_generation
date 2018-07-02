package methodEmbedding.Magic_Trick.S.LYD322;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MagicTrick {

	public MagicTrick(String inputFile){
		String[] decoupe = null;
		final String template = "Case #";
		StringBuilder result = new StringBuilder();
		int nbcas = 0, dec;
		int num = 0;
		int[] tab1 = {0, 0, 0, 0};
		int[] tab2 = {0, 0, 0, 0};
		int i, first = 0, value = 0;

		input = null;
		output = null;
		
		try {
			input = new BufferedReader(new FileReader(inputFile));
			output = new BufferedWriter(new FileWriter("magictrick.output"));
			nbcas = Integer.parseInt(input.readLine());
			dec = nbcas;
			while (dec > 0){
				num = Integer.parseInt(input.readLine());
				for (i = 0; i < num-1; i++)
					input.readLine();

				decoupe = input.readLine().split(" ");
				
				for (i = 0; i < 4; i++)
					tab1[i] = Integer.parseInt(decoupe[i]);

				for (i = 0; i < 4-num; i++)
					input.readLine();
				
				num = Integer.parseInt(input.readLine());

				for (i = 0; i < num-1; i++)
					input.readLine();

				decoupe = input.readLine().split(" ");
				for (i = 0; i < 4; i++)
					tab2[i] = Integer.parseInt(decoupe[i]);

				for (i = 0; i < 4-num; i++)
					input.readLine();
				
				for (i = 0; i < 4; i++){
					for (int j = 0; j < 4; j++){
						if (tab1[i] == tab2[j]){
							first++;
							value = tab1[i];
						}
					}
				}
				result.append(template).append(nbcas - dec + 1).append(": ");
				if (first == 0)
					result.append("Volunteer cheated!\n");
				else if (first == 1)
					result.append(value).append("\n");
				else
					result.append("Bad magician!\n");
				
				output.write(result.toString());
				result.delete(0, result.length());
				first = 0;
				dec--;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if (input != null)
					input.close();
				if (output != null)
					output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		new MagicTrick("A-small-attempt0.in");
		System.out.println("Traitement termin?");
	}
	
	BufferedReader input;
	BufferedWriter output;

}
