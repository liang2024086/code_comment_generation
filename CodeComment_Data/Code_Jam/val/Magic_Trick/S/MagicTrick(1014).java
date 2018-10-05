package methodEmbedding.Magic_Trick.S.LYD1772;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Magic Trick
 * Question A from Google Code Jam 2014
 *
 * @author William Glenn Hollingsworth (Mebibyte)
 * @version 1.0
 */
public class MagicTrick {
	private static int first, second;
	private static Scanner scan;
	private static BufferedWriter writer;

	public static void main(String[] args) {
		try {
			scan = new Scanner(new File("A-small-attempt0.in"));
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "utf-8"));
			int tests = Integer.parseInt(scan.nextLine());
			for (int i = 1; i <= tests; i++) {
				boolean[] inList = new boolean[17];
				ArrayList<Integer> outList = new ArrayList<>(4);
				first = Integer.parseInt(scan.nextLine());
				for (int j = 1; j <= 4; j++) {
					if (j == first) {
						for (int k = 1; k <= 4; k++) {
							inList[scan.nextInt()] = true;
						}
					}
					scan.nextLine();
				}
				
				second = Integer.parseInt(scan.nextLine());
				for (int j = 1; j <= 4; j++) {
					if (j == second) {
						for (int k = 1; k <= 4; k++) {
							int num = scan.nextInt();
							if (inList[num]) {
								outList.add(num);
							}
						}
					}
					scan.nextLine();
				}
				writer.write("Case #" + i + ": " + (outList.size() == 1 ? outList.get(0) : (outList.size() == 0 ? "Volunteer cheated!" : "Bad magician!")) + "\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
