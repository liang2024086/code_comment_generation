package methodEmbedding.Magic_Trick.S.LYD1134;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:/Users/Jon PC/Documents/CS/javarevision/src/magic_test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		try {
			int numOfTests = Integer.parseInt(reader.readLine());
			for (int i = 0; i < numOfTests; i++){
				int rowSelected1 = Integer.parseInt(reader.readLine()) - 1;
				ArrayList<String> rows = new ArrayList<String>();
				for (int r=0; r < 4; r++)
					rows.add(reader.readLine());
				String selectedRow1 = rows.get(rowSelected1);
				

				int rowSelected2 = Integer.parseInt(reader.readLine()) - 1;
				ArrayList<String> rows2 = new ArrayList<String>();
				for (int r=0; r < 4; r++)
					rows2.add(reader.readLine());
				String selectedRow2 = rows2.get(rowSelected2);
				
				ArrayList<String> row1 = new ArrayList<String>(Arrays.asList(selectedRow1.split(" ")));
				ArrayList<String> row2 = new ArrayList<String>(Arrays.asList(selectedRow2.split(" ")));
				
				ArrayList<String> intersection = new ArrayList<String>();
				for (String s : row1){
					if (row2.contains(s))
						intersection.add(s);
				}
				
				String solution = "Case #" + (i+1) + ": ";
				if (intersection.size() == 1)
				{
					solution += intersection.get(0);
				}
				else if (intersection.size() > 0)
				{
					solution += "Bad magician!";
				}
				else
					solution += "Volunteer cheated!";
				System.out.println(solution);
				
				
			}
				
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
