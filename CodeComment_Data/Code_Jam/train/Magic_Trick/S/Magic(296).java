package methodEmbedding.Magic_Trick.S.LYD2028;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Magic {

	public static String CASE = "Case #";
	public static void main(String[] args) {
		String[][] cards = new String[4][4];
		String[][] newcards = new String[4][4];
		try {
			File file = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file));
			int cnt = Integer.parseInt(br.readLine());
			for (int i=0;i<cnt;i++) {
				System.out.print(CASE+(i+1)+": ");
				int firstNum = Integer.parseInt(br.readLine());
				cards[0] = br.readLine().split(" ");
				cards[1] = br.readLine().split(" ");
				cards[2] = br.readLine().split(" ");
				cards[3] = br.readLine().split(" ");
				int nextNum = Integer.parseInt(br.readLine());
				newcards[0] = br.readLine().split(" ");
				newcards[1] = br.readLine().split(" ");
				newcards[2] = br.readLine().split(" ");
				newcards[3] = br.readLine().split(" ");

				List<String> l = new ArrayList<String>();
				for(String card : cards[firstNum-1]){
					for (String nCard : newcards[nextNum-1]) {
						if (card.equals(nCard)) {
							l.add(card);
						}
					}
				}
				if (l.size()==0){
					System.out.println("Volunteer cheated!");
				} else if(l.size()==1){
					System.out.println(l.get(0));
				} else {
					System.out.println("Bad magician!");
				}
			}
		} catch(Exception e) {System.out.print("miss");}
	}
}
