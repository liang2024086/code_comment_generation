package methodEmbedding.Standing_Ovation.S.LYD1871;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int standing = 0, friends = 0, Smax = 0; 
			Smax = in.nextInt();
			int arr[] = new int[Smax + 1];
			String enter = in.next();
			for (int j = 0; j < enter.length(); j++) {
				arr[j] = ((int)enter.charAt(j) - 48 );
			}
			standing = arr[0];
			for (int j = 1; j < Smax + 1; j++) {
				if(arr[j] == 0)
					continue;
				if(j > standing){
					friends += j - standing;
					standing += friends + arr[j];
				} else {
					standing += arr[j];
				}
			}
			System.out.println("Case #" + (i+1) + ": " + friends);
		}
		in.close();
	}
}
