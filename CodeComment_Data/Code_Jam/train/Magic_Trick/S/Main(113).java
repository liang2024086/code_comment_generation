package methodEmbedding.Magic_Trick.S.LYD2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		try {
			// InputStreamReader isr = new InputStreamReader(//System.in);
			FileReader isr;

			isr = new FileReader(new File(
					"C:\\Users\\dilip1\\Desktop\\A-small-attempt7.in"));

			BufferedReader br = new BufferedReader(isr);

			FileWriter fw = new FileWriter(new File(
					"C:\\Users\\dilip1\\Desktop\\output.out"));
			BufferedWriter bw = new BufferedWriter(fw);

			int no_cases = Integer.parseInt(br.readLine());
			// //System.out.println("cases:"+no_cases);
			int row1;
			String[] row11;
			int row2;
			String[] row12;
			for (int i = 1; i <= no_cases; i++) {
				// //System.out.println("i"+i);
				row1 = Integer.parseInt(br.readLine()) - 1;
				//System.out.println(row1);
				row11 = new String[4];
				row11[0] = br.readLine();
				//System.out.println(row11[0]);
				row11[1] = br.readLine();
				//System.out.println(row11[1]);
				row11[2] = br.readLine();
				//System.out.println(row11[2]);
				row11[3] = br.readLine();
				//System.out.println(row11[3]);
				row2 = Integer.parseInt(br.readLine()) - 1;
				//System.out.println(row1);
				row12 = new String[4];
				row12[0] = br.readLine();
				//System.out.println(row12[0]);
				row12[1] = br.readLine();
				//System.out.println(row12[1]);
				row12[2] = br.readLine();
				//System.out.println(row12[2]);
				row12[3] = br.readLine();
				//System.out.println(row12[3]);
				String[] digits1 = row11[row1].split(" ");
				int count = 0;
				String str = "";

				for (String s : digits1) {

					if (row12[row2].contains(s)) {
						String str2[] = row12[row2].split(" ");
						for (String s1 : str2) {
							if (s1.equals(s)) {
								//System.out.println(row12[row2] + ":" + s);
								str = s;
								count++;
							}
						}

					}
				}
				//System.out.println("count0" + count);
				if (count == 0) {
					//System.out.println("Case #" + i + ": Volunteer cheated!");
					fw.write("Case #" + i + ": Volunteer cheated!");
				} else if (count == 1) {
					//System.out.println("Case #" + i + ":" + str);
					fw.write("Case #" + i + ": " + str + "");
				} else {
					//System.out.println("Case #" + i + ": Bad magician!\n");
					fw.write("Case #" + i + ": Bad magician!");

				}
				if (i < no_cases)
					fw.write("\n");
			}
			fw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
