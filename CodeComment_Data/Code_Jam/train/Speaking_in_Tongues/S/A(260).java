package methodEmbedding.Speaking_in_Tongues.S.LYD715;

import java.io.*;
import java.util.Scanner;

public class A {

public static void main(String[] args) throws FileNotFoundException, IOException {
     Scanner sc = new Scanner(new FileReader("input.txt"));
     PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
     char alphabat[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
     int noOfCases = sc.nextInt();
     sc.nextLine();
for (int caseNum = 0; caseNum < noOfCases; caseNum++){
	String newLine = sc.nextLine();
	String result = new String();
	result = "";
	//System.out.println(newLine);
	for (int i = 0; i < newLine.length(); i++) {
		int newChar = newLine.charAt(i);
		//System.out.println(newChar);
		if(newChar != 32){
			result = result + alphabat[newChar - 97];
		}
		else{
			result = result + " ";
		}
	}
    pw.print("Case #" + (caseNum + 1) + ": "+ result);
    if(caseNum < noOfCases-1)
    	pw.println("");
    
}
     

     pw.flush();
     pw.close();
     sc.close();
}
}

