package methodEmbedding.Magic_Trick.S.LYD2216;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A {

	@SuppressWarnings("deprecation")
	public static void main(String[] Args) throws NumberFormatException, IOException {
		FileInputStream inFile = new FileInputStream(new File("src/qualification/A-small-attempt0.in"));
		DataInputStream in = new DataInputStream(inFile);
		FileOutputStream outFile = new FileOutputStream(new File("src/qualification/out.txt"));
		DataOutputStream out = new DataOutputStream(outFile);

		int cases = Integer.parseInt(in.readLine());

		for (int i = 1; i <= cases; i++) {

			int row1 = Integer.parseInt(in.readLine());
					
			
			for(int j=1; j<row1; j++ ){
				in.readLine();
			}
			
			String[] possible1 = in.readLine().split(" ");
			
			for(int j=row1+1; j<=4; j++ ){
				in.readLine();
			}
			
			int row2 = Integer.parseInt(in.readLine());
					
			
			for(int j=1; j<row2; j++ ){
				in.readLine();
			}
			
			String[] possible2 = in.readLine().split(" ");
			
			for(int j=row2+1; j<=4; j++ ){
				in.readLine();
			}
			
			Set<String> s1 = new HashSet<String>(Arrays.asList(possible1));
			Set<String> s2 = new HashSet<String>(Arrays.asList(possible2));
			s1.retainAll(s2);

			String[] possible = s1.toArray(new String[s1.size()]);
			
			String msg;
			if (possible.length == 0) {
				msg = "Volunteer cheated!";
			} else if (possible.length == 1) {
				msg = possible[0];
			} else {
				msg = "Bad magician!";
			}

			String result = ("Case #" + i + ": "  + msg);
			//System.out.println(result);
			out.writeBytes(result +"\n");

		}
	}
}
