package methodEmbedding.Cookie_Clicker_Alpha.S.LYD52;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashSet;

public class Q2 {
	
	public static final String INPUT = "A.in";
	public static final String OUTPUT = "output.txt";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(INPUT)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(OUTPUT)));
		int caseNum = Integer.parseInt(br.readLine());
		String line = "";
		for (int i = 0; i <caseNum; i++){
			String result = "";
			line = br.readLine();
			String[] paras = line.split(" ");
			double C = Double.parseDouble(paras[0]);
			double F = Double.parseDouble(paras[1]);
			double X = Double.parseDouble(paras[2]);
			double rate = 2.0;
			double left = X;
			double timeUsed = 0;
			while (Math.abs(left - C) > 0.000001 && (left/rate) > ((C/rate)+left/(rate+F))){
				timeUsed += C/rate;
				rate += F;
			}
			timeUsed += left/rate;
			DecimalFormat myFormatter = new DecimalFormat("###.000000");
			result = myFormatter.format(timeUsed);
			bw.write("Case #"+ (i+1) + ": " + result + "\n");
			System.out.println("Case #"+ (i+1) + ": " + result + "\n");
		}
		bw.close();
		br.close();
		
	}
}
