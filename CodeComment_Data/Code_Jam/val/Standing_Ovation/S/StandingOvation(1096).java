package methodEmbedding.Standing_Ovation.S.LYD240;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StandingOvation {
//lsmax =6
//max input 9999999
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(br.readLine());
			for(int i = 1; i<=T; i++) {
				//logic here
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				long lsMax = Long.parseLong(st.nextToken());
				String sDigits = st.nextToken();
				char[] cDigits = sDigits.toCharArray();
				int friends = 0;
				int numOfPplStoodUp = 0;
				for(int index = 1; index <= cDigits.length; index++) {
					char c = cDigits[index-1];
					numOfPplStoodUp = numOfPplStoodUp + Character.getNumericValue(c); 
					if(numOfPplStoodUp < index) {
						int oldFriends = friends;
						friends = index - numOfPplStoodUp;
						if(friends < oldFriends)
							friends = oldFriends;
					}
						
				}
				System.out.println("Case #" + (i) + ": " + friends);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
