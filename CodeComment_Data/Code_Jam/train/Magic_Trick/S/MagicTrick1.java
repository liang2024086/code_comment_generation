package methodEmbedding.Magic_Trick.S.LYD1001;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class MagicTrick {

	public static void main (String args[]) {
						
	     Path path = FileSystems.getDefault().getPath("src/resources", "A-small-attempt1.in");
	     
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
					    
		    String guessLine = null;
		    
		    String answerLine = null;
		    
		    @SuppressWarnings("unused")
			String firstLine = reader.readLine();
		    
		    int x = 1;

			while(reader.ready()) {
		    		
		    	guessLine = reader.readLine();
		    		    	
		    	Map<String, String> question = new HashMap<String, String>();
		    	
		    	question.put("1", reader.readLine());
		    	question.put("2", reader.readLine());
		    	question.put("3", reader.readLine());
		    	question.put("4", reader.readLine());
		    	
		    	Map<String, String> answer = new HashMap<String, String>();
		    	
		    	answerLine = reader.readLine();
		    	
		    	answer.put("1", reader.readLine());
		    	answer.put("2", reader.readLine());
		    	answer.put("3", reader.readLine());
		    	answer.put("4", reader.readLine());
		    	
		    	String[] splitAnswer = answer.get(answerLine).split(" ");
		    	
		    	String[] splitQuestion = question.get(guessLine).split(" ");
		    	
		    	int matchCount = 0;
		    	
		    	String magicianResult = null;
		    	
		    	for(String answerResult : splitAnswer) {
		    		
		    		for(String questionResult : splitQuestion) {
		    				    		
		    		if(answerResult.equals(questionResult)) {
		    			
		    			magicianResult = questionResult;
		    			matchCount++;
		    			
		    		};
		    		}
		    	}
		    	
		    	if(matchCount > 1) {
		    		magicianResult = "Bad magician!";
		    	} else if(matchCount == 0) {
		    		magicianResult = "Volunteer cheated!";
		    	}
		    	
		    	System.out.println("Case #" + x + ": " + magicianResult);
		    	
		    	x++;
		    	
		    	answer.clear();
		    	question.clear();
		    	
		    	}
		    	    
		  
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
	}
	
}
