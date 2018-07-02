package methodEmbedding.Standing_Ovation.S.LYD223;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingO {

	static BufferedWriter writer;
	static BufferedReader reader;
	
	public static void main(String args[]) throws IOException {

		File fileIn = new File("A-small-attempt0.in");
		File fileOut = new File("output.out");
		FileWriter fwriter = new FileWriter(fileOut);
		writer = new BufferedWriter(fwriter);
		FileReader freader = new FileReader(fileIn);
		reader = new BufferedReader(freader);
		int cases = Integer.parseInt(reader.readLine());
		for (int i = 0; i < cases; i++) {
			String line = reader.readLine();
			String[] split = line.split(" ");
			int Smax = Integer.valueOf(split[0]);
			int tobeadded=0;
			int peopleclapping=0;
			String shyness = split[1];
			for(int j=0; j<shyness.length();j++){
				int Si = shyness.charAt(j) -'0';;
				if(Si!=0 && peopleclapping<j){
					tobeadded+=(j-peopleclapping);
					peopleclapping+=(j-peopleclapping);
				}
				peopleclapping+=Si;
				if(peopleclapping>=Smax) break;
			}
			
			
			
			writer.write("Case #"+(i+1)+": " +tobeadded);
			writer.newLine();
			
		}
		writer.flush();
		}

}
