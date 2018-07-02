package methodEmbedding.Standing_Ovation.S.LYD963;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StandingOvation {
	public static String LARGE_OUT = "A-large.out";
	public static String SMALL_OUT = "A-small-attempt2.out";

	public static String LARGE_IN = "A-large.in";
	public static String SMALL_IN = "A-small-attempt2.in";

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(SMALL_IN));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				SMALL_OUT)));
		String line=null;
		int n=0;
		if((line=reader.readLine()) !=null){
			n=Integer.parseInt(line.trim());
		}
		
		for(int i=0;i<n;i++){
			line=reader.readLine();
			String[] input=line.split(" ");
			int shyness=Integer.parseInt(input[0]);
			int count=0;
			int min=0;
			for(int k=0;k<input[1].length();k++){
				int levelCount=(input[1].charAt(k)-'0');
				if(count<k){
					min+=(k-count);
					count+=(k-count);
				}
				count+=levelCount;
			}
			out.println("Case #"+(i+1)+": "+(min));
		}
		
		
		out.close();
		reader.close();
		System.exit(0);
	}

}
