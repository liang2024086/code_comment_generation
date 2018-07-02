package methodEmbedding.Magic_Trick.S.LYD733;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author antonio081014
 * @time Apr 11, 2014, 9:26:02 PM
 */
public class GCJ_2014_Qualification_A_Magic_Trick {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("input.txt"));
			PrintWriter out = new PrintWriter(new File("out.txt"));
			int T = Integer.parseInt(in.readLine());
			for (int t = 1; t <= T; t++) {
				out.write(String.format("Case #%d: ", t));
				int answer = Integer.parseInt(in.readLine());
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				for (int i = 0; i < 4; i++) {
					String[] s = in.readLine().split("\\s");
					if (answer == i + 1) {
						for (int j = 0; j < 4; j++) {
							list1.add(Integer.parseInt(s[j]));
						}
					}
				}
				answer = Integer.parseInt(in.readLine());
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				for (int i = 0; i < 4; i++) {
					String[] s = in.readLine().split("\\s");
					if (answer == i + 1) {
						for (int j = 0; j < 4; j++) {
							list2.add(Integer.parseInt(s[j]));
						}
					}
				}
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (Integer a : list1) {
					for (Integer b : list2) {
						if (a.intValue() == b.intValue()) {
							list.add(a);
						}
					}
				}
				if (list.size() == 1) {
					out.write("" + list.get(0) + "\n");
				} else if (list.size() == 0) {
					out.write("Volunteer cheated!\n");
				} else {
					out.write("Bad magician!\n");
				}
			}
			in.close();
			out.close();
		} catch (Exception e) {
		}
	}

}
