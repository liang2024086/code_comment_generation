package methodEmbedding.Speaking_in_Tongues.S.LYD1251;

import java.io.*;


public class General {

	private static char letters[] = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private static char lettersEncrypted[] = {' ','y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
	public static void main (String[] args) {
	
		String strNumberOfSentences = "";
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		    
		Integer numberOfSentences = -1;
		String[] sentences = null;
		try {
			strNumberOfSentences = in.readLine();
		
			numberOfSentences = Integer.parseInt(strNumberOfSentences);
			sentences = new String[numberOfSentences];
			
			for ( int i = 0; i < numberOfSentences; ++i) {
				sentences[i] = in.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if ( numberOfSentences == -1) {
			return;
		}
		
		for ( int i = 0; i < numberOfSentences; ++i) {
			StringBuilder encryptedSentence = new StringBuilder("");
			
			for ( int j = 0; j < (sentences[i]).length(); ++j ) {
				boolean isFound = false;
				for ( int k = 0; k < letters.length && !isFound; ++k ) {
					if (sentences[i].charAt(j) == lettersEncrypted[k] ) {
						encryptedSentence.append(letters[k]);	
						isFound = true;
					} 
				}
			}
			
			System.out.println("Case #" + new Integer(i+1).toString() + ": " + encryptedSentence.toString() );
		}
	}
	
}
