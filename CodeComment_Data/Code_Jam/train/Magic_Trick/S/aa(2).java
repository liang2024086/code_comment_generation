package methodEmbedding.Magic_Trick.S.LYD311;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

import javax.swing.ComboBoxEditor;

public class aa {

	public static void main(String[] args) throws IOException {

	//	 BufferedReader in = new BufferedReader(new
		// InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		// PrintWriter out = new PrintWriter(new
	//	 OutputStreamWriter(System.out));
		StringBuilder q = new StringBuilder();
		int n = Integer.parseInt(in.readLine().trim());
		for (int i = 0; i < n; i++) {
			int fRow = Integer.parseInt(in.readLine().trim());
			boolean ch[] = new boolean[20];
			for (int j = 1; j <= 4; j++) {
				String y[] = in.readLine().trim().split(" ");
				if (j == fRow) {
					for (int k = 0; k < 4; k++) {
						int t = Integer.parseInt(y[k]);
						ch[t] = true;
					}
				}
			}
			int sRow = Integer.parseInt(in.readLine().trim());
			int ans = -1;
			int count = 0;
			for (int j = 1; j <= 4; j++) {
				String y[] = in.readLine().trim().split(" ");
				if (j == sRow) {
					for (int k = 0; k < 4; k++) {
						int t = Integer.parseInt(y[k]);
						if (ch[t]) {
							ans = t;
							count++;
						}
					}
				}
			}
			out.print("Case #" + (i + 1) + ": ");
			if (count == 0)
				out.println("Volunteer cheated!");
			else if (count == 1)
				out.println(ans);
			else
				out.println("Bad magician!");

		}

		out.close();

	}
}
