package methodEmbedding.Counting_Sheep.S.LYD921;

import java.util.*;
import java.io.*;

public class Main {
  	public static void main(String[] args) {
  		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
  		
  		int T = in.nextInt();
  		for (int i = 1; i <= T; i++) {
  			int N = in.nextInt();
  			if (N == 0) {
  				System.out.println("Case #" + i + ": INSOMNIA");
  			} else {
  				boolean[] visited = new boolean[10];
  				int currentMultiplier = 1;
  				while (true) {
  					int testNumber = N * currentMultiplier;
  					
  					while (testNumber >= 1) {
  						visited[testNumber % 10] = true;
  						
  						testNumber /= 10;
  					}
  					
  					boolean doneFlag = true;
  					for (int count = 0; count < 10; count++) {
  						if (!visited[count]) {
  							doneFlag = false;
  						}
  					}
  					if (doneFlag) {
  						break;
  					}
  					
  					currentMultiplier++;
  				}
  				
  				System.out.println("Case #" + i + ": " + N * currentMultiplier);
  			}
  		}
  	}
}
