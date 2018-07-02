package methodEmbedding.Standing_Ovation.S.LYD170;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		sn.nextLine();
		for(int i = 0; i < t; i++){

			String s = sn.nextLine();
			int smax = Integer.valueOf("" + s.charAt(0));
			int str[] = new int[smax+1];
			for(int j = 0; j < smax + 1; j++){
				str[j] = Integer.valueOf( "" + s.charAt(j + 2));
			}

			int stoodUp = str[0];
			int friends = 0;
			for(int j = 1; j < smax + 1; j++){
				if(str[j] != 0){
					if(stoodUp >= j){
						stoodUp += str[j];
					}
					else{
						friends += j - stoodUp;
						stoodUp += friends + str[j];
					}
				}
			}
			try {

				FileWriter fw = new FileWriter("Ouput1.out", true);	
				fw.write("Case #" + (i + 1) + ": " + friends + "\n");
				fw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Case #" + (i + 1) + ": " + friends);			
		}
	}



}
