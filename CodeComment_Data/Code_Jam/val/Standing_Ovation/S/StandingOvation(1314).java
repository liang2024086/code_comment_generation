package methodEmbedding.Standing_Ovation.S.LYD1227;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class StandingOvation {

    public static void main(String[] args) throws IOException {
	BufferedReader inFile = new BufferedReader (new FileReader ("A-small-attempt0.in"));
	PrintWriter outFile = new PrintWriter (new FileWriter ("standingovation.out"));
	
	int T = Integer.parseInt (inFile.readLine());
	for (int t = 1; t <= T; t++)
	{
	    StringTokenizer tok = new StringTokenizer(inFile.readLine());
	    int S = Integer.parseInt(tok.nextToken());
	    String digits = tok.nextToken();
	    
	    int numStanding = 0;
	    int numNeeded = 0;
	    for (int pos = 0; pos <= S; pos ++){
		int s = digits.charAt(pos) - '0';
		if (pos > numStanding){
		    numNeeded += (pos - numStanding);
		    numStanding += (pos - numStanding);
		} 
		numStanding += s;
	    }
	    
	    outFile.printf("Case #%d: %d%n", t, numNeeded);
	}
	
	inFile.close();
	outFile.close();

    }

}
