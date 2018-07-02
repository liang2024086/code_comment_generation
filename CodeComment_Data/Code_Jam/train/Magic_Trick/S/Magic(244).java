package methodEmbedding.Magic_Trick.S.LYD2047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magic {
	public static void main(String [] args){
		try{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			int cases = Integer.parseInt(in.readLine());
			for (int x = 0; x < cases; x++){
				int first = Integer.parseInt(in.readLine());
				for (int i = 0 ; i < first-1; i++) { in.readLine(); }
				String[] row1 = in.readLine().split("\\s");
				for (int i = first ; i < 4; i++) { in.readLine(); }
				
				int second = Integer.parseInt(in.readLine());
				for (int i = 0 ; i < second-1; i++) { in.readLine(); }
				String[] row2 = in.readLine().split("\\s");
				for (int i = second ; i < 4; i++) { in.readLine(); }
				
				int matches = 0, match = 0;
				String state = "";
				
				for (int i = 0; i < 4; i++) {
					int num = Integer.parseInt(row1[i]);
					for (int j = 0; j < 4; j++) {
						if (num == Integer.parseInt(row2[j])) {
							matches++;
							match = num;
						}
					}
				}
				
				if (matches == 0) {
					state = "Volunteer cheated!";
				} else if (matches == 1) {
					state = match+"";
				} else {
					state = "Bad magician!";
				}
				
				System.out.println("Case #" + (x+1) + ": " + state);
			}
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
