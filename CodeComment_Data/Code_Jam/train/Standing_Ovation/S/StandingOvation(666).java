package methodEmbedding.Standing_Ovation.S.LYD655;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class StandingOvation {

	public static void main(String[] args) throws Exception{
		File file = new File("small.in");
		File outFile = new File("small.out");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		int testCases = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCases; t++) {
//			int total = Integer.parseInt(br.readLine());

//			HashMap<Integer, String> map = new HashMap<Integer, String>();
			
			String [] input = br.readLine().split(" ");
			int smax = Integer.parseInt(input[0]);
			int done = 0;
			int result = 0;
			for(int i =0 ;i<input[1].length();i++){
				int value = (input[1].charAt(i))-'0';
				if(value == 0 || done >=i){
					done+=value;
					continue;
				}
				int diff = (i-done); 
				result+= diff; 
				done+=value+diff;
			}
			
			
			bw.write("Case #" + t + ": "+result+"\n");
			
		}
		br.close();
		bw.close();
	}
}
