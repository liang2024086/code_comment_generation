package methodEmbedding.Standing_Ovation.S.LYD1084;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {

	public static void main(String args[]){

		String filename = "A-small-attempt1.in";
		//String filename = "standingovation.input";
		String out = "result.txt";
		File file = new File(filename);
		File outfile = new File(out);


		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			br = new BufferedReader(new FileReader(file));
			pw = new PrintWriter(new BufferedWriter(new FileWriter(outfile)));

			int testCase = Integer.parseInt(br.readLine());

			for(int t=1;t<=testCase;t++){
				System.out.println("test "+ t);
				String[] strs = br.readLine().split(" ");
				int maxLevel = Integer.parseInt(strs[0]);
				String audience = strs[1];

				int result = 0;
				int sum = 0;

				for(int l=0;l<=maxLevel;l++){

					if(l==0){
						sum += Character.getNumericValue(audience.charAt(l));
					}else{
						int i = Character.getNumericValue(audience.charAt(l));
						if(sum < l && i!=0){
							result += (l-sum);
							sum += result;
						}
						sum += i;
					}
					System.out.println(sum);
				}

				pw.println("Case #"+ t + ": " + result);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(1);
				}
			}
			if(pw != null){
				pw.close();
			}
		}


	}

}
