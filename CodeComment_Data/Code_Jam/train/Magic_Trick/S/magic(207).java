package methodEmbedding.Magic_Trick.S.LYD553;

import java.io.*;
import java.util.*;

class magic {
	public static void main (String [] args) throws IOException {
		long start = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new FileReader("magic.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("magic.out")));
		int T = Integer.parseInt(br.readLine());
		for (int k = 0; k < T; k++) {
			String answer = "";
			int firstans = Integer.parseInt(br.readLine())-1;
			int[] firstrow = new int[4];
			for (int i = 0; i < 4; i++) {
			    if (i == firstans) {
			        StringTokenizer st = new StringTokenizer(br.readLine());
			        for (int j = 0; j < 4; j++) {
			            firstrow[j] = Integer.parseInt(st.nextToken());
			        }
			    }
			    else br.readLine();
			}
			int secondans = Integer.parseInt(br.readLine())-1;
			int[] secondrow = new int[4];
			for (int i = 0; i < 4; i++) {
			    if (i == secondans) {
			        StringTokenizer st = new StringTokenizer(br.readLine());
			        for (int j = 0; j < 4; j++) {
			            secondrow[j] = Integer.parseInt(st.nextToken());
			        }
			    }
			    else br.readLine();
			}
			int numcol = -1;
			boolean volunteer = true;
			boolean magician = false;
			for (int i = 0; i < 4; i++) {
			    for (int j = 0; j < 4; j++) {
			        if (firstrow[i] == secondrow[j]) {
			            if (volunteer) {
			                volunteer = false;
			                numcol = i;
			            }
			            else if (!volunteer && !magician) {
			                magician = true;
			            }
			        }
			    }
			}
			if (volunteer) answer = "Volunteer cheated!";
			else if (magician) answer = "Bad magician!";
			else answer = Integer.toString(firstrow[numcol]); 
			out.println("Case #" + (k+1) + ": " + answer);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		out.close();
		System.exit(0);
	}
}

