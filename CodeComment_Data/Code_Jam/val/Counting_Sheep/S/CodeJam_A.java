package methodEmbedding.Counting_Sheep.S.LYD1437;

import java.util.*;
import java.io.*;
import java.math.*;

public class CodeJam_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tests = Integer.parseInt(in.next());

		for(int tt = 1; tt <= tests; tt++) {

			int space = 10;
			int[] arr = new int[10];

			int input = Integer.parseInt(in.next());

			if(input == 0) {
				System.out.println("Case #" + tt + ": INSOMNIA");
			} else {

				int mult = 1;

				while(space > 0) {
					
					int tempNum = new Integer(input * mult);
					//System.out.println(tempNum);
					while(tempNum > 0) {
						int r = tempNum % 10;
						if(arr[r] == 0) {
							arr[r] = 1;
							space--;
						} 
						tempNum /= 10;
					}
					if(space > 0) {
						mult++;
					}
				}
				System.out.println("Case #" + tt + ": " + (input * mult));

			}
		}



	}


}
