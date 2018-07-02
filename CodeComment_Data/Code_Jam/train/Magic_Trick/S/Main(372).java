package methodEmbedding.Magic_Trick.S.LYD1726;

/*
 * Copyright ?? $year Elastic Path Software Inc. All rights reserved.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		File output = new File("output");
		try (
				PrintWriter writer = new PrintWriter(new FileWriter(output));
				BufferedReader reader = new BufferedReader(new InputStreamReader(Main.class.getClassLoader().getResourceAsStream("sample")))) {

			String line = reader.readLine();
			int problems = Integer.parseInt(line);
			for (int i = 0; i < problems; i++) {
				int firstAnswer = Integer.parseInt(reader.readLine());
				String firstAnswerRow = line;
				for (int row = 0; row < 4; row++) {
					line = reader.readLine();
					if (row == firstAnswer - 1) {
						firstAnswerRow = line;
					}
				}
				int secondAnswer = Integer.parseInt(reader.readLine());
				String secondAnswerRow = line;
				for (int row = 0; row < 4; row++) {
					line = reader.readLine();
					if (row == secondAnswer - 1) {
						secondAnswerRow = line;
					}
				}
				ImmutableSet<String> firstRowSet = ImmutableSet.copyOf(Splitter.on(" ").split(firstAnswerRow));
				ImmutableSet<String> secondRowSet = ImmutableSet.copyOf(Splitter.on(" ").split(secondAnswerRow));
				Sets.SetView<String> intersection = Sets.intersection(firstRowSet, secondRowSet);
				writer.print(String.format("Case #%d: ", i + 1));
				if (intersection.size() == 0) {
					writer.println("Volunteer cheated!");
				} else if (intersection.size() == 1) {
					writer.println(intersection.iterator().next());
				} else {
					writer.println("Bad magician!");
				}
			}

		}
	}
}
