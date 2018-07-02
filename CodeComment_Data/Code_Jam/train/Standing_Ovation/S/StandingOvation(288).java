package methodEmbedding.Standing_Ovation.S.LYD1565;

import java.util.*;
import java.io.*;

public class StandingOvation {
	
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("standing_ovation.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("standing_ovation.out")));
		
		int T = Integer.parseInt(f.readLine());
		for ( int i=1; i<=T; i++ ) {
			StringTokenizer st = new StringTokenizer(f.readLine());
			int sMax = Integer.parseInt(st.nextToken());
			String shynesses = st.nextToken();
			int numFriendsInvited = 0;
			int numPeopleStanding = 0;
			for ( int j=0; j<sMax+1; j++ ) {
				int numPeopleJShy = Character.getNumericValue(shynesses.charAt(j));
				if ( numPeopleStanding >= j ) {
					numPeopleStanding += numPeopleJShy;
				} else if ( numPeopleStanding < j ) {
					numFriendsInvited += j - numPeopleStanding;
					numPeopleStanding = j;
					numPeopleStanding += numPeopleJShy;
				}
			}
			out.println(String.format("Case #%d: %d",i,numFriendsInvited));
		}
		
		f.close();
		out.close();
	}
}
