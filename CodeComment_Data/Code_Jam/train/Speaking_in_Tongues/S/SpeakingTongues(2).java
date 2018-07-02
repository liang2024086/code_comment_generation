package methodEmbedding.Speaking_in_Tongues.S.LYD1659;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class SpeakingTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			String userDir = System.getProperty("user.dir"); //get working directory
			userDir.replaceAll("['\']", "\\"); // replace all chars '\' with '\\' in the string
			File file = new File(System.getProperty("user.dir") + "\\QualificationRound\\SpeakingTongues\\in-out\\A-small-attempt4.in");
	        Scanner fileScanner = new Scanner(file);
	        //delimiter is how input text is set up in this case it's the new line char
	        fileScanner.useDelimiter(System.getProperty("line.separator")); 
	        //declared for file writing
	        BufferedWriter outFile = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\QualificationRound\\SpeakingTongues\\in-out\\A-small.out"));
			int counter, incounter, masterCounter, numCases;
			String inputText;
	        //make dictionary
	        String eng1 = "our language is impossible to understand";
	        String goo1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
	        String eng2 = "there are twenty six factorial possibilities";
	        String goo2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	        String eng3 = "so it is okay if you want to just give up";
	        String goo3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
	        TreeMap dictionary = new TreeMap();
	        for(counter = 0; counter<eng1.length(); counter++){
	        	dictionary.put(goo1.charAt(counter), eng1.charAt(counter));
	        }
	        for(counter = 0; counter<eng2.length(); counter++){
	        	dictionary.put(goo2.charAt(counter), eng2.charAt(counter));
	        }
	        for(counter = 0; counter<eng3.length(); counter++){
	        	dictionary.put(goo3.charAt(counter), eng3.charAt(counter));
	        }
	        dictionary.put('z','q');
	        dictionary.put('q','z');
	        numCases = Integer.parseInt(fileScanner.nextLine());
	        String outputStr;
	        Character tempChar;
	        for(masterCounter = 1; masterCounter <= numCases; masterCounter++){
	        	inputText = fileScanner.nextLine();
	        	outputStr = "";
	        	
	        	for(counter = 0; counter < inputText.length(); counter++){
	        		tempChar = (Character) dictionary.get(inputText.charAt(counter));
	        		outputStr = outputStr + tempChar;
	        		
	        	}
	        	System.out.println("Case #" + masterCounter + ": " + outputStr);
	        	outFile.write("Case #" + masterCounter + ": " + outputStr + "\n");
	        }
	        
	        
	        fileScanner.close();
	        outFile.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found"); e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
