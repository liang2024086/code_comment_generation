package methodEmbedding.Magic_Trick.S.LYD1324;

import java.io.*;
import java.util.*;

class Magic {


public static void main(String[] arg) {
try {
	BufferedReader reader = new BufferedReader(new FileReader("input"));
	PrintWriter writer = new PrintWriter("out");		

	int numTest = Integer.parseInt(reader.readLine());

	for (int i = 0; i < numTest; i++) {
		int row1 = Integer.parseInt(reader.readLine());

		String[] line1 = new String[4];
		for (int k = 1; k <= 4; k++) {
			String line = reader.readLine();
			if (row1 == k) {
				line1 = line.split(" ");
			}
		}

		int row2 = Integer.parseInt(reader.readLine());
		
		String[] line2 = new String[4];
		for (int k = 1; k <= 4; k++) {
			String line = reader.readLine();
			if (row2 == k) {
				line2 = line.split(" ");
			}
		}

		int num = -1;
		int rep = 0;
		for(String n1 : line1) {
			for (String n2 : line2) {
				if (n1.equals(n2)) {
					num = Integer.parseInt(n1);
					rep++;		
				}		
			}
		}

		String out = "Case #" + (i + 1) + ": ";
		switch(rep) {
			case 0:
				out += "Volunteer cheated!";
				break;
			case 1:
				out += Integer.toString(num);
				break;
			default:
				out += "Bad magician!";
				break;
		}		

		
	
	writer.println(out);

	}

	reader.close();
	writer.flush();
	writer.close();
	} catch(IOException e) {
		e.printStackTrace();
}
}
}
