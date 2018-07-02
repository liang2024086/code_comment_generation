package methodEmbedding.Standing_Ovation.S.LYD940;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class StandingOvation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("A-small-attempt2.in");
		BufferedReader tr = new BufferedReader(fr);
		
		FileWriter write = new FileWriter("output.out");
		
		int T = Integer.parseInt(tr.readLine());
		int k=1;
		while(k<=T){
			String testcase[] = tr.readLine().split(" ");
			int Smax = Integer.parseInt(testcase[0]);
			int count = 0, friends = 0, i = 0;
			while(count < Smax && i < testcase[1].length()-1){
				int r = Character.getNumericValue(testcase[1].charAt(i));
				if((count <= i) && (r == 0)){
					friends++;
					r = 1;
				}
				count = count + r;
				i++;
			}
			write.write("Case #"+k+": "+friends+"\n");
			k++;
		}
		tr.close();
		write.close();
	}

}
