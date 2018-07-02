package methodEmbedding.Magic_Trick.S.LYD750;

import java.util.*;

public class MagicTrick_SMALL {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for (int z = 0; z < T; z++) {
	    int answ = sc.nextInt();
	    int[] aGrid = new int[4];
	    for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
		    int read = sc.nextInt();
		    if ((i+1)==answ) { 
			aGrid[j] = read;
		    }
		}
	    }
	    int answ2 = sc.nextInt();
	    int result = -1;
	    String answer = null;
	    for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
		    int read = sc.nextInt();
		    if ((i+1)==answ2) {
			for (int k = 0; k < 4; k++) {
			    if (aGrid[k] == read) {
				if (result != -1) {
				    //bd magician
				    answer = "Bad magician!";
				} else {
				    result = read;
				}
			    }
			}
		    }
		}
	    }
	    if (result == -1) {
		answer = "Volunteer cheated!";
	    } else if (answer == null || !answer.equals("Bad magician!")) {
		answer = "" + result;
	    }
	    System.out.printf("Case #%d: %s\n", (z+1), answer);
	}
    }
}
