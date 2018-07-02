package methodEmbedding.Magic_Trick.S.LYD1823;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {


		FileInputStream fis = new FileInputStream("A-small-attempt0.in");
		DataInputStream in = new DataInputStream(fis);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		int casesNumber=Integer.parseInt(br.readLine());

		for (int i = 0; i < casesNumber; i++) {
			int firstChoice=Integer.parseInt(br.readLine())-1;
			List<String> firstGrid=new ArrayList<String>();
			for (int j = 0; j < 4; j++) {
				firstGrid.add(br.readLine());
			}
			int secondChoice=Integer.parseInt(br.readLine())-1;
			List<String> secondGrid=new ArrayList<String>();
			for (int j = 0; j < 4; j++) {
				secondGrid.add(br.readLine());
			}

			String[] firstChoiceNumbers=firstGrid.get(firstChoice).split(" ");
			String[] secondChoiceNumbers=secondGrid.get(secondChoice).split(" ");
			int occurance = 0;
			String cardNumber = null;
			int match=0;

			for (int j = 0; j < 4; j++) {
				occurance=0;
				for (int k = 0; k < 4; k++) {
					if (firstChoiceNumbers[j].equals(secondChoiceNumbers[k])) {
						occurance++;					
						if (occurance==1) {
							cardNumber=firstChoiceNumbers[j];
							match++;
						}
					}

				}

			}
			StringBuilder output=new StringBuilder();
			output.append(String.format("Case #%s: ", String.valueOf(i+1)));
			if (match>1) {
				output.append("Bad magician!");
				System.out.println(output);
			}			
			else if (match==1) {
				output.append(cardNumber);
				System.out.println(output);
			}
			else if (match==0)
			{
				output.append("Volunteer cheated!");
				System.out.println(output);
			}
		}

		br.close();
	}


}
