package methodEmbedding.Speaking_in_Tongues.S.LYD1644;

import java.io.*;
import java.util.*;
import java.math.*;
/** @author Samuel Ahn */

public class A {
    public static void main(String args[]) throws Exception {
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	in.nextLine();
	String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	String[] decode = {"y","h","e","s","o","c","v","x","d","u","i","g","l","b","k","r","z","t","n","w","j","p","f","m","a","q"};
	for (int i = 1; i <= T; i++) {
	    String temp = in.nextLine();
	    String ans = "";
	    for (int k = 0; k < temp.length(); k++) {
		String tmp = temp.substring(k, k + 1);
		if (tmp.equals(" ")) {
		    ans = ans + " ";
		} else {
		    for (int j = 0; j < 26; j++) {
			if (tmp.equals(alpha[j])) {
			    ans = ans + decode[j];
			    break;
			}
		    }
		}
	    }
	    System.out.printf("Case #%d: %s\n", i, ans);
	}
    }
}
