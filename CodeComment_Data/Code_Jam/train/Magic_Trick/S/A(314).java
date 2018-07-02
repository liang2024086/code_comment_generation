package methodEmbedding.Magic_Trick.S.LYD1508;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("A-small-attempt0.in");
		Scanner inFile = new Scanner(reader);
		int numIns = Integer.parseInt(inFile.nextLine().trim());
		for (int count = 1; count <= numIns; count++) {
			ArrayList<Integer> one = new ArrayList<Integer>();
			ArrayList<Integer> two = new ArrayList<Integer>();
			for (int j = 1; j < 3; j++) {
				int firstan = Integer.parseInt(inFile.nextLine().trim());
				ArrayList<Integer> first = new ArrayList<Integer>();
				ArrayList<Integer> second = new ArrayList<Integer>();
				ArrayList<Integer> third = new ArrayList<Integer>();
				ArrayList<Integer> fourth = new ArrayList<Integer>();
				for (int i = 1; i <= 4; i++) {
					first.add(Integer.parseInt(inFile.next().trim()));
				}
				for (int i = 1; i <= 4; i++) {
					second.add(Integer.parseInt(inFile.next().trim()));
				}
				for (int i = 1; i <= 4; i++) {
					third.add(Integer.parseInt(inFile.next().trim()));
				}
				for (int i = 1; i <= 4; i++) {
					if (i != 4) {
						fourth.add(Integer.parseInt(inFile.next().trim()));
					} else {
						fourth.add(Integer.parseInt(inFile.nextLine().trim()));
					}
				}
				if (j == 1) {
					if (firstan == 1) {
						one = first;
					} else if (firstan == 2) {
						one = second;
					} else if (firstan == 3) {
						one = third;
					} else if (firstan == 4) {
						one = fourth;
					}
				} else if (j == 2) {
					if (firstan == 1) {
						two = first;
					} else if (firstan == 2) {
						two = second;
					} else if (firstan == 3) {
						two = third;
					} else if (firstan == 4) {
						two = fourth;
					}
				}
			}
			// checking arrays
			int cards = 0;
			int onlycard = 0;
			for (int can = 0; can < 4; can++) {
				if (one.contains(two.get(can))) {
					onlycard = two.get(can);
					cards++;
				}
			}
			String output = "";
			if (cards == 0) {
				output = "Volunteer cheated!";
			} else if (cards > 1) {
				output = "Bad magician!";
			} else if (cards == 1) {
				output = Integer.toString(onlycard);
			}

			FileWriter fw = new FileWriter("out.txt", true);
			fw.write("Case #" + count + ": " + output + "\n");
			fw.close();
			System.out.println(output);
		}
	}
}
