package methodEmbedding.Magic_Trick.S.LYD1619;

import java.io.*;

public class A {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		FileWriter fw = new FileWriter("A-small-attempt1.out");
		
		int N = new Integer(in.readLine());
		
		for (int cases = 1; cases <= N; cases++) {
			String out = "";
			
			int q1 = Integer.parseInt(in.readLine());
			String r1[] = null;
			
			for (int i=1; i < 5; i++) {
				String temp = in.readLine();
				if(i == q1) {
					r1 = temp.split(" ");
				}
			}
			
			int q2 = Integer.parseInt(in.readLine());
			String r2[] = null;
			
			for (int i=1; i < 5; i++) {
				String temp = in.readLine();
				if(i == q2) {
					r2 = temp.split(" ");
				}
			}
			
			int nb = 0;
			int x = 0;
			
			for (int i = 0; i < r1.length; i++) {
				for (int i2 = 0; i2 < r2.length; i2++) {
					if (Integer.parseInt(r1[i]) == Integer.parseInt(r2[i2]))
					{
						nb = Integer.parseInt(r1[i]);
						x++;
					}
				}
			}
			
			if (x == 0) {
				fw.write ("Case #" + cases + ": " + "Volunteer cheated!" + "\n");
			}
			else if (x == 1) {
				fw.write ("Case #" + cases + ": " + nb + "\n");
			}
			else {
				fw.write ("Case #" + cases + ": " + "Bad magician!" + "\n");
			}
		}
		
		fw.flush();
		fw.close();
	}

}


