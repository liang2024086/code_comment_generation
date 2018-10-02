package methodEmbedding.Magic_Trick.S.LYD430;


import java.util.ArrayList;
import java.util.Scanner;

class MagicTrick {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = Integer.parseInt(s.nextLine());
		
		for (int i = 1; i <= t; ++i){
			// solve
			String message = "";

			int g1 = Integer.parseInt(s.nextLine());
			String[] z1 = new String[4];
			ArrayList<String> r1 = new ArrayList<String>();

			for (int j = 0; j < 4; ++j) {
				String temp = s.nextLine();
				if ((j + 1) == g1) {
					z1 = temp.split(" ");
					for (int k = 0; k < 4; ++k){
						r1.add(z1[k]);
					}
				}
			}
			
			int g2 = Integer.parseInt(s.nextLine());
			String[] r2 = null;
			for (int j = 0; j < 4; ++j ){
				String temp = s.nextLine();
				if (message == "") {
					if((j+1) == g2) {
						r2 = temp.split(" ");
						for (int k = 0; k < 4; ++k){
							if(r1.contains(r2[k])){
								if (message == "") {
									message = "Case #" + i + ": " + r2[k];
								} else {
									message = "Case #" + i + ": Bad magician!";
									break;
								}
							}
						}
					}
					
					if (message == ""  && r2 != null){
						message = "Case #" + i + ": Volunteer cheated!";
					}
				}
			}
			
			System.out.println(message);
		}
	}
}
