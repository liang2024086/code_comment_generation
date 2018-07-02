package methodEmbedding.Standing_Ovation.S.LYD1242;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class StandingOvation {

	public static void main(String[] args) throws IOException,NumberFormatException {
		// TODO Auto-generated method stub
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(console.readLine());
		for(int t=1;t<=T;t++){
			String[]input = console.readLine().split(" ");
			int s = Integer.parseInt(input[0]);
			int friends=0;
			int standingPeople=0;
			for(int i=0;i<=s;i++){
				if(input[1].charAt(i)>0){
					int dif=0;
					if(standingPeople<i) friends+=dif= i-standingPeople;
					standingPeople+=input[1].charAt(i)-'0'+ dif;
					
				}				
			}
			System.out.println("Case #"+t+": "+friends);
		}
	}

}
