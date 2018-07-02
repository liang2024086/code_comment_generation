package methodEmbedding.Speaking_in_Tongues.S.LYD1263;


import java.util.Scanner;

public class SpeakInTongues {
	public static void main(String args[]) {
		String googlerese = "YNFICWLBKUOMXSEVZPDRJGTHAQ "; //Eng to Googlerese
		String english = 	"ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		Scanner sc = new Scanner(System.in);
		int numTc = sc.nextInt();
		sc.nextLine();
		for (int i=1; i<=numTc; i++) {
			String googMsg = sc.nextLine();//y qee
			String engMsg = new String();
			int lMsg = googMsg.length();
			for (int j=0; j<lMsg; j++) {
				char ch = googMsg.toUpperCase().charAt(j);
				int index = googlerese.indexOf(ch);
				engMsg = engMsg.concat(String.valueOf(english.charAt(index)));
			}
			System.out.println("Case #"+i+": "+engMsg.toLowerCase());
		}
	}
}
