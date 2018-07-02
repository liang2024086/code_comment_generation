package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1054;

import java.io.*;
import java.util.Scanner;

public class B {

public static void main(String[] args) throws FileNotFoundException, IOException {
     Scanner sc = new Scanner(new FileReader("input.txt"));
     PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

     int noOfCases = sc.nextInt();
     sc.nextLine();

for (int caseNum = 0; caseNum < noOfCases; caseNum++){
	String line = sc.nextLine();
	int stack[] = new int[line.length()];
	for (int i = 0; i < line.length(); i++) {
		if(line.charAt(i)=='+') {
			stack[i] = 1;
		} else {
			stack[i] = -1;
		}
	}
	boolean isComplete = false;
	int turn = 0;
	while(!isComplete) {
		int i = 0;
		int currentTop = stack[0];
		while (currentTop == stack[i]) {
			if (i==stack.length-1) {
				if (currentTop==-1){
					turn++;
				}
				isComplete = true;
				break;
			} else {
				i++;
			}
		}
		
		if (isComplete && i==stack.length-1) {
			break;
		}

		turn++;
		for (int j = 0; j < i; j++) {
			stack[j] = stack[j] * (-1);
		}
	}
	
	pw.print("Case #" + (caseNum + 1) + ": " + turn);
	
    if(caseNum < noOfCases-1)
     	pw.println("");
	}
     

     pw.flush();
     pw.close();
     sc.close();
}
}

