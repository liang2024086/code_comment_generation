package methodEmbedding.Standing_Ovation.S.LYD1155;

import java.util.*;
public class A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		input.nextLine();
		
		for (int i = 0; i < t; i++){
			String line = input.nextLine();
			
			int sMax = Integer.parseInt(line.split(" ")[0]);
			
			int s[] = new int[sMax+1];
			
			String x = line.split(" ")[1];
			
			for (int j = 0; j < x.length(); j++){
				s[j] = Integer.parseInt(x.split("")[j]);
			}
			
			int invitees = 0;
			int numStood = s[0];
			
			for (int j = 1; j < s.length; j++){
				if (j <= numStood){
					numStood += s[j];
				}else{
					if (s[j] != 0){
						invitees += j-numStood;
						numStood += j-numStood;
						numStood += s[j];
					}
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+invitees);
		}

	}

}
