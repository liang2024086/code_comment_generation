package methodEmbedding.Standing_Ovation.S.LYD1279;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader fr = new BufferedReader(new FileReader(new File("input.txt")));
		FileWriter fw = new FileWriter(new File("result.txt"));
		String firstLine = fr.readLine();
		int nbCases = Integer.parseInt(firstLine);

		for (int i =0; i<nbCases; i++){

			String nLine = fr.readLine();
			int nSorte = Integer.parseInt(nLine.split(" ")[0]);
			String people = nLine.split(" ")[1];
			int nbp=0;
			int nbToadd=0;
			for (int p =0; p<nSorte; p++){
				int nbp2 = Integer.parseInt(people.substring(p, p+1));
				nbp+=nbp2;
				if (nbp<p+1){
					nbToadd++;
					nbp++;
				}
			}
			fw.write("Case #"+(i+1)+": "+(nbToadd)+"\n");
			
		}
		fw.close();
		System.out.println("finished");
	}
}
