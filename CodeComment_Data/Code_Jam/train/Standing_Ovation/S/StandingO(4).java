package methodEmbedding.Standing_Ovation.S.LYD19;


public class StandingO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int testCases = StdIn.readInt();
		String[] answers = new String[testCases];
		for(int i = 0; i < testCases; i++){
			int sMax = StdIn.readInt();
			String shynessLevels = StdIn.readString();
			int audienceMembersAdded = 0;
			int standingAudience = 0;
			for(int j = 0; j < shynessLevels.length(); j++){
				if(standingAudience < j){
					audienceMembersAdded = audienceMembersAdded + (j - standingAudience);
					standingAudience = j + Integer.parseInt(shynessLevels.charAt(j) +"");
				}
				else{
					standingAudience += Integer.parseInt(shynessLevels.charAt(j) +"");
				}
			}
			answers[i] = "Case #" + (i+1) +": " + audienceMembersAdded;
		}
		
		for (int i = 0; i < answers.length; i++) {
			System.out.println(answers[i]);
		}		
	}

}
