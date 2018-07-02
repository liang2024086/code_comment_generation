package methodEmbedding.Standing_Ovation.S.LYD1366;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter writer = new PrintWriter("/home/vivi/Documents/testGuillaume/small.out");
		FileReader fr = new FileReader("/home/vivi/Documents/testGuillaume/small.in");
		BufferedReader br = new BufferedReader(fr);
		String sCurrentLine;
		sCurrentLine = br.readLine();
		int nbProbleme = Integer.parseInt(sCurrentLine);
		
		for (int i = 0; i < nbProbleme; i++) {
			sCurrentLine = br.readLine();
			String[] parts = sCurrentLine.split(" ");
			int max = Integer.parseInt(parts[0]);
			
			int debout=0;
			int ajout = 0;
			for (int j = 0; j < max+1; j++) {
				int x=	Integer.parseInt(String.valueOf( parts[1].charAt(j)));
				if (debout<j){
					ajout+=j-debout;
					debout+=j-debout;
				}
				debout+=x;
			}
			writer.println("Case #"+(i+1)+": "+ajout);
		}
		writer.close();

	}
	
	

}
