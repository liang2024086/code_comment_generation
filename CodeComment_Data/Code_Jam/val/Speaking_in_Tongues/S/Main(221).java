package methodEmbedding.Speaking_in_Tongues.S.LYD1177;

import java.util.*;

public class Main {
    public static final char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int n = console.nextInt();
	console.nextLine();
	for (int i = 0; i < n; i++) {
	    String s = console.nextLine();
	    System.out.print("Case #" + (i + 1) + ": ");
	    int length = s.length();
	    for (int j = 0; j < length; j++) {
		char ch = s.charAt(j);
		if (ch == ' ') {
		    System.out.print(" ");
		} else {
		    System.out.print(map[ch - 'a']);
		}
	    }
	    System.out.println();
	}
    }
}
