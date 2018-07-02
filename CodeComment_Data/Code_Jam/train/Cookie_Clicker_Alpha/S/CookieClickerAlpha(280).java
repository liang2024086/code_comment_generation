package methodEmbedding.Cookie_Clicker_Alpha.S.LYD321;

import java.io.*;
import java.util.*;
public class CookieClickerAlpha {	
    public static void main(String[] args) throws IOException {
        File path = new File("B-small-attempt0.in");
        Scanner inFile = new Scanner(new FileReader(path));
    	PrintWriter outFile = new PrintWriter ("CookieClickerAlpha.out");
        int T = inFile.nextInt();
        for(int i = 1; i <= T; i++){
        	//input
        	double C = inFile.nextDouble();
        	double F = inFile.nextDouble();
        	double X = inFile.nextDouble();
        	//process
        	int N = (int) Math.max(Math.floor(X / C - 2 / F), 0); 
        	double time = 0;
        	for(int j = 0; j < N; j++){
        		time = time + 1 / (2 + j * F);
        	}
        	time = time * C + X / (2 + N * F);
        	//output
        	outFile.print("Case #");
        	outFile.print(i);
        	outFile.print(": ");
        	outFile.println(time);
        }
        inFile.close();
        outFile.close();
    }
}
