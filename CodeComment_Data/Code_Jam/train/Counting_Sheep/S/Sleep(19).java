package methodEmbedding.Counting_Sheep.S.LYD102;

import java.util.*;
import java.io.*;
public class Sleep {
  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream fin = new FileInputStream("src/A2.in");
    PrintStream fout = new PrintStream(new FileOutputStream("src/A.out"));
    System.setIn(fin);
    System.setOut(fout);
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Case #" + i + ": INSOMNIA");
        } 
        else {
        	int[] v;
        	v = new int[10];
            for (int j = 1;;j++) {
            	String s = String.valueOf(n*j);
            	for (int k = 0; k < s.length(); k++) {
            		v[s.charAt(k)-48] = 1;
            	}
            	int l;
            	for (l = 0; l <10; l++) {
            		if (v[l] == 0) break;
            	}
            	if (l == 10) {
            		System.out.println("Case #" + i + ": " + n * j);
            		break;
            	}
            }
        }
    }
  }
}
