package methodEmbedding.Cookie_Clicker_Alpha.S.LYD511;

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

		// BufferedReader in = new BufferedReader(new
		// InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		BufferedReader in = new BufferedReader(new FileReader(
				"B-small-attempt5.in"));
		// PrintWriter out = new PrintWriter(new

		// OutputStreamWriter(System.out));
		StringBuilder q = new StringBuilder();
		int n = Integer.parseInt(in.readLine().trim());
		for (int i = 0; i < n; i++) {
			String y[] = in.readLine().trim().split(" ");
			double c = Double.parseDouble(y[0]);
			double f = Double.parseDouble(y[1]);
			double x = Double.parseDouble(y[2]);
			double totTime = Integer.MAX_VALUE;

			double rate = 2.0000000;
			if (x < rate) {
				totTime = (double) x / (double) rate;
			}
			double time = 0.0000000;
			int w = 0;
			while (w < 100000) {
				double time1 = ((double) x / (double) rate) + (double) time;
				totTime = (double) Math.min((double) totTime, (double) time1);
				time = (double) time + (double) c / (double) rate;
				rate = (double) rate + (double) f;
				w++;

			}
			out.print("Case #" + (i + 1) + ": ");
			out.printf("%.7f", totTime);
			out.println();
		}

		out.close();

	}
}
