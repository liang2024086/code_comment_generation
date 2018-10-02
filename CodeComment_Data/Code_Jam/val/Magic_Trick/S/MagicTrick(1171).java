package methodEmbedding.Magic_Trick.S.LYD1690;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class MagicTrick {

	public static void main(String[] args) {

			String filename = "A-small-attempt1.in";
			String line = null;
			
			try {
				FileInputStream fis = new FileInputStream(filename);
				DataInputStream dis = new DataInputStream(fis);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dis));
				FileWriter filewriter = new FileWriter("A-small-attempt1-output.txt");
				BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
				
				line = bufferedReader.readLine();
				int numOfTestCase = Integer.parseInt(line);
				int currentTestCase = 1;
				int[] grid1 = new int[4];
				int[] grid2 = new int[4];
				int counter = 0;
				int value = 0;
				
				while (currentTestCase <= numOfTestCase) {
					bufferedwriter.write("Case #" + currentTestCase + ": ");
					
					// read first guess and data in the specific row (read off the rest of the rows)
					int guess1 = Integer.parseInt(bufferedReader.readLine());
					for (int i=1; i<5; i++) {
						if (guess1 == i) {
							String data1 = bufferedReader.readLine();
							String[] token1 = data1.split(" ");
							for (int m=0; m<token1.length; m++) {
								grid1[m] = Integer.parseInt(token1[m]);
							}
						}
						else 
							bufferedReader.readLine();
					}

					// read second guess and data in the specific row (read off the rest of the rows)					
					int guess2 = Integer.parseInt(bufferedReader.readLine());
					for (int j=1; j<5; j++) {
						if (guess2 == j) {
							String data2 = bufferedReader.readLine();
							String[] token2 = data2.split(" ");
							for (int n=0; n<token2.length; n++) {
								grid2[n] = Integer.parseInt(token2[n]);
							}
						}
						else
							bufferedReader.readLine();
					}

					// compare the two int arrays
					for (int k=0; k<4; k++) {
						int compare1 = grid1[k];
						for (int j=0; j<4; j++) {
							int compare2 = grid2[j];
							if (compare1 == compare2) {
								counter++;
								value = compare2;
							}
						}
					}
					
					 System.out.print(value +" ");
					 System.out.println(counter);
					if (counter == 1)
						bufferedwriter.write(String.valueOf(value));
					else if (counter == 0)
						bufferedwriter.write("Volunteer Cheated!");
					else if (counter > 1)
						bufferedwriter.write("Bad magician!");
					
					// reset counter and value
					counter = 0;
					value = 0;
					bufferedwriter.newLine();
					currentTestCase++;
				}
				
				bufferedwriter.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		} 
	}
}
