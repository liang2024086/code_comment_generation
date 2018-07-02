package methodEmbedding.Counting_Sheep.S.LYD80;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();
	    for (int i = 1; i <= t; i++) {
	    	int number = in.nextInt();
	    	if (number == 0) {
      			System.out.println("Case #" + i + ": INSOMNIA");
      		} else {
      			int m = 1;
      			HashSet<Character> set = new HashSet<Character>();
      			int count = 0;
      			int tmp = 0;
      			while (count < 10) {
      				tmp = m * number;
      				String str = tmp + "";
      				for (int k = 0; k <= str.length() - 1; k++) {
      					char c = str.charAt(k);
      					if (!set.contains(c)) {
      						set.add(c);
      						count++;
      					}
      				}
      				m++;
      			}
      			System.out.println("Case #" + i + ": " + tmp);
      		}
	    }
	}
}
