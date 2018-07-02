package methodEmbedding.Magic_Trick.S.LYD1242;


import java.io.*;
import java.util.*;

public class A {
		public static void main(String [] args) throws Exception {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter("outputA.txt");
			//PrintWriter pw = new PrintWriter(System.out);
			
			int t = Integer.parseInt(br.readLine());
			int [] first = new int[4];
			int [] second = new int[4];
			
			for(int tests=1; tests<=t; ++tests) {
				int firstRow = Integer.parseInt(br.readLine());
				for(int q=1; q<=4; q++) {
					if(firstRow==q) {
						String [] temp = br.readLine().split(" ");
						for(int i=0; i<4; i++)
							first[i] = Integer.parseInt(temp[i]);
					} else {
						String temp1 = br.readLine();
					}
				}
				
				int secondRow = Integer.parseInt(br.readLine());
				for(int q=1; q<=4; q++) {
					if(secondRow==q) {
						String [] temp = br.readLine().split(" ");
						for(int i=0; i<4; i++)
							second[i] = Integer.parseInt(temp[i]);
					} else {
						String temp1 = br.readLine();
					}
				}
				
				int counter = 0;
				int value = -1;
				for(int i=0; i<4; i++)
					for(int j=0; j<4; j++)
						if(first[i]==second[j]) {
							counter++;
							value = first[i];
						}
				
				String result = "";
				if(counter==1)
					result = String.valueOf(value);
				else if(counter>1)
					result = "Bad magician!";
				else
					result = "Volunteer cheated!";
				
				pw.println("Case #"+tests+": "+result);
				pw.flush();
					
					
			}
		}
}
