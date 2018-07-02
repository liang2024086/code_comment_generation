package methodEmbedding.Magic_Trick.S.LYD654;

import java.math.*;
import java.io.*;
import java.util.*;

public class CodeJam {
	
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		PrintWriter w = null;
		try {
			System.out.println(args[0]);
			s = new Scanner(new BufferedReader(new FileReader(args[0])));
			w = new PrintWriter(args[0] + ".out");
			
			//total test cases
			int total = s.nextInt();

			//for each test case
			for(int i=1; i<=total; i++) {
				String result = "Volunteer cheated!";
				int g = s.nextInt();
				int[] a = new int[4];

				for(int r=0; r<4; r++) {
					
						for(int c=0; c<4; c++) {
							if(r == g-1){
								a[c] = s.nextInt();
							} else {
								s.nextInt();
							}
						}
					
				}

				g = s.nextInt();
				for(int r=0; r<4; r++){
					
						for(int c=0; c<4; c++) {
							int b = s.nextInt();
							if(r == g-1) {
								for(int j=0; j<4; j++){
									if(a[j] == b) {
										if(result.equals("Volunteer cheated!")){
											result = "" + b;
										} else {
											result = "Bad magician!";
										}
									}
								}
							}
						}
					
				}

				w.println("Case #"+i+": " + result);
			}

		} finally {
			if(s != null) {
				s.close();
			}

			if(w != null) {
				w.close();
			}
		}
	}
}
