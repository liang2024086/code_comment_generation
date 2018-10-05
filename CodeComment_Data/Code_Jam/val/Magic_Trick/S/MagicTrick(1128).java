package methodEmbedding.Magic_Trick.S.LYD1878;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new FileReader("A-small-attempt2.in"));
			PrintWriter out = new PrintWriter(new FileWriter("A-small-attempt0.out"));
			int cases = Integer.valueOf(in.nextLine());
			for(int c = 1; c <= cases; c++) {
				HashMap<String,Boolean> hash = new HashMap<String,Boolean>();
				String target = null; int occur = 0;
				int row1 = Integer.valueOf(in.nextLine());
				for(int i = 1; i <= 4; i++) {
					String s = in.nextLine();
					if(row1 == i) {
						String[] tmp = s.split(" ");
						for(String t : tmp) {
							hash.put(t, true);
						}
					}
				}
				int row2 = Integer.valueOf(in.nextLine());
				for(int i = 1; i <= 4; i++) {
					String s = in.nextLine();
					if(row2 == i) {
						String[] tmp = s.split(" ");
						for(String t : tmp) {
							Boolean b = hash.get(t);
							if(b != null && b == true) {
								target = t;
								occur++;
							}
						}
					}
				}
				switch(occur) {
					case 0:
						out.write("Case #"+c+": Volunteer cheated!");
						break;
					case 1:
						out.write("Case #"+c+": "+target);
						break;
					default:
						out.write("Case #"+c+": Bad magician!");
						break;
				}
				if(c != cases) {
					out.write("\n");
				}
			}
			in.close();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
