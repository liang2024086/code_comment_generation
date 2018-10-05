package methodEmbedding.Standing_Ovation.S.LYD2032;

import java.util.*;
import java.io.*;

public class StandingOvation{
    public static void main(String[] args) throws FileNotFoundException{
	Scanner s = new Scanner(new File(args[0]));
	int numTurns = s.nextInt();
	for(int i = 0; i < numTurns; i++){
	    int sMax = s.nextInt();
	    String people = s.next();
	    int peopleThere = 0;
	    int totalPeopleNeeded = 0;
	    
	    for(int j = 0; j <= sMax; j++){
		if(peopleThere < j){
		    int peopleNeeded = j-peopleThere;
		    peopleThere += peopleNeeded;
		    totalPeopleNeeded += peopleNeeded;
		}
		peopleThere += people.charAt(j)-48;
	    }
	    System.out.println("Case #" + (i+1) + ": " + totalPeopleNeeded);
	}
    }
}
