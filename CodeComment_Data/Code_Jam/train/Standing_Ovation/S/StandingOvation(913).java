package methodEmbedding.Standing_Ovation.S.LYD1434;

import java.io.FileInputStream;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) throws Exception {

//		System.setIn(new FileInputStream("A-small-attempt4 (1).in"));

		Scanner in = new Scanner(System.in);

		int cases, shyMax, counter=1, invites, num, total;

		cases = in.nextInt();

		while (cases != 0) {
			shyMax = in.nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append(in.next());
			invites=0;
			total=0;
			num=0;
			for (int i = 0; i < sb.length()-1; i++) {
				num = sb.charAt(i)-48;
				
				if(i==total && num == 0){
					invites++;
					total++;
					continue;
				}
				
				if(total<i){
					invites++;
					total++;
					i--;
					continue;
				}
				
				total+=num;
				
				if(total>=shyMax){
					break;
				}
					
			}
			
			System.out.println("Case #"+counter+": "+invites);
			counter++;
			cases--;
		}
		in.close();
	}
}
