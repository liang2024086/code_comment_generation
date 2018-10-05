package methodEmbedding.Revenge_of_the_Pancakes.S.LYD996;


import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int testCases = in.nextInt();
	in.nextLine();
	for (int t = 0; t < testCases; t++) {
	    String testCase = in.nextLine();
	    boolean[] pancakes = new boolean[testCase.length()];
	    
	    //Cast string to boolean array
	    for (int i = 0; i < testCase.length(); i++) {
		if (testCase.charAt(i) == '+')
		    pancakes[i] = true;
		else if (testCase.charAt(i) == '-')
		    pancakes[i] = false;
	    }
	    
	    int flipCount = 0;
	    int startSegmentLength;
	    boolean done;
	    while (true) {
		done = true;
		for (int i = 0; i < pancakes.length; i++) {
		    if (!pancakes[i]) {
			done = false;
			break;
		    }
		}
		if (done)
		    break;
		
		startSegmentLength = 0;
		for (int i = 0; i < pancakes.length; i++) {
		    if (pancakes[0] == pancakes[i])
			startSegmentLength++;
		    else
			break;
		}
		
		boolean[] handOfPancakes = new boolean[pancakes.length];
		flipCount++;
		for (int i = 0; i < pancakes.length; i++) {
		    if (i < startSegmentLength)
			handOfPancakes[i] = !pancakes[startSegmentLength - 1 - i];
		    else
			handOfPancakes[i] = pancakes[i];
		}
		pancakes = handOfPancakes;
	    }
	    System.out.println("Case #" + (t+1) + ": " + flipCount);
	}
    }
}
