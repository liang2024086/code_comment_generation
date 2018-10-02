package methodEmbedding.Magic_Trick.S.LYD902;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MagicTrick {
    public static void main(String[] args) {
	BufferedReader reader = null;
	try {
	    if (args.length == 1) {
		reader = new BufferedReader(new FileReader(args[0]));
		int[][] startGrid = new int[4][4];
		int[][] finalGrid = new int[4][4];
		int[] startPoss;
		int[] finalPoss;
		int caseCount = 0;
		int startRow = 0;
		int finalRow = 0;
		caseCount = Integer.valueOf(reader.readLine());
		int count = 1;
		while (count <= caseCount) {
		    // Find possiblities in first selected row
		    startRow = Integer.valueOf(reader.readLine());
		    for (int i = 0; i < 4; i++) {
			String[] row = reader.readLine().split(" ");
			for (int j = 0; j < 4; j++) {
			    startGrid[i][j] = Integer.valueOf(row[j]);
			}
		    }
		    startPoss = startGrid[startRow - 1];
		    // Find possiblities in second selected row
		    finalRow = Integer.valueOf(reader.readLine());
		    for (int i = 0; i < 4; i++) {
			String[] row = reader.readLine().split(" ");
			for (int j = 0; j < 4; j++) {
			    finalGrid[i][j] = Integer.valueOf(row[j]);
			}
		    }
		    finalPoss = finalGrid[finalRow - 1];
		    ArrayList<Integer> matches = new ArrayList<>();
		    for (int i = 0; i < startPoss.length; i++) {
			for (int j = 0; j < finalPoss.length; j++) {
			    if (startPoss[i] == finalPoss[j]) {
				matches.add(startPoss[i]);
			    }
			}
		    }
		    if (matches.size() == 0) {
			System.out.println("Case #" + count + ": Volunteer cheated!");
		    } else if (matches.size() == 1) {
			System.out.println("Case #" + count + ": " + matches.get(0));
		    }
		    else {
			System.out.println("Case #" + count + ": Bad magician!");
		    }
		    // Find numbers that appear in both selected rows
		    count++;
		}
		
	    } else {
		throw new IllegalArgumentException("USAGE: MagicTrick input.txt");
	    }
	} catch (Exception ex) {
	    ex.getMessage();
	} finally {
	    try {
		if (reader != null) {
		    reader.close();
		}
	    }
	    catch (IOException ioex) {
		System.err.println("Closing reader after exception failed");
	    }
	}
    }
}
