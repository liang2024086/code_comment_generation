package methodEmbedding.Magic_Trick.S.LYD447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class MagicTrick {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));
		 // input file name goes above
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt0.out")));
		 
		 int cases= Integer.parseInt(f.readLine());
		for (int i = 0; i < cases; i++) {
			
			HashSet<String> first= new HashSet<String>();
			
			int row1=Integer.parseInt(f.readLine());
			for (int j = 1; j < row1; j++) {
				f.readLine();
			}
			StringTokenizer line= new StringTokenizer(f.readLine());
			for (int j = 0; j < 4; j++) {
				first.add(line.nextToken());
			}
			for (int j = 0; j < 4-row1; j++) {
				f.readLine();
			}
			int row2=Integer.parseInt(f.readLine());
			for (int j = 1; j < row2; j++) {
				f.readLine();
			}
			int count=0;
			String number="";
			line= new StringTokenizer(f.readLine());
			for (int j = 0; j < 4; j++) {
				String tok=line.nextToken();
				if(first.contains(tok))
				{
					count++;
					number=tok;
				}
					
			}
			for (int j = 0; j < 4-row2; j++) {
				f.readLine();
			}
			switch (count) {
			case 0: out.println("Case #"+(i+1)+": Volunteer cheated!");
			break;
			case 1:
				out.println("Case #"+(i+1)+": "+number);
				break;

			default:
				out.println("Case #"+(i+1)+": Bad magician!");
				break;
			}
		}
		out.close();
		 
	}
}
