package methodEmbedding.Standing_Ovation.S.LYD974;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;


public class Concert {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File(args[0]));
        File outFile = new File(args[1]);
        FileOutputStream os = new FileOutputStream(outFile);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        Writer w = new BufferedWriter(osw);
		
		int cases = sc.nextInt();

		for (int i=0; i<cases; ++i) {
			
			int maxS = sc.nextInt();
			String sStr = sc.next();
			
			int specSum = 0;
			int maxDiff = 0;
			for (int j=0; j<sStr.length(); ++j) {
				if (j-specSum > maxDiff) {
					maxDiff = j-specSum;
				}
				int specJ = new Integer(sStr.substring(j,j+1));
				specSum += specJ;
			}
			
			w.write("Case #" + Integer.toString(i+1) + ": " + Integer.toString(maxDiff) + "\n");
		}
		
		w.close();
		sc.close();
	}

}
