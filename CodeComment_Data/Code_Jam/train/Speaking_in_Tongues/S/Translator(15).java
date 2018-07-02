package methodEmbedding.Speaking_in_Tongues.S.LYD1376;


import java.io.BufferedReader;
import java.io.FileReader;

import dancing.MaxScoreDetector;

public class Translator {
	
	String alpha = " abcdefghijklmnopqrstuvwxyz";
	String gopha = " ynficwlbkuomxsevzpdrjgthaq";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = null;
		if(args.length == 1){
			fileName = args[0];
		}else{
			System.err.println("Requires a command line argument: fileName");
			System.exit(1);
		};
		
		new Translator(fileName);

	}
	
	public Translator(String fileName){
		try{
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			String test = in.readLine();
			int numCase = Integer.parseInt(test);
			for(int i=1; i<=numCase; i++){
				String line = in.readLine();
				String newLine = "";
				for(int j=0; j<line.length(); j++){
					newLine+=alpha.charAt(gopha.indexOf(line.charAt(j)));
				}
				System.out.println("Case #" + i + ": " + newLine);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
