package methodEmbedding.Standing_Ovation.S.LYD927;

import java.util.ArrayList;

public class Princ {
	
	public static void main(String[] args) {
		
		LectureTxt lecTxt = new LectureTxt("A.txt");
		ArrayList<ArrayList<Integer>> T = lecTxt.getList();
		
		int cas = 1;
		
		for (ArrayList<Integer> al : T) {
			int peopleBeforeCurrent = 0;
			int peopleNeeded = 0;
			
	
			for (int i = 0; i < al.size(); i++) {
				if(peopleBeforeCurrent < i) {
					peopleNeeded = peopleNeeded + (i - peopleBeforeCurrent);
					peopleBeforeCurrent = peopleBeforeCurrent + al.get(i) + (i - peopleBeforeCurrent);
				}
				else {
					peopleBeforeCurrent = peopleBeforeCurrent + al.get(i);
				}
			}
			
			System.out.println("Case #" +cas +": " +peopleNeeded);
			cas++;
		}
		
	}

}
