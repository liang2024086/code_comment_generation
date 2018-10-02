package methodEmbedding.Standing_Ovation.S.LYD1356;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProblemA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();//Start time
		try {
			BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
			BufferedWriter out = new BufferedWriter(new FileWriter("A-small-attempt0.out"));
			String line = null;
			line = in.readLine();
			
			int T = Integer.parseInt(line);
			for(int i=0;i<T;i++){//each case
				line = in.readLine();
				String [] tokens = line.split(" ");					
				int N = Integer.parseInt(tokens[0]);
				int [] CS = new int [N+1];//counts of shyness level
				String [] digits = tokens[1].split("");
				for (int k=0;k<=N;k++){
					CS[k]= Integer.parseInt(digits[k]);
				}
				int NS=0;//number of standing people
				int NF=0;//number of invited friends
				for (int k=0;k<=N;k++){
					if (CS[k]==0)continue;
					if (NS>=k){//at least k people stand
						NS=NS+CS[k];
					} else {
						NF=NF+k-NS;
						NS=NS+k-NS;
						NS=NS+CS[k];
					}
				}
				System.out.println("Case #" + (i+1) +": " + NF);	
				out.write("Case #" + (i+1) +": " + NF + "\n");
			}
			in.close();	
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
		long endTime=System.currentTimeMillis();//End time
		System.out.println("Running time is "+(endTime-startTime)+"ms");

	}

}
