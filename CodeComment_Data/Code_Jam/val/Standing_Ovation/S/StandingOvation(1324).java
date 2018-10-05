package methodEmbedding.Standing_Ovation.S.LYD1039;


import java.io.FileNotFoundException;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		java.io.File input = new java.io.File("A-small-attempt0.in");
		java.util.Scanner in = new java.util.Scanner(input);
		java.io.PrintWriter out = new java.io.PrintWriter("A-small-attempt0.out");
		

		long T = in.nextLong();
		int I = 1;
		while (I <= T) {
			
			in.nextLong();
			String temp = in.next();
			long additional = 0;
			long audiance = 0;
			
			for (int i = 0; i < temp.length(); i++) {
				int currentPeople = Integer.parseInt(String.valueOf(temp.charAt(i)));
				if (i > audiance & currentPeople != 0) {

					additional += (i - audiance);
					audiance += (i - audiance);
				}
				
				audiance = audiance + currentPeople;
			}
			out.println("Case #" + I + ": " + additional);
			I++;
		}
		

		in.close();
		out.close();

	}

}
