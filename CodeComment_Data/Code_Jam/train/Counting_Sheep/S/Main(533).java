package methodEmbedding.Counting_Sheep.S.LYD649;


import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int testCycles = in.nextInt();
		int testedCycles = 0;
		int lastNumber = 0;
		int userIntegerInput;
		while (0 < testCycles && testedCycles != testCycles) {
			String userInputString = "";
			int[] userInputArray = {10,10,10,10,10,10,10,10,10,10};
			userIntegerInput = in.nextInt();

			boolean firstZero = false;

			for (int n = 1; userIntegerInput != 0; ++n, userInputString = "") {
				lastNumber = n * userIntegerInput;
				userInputString += n * userIntegerInput;
				String a;

				for (int stringIndex = 0; stringIndex < userInputString.length(); ++stringIndex){
					a="";
					a +=userInputString.charAt(stringIndex);
				if(!(Arrays.toString(userInputArray).contains(" "+a+ ",") ||
							Arrays.toString(userInputArray).contains("["+a+ ",") ||
							Arrays.toString(userInputArray).contains(" "+a+ "]")) )
					for (int arrayIndex = 0; arrayIndex < userInputArray.length; ++arrayIndex) {
						if (userInputString.charAt(stringIndex) - 48 != userInputArray[arrayIndex]
								&& userInputArray[arrayIndex] == 10
								&& !(firstZero && userInputString.charAt(stringIndex) == '0')) {
							userInputArray[arrayIndex] = userInputString.trim().charAt(stringIndex) - 48;
							Arrays.sort(userInputArray);
							break;

						}

					}
				}

				if (userInputArray[9] != 10) {
					System.out.println("Case #" + ++testedCycles + ": " + lastNumber);
					break;
				}
			}
			if (userIntegerInput == 0)
				System.out.println("Case #" + ++testedCycles + ": INSOMNIA");

		}
	}
}
