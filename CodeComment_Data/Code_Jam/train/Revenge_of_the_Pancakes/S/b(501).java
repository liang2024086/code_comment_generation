package methodEmbedding.Revenge_of_the_Pancakes.S.LYD578;

import java.util.*;
import java.io.*;

public class b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for(int caseN = 1; caseN <= t; caseN++) {
			String str = in.next();

			char[] arr = str.toCharArray();
			int len = arr.length;

			int count = 0;

			if(arr[len - 1] == '-') count++;

			for(int i = 1; i < len; i++)
				if(arr[i] != arr[i - 1]) count++;

			System.out.println("Case #" + caseN + ": " + count);	
		}

	}

}
