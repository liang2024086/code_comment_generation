package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1187;

import java.util.*;
import java.io.*;
public class Sleep {
  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream fin = new FileInputStream("src/B-small-attempt1.in");
    PrintStream fout = new PrintStream(new FileOutputStream("src/B.out"));
    System.setIn(fin);
    System.setOut(fout);
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
    	String n = in.next();
    	int times = 0;
    	char a = '0';
    	int j;
    	for (j = 0; j < n.length();) {	
    		a = n.charAt(j);
    		while (j < n.length() && a == n.charAt(j)) j++;
        	times++;
    	}
    	if ( a == '+') {
    		times--;
    		System.out.println("Case #" + i + ": " + times);
   		}
    	else if( a == '-') {
    		System.out.println("Case #" + i + ": " + times++);
    	}
    }
  }
}
