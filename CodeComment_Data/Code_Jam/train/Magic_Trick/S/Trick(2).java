package methodEmbedding.Magic_Trick.S.LYD1326;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Trick {

	public static void main(String args[]) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("data/in/trick.in"));
			PrintWriter out = new PrintWriter("data/out/trick.out");

			int amount = Integer.parseInt(in.readLine());
			
			for (int k = 0; k < amount; k++) {
				int firstRow = Integer.parseInt(in.readLine());
				for (int r = 1; r < firstRow; r++)
					in.readLine();
				String strFirstRow = in.readLine();
				for (int r = firstRow + 1; r <= 4; r++)
					in.readLine();
				
				int secondRow = Integer.parseInt(in.readLine());

				for (int r = 1; r < secondRow; r++)
					in.readLine();
				String strSecondRow = in.readLine();
				for (int r = secondRow + 1; r <= 4; r++)
					in.readLine();

				String[] arrFirstRow = strFirstRow.split(" ");
				String[] arrSecondRow = strSecondRow.split(" ");
				ArrayList<String> arrRes = new ArrayList<String>();
				

				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 4; j++) {
						if (arrFirstRow[i].equals(arrSecondRow[j]))
							arrRes.add(arrFirstRow[i]);
					}
				
				if (arrRes.size() == 0)
					out.println("Case #" + (k + 1) + ": " + "Volunteer cheated!");
				else if (arrRes.size() == 1)
					out.println("Case #" + (k + 1) + ": " + arrRes.get(0));
				else if (arrRes.size() > 1)
					out.println("Case #" + (k + 1) + ": " + "Bad magician!");
			}
			
			in.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("?????!");
	}
}
