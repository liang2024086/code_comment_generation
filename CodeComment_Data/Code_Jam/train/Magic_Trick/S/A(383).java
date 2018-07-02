package methodEmbedding.Magic_Trick.S.LYD2188;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class A {

	public static void main(String args[]) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("A-small-attempt0.in.txt");
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("A-small-attempt0.out.txt");
			bw = new BufferedWriter(fw);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		int count = 0;
		try {
			count = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= count ; i++) {

			int row1 = 0;
			try {
				row1 = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			Set<Integer> cardRowSet = new HashSet<Integer>();
			for (int j = 1; j < 5;j++) {
				try {				
					String cardRow = br.readLine();
					if (j != row1) continue;

					String [] card = cardRow.split(" ");
					cardRowSet.add(Integer.valueOf(card[0]));
					cardRowSet.add(Integer.valueOf(card[1]));
					cardRowSet.add(Integer.valueOf(card[2]));
					cardRowSet.add(Integer.valueOf(card[3]));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			int row2 = 0;
			try {
				row2 = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			int removed = 0;
			for (int j = 1; j < 5;j++) {
				try {				
					String cardRow = br.readLine();
					if (j != row2) continue;

					String [] card = cardRow.split(" ");
					for(int k = 0; k < 4;k++) {
						int current = Integer.valueOf(card[k]);
						if (cardRowSet.remove(current)) {
							removed = current;
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			int size = cardRowSet.size();
			String result;
			if (size == 3) {
				result = String.valueOf(removed);
			} else if (size == 4) {
				result = "Volunteer cheated!";
			} else {
				result = "Bad magician!";
			}

			StringBuffer resultStr = new StringBuffer();
			resultStr.append("Case #");
			resultStr.append(i);
			resultStr.append(": ");
			resultStr.append(result);
			resultStr.append("\n");
			try {
				bw.write(resultStr.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print(resultStr.toString());
		}
		try {
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
