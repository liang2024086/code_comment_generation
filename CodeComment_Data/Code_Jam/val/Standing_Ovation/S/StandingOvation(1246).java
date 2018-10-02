package methodEmbedding.Standing_Ovation.S.LYD1890;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		int cases = Integer.parseInt(br.readLine());
		for(int i=0; i<cases; i++){
			String in = br.readLine();
			String[] inSplit = in.split("");
			int maxShy = Integer.parseInt(inSplit[1]);
			int clappingPeople = 0;
			int needClappers = 0;
			for(int s=0; s<maxShy+1; s++){
				int shyPeople = Integer.parseInt(inSplit[3+s]);
				if (s>(clappingPeople+needClappers)&& shyPeople>0) needClappers += (s-(clappingPeople+needClappers));
				clappingPeople += shyPeople;
			}
			System.out.format("Case #%d: %d\n", i+1, needClappers);
		}
	}
} 
