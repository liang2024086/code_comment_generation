package methodEmbedding.Magic_Trick.S.LYD1450;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {

	public static void main(String[] ar) throws NumberFormatException, IOException{
		BufferedReader file = new BufferedReader(new FileReader(
				"I:/A-small-attempt0.in"));

		int total_case = Integer.parseInt(file.readLine());

		PrintWriter pw = new PrintWriter(new FileWriter("I:/output.txt"));

		for (int j = 1; j <= total_case; j++) {
			
			int firstResponse = Integer.parseInt(file.readLine());
			String[][] cardsArrangement1 = new String[4][4];
			cardsArrangement1[0] = file.readLine().split(" ");
			cardsArrangement1[1] = file.readLine().split(" ");
			cardsArrangement1[2] = file.readLine().split(" ");
			cardsArrangement1[3] = file.readLine().split(" ");
			
			Set<String> probable1 = new HashSet<String>();
			for(String str : cardsArrangement1[firstResponse-1]){
				probable1.add(str);
			}
			
			int secondResponse = Integer.parseInt(file.readLine());
			String[][] cardsArrangement2 = new String[4][4];
			cardsArrangement2[0] = file.readLine().split(" ");
			cardsArrangement2[1] = file.readLine().split(" ");
			cardsArrangement2[2] = file.readLine().split(" ");
			cardsArrangement2[3] = file.readLine().split(" ");
			
			Set<String> probable2 = new HashSet<String>();
			for(String str : cardsArrangement2[secondResponse-1]){
				probable2.add(str);
			}
			
			System.out.println(probable1);
			System.out.println(probable2);
			probable1.retainAll(probable2);
			System.out.println(probable1);
			if(probable1.size() == 1)
				pw.println("Case #" + j + ": " + probable1.iterator().next());
			else if(probable1.size() > 1)
				pw.println("Case #" + j + ": " + "Bad magician!");
			else if(probable1.size() == 0)
				pw.println("Case #" + j + ": " + "Volunteer cheated!");
			
			System.out.println();
			
		}
		pw.close();
		
	}
}
