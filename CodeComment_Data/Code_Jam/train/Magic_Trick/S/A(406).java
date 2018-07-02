package methodEmbedding.Magic_Trick.S.LYD1278;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		FileWriter fw = new FileWriter("A-small-attempt0.out");
		int N = new Integer(in.readLine());
		int Column = 4;
		for (int cases = 1; cases <= N; cases++) {
			
			
			int C1 = new Integer(in.readLine());
			int[] line1 = new int[Column];
			
			for (int i = 1; i <= Column; i++) {
				if (i==C1){
					StringTokenizer st = new StringTokenizer(in.readLine());
					for (int j = 0; j < line1.length; j++) {
						line1[j] = new Integer(st.nextToken());
					}
				}
				else{
					in.readLine();
				}
			}
			
			int C2 = new Integer(in.readLine());
			int[] line2 = new int[Column];
			for (int i = 1; i <= Column; i++) {
				if (i==C2){
					StringTokenizer st = new StringTokenizer(in.readLine());
					for (int j = 0; j < line2.length; j++) {
						line2[j] = new Integer(st.nextToken());
					}
				}
				else{
					in.readLine();
				}
			}
			
			int countFound = 0;
			int y = 0;
			for (int i = 0; i < Column; i++) {
				for (int j = 0; j < Column; j++) {
					if(line1[i] == line2[j]){
						countFound++;
						y = line1[i];
					}
				}
			}
			
			if (countFound == 1){
				fw.write("Case #" + cases + ": " + y + "\n");
			}
			else if (countFound > 1){
				fw.write("Case #" + cases + ": Bad magician!\n");
			}
			else {
				fw.write("Case #" + cases + ": Volunteer cheated!\n");
			}
			
			
			
			
		}
		fw.flush();
		fw.close();
		
		System.out.println("Done!");
	}

}

