package methodEmbedding.Magic_Trick.S.LYD413;

import java.util.*;

class A{

    public static void main(String[] args) {
	Scanner s = new Scanner (System.in);

	int reps = s.nextInt();
	s.nextLine();

	for (int rep = 1; rep <= reps; rep++) {
	    int pos1 = s.nextInt();
	    ArrayList<Integer> n1 = new ArrayList<Integer>();

	    for (int i = 1; i <= 4; i++) {
		for (int j = 1; j <= 4; j++) {
		    int n = s.nextInt();
		    if (i == pos1) n1.add(n);
		}
	    }
	    int pos2 = s.nextInt();
	    ArrayList<Integer> n2 = new ArrayList<Integer>();

	    for (int i = 1; i <= 4; i++) {
		for (int j = 1; j <= 4; j++) {
		    int n = s.nextInt();
		    if (i == pos2) n2.add(n);
		}
	    }
	    n1.retainAll(n2);
	    
	    String word = "";
	    if (n1.size() == 1) {
		word += n1.get(0);
	    } else if (n1.size() == 0) {
		word += "Volunteer cheated!";
	    } else {
		word += "Bad magician!";
	    }

	    System.out.println("Case #" + rep + ": " + word);

	}
    }

}
