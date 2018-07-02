package methodEmbedding.Counting_Sheep.S.LYD411;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

	public static void main(String args[]){

		String filename = "qualificationRound/ProblemA/A-small-attempt0.in";
		String out = "qualificationRound/ProblemA/result_A_small.txt";
		File file = new File(filename);
		File outfile = new File(out);

		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			br = new BufferedReader(new FileReader(file));
			pw = new PrintWriter(new BufferedWriter(new FileWriter(outfile)));
			NumberFormat df = NumberFormat.getIntegerInstance();
			df.setGroupingUsed(false);

			int testCase = Integer.parseInt(br.readLine());

			for(int t=1;t<=testCase;t++){
				System.out.println("test "+ t);
				double N = Double.parseDouble(br.readLine());

				Set<Double> set_n = new HashSet<Double>();
				Set<Character> set_digit = new HashSet<Character>();

				int i=1;
				double now = N;
				String result = "";

				while(true){
					if(now < 0){
						result = "INSOMNIA";
						break;
					}

					if(!set_n.contains(now)){
						set_n.add(now);

						String str = df.format(now);
						for(int s=0;s<str.length();s++){
							char c = str.charAt(s);
							set_digit.add(c);
						}

						if(set_digit.size()==10){
							result = str;
							break;
						}

					}else{
						result = "INSOMNIA";
						break;
					}

					now += N;
					i++;
				}

				pw.println("Case #"+ t + ": " + result);
				set_n.clear();
				set_n=null;
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
