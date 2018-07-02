package methodEmbedding.Revenge_of_the_Pancakes.S.LYD787;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RevengeOfPancakes {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File ("C:/Nandan/GoogleCodeJam/2016_Qualification/resources/RevengeOfPancakes/B-small.in"));
			int T = sc.nextInt();
			
			for (int t = 1; t <= T; t++) {
				String S = sc.next();
				String characters[] = S.split("(?!^)");
				
				int time = 0;
				
				String prevStr = "x";
				for(int i=0; i<characters.length; i++){
					String str = characters[i];
					
					if(str.equals("-") && !prevStr.equals("-")){
						if(prevStr.equals("x")){
							time++;
						}else{
							time = time+2;
						}
					}
					prevStr = str;
				}
				
				
				System.out.println("Case #"+t+": "+time);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		

	

}
