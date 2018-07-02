package methodEmbedding.Magic_Trick.S.LYD1519;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Magic Trick problem
public class QualificationProblemA {
	public static void main(String[] args) {
		try {

			// Read in test input
			BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
			BufferedWriter out = new BufferedWriter(new FileWriter("Output2.txt"));

			// # of test cases
			String cur = in.readLine();
			int testCount = Integer.parseInt(cur);

			// Current line
			cur = in.readLine();
			int firstAnswer = 0;

			// Properties
			int caseNumber = 1;
			int finished = 1;
			int flag = 0;

			// Arrangements
			String [] firstArrangement = new String[4];
			String [] secondArrangement = new String[4];

			while (flag < testCount) {

				out.write("Case #" + (flag + 1) + ": ");
				firstAnswer = Integer.parseInt(cur);
				cur = in.readLine();

				// Read in first arrangement
				while (finished < 5){
					if (finished == firstAnswer) {

						String[] test = cur.split(" ");

						for (int i = 0; i < test.length; ++i) {
							firstArrangement[i] = test[i];
						}
					}
					cur = in.readLine();
					finished++;
				}
				finished = 1;

				int secondAnswer = Integer.parseInt(cur);
				cur = in.readLine();

				// Read in second arrangement
				while (finished < 5){
					if (finished == secondAnswer) {

						String[] test = cur.split(" ");

						for (int i = 0; i < test.length; ++i) {
							secondArrangement[i] = test[i];
						}
					}
						cur = in.readLine();
					
					finished++;
				}

				int cardNumber = 0;
				String storedNumber = "";

				for(int i = 0; i < firstArrangement.length; ++i) {
					for (int j = 0; j < secondArrangement.length; ++j){
						if (firstArrangement[i].equals(secondArrangement[j])) {
							cardNumber++;
							storedNumber = firstArrangement[i];
							break;
						}	
					}
				}

				if(cardNumber == 1){
					out.write(storedNumber);
				} else {
					if(cardNumber == 0){
						out.write("Volunteer cheated!");
					}else{
						out.write("Bad magician!");
					}
				}
					finished = 1;
					flag++;
				
					if(flag != testCount){
						out.write("\r\n");
					}
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
