package methodEmbedding.Magic_Trick.S.LYD1375;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class MagickTrick {

	private static final int BUFFER_SIZE = 32768;

	public static void main(String[] args) throws Exception {

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		BufferedWriter out = new BufferedWriter(new FileWriter(args[1]), BUFFER_SIZE);

		String line = in.readLine();

		long T = Long.parseLong(line);

		for(int i = 1; i <= T; i++){

			int[] freqs = new int[17];

			for(int j = 0; j < 2; j++){
				
				line = in.readLine();
				
				int chosenRowNbr = Integer.parseInt(line)-1;

				for(int k = 0; k < 4; k++){
					line = in.readLine();

					if(k == chosenRowNbr){
						String[] rowStr = line.split(" ");
						for(int l = 0; l < 4; l++){
							++freqs[Integer.parseInt(rowStr[l])]; 
						}
					}
				}

			}
			
			int ans = -1;
			int nbrOfRepeatedCards = 0;
			for(int j = 0; j < freqs.length; j++){
				if(freqs[j] > 1){
					++nbrOfRepeatedCards;
					ans = j;
				}
			}
			
			if(nbrOfRepeatedCards == 1){
				out.write("Case #" + i + ": " + ans + '\n');
			} else if(nbrOfRepeatedCards == 0){
				out.write("Case #" + i + ": " + "Volunteer cheated!" + '\n');
			} else {
				out.write("Case #" + i + ": " + "Bad magician!" + '\n');
			}
		}
		
		out.close();
	}

}
