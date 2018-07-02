package methodEmbedding.Standing_Ovation.S.LYD471;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Standing Ovation
 * Question A from Google Code Jam 2015
 *
 * @author William Glenn Hollingsworth (Mebibyte)
 * @version 1.0
 */
public class StandingOvation {
	private static int first, second;
	private static Scanner scan;
	private static BufferedWriter writer;

	public static void main(String[] args) {
		try {
			scan = new Scanner(new File("A-small-attempt0.in"));
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("A-small-attempt0.out"), "utf-8"));
			int tests = Integer.parseInt(scan.nextLine());
			for (int j = 1; j <= tests; j++) {
                int maxShy = Integer.parseInt(scan.next()), toAdd = 0, standing = 0;
                String audience = scan.next();
                for (int i = 0; i <= maxShy; i++) {
                    if (standing < i && audience.charAt(i) != '0') {
                        toAdd += i - standing;
                        standing += i - standing;
                    }
                    standing += audience.charAt(i) - '0';
                }
				writer.write("Case #" + j + ": " + toAdd + "\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
