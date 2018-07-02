package methodEmbedding.Standing_Ovation.S.LYD1243;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Exo1 {



	public static void main(String[] args) throws IOException {
		boolean firstLine = true;
		int caseNumber = 0;
		for (String oneLine:FileUtils.readLines(new File("A-small-attempt0.in"))) {
			if (firstLine) {
				firstLine = false;
			} else {
				caseNumber++;
				String[] splitted = oneLine.split(" ");
				int smax = Integer.valueOf(splitted[0])+1;
				int[] entries = new int[splitted[1].length()];
				int rank = 0;
				for(char a:splitted[1].toCharArray()) {
					entries[rank] = Integer.valueOf(""+a);
					rank++;
				}
				
				
				int added = 0;
				int applaudingPeople = 0;
				for (int k=0;k<smax;k++) {
//					System.out.println("Rank: "+k);
					if (entries[k] != 0) {
						if (applaudingPeople <k) {
//							System.out.println("Going to add: "+(k-applaudingPeople));
							added  += (k-applaudingPeople);
							applaudingPeople += (k-applaudingPeople);
						}
						applaudingPeople += entries[k];
					}
				}
				System.out.println(added);
				FileUtils.writeStringToFile(new File("result.txt"), "Case #"+caseNumber+": "+added+"\n",true);
			}
		}
		
		
	}



}
