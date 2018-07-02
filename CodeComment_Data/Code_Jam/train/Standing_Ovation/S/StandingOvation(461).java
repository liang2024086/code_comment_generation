package methodEmbedding.Standing_Ovation.S.LYD322;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StandingOvation {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(args[0]);
		Scanner sc = new Scanner(f);
		
		
		int cases=0;
		if(sc.hasNextLine()){
			sc.nextLine();
		}
		while(sc.hasNextLine()){
			int maxShy, needed=0;
			cases++;
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			maxShy=Integer.parseInt(st.nextToken());
			String temp = st.nextToken();
			int amount=0;
			for(int i=0;i<=maxShy;i++){
				int current=Integer.parseInt(temp.charAt(i)+"");
				amount+=current;
				if(current==0&&i>=amount){
					needed++;
					amount++;
				}
			}
			System.out.println("Case #"+cases+": "+needed);
		}

	}

}
