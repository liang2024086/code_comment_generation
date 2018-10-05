package methodEmbedding.Speaking_in_Tongues.S.LYD1161;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("./output.txt");
		Scanner in = new Scanner(new File("/home/lotrf3/Downloads/A-small-attempt0(1).in"));
		int cases = Integer.parseInt(in.nextLine());
		for (int i=0; i<cases; i++){
			Case x = new Case(in.nextLine());
			fw.append("Case #"+(i+1) + ": " + x.solve() + "\n");
		}
		fw.close();
	}
}
