package methodEmbedding.Standing_Ovation.S.LYD1894;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Anu
 */
public class Code2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String row = "";
		int testCaseNumber = 0;
		String[] inputString = null;
		int position = 0;
		int noOfFriends = 0;

		try {
			BufferedReader r = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));

			boolean first = true;
			while ((row = r.readLine()) != null) {
				if (first) {
					testCaseNumber = Integer.parseInt(row);
					first = false;
					inputString = new String[testCaseNumber];
					continue;
				} else {
					inputString[position] = row;
					position++;

				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			                 System.out.println("IO error");
		}
		//

		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(new File("output.txt")));
		
		for (int i = 0; i < testCaseNumber; i++) {
			char[] charArray = inputString[i].toCharArray();
			
			if (charArray[0] == '0') {
				System.out.println();
				w.write("Case #" + (i + 1) + ": " + "0");
				w.newLine();
			} else {

				int stand = 0;

				for (int j = 2; j < (charArray.length); j++) {
					int val = charArray[j] - 48;
					int shyLevel = (j - 2);
					if (stand > shyLevel) {
						stand += val;

						continue;
					} else {
						int diff = shyLevel - stand;

						noOfFriends += (diff);
						stand += (diff + val);
					}

				}
				System.out.println();
				w.write("Case #" + (i + 1) + ": " + noOfFriends);
				w.newLine();
			}
			noOfFriends = 0;
		}
		
		w.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			                 System.out.println("Error");
		}
}
}
