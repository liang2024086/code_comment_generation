package methodEmbedding.Magic_Trick.S.LYD380;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class A{
	
	
	public static void main(String[] args){
		BufferedReader brdr = null;
		BufferedWriter out = null;
		try {
		
		
			String sCurrentLine; 
			brdr = new BufferedReader(new FileReader("A-small-attempt1.in"));

			int n = Integer.parseInt(brdr.readLine());
			FileWriter fstream = new FileWriter("out.txt");
			out = new BufferedWriter(fstream);

			for(int i=0; i<n; i++){
				int firstGuess = Integer.parseInt(brdr.readLine());
				String[] firstCards = new String[4];
				for(int row=0; row<firstCards.length; row++){
					firstCards[row] = brdr.readLine();
				}

				String firstPossbile[] = firstCards[firstGuess-1].split(" ");

				int secondGuess = Integer.parseInt(brdr.readLine());

				String[] secondCards = new String[4];

				for(int row=0; row<secondCards.length; row++){
					secondCards[row] = brdr.readLine();
				}

				String[] secondPossbile = secondCards[secondGuess-1].split(" ");

				ArrayList<Integer> possbileNum = new ArrayList<Integer>();

				for(int j=0; j<firstPossbile.length; j++){
					int num1 = Integer.parseInt(firstPossbile[j]);
					for(int k=0; k<secondPossbile.length; k++){
						int num2 = Integer.parseInt(secondPossbile[k]);
						if(num1 == num2){
							possbileNum.add(num1);
						}
					}
				}

				if(possbileNum.size() == 0){
					System.out.println("Case #"+(i+1)+": Volunteer cheated!");
					out.write("Case #"+(i+1)+": Volunteer cheated!");
					out.newLine();
				} else if(possbileNum.size() == 1){
					System.out.println("Case #"+(i+1)+": "+possbileNum.get(0));
					out.write("Case #"+(i+1)+": "+possbileNum.get(0));
					out.newLine();
				} else {
					System.out.println("Case #"+(i+1)+": Bad magician!");
					out.write("Case #"+(i+1)+": Bad magician!");
					out.newLine();
				}






			}



			/*

			FileWriter fstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			for(String line:fileContent){
				System.out.println(line);
				out.write(line);
				out.newLine();
			}
			//Close the output stream
			out.close();

			*/
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (brdr != null)brdr.close();
				out.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	
}
