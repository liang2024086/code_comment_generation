package methodEmbedding.Standing_Ovation.S.LYD230;

import java.io.*;

class a {
    public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String line = null;

	try {
	    // Read in how many case we're reading
	    int caseCount  = Integer.parseInt(br.readLine());	
	    int friendCount,clappingCount;    
	    friendCount = 0;
	    clappingCount = 0;
	    int caseAnswer[] = new int[caseCount];
	    // Process the rest of this
	    for (int i = 0; i < caseCount; i++) {
		//Readline
		line = br.readLine();
		//Splitline
		String[] parts = line.split(" ");
		friendCount = 0;
		clappingCount = 0;
		int shynessMax = Integer.parseInt(parts[0]);

		for(int j = 0; j <= shynessMax; j++) {
		    if (j <= clappingCount) {
			clappingCount += Character.getNumericValue(parts[1].charAt(j));
		    } else {
			friendCount += (j - clappingCount);
			clappingCount += Character.getNumericValue(parts[1].charAt(j)) + (j - clappingCount);
		    }
		}
		//System.out.println(clappingCount);
		caseAnswer[i] = friendCount;
	    }

	    //Answers
	    for (int i = 0; i < caseCount; i++) {
		System.out.println("Case #" + (i+1) + ": " + caseAnswer[i]);
	    }
	    
	} catch (IOException e) {
	    System.out.println("Whoops");
	    System.exit(1);
	}
    }
}
