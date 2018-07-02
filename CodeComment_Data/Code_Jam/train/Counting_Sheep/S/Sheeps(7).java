package methodEmbedding.Counting_Sheep.S.LYD1448;

import java.io.IOException;
import java.util.ArrayList;

import codeJam.common.FileUtil;

public class Sheeps {

	public static void main(String[] args) {
		ArrayList<Integer> pastNums;
		ArrayList<Integer> pastDigits;
		
		try {
			FileUtil fUtil = new FileUtil();
			int cases = Integer.parseInt(fUtil.readLine());
			for (int i = 0; i < cases; i++) {
				pastNums = new ArrayList<Integer>();
				pastDigits = new ArrayList<Integer>();
				int N = Integer.parseInt(fUtil.readLine());
				int m = 1; 
				while (true) {
					int num = N * m;
					if (pastNums.contains(num)) {
						fUtil.writeLine(String.format("Case #%d: INSOMNIA\n", i + 1));
						break;
					}
					else pastNums.add(num);
					
					char[] digits = Integer.toString(num).toCharArray();
					for (int j = 0; j < digits.length; j++) {
						int dig = java.lang.Character.getNumericValue(digits[j]);
						if (!pastDigits.contains(dig))
							pastDigits.add(dig);
					}
					if (pastDigits.size() == 10) {
						fUtil.writeLine(String.format("Case #%d: %s\n", i + 1, num));
						break;
					}
					m++;
				}
			}
			fUtil.done();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
