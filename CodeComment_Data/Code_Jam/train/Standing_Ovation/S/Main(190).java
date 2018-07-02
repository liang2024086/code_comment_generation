package methodEmbedding.Standing_Ovation.S.LYD1286;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer writer = null;

		try (BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"))) {
			String sCurrentLine = "";
			String numberOfLines = br.readLine();

			  writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream("A-small-attempt1.out"), "utf-8"));
			  
			for (int i = 0; i < (Integer.parseInt(numberOfLines) ); i++) {

				sCurrentLine = br.readLine();
				System.out.println(sCurrentLine);
				int Smax = Integer.parseInt(sCurrentLine.split(" ")[0]);
				// System.out.println(Smax+"");
				String audienceRepartition = sCurrentLine.split(" ")[1];
				int numberOfFriends = 0;
				int numberOfPersonsUp = 0;

				numberOfPersonsUp = audienceRepartition.charAt(0) - 48;
				for (int j = 1; j < audienceRepartition.length(); j++) {

					int positionsActuelleAudience = audienceRepartition
							.charAt(j) - 48;
					// System.out.print(positionsActuelleAudience
					// / );
					int nombrePersonNecessaire = j;

					if (numberOfPersonsUp < nombrePersonNecessaire && positionsActuelleAudience>0) {
						numberOfFriends += (nombrePersonNecessaire - numberOfPersonsUp);
			//			System.out.println("ness " + nombrePersonNecessaire);
						numberOfPersonsUp += (nombrePersonNecessaire - numberOfPersonsUp);
					}
					numberOfPersonsUp += positionsActuelleAudience;
			//		System.out.println(numberOfPersonsUp + " Up");
					if(numberOfPersonsUp>=Smax) break;
				}
			    writer.write("Case #" + (i + 1) + ": " + numberOfFriends+"\n");

				
			/*	System.out.println("Case#" + (i + 1) + ":" + numberOfFriends);
				System.out
						.println("----------------------------------------------------");
			*/}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			   try {writer.close();} catch (Exception ex) {//ignore}
			   }
		}}

}
