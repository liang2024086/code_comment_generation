package methodEmbedding.Counting_Sheep.S.LYD1468;


import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.codejam16.common.ExtractDigits;
import com.codejam16.common.FileUtil;

public class CountSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> digitsSeen = new TreeSet<Integer>();
		List<Integer> testCases = null;
		int numberOfTestCases = 0;
		String outputFilePath = CountSheep.class.getResource(args[0]).getFile()
				.replace("input", "output");
//		System.out.println("output file path: " + outputFilePath);

		testCases = FileUtil.readTestCases(args[0]);

		numberOfTestCases = testCases.size();
//		System.out.println("Number of testcases::" + numberOfTestCases);
		BufferedWriter writer = FileUtil.create(outputFilePath);
		int testCaseNumber = 1;
		for (int testcase : testCases) {

			boolean insomnia = false;
			int previous = -1;
			int c = 1;
			System.out.println("testcase::"+testcase);
			while (digitsSeen.size() != 10 && !insomnia) {
//				System.out.println("previous::"+previous+", c*testcase:: "+c*testcase);
				System.out.println("number seen::"+c * testcase);
				if (previous == c * testcase) {
					insomnia = true;
					break;
				}
				ExtractDigits.union(ExtractDigits.extract(c * testcase),
						digitsSeen);
				previous = c * testcase;
				c++;
				
			}

			try {
				writer.write("Case #" + testCaseNumber++ + ": "
						+ (insomnia ? "INSOMNIA" : previous));
				writer.newLine();
				writer.flush();
//				System.out.println("digits seen::"+digitsSeen);
				digitsSeen.clear();
//				System.out.println("digits seen::"+digitsSeen);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
