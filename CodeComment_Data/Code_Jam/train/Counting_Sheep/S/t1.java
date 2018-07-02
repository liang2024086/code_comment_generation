package methodEmbedding.Counting_Sheep.S.LYD387;

public class MyClass {
	public static void main(String args[]) {
		int numberOfCases = Integer.parseInt(args[0]);
		String[] output = new String[numberOfCases];

		for(int i = 1, j = 0; i < args.length && i < numberOfCases + 1; i++, j++) {
			int caseInput = Integer.parseInt(args[i]);
			String caseStr = "";
			Set<Integer> encountered = new HashSet<Integer>();
			
			if (caseInput == 0) {
				caseStr = "Case #" + i + ": INSOMNIA";
				output[j] = caseStr;
			} else {
				int mult = 2;
				int origInput = caseInput;
				
				while (true) {
					int currVal = caseInput;
					int currentDigit = 0;
					while (currVal > 0) {
						currentDigit = currVal % 10;
						encountered.add(currentDigit);
						currVal /= 10;
					}
					
					int sum = 0;
					for (int value : encountered) {
						sum += value;
					}
					
					if (sum == 45 && encountered.contains(0)) {
						caseStr = "Case #" + i + ": " + Integer.toString(caseInput);
						output[j] = caseStr;
						break;
					}
					
					caseInput = origInput * mult;
					mult++;
				}
			}   
		}
	}
}
