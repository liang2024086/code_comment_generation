package methodEmbedding.Standing_Ovation.S.LYD521;


public class StandingOvation {

	public static void main(String [] args) {
		java.util.Scanner scanner = null;
	
		try {
		 scanner = new java.util.Scanner(new java.io.File ("C:\\Users\\home\\Downloads\\A-small-attempt2.in"));
		}
		catch (java.io.FileNotFoundException e) {
			System.out.println("not found");
			System.exit(1);
		}
		
		
		String first_test = scanner.next();
		
		int testCases = Integer.parseInt(first_test);
		int solution [] = new int[testCases];
		
		
		for (int i = 0; i < testCases; i++) {
			String maxShyStr = scanner.next();
			int maxShy = Integer.parseInt(maxShyStr);
			final String audience = scanner.next();
			int needed = 0;
			int numPeople = -1;

			for (int k = 0; k < maxShy + 1 && k < audience.length(); k++) {
				//if (audience.charAt(k) != '0') {
					numPeople += audience.charAt(k) - '0';
			//	}
				//else 
					if (audience.charAt(k) == '0') {
						if (numPeople < k) { 
							needed++;
							numPeople++;
						}
					}
				
			}
			
			solution[i] = needed;
		}
		
		int count = 1;
		java.io.PrintWriter printer = null;
		
		
		
		try {
			printer = new java.io.PrintWriter(new java.io.File("C:\\Users\\home\\JAVAprograms\\prgs\\src\\out.txt"));
		}
		catch (java.io.FileNotFoundException e) {
			System.out.println("not found");
			System.exit(1);
		}
			
		for (int i : solution) {
			printer.println("Case #" + count + ": " + i);
			count++;
		}
		printer.close();
		
	}
}
