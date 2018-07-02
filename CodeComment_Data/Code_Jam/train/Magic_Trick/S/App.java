package methodEmbedding.Magic_Trick.S.LYD535;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class App {

	public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));
    	PrintWriter writer = new PrintWriter("A-small-attempt2.out", "UTF-8");
	    try {
	        String line = br.readLine();
	        int nbInput = Integer.parseInt(line);
	        for (int i = 1; i < nbInput+1; i++) {
	        	int firstRound = Integer.parseInt(br.readLine());
	        	String possibilities1 = "";
	        	for (int j = 1; j <= 4; j++) {
	        		String row = br.readLine();
	        		if (firstRound == j) {
	        			possibilities1 = row;
	        		}
	        	}
	        	String[] parts1 = possibilities1.split(" ");
	        	Set<String> set1 = new HashSet<String>(Arrays.asList(parts1));
	        	
	        	int secondRound = Integer.parseInt(br.readLine());
	        	String possibilities2 = "";
	        	for (int j = 1; j <= 4; j++) {
	        		String row = br.readLine();
	        		if (secondRound == j) {
	        			possibilities2 = row;
	        		}
	        	}
	        	String[] parts2 = possibilities2.split(" ");
	        	Set<String> set2 = new HashSet<String>(Arrays.asList(parts2));
	        	
	        	Set<String> finalPossibilities = new HashSet<String>(set1);
	        	finalPossibilities.retainAll(set2);
	        	
	        	if (finalPossibilities.isEmpty()) {
		        	writer.println("Case #" + i + ": " + "Volunteer cheated!");
	        	}
	        	else if(finalPossibilities.size() == 1) {
	        		Iterator<String> it = finalPossibilities.iterator();
		        	writer.println("Case #" + i + ": " + it.next());
	        	} else {
		        	writer.println("Case #" + i + ": " + "Bad magician!");
	        	}
	        }
	    } finally {
	        br.close();
        	writer.close();
	    }
	}

}
