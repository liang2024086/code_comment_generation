package methodEmbedding.Standing_Ovation.S.LYD905;


import java.util.Scanner;

public class trialOne {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		sc.nextLine();
		String inp;
		int attendees;
		String input;
		int invitees;
		int totalinvitees;
		int standing;
		for(int i=1; i<=testCases; i++){
			inp = sc.nextLine();
			invitees = 0;
			totalinvitees = 0;
			String[] inputs = inp.split(" ");
			input = inputs[1];
			String first = input.charAt(0)+"";
			standing = Integer.parseInt(first);
			for(int j=1; j<input.length(); j++){
				if(standing >= j)
					standing += Integer.parseInt(input.charAt(j)+"");
				else{
					invitees = j-standing;
					totalinvitees += invitees;
					standing += Integer.parseInt(input.charAt(j)+"") + invitees;
				
				}
				
			}
			System.out.println("Case #"+ i +": " + totalinvitees);
		}
	}

}
