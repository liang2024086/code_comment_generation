package methodEmbedding.Magic_Trick.S.LYD1309;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

public class Main {
	private static final int ROWS_NUM = 4, COLUMNS_NUM = 4;

	private static final int MIN_NUMBER = 1, MAX_NUMBER = 100;

	private static final int ARRANGEMENTS_NUM = 2;

	private static final String RESULT_BAD_MAGICION = "Bad magician!",
			RESULT_VOLUNTEER_CHEATED = "Volunteer cheated!";

	private static final String OUTPUT_FILE_NAME = "magic-trick.out";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		if (args.length == 0)
			throw new IllegalStateException("No arguments passed");

		Reader reader = new FileReader(args[0]);
		String[] answers;
		try {
			BufferedReader buffer = new BufferedReader(reader);
			reader = buffer;

			int numTricks = Integer.parseInt(buffer.readLine());
			if (numTricks < MIN_NUMBER)
				throw new IllegalStateException("Number is less than a minimum of " + MIN_NUMBER);
			if (numTricks > MAX_NUMBER)
				throw new IllegalStateException("Number is greated than a maximum " + MAX_NUMBER);
			answers = new String[numTricks];

			for (int trickIndex = 0; trickIndex < numTricks; trickIndex++) {
				Set<Integer> possibilities = null;
				for (int arrangementIndex = 0; arrangementIndex < ARRANGEMENTS_NUM;
						arrangementIndex++) {
					int rowSelection = Integer.parseInt(buffer.readLine());
					if (rowSelection <= 0)
						throw new IllegalStateException(
								"Provided answer is less than a minimum of 1 in test case " +
								trickIndex + " arrangement " + arrangementIndex);
					if (rowSelection > ROWS_NUM)
						throw new IllegalStateException(
								"Provided answer is greated than a maximum of " + ROWS_NUM +
								" in test case " + trickIndex + " arrangement " + arrangementIndex);

					// TODO: Confirm grid correctness?
					Set<Integer> newPossibilities = new HashSet<Integer>();
					for (int rowIndex = 0; rowIndex < ROWS_NUM; rowIndex++) {
						String[] rowValues = buffer.readLine().split(" ");
						if (rowValues.length != COLUMNS_NUM)
							throw new IllegalStateException("The number of values in row " +
									rowIndex + " arrangement " + arrangementIndex +
									" test case " + trickIndex + " is not " + COLUMNS_NUM);

						if (rowIndex == rowSelection - 1) {
							for (int columnIndex = 0; columnIndex < COLUMNS_NUM; columnIndex++) {
								newPossibilities.add(Integer.valueOf(rowValues[columnIndex]));
							}
						}
					}
					if (possibilities == null)
						possibilities = newPossibilities;
					else
						possibilities.retainAll(newPossibilities);
				}

				String answer;
				switch (possibilities.size()) {
					case 1:  answer = Integer.toString(possibilities.iterator().next()); break;
					case 0:  answer = RESULT_VOLUNTEER_CHEATED; break;
					default: answer = RESULT_BAD_MAGICION;
				}
				answers[trickIndex] = answer;
			}
			// TODO: Verify file ending?
		} finally {
			reader.close();
		}

		Writer writer = new FileWriter(OUTPUT_FILE_NAME);
		try {
			BufferedWriter buffer = new BufferedWriter(writer);
			writer = buffer;
			for (int answerIndex = 0; answerIndex < answers.length; answerIndex++) {
				buffer.write("Case #" + (answerIndex + 1) + ": " + answers[answerIndex]);
				buffer.newLine();
			}
		} finally {
			writer.close();
		}
	}
}
