package methodEmbedding.Counting_Sheep.S.LYD1494;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class maain {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
		BufferedWriter writer = new BufferedWriter(new FileWriter("A-small-attempt0.out"));
		
		int numOfCases = Integer.parseInt(reader.readLine());
		int n, j, q, r, innern, innern2 = -1;
		
		for(int i=0; i<numOfCases; i++) {
			n = Integer.parseInt(reader.readLine());
			System.out.println("???? n = " + n);
			
			if(n == 0) {
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
				writer.write("Case #" + (i+1) + ": INSOMNIA");
				writer.newLine();
				continue;
			}
			
			boolean[] flag = {false, false, false, false, false, false, false, false, false, false};
			j = 1; 
			while(flag[0] == false || flag[1] == false || flag[2] == false || flag[3] == false || flag[4] == false || flag[5] == false || flag[6] == false || flag[7] == false || flag[8] == false || flag[9] == false) {
				innern2 = n*j;
				j++;
				innern = innern2;
				while(true) {
					q = innern/10;
					r = innern%10;
//					System.out.println("innern = " + innern + " q = " + q + " r = " + r);
					flag[r] = true;
//					System.out.println(r + " becomes true");
//					System.exit(1);
					if(q != 0) {
						innern=q; continue;
					}
					else {
						break;
					}
				}
//				if(j == 20) {
//					break;
//				}
			}
//			System.out.println("answer " + i + " = " + innern2);
			System.out.println("Case #" + (i+1) + ": " + innern2);
			writer.write("Case #" + (i+1) + ": " + innern2);
			writer.newLine();
		}
		reader.close();
		writer.close();
		
	}
}
