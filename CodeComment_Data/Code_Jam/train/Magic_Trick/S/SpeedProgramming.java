package methodEmbedding.Magic_Trick.S.LYD249;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;

/**
 *
 * @author User
 */
public class SpeedProgramming {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			// TODO code application logic here

			Scanner fin = new Scanner(new File("input.txt"));
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

			int time = fin.nextInt();
			int[][] arr1 = new int[4][4];
			int row1;
			int[][] arr2 = new int[4][4];
			int row2;
			int i;
			int j;
			List<Integer> lis = new LinkedList<Integer>();

			for (int m = 0; m < time; m++) {
				lis.clear();
				row1 = fin.nextInt();
				row1--;
				for (i = 0; i < 4; i++) {
					for (j = 0; j < 4; j++) {
						arr1[i][j] = fin.nextInt();
					}
				}

				row2 = fin.nextInt();
				row2--;
				for (i = 0; i < 4; i++) {
					for (j = 0; j < 4; j++) {
						arr2[i][j] = fin.nextInt();
					}
				}

				for (i = 0; i < 4; i++) {
					for (j = 0; j < 4; j++) {
						if (arr1[row1][i] == arr2[row2][j]) {
							lis.add(arr1[row1][i]);
						}
					}
				}
				writer.print("Case #" + (m + 1) + ": ");
				if (lis.size() == 0) {
					writer.println("Volunteer cheated!");
				} else if (lis.size() > 1) {
					writer.println("Bad magician!");
				} else {
					writer.println(lis.remove(0));
				}
			}
			writer.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
