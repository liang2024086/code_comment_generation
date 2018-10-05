package methodEmbedding.Speaking_in_Tongues.S.LYD33;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	private static String alphabet = " abcdefghijklmnopqrstuvwxyz";
	private static String googlealphabet = " ynficwlbkuomxsevzpdrjgthaq";

	public static void main(String[] args) {
		List<String> lstLinesOutput = new ArrayList<String>();
		
		List<String> lstLinesInput = FileReaderHandler.openFile("/home/guillaume/Bureau/input");
		for(int n=1;n< Integer.parseInt(lstLinesInput.get(0)) + 1;n++){
			String sOutput = "Case #" + n + ": ";
			String sInput = lstLinesInput.get(n);
			for(char c : sInput.toCharArray()){
				sOutput += alphabet.charAt(googlealphabet.indexOf(c));
			}
			lstLinesOutput.add(sOutput);
		}
		
		if(Integer.parseInt(lstLinesInput.get(0)) != lstLinesOutput.size()){
			System.out.println("ERROR!!!");
		}
		FileWriterHandler.writeToFile(lstLinesOutput);
	}
}
