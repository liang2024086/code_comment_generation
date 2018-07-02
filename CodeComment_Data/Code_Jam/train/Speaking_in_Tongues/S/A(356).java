package methodEmbedding.Speaking_in_Tongues.S.LYD959;

import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args) {
		String encoded = " ynficwlbkuomxsevzpdrjgthaq";
		String decoded = " abcdefghijklmnopqrstuvwxyz";

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();sc.nextLine();
		String[] s = new String[n];
		for(int i=0;i<n;i++){
			s[i] = sc.nextLine();
		}

		for(int i=0;i<n;i++){
			char[] out = new char[s[i].length()];
			for(int j=0;j<s[i].length();j++){
				int index = encoded.indexOf(s[i].charAt(j));
				out[j] = decoded.charAt(index);
			}
			System.out.print("Case #" + (i+1) + ": ");
			System.out.println(out);
		}
	}
}
