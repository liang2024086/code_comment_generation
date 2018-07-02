package methodEmbedding.Speaking_in_Tongues.S.LYD100;


public class SpeakinginTongues {

	// Mapping
	static char orgChar[] = new char[26]; // Minus off 97
	
	public static void main(String[] args) {
		
		String inputTrg[] = InputReader.getInputFromFileFirstLineRepLineCount("data/trg_input.txt");
		String outputTrg[] = InputReader.getInputFromFileFirstLineRepLineCount("data/trg_output.txt");
		
		for (int currLine = 0; currLine < inputTrg.length; currLine++) {
			
			String input_src = inputTrg[currLine];
			String input_enc = outputTrg[currLine];
			
			for (int i = 0; i < input_src.length(); i++) {
				
				if (input_src.charAt(i) == ' ') {
					continue;
				}
				
				// Int of src char
				int charInt = (int)input_src.charAt(i)-97;
				
				orgChar[charInt] = input_enc.charAt(i);
			}
			
			
		}
		
		
		// Override 
		orgChar[((int)'q')-97] = 'z';
		orgChar[((int)'z')-97] = 'q';
		
		// Output stats
		/*for(int i = 0; i < orgChar.length; i++ ) {
			
			if (orgChar[i] == 0) {
				System.out.println("Missing: " + (char)(i+97));
			} else {
				System.out.println(" " + (char)(i+97) + ":" + orgChar[i]);	
			}
			
		}*/
		

		String inputTrg1[] = InputReader.getInputFromFileFirstLineRepLineCount("data/A-small-attempt0.in");
		
		for (int currLine = 0; currLine < inputTrg1.length; currLine++) {
			
			System.out.print("Case #" + (currLine+1) + ": ");
			String input_src = inputTrg1[currLine];
			boolean uppercase = false;
			
			for (int i = 0; i < input_src.length(); i++) {
				
				if (input_src.charAt(i) == ' ') {
					System.out.print(" ");
					continue;
				}
				
				if ((int)input_src.charAt(i) <= (int)'Z' ) {
					uppercase = true;
				}
				
				
				
					
					if (uppercase) {
						String toPrint = String.valueOf(orgChar[(int)input_src.charAt(i)-65]);
						System.out.print(toPrint.toUpperCase());
						uppercase = false;
					} else {
						System.out.print(orgChar[(int)input_src.charAt(i)-97]);
					}
					
				
				
			}

			System.out.println();
			
		}
	}

	
}
