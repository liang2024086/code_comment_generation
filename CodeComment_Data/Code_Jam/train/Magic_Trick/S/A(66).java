package methodEmbedding.Magic_Trick.S.LYD871;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class A {
	private static final File output = new File("C:\\Users\\Christian\\Desktop\\a-out.txt");
	
	private static final HashSet<Integer> existing = new HashSet<Integer>();
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		Scanner s = new Scanner(System.in);
	
		int numcases = s.nextInt();
		
		for ( int caseNum = 1; caseNum <= numcases; caseNum++ ) {
			int matches = 0;
			int lastMatch = -1;
			existing.clear();
			
			int row1 = s.nextInt()-1;
			for ( int i = 0; i < 4; i++ ) {
				for ( int j = 0; j < 4; j++ ) {
					int number  = s.nextInt();
					if ( i == row1 ) {
						existing.add(number);
					}
				}
			}
			
			int row2 = s.nextInt()-1;
			for ( int i = 0; i < 4; i++ ) {
				for ( int j = 0; j < 4; j++ ) {
					int number  = s.nextInt();
					if ( i == row2 ) {
						boolean existed = !existing.add(number);
						matches += (existed?1:0);
						if ( existed ) {
							lastMatch = number;
						}
					}
				}
			}
			
			sb.append("Case #"+caseNum+": ");
			
			if ( matches == 0 ) {
				sb.append("Volunteer cheated!");
			}
			else if ( matches == 1 ) {
				sb.append(lastMatch);
			} 
			else {
				sb.append("Bad magician!");
			}
			sb.append("\n");
		}
		
		s.close();
		
		FileOutputStream fos = new FileOutputStream(output);
		fos.write(sb.toString().getBytes());
		fos.close();
	}

}
