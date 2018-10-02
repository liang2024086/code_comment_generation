package methodEmbedding.Speaking_in_Tongues.S.LYD1481;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
//import java.util.ArrayList;


public class Min_Scale_Prod {
	public static void main(String[] args){
		try{
			String inputFileName = "A-small-attempt0.in";
			String outputFileName = "A-small-attempt0.out";
			FileInputStream fstream = new FileInputStream(inputFileName);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			FileWriter foutstream = new FileWriter(outputFileName);
			BufferedWriter out = new BufferedWriter(foutstream);
			String strLine;
			Helper help = new Helper();
			int counter = 0;
			while ((strLine = br.readLine()) != null)   {
				//Print the content to file
				if (counter == 0) {
					;
				} else {
					help.printResult(out, strLine, counter);
				}
				counter +=1;
			}
			//Close the output stream
			out.close();
		}catch (Exception e){//Catch exception if any
			System.err.println(e);
		}
	}
}
